// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/experiment_arm_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface MutateExperimentArmResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.MutateExperimentArmResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated experiment arm with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ExperimentArm experiment_arm = 2;</code>
   * @return Whether the experimentArm field is set.
   */
  boolean hasExperimentArm();
  /**
   * <pre>
   * The mutated experiment arm with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ExperimentArm experiment_arm = 2;</code>
   * @return The experimentArm.
   */
  com.google.ads.googleads.v16.resources.ExperimentArm getExperimentArm();
  /**
   * <pre>
   * The mutated experiment arm with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ExperimentArm experiment_arm = 2;</code>
   */
  com.google.ads.googleads.v16.resources.ExperimentArmOrBuilder getExperimentArmOrBuilder();
}
