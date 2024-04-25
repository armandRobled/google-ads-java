// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/campaign_conversion_goal.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface CampaignConversionGoalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.CampaignConversionGoal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign conversion goal.
   * Campaign conversion goal resource names have the form:
   *
   * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign conversion goal.
   * Campaign conversion goal resource names have the form:
   *
   * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign with which this campaign conversion goal is
   * associated.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign with which this campaign conversion goal is
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
   * The conversion category of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * The conversion category of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
   * @return The category.
   */
  com.google.ads.googleads.v15.enums.ConversionActionCategoryEnum.ConversionActionCategory getCategory();

  /**
   * <pre>
   * The conversion origin of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
   * @return The enum numeric value on the wire for origin.
   */
  int getOriginValue();
  /**
   * <pre>
   * The conversion origin of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
   * @return The origin.
   */
  com.google.ads.googleads.v15.enums.ConversionOriginEnum.ConversionOrigin getOrigin();

  /**
   * <pre>
   * The biddability of the campaign conversion goal.
   * </pre>
   *
   * <code>bool biddable = 5;</code>
   * @return The biddable.
   */
  boolean getBiddable();
}
