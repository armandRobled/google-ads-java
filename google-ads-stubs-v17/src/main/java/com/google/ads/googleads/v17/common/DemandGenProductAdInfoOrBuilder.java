// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

public interface DemandGenProductAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.common.DemandGenProductAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Text asset used for the short headline.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdTextAsset headline = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the headline field is set.
   */
  boolean hasHeadline();
  /**
   * <pre>
   * Required. Text asset used for the short headline.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdTextAsset headline = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The headline.
   */
  com.google.ads.googleads.v17.common.AdTextAsset getHeadline();
  /**
   * <pre>
   * Required. Text asset used for the short headline.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdTextAsset headline = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v17.common.AdTextAssetOrBuilder getHeadlineOrBuilder();

  /**
   * <pre>
   * Required. Text asset used for the description.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdTextAsset description = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Required. Text asset used for the description.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdTextAsset description = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The description.
   */
  com.google.ads.googleads.v17.common.AdTextAsset getDescription();
  /**
   * <pre>
   * Required. Text asset used for the description.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdTextAsset description = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v17.common.AdTextAssetOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Required. Logo image to be used in the ad. Valid image types are GIF, JPEG,
   * and PNG. The minimum size is 128x128 and the aspect ratio must be 1:1
   * (+-1%).
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdImageAsset logo_image = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the logoImage field is set.
   */
  boolean hasLogoImage();
  /**
   * <pre>
   * Required. Logo image to be used in the ad. Valid image types are GIF, JPEG,
   * and PNG. The minimum size is 128x128 and the aspect ratio must be 1:1
   * (+-1%).
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdImageAsset logo_image = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The logoImage.
   */
  com.google.ads.googleads.v17.common.AdImageAsset getLogoImage();
  /**
   * <pre>
   * Required. Logo image to be used in the ad. Valid image types are GIF, JPEG,
   * and PNG. The minimum size is 128x128 and the aspect ratio must be 1:1
   * (+-1%).
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdImageAsset logo_image = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v17.common.AdImageAssetOrBuilder getLogoImageOrBuilder();

  /**
   * <pre>
   * First part of text that appears in the ad with the displayed URL.
   * </pre>
   *
   * <code>string breadcrumb1 = 4;</code>
   * @return The breadcrumb1.
   */
  java.lang.String getBreadcrumb1();
  /**
   * <pre>
   * First part of text that appears in the ad with the displayed URL.
   * </pre>
   *
   * <code>string breadcrumb1 = 4;</code>
   * @return The bytes for breadcrumb1.
   */
  com.google.protobuf.ByteString
      getBreadcrumb1Bytes();

  /**
   * <pre>
   * Second part of text that appears in the ad with the displayed URL.
   * </pre>
   *
   * <code>string breadcrumb2 = 5;</code>
   * @return The breadcrumb2.
   */
  java.lang.String getBreadcrumb2();
  /**
   * <pre>
   * Second part of text that appears in the ad with the displayed URL.
   * </pre>
   *
   * <code>string breadcrumb2 = 5;</code>
   * @return The bytes for breadcrumb2.
   */
  com.google.protobuf.ByteString
      getBreadcrumb2Bytes();

  /**
   * <pre>
   * Required. The advertiser/brand name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.AdTextAsset business_name = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * Required. The advertiser/brand name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.AdTextAsset business_name = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The businessName.
   */
  com.google.ads.googleads.v17.common.AdTextAsset getBusinessName();
  /**
   * <pre>
   * Required. The advertiser/brand name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.AdTextAsset business_name = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v17.common.AdTextAssetOrBuilder getBusinessNameOrBuilder();

  /**
   * <pre>
   * Asset of type CallToActionAsset used for the "Call To Action" button.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdCallToActionAsset call_to_action = 7;</code>
   * @return Whether the callToAction field is set.
   */
  boolean hasCallToAction();
  /**
   * <pre>
   * Asset of type CallToActionAsset used for the "Call To Action" button.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdCallToActionAsset call_to_action = 7;</code>
   * @return The callToAction.
   */
  com.google.ads.googleads.v17.common.AdCallToActionAsset getCallToAction();
  /**
   * <pre>
   * Asset of type CallToActionAsset used for the "Call To Action" button.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.AdCallToActionAsset call_to_action = 7;</code>
   */
  com.google.ads.googleads.v17.common.AdCallToActionAssetOrBuilder getCallToActionOrBuilder();
}
