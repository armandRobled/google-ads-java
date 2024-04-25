// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/offline_user_data_job_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface AddOfflineUserDataJobOperationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.AddOfflineUserDataJobOperationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();

  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return The warning.
   */
  com.google.rpc.Status getWarning();
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getWarningOrBuilder();
}
