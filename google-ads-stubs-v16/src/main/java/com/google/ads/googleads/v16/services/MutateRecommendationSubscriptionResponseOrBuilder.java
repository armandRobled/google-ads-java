// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/recommendation_subscription_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface MutateRecommendationSubscriptionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.MutateRecommendationSubscriptionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Results, one per operation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.MutateRecommendationSubscriptionResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v16.services.MutateRecommendationSubscriptionResult> 
      getResultsList();
  /**
   * <pre>
   * Results, one per operation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.MutateRecommendationSubscriptionResult results = 1;</code>
   */
  com.google.ads.googleads.v16.services.MutateRecommendationSubscriptionResult getResults(int index);
  /**
   * <pre>
   * Results, one per operation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.MutateRecommendationSubscriptionResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Results, one per operation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.MutateRecommendationSubscriptionResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.services.MutateRecommendationSubscriptionResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * Results, one per operation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.MutateRecommendationSubscriptionResult results = 1;</code>
   */
  com.google.ads.googleads.v16.services.MutateRecommendationSubscriptionResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors) we return the RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors) we return the RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors) we return the RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();
}
