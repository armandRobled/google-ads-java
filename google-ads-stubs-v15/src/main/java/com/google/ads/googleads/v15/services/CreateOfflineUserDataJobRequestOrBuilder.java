// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/offline_user_data_job_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface CreateOfflineUserDataJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.CreateOfflineUserDataJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer for which to create an offline user data
   * job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer for which to create an offline user data
   * job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The job.
   */
  com.google.ads.googleads.v15.resources.OfflineUserDataJob getJob();
  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.resources.OfflineUserDataJobOrBuilder getJobOrBuilder();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * If true, match rate range for the offline user data job is calculated and
   * made available in the resource.
   * </pre>
   *
   * <code>bool enable_match_rate_range_preview = 5;</code>
   * @return The enableMatchRateRangePreview.
   */
  boolean getEnableMatchRateRangePreview();
}
