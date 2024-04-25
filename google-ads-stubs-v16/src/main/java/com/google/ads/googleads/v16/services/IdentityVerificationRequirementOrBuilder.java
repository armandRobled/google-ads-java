// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/identity_verification_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface IdentityVerificationRequirementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.IdentityVerificationRequirement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The deadline to start verification in "yyyy-MM-dd HH:mm:ss" format.
   * </pre>
   *
   * <code>string verification_start_deadline_time = 1;</code>
   * @return The verificationStartDeadlineTime.
   */
  java.lang.String getVerificationStartDeadlineTime();
  /**
   * <pre>
   * The deadline to start verification in "yyyy-MM-dd HH:mm:ss" format.
   * </pre>
   *
   * <code>string verification_start_deadline_time = 1;</code>
   * @return The bytes for verificationStartDeadlineTime.
   */
  com.google.protobuf.ByteString
      getVerificationStartDeadlineTimeBytes();

  /**
   * <pre>
   * The deadline to submit verification.
   * </pre>
   *
   * <code>string verification_completion_deadline_time = 2;</code>
   * @return The verificationCompletionDeadlineTime.
   */
  java.lang.String getVerificationCompletionDeadlineTime();
  /**
   * <pre>
   * The deadline to submit verification.
   * </pre>
   *
   * <code>string verification_completion_deadline_time = 2;</code>
   * @return The bytes for verificationCompletionDeadlineTime.
   */
  com.google.protobuf.ByteString
      getVerificationCompletionDeadlineTimeBytes();
}
