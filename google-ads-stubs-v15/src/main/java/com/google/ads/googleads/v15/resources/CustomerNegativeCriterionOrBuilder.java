// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/customer_negative_criterion.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface CustomerNegativeCriterionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.CustomerNegativeCriterion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer negative criterion.
   * Customer negative criterion resource names have the form:
   *
   * `customers/{customer_id}/customerNegativeCriteria/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer negative criterion.
   * Customer negative criterion resource names have the form:
   *
   * `customers/{customer_id}/customerNegativeCriteria/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the criterion.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the criterion.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CriterionTypeEnum.CriterionType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CriterionTypeEnum.CriterionType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v15.enums.CriterionTypeEnum.CriterionType getType();

  /**
   * <pre>
   * Immutable. ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ContentLabelInfo content_label = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the contentLabel field is set.
   */
  boolean hasContentLabel();
  /**
   * <pre>
   * Immutable. ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ContentLabelInfo content_label = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The contentLabel.
   */
  com.google.ads.googleads.v15.common.ContentLabelInfo getContentLabel();
  /**
   * <pre>
   * Immutable. ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ContentLabelInfo content_label = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.ContentLabelInfoOrBuilder getContentLabelOrBuilder();

  /**
   * <pre>
   * Immutable. MobileApplication.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileApplicationInfo mobile_application = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mobileApplication field is set.
   */
  boolean hasMobileApplication();
  /**
   * <pre>
   * Immutable. MobileApplication.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileApplicationInfo mobile_application = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mobileApplication.
   */
  com.google.ads.googleads.v15.common.MobileApplicationInfo getMobileApplication();
  /**
   * <pre>
   * Immutable. MobileApplication.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileApplicationInfo mobile_application = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.MobileApplicationInfoOrBuilder getMobileApplicationOrBuilder();

  /**
   * <pre>
   * Immutable. MobileAppCategory.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileAppCategoryInfo mobile_app_category = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mobileAppCategory field is set.
   */
  boolean hasMobileAppCategory();
  /**
   * <pre>
   * Immutable. MobileAppCategory.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileAppCategoryInfo mobile_app_category = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mobileAppCategory.
   */
  com.google.ads.googleads.v15.common.MobileAppCategoryInfo getMobileAppCategory();
  /**
   * <pre>
   * Immutable. MobileAppCategory.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileAppCategoryInfo mobile_app_category = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.MobileAppCategoryInfoOrBuilder getMobileAppCategoryOrBuilder();

  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The placement.
   */
  com.google.ads.googleads.v15.common.PlacementInfo getPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.PlacementInfoOrBuilder getPlacementOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeVideoInfo youtube_video = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeVideo field is set.
   */
  boolean hasYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeVideoInfo youtube_video = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeVideo.
   */
  com.google.ads.googleads.v15.common.YouTubeVideoInfo getYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeVideoInfo youtube_video = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.YouTubeVideoInfoOrBuilder getYoutubeVideoOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeChannel field is set.
   */
  boolean hasYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeChannel.
   */
  com.google.ads.googleads.v15.common.YouTubeChannelInfo getYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.YouTubeChannelInfoOrBuilder getYoutubeChannelOrBuilder();

  /**
   * <pre>
   * Immutable. NegativeKeywordList.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.NegativeKeywordListInfo negative_keyword_list = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the negativeKeywordList field is set.
   */
  boolean hasNegativeKeywordList();
  /**
   * <pre>
   * Immutable. NegativeKeywordList.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.NegativeKeywordListInfo negative_keyword_list = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The negativeKeywordList.
   */
  com.google.ads.googleads.v15.common.NegativeKeywordListInfo getNegativeKeywordList();
  /**
   * <pre>
   * Immutable. NegativeKeywordList.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.NegativeKeywordListInfo negative_keyword_list = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.NegativeKeywordListInfoOrBuilder getNegativeKeywordListOrBuilder();

  com.google.ads.googleads.v15.resources.CustomerNegativeCriterion.CriterionCase getCriterionCase();
}
