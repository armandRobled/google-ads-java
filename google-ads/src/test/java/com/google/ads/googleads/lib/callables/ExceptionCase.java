// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.callables;

import com.google.ads.googleads.lib.catalog.GeneratedCatalog;
import com.google.ads.googleads.v17.errors.GoogleAdsError;
import com.google.ads.googleads.v17.errors.GoogleAdsException;
import com.google.ads.googleads.v17.errors.GoogleAdsFailure;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.rpc.ApiException;
import com.google.common.collect.ImmutableList;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.StatusException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.mockito.ArgumentMatcher;

/** Abstracts a test case for exception transformation. */
public abstract class ExceptionCase implements ArgumentMatcher<Throwable> {

  /** Gets all test cases. */
  public static List<ExceptionCase> getCases() {
    return ImmutableList.of(
        getGoogleAdsFailureCase(),
        getPlainApiExceptionCase(),
        getPlainRuntimeExceptionCase(),
        getUnparsableMetadataCase());
  }

  /** Gets all test cases in a format expected by JUnit parameterized tests. */
  static List<Object[]> getCasesForParameterized() {
    return getCases().stream().map(c -> new Object[] {c.getName(), c}).collect(Collectors.toList());
  }

  /** A short human readable name. */
  abstract String getName();

  /** Throwable that should be used for testing. */
  abstract Throwable getInputThrowable();

  /**
   * Ensures that the resulting throwable matches expectations.
   *
   * <p>Handles most cases where the exceptions can be directly compared with Objects.equals().
   */
  @Override
  public boolean matches(Throwable actual) {
    return Objects.equals(actual, getInputThrowable());
  }

  /** Vanilla failure case with a GoogleAdsException. */
  private static ExceptionCase getGoogleAdsFailureCase() {
    // Creates a simple GoogleAdsFailure with enough content not to be equal to empty protobuf
    // message.
    GoogleAdsFailure originalFailure =
        GoogleAdsFailure.newBuilder().addErrors(GoogleAdsError.getDefaultInstance()).build();

    // Creates a GoogleAdsFailure embedded in trailers to match how the API sends back error
    // details.
    Metadata trailers = new Metadata();
    trailers.put(
        GeneratedCatalog.getDefault().getLatestVersion().getExceptionFactory().getTrailerKey(),
        originalFailure.toByteArray());

    // Creates an ApiException with the GoogleAdsFailure trailers, as would be generated by GAX in
    // response to an API call that failed on the ads backend.
    ApiException originalException =
        new ApiException(
            new StatusException(Status.INVALID_ARGUMENT, trailers),
            GrpcStatusCode.of(Code.INVALID_ARGUMENT),
            false);

    return new ExceptionCase() {

      @Override
      String getName() {
        return "Unpack GoogleAdsFailure";
      }

      @Override
      Throwable getInputThrowable() {
        return originalException;
      }

      @Override
      public boolean matches(Throwable actual) {
        if (actual == null) {
          return false;
        }
        if (!actual.getClass().isAssignableFrom(GoogleAdsException.class)) {
          return false;
        }
        GoogleAdsException ex = (GoogleAdsException) actual;
        return Objects.equals(ex.getGoogleAdsFailure(), originalFailure);
      }
    };
  }

  /** Case where ApiException doesn't contain GoogleAdsFailure. */
  private static ExceptionCase getPlainApiExceptionCase() {
    ApiException originalException =
        new ApiException(null, GrpcStatusCode.of(Code.INVALID_ARGUMENT), false);

    return new ExceptionCase() {
      @Override
      String getName() {
        return "Plain ApiException passes through";
      }

      @Override
      Throwable getInputThrowable() {
        return originalException;
      }
    };
  }

  /** Case where a generic RuntimeException occurs. */
  private static ExceptionCase getPlainRuntimeExceptionCase() {
    RuntimeException originalException = new RuntimeException();
    return new ExceptionCase() {

      @Override
      String getName() {
        return "Plan RuntimeException passes through";
      }

      @Override
      Throwable getInputThrowable() {
        return originalException;
      }
    };
  }

  /** Case where a GoogleAdsFailure appears with unparsable Metadata. */
  private static ExceptionCase getUnparsableMetadataCase() {
    // Creates a GoogleAdsFailure embedded in trailers to match how the API sends back error
    // details.
    Metadata trailers = new Metadata();
    trailers.put(
        GeneratedCatalog.getDefault().getLatestVersion().getExceptionFactory().getTrailerKey(),
        new byte[] {0x1, 0x2, 0x3});

    // Creates an ApiException with the GoogleAdsFailure trailers, as would be generated by GAX in
    // response to an API call that failed on the ads backend.
    ApiException originalException =
        new ApiException(
            new StatusException(Status.INVALID_ARGUMENT, trailers),
            GrpcStatusCode.of(Code.INVALID_ARGUMENT),
            false);

    return new ExceptionCase() {

      @Override
      String getName() {
        return "Unparsable GoogleAdsFailure";
      }

      @Override
      Throwable getInputThrowable() {
        return originalException;
      }
    };
  }
}
