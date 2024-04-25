// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/campaign_lifecycle_goal.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public interface CampaignLifecycleGoalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.CampaignLifecycleGoal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer lifecycle goal of a campaign.
   *
   * `customers/{customer_id}/campaignLifecycleGoal/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer lifecycle goal of a campaign.
   *
   * `customers/{customer_id}/campaignLifecycleGoal/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The campaign where the goal is attached.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Output only. The campaign where the goal is attached.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Output only. The customer acquisition goal settings for the campaign. The
   * customer acquisition goal is described in this article:
   * https://support.google.com/google-ads/answer/12080169
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomerAcquisitionGoalSettings customer_acquisition_goal_settings = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the customerAcquisitionGoalSettings field is set.
   */
  boolean hasCustomerAcquisitionGoalSettings();
  /**
   * <pre>
   * Output only. The customer acquisition goal settings for the campaign. The
   * customer acquisition goal is described in this article:
   * https://support.google.com/google-ads/answer/12080169
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomerAcquisitionGoalSettings customer_acquisition_goal_settings = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The customerAcquisitionGoalSettings.
   */
  com.google.ads.googleads.v16.resources.CustomerAcquisitionGoalSettings getCustomerAcquisitionGoalSettings();
  /**
   * <pre>
   * Output only. The customer acquisition goal settings for the campaign. The
   * customer acquisition goal is described in this article:
   * https://support.google.com/google-ads/answer/12080169
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomerAcquisitionGoalSettings customer_acquisition_goal_settings = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.resources.CustomerAcquisitionGoalSettingsOrBuilder getCustomerAcquisitionGoalSettingsOrBuilder();
}
