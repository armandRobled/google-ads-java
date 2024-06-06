// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/conversion_goal_campaign_config.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface ConversionGoalCampaignConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.ConversionGoalCampaignConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the conversion goal campaign config.
   * Conversion goal campaign config resource names have the form:
   *
   * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the conversion goal campaign config.
   * Conversion goal campaign config resource names have the form:
   *
   * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign with which this conversion goal campaign config is
   * associated.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign with which this conversion goal campaign config is
   * associated.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * The level of goal config the campaign is using.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
   * @return The enum numeric value on the wire for goalConfigLevel.
   */
  int getGoalConfigLevelValue();
  /**
   * <pre>
   * The level of goal config the campaign is using.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
   * @return The goalConfigLevel.
   */
  com.google.ads.googleads.v17.enums.GoalConfigLevelEnum.GoalConfigLevel getGoalConfigLevel();

  /**
   * <pre>
   * The custom conversion goal the campaign is using for optimization.
   * </pre>
   *
   * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The customConversionGoal.
   */
  java.lang.String getCustomConversionGoal();
  /**
   * <pre>
   * The custom conversion goal the campaign is using for optimization.
   * </pre>
   *
   * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customConversionGoal.
   */
  com.google.protobuf.ByteString
      getCustomConversionGoalBytes();
}
