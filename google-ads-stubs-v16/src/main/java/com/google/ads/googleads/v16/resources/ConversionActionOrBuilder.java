// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/conversion_action.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public interface ConversionActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.ConversionAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the conversion action.
   * Conversion action resource names have the form:
   *
   * `customers/{customer_id}/conversionActions/{conversion_action_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the conversion action.
   * Conversion action resource names have the form:
   *
   * `customers/{customer_id}/conversionActions/{conversion_action_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the conversion action.
   * </pre>
   *
   * <code>optional int64 id = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the conversion action.
   * </pre>
   *
   * <code>optional int64 id = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the conversion action.
   *
   * This field is required and should not be empty when creating new
   * conversion actions.
   * </pre>
   *
   * <code>optional string name = 22;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the conversion action.
   *
   * This field is required and should not be empty when creating new
   * conversion actions.
   * </pre>
   *
   * <code>optional string name = 22;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the conversion action.
   *
   * This field is required and should not be empty when creating new
   * conversion actions.
   * </pre>
   *
   * <code>optional string name = 22;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The status of this conversion action for conversion event accrual.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionStatusEnum.ConversionActionStatus status = 4;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of this conversion action for conversion event accrual.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionStatusEnum.ConversionActionStatus status = 4;</code>
   * @return The status.
   */
  com.google.ads.googleads.v16.enums.ConversionActionStatusEnum.ConversionActionStatus getStatus();

  /**
   * <pre>
   * Immutable. The type of this conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionTypeEnum.ConversionActionType type = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. The type of this conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionTypeEnum.ConversionActionType type = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v16.enums.ConversionActionTypeEnum.ConversionActionType getType();

  /**
   * <pre>
   * Output only. The conversion origin of this conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionOriginEnum.ConversionOrigin origin = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for origin.
   */
  int getOriginValue();
  /**
   * <pre>
   * Output only. The conversion origin of this conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionOriginEnum.ConversionOrigin origin = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The origin.
   */
  com.google.ads.googleads.v16.enums.ConversionOriginEnum.ConversionOrigin getOrigin();

  /**
   * <pre>
   * If a conversion action's primary_for_goal bit is false, the conversion
   * action is non-biddable for all campaigns regardless of their customer
   * conversion goal or campaign conversion goal.
   * However, custom conversion goals do not respect primary_for_goal, so if
   * a campaign has a custom conversion goal configured with a
   * primary_for_goal = false conversion action, that conversion action is
   * still biddable.
   * By default, primary_for_goal will be true if not set. In V9,
   * primary_for_goal can only be set to false after creation through an
   * 'update' operation because it's not declared as optional.
   * </pre>
   *
   * <code>optional bool primary_for_goal = 31;</code>
   * @return Whether the primaryForGoal field is set.
   */
  boolean hasPrimaryForGoal();
  /**
   * <pre>
   * If a conversion action's primary_for_goal bit is false, the conversion
   * action is non-biddable for all campaigns regardless of their customer
   * conversion goal or campaign conversion goal.
   * However, custom conversion goals do not respect primary_for_goal, so if
   * a campaign has a custom conversion goal configured with a
   * primary_for_goal = false conversion action, that conversion action is
   * still biddable.
   * By default, primary_for_goal will be true if not set. In V9,
   * primary_for_goal can only be set to false after creation through an
   * 'update' operation because it's not declared as optional.
   * </pre>
   *
   * <code>optional bool primary_for_goal = 31;</code>
   * @return The primaryForGoal.
   */
  boolean getPrimaryForGoal();

  /**
   * <pre>
   * The category of conversions reported for this conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 6;</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * The category of conversions reported for this conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 6;</code>
   * @return The category.
   */
  com.google.ads.googleads.v16.enums.ConversionActionCategoryEnum.ConversionActionCategory getCategory();

  /**
   * <pre>
   * Output only. The resource name of the conversion action owner customer, or
   * null if this is a system-defined conversion action.
   * </pre>
   *
   * <code>optional string owner_customer = 23 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the ownerCustomer field is set.
   */
  boolean hasOwnerCustomer();
  /**
   * <pre>
   * Output only. The resource name of the conversion action owner customer, or
   * null if this is a system-defined conversion action.
   * </pre>
   *
   * <code>optional string owner_customer = 23 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The ownerCustomer.
   */
  java.lang.String getOwnerCustomer();
  /**
   * <pre>
   * Output only. The resource name of the conversion action owner customer, or
   * null if this is a system-defined conversion action.
   * </pre>
   *
   * <code>optional string owner_customer = 23 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for ownerCustomer.
   */
  com.google.protobuf.ByteString
      getOwnerCustomerBytes();

  /**
   * <pre>
   * Whether this conversion action should be included in the "conversions"
   * metric.
   * </pre>
   *
   * <code>optional bool include_in_conversions_metric = 24;</code>
   * @return Whether the includeInConversionsMetric field is set.
   */
  boolean hasIncludeInConversionsMetric();
  /**
   * <pre>
   * Whether this conversion action should be included in the "conversions"
   * metric.
   * </pre>
   *
   * <code>optional bool include_in_conversions_metric = 24;</code>
   * @return The includeInConversionsMetric.
   */
  boolean getIncludeInConversionsMetric();

  /**
   * <pre>
   * The maximum number of days that may elapse between an interaction
   * (for example, a click) and a conversion event.
   * </pre>
   *
   * <code>optional int64 click_through_lookback_window_days = 25;</code>
   * @return Whether the clickThroughLookbackWindowDays field is set.
   */
  boolean hasClickThroughLookbackWindowDays();
  /**
   * <pre>
   * The maximum number of days that may elapse between an interaction
   * (for example, a click) and a conversion event.
   * </pre>
   *
   * <code>optional int64 click_through_lookback_window_days = 25;</code>
   * @return The clickThroughLookbackWindowDays.
   */
  long getClickThroughLookbackWindowDays();

  /**
   * <pre>
   * The maximum number of days which may elapse between an impression and a
   * conversion without an interaction.
   * </pre>
   *
   * <code>optional int64 view_through_lookback_window_days = 26;</code>
   * @return Whether the viewThroughLookbackWindowDays field is set.
   */
  boolean hasViewThroughLookbackWindowDays();
  /**
   * <pre>
   * The maximum number of days which may elapse between an impression and a
   * conversion without an interaction.
   * </pre>
   *
   * <code>optional int64 view_through_lookback_window_days = 26;</code>
   * @return The viewThroughLookbackWindowDays.
   */
  long getViewThroughLookbackWindowDays();

  /**
   * <pre>
   * Settings related to the value for conversion events associated with this
   * conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.ValueSettings value_settings = 11;</code>
   * @return Whether the valueSettings field is set.
   */
  boolean hasValueSettings();
  /**
   * <pre>
   * Settings related to the value for conversion events associated with this
   * conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.ValueSettings value_settings = 11;</code>
   * @return The valueSettings.
   */
  com.google.ads.googleads.v16.resources.ConversionAction.ValueSettings getValueSettings();
  /**
   * <pre>
   * Settings related to the value for conversion events associated with this
   * conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.ValueSettings value_settings = 11;</code>
   */
  com.google.ads.googleads.v16.resources.ConversionAction.ValueSettingsOrBuilder getValueSettingsOrBuilder();

  /**
   * <pre>
   * How to count conversion events for the conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionCountingTypeEnum.ConversionActionCountingType counting_type = 12;</code>
   * @return The enum numeric value on the wire for countingType.
   */
  int getCountingTypeValue();
  /**
   * <pre>
   * How to count conversion events for the conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ConversionActionCountingTypeEnum.ConversionActionCountingType counting_type = 12;</code>
   * @return The countingType.
   */
  com.google.ads.googleads.v16.enums.ConversionActionCountingTypeEnum.ConversionActionCountingType getCountingType();

  /**
   * <pre>
   * Settings related to this conversion action's attribution model.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.AttributionModelSettings attribution_model_settings = 13;</code>
   * @return Whether the attributionModelSettings field is set.
   */
  boolean hasAttributionModelSettings();
  /**
   * <pre>
   * Settings related to this conversion action's attribution model.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.AttributionModelSettings attribution_model_settings = 13;</code>
   * @return The attributionModelSettings.
   */
  com.google.ads.googleads.v16.resources.ConversionAction.AttributionModelSettings getAttributionModelSettings();
  /**
   * <pre>
   * Settings related to this conversion action's attribution model.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.AttributionModelSettings attribution_model_settings = 13;</code>
   */
  com.google.ads.googleads.v16.resources.ConversionAction.AttributionModelSettingsOrBuilder getAttributionModelSettingsOrBuilder();

  /**
   * <pre>
   * Output only. The snippets used for tracking conversions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.TagSnippet tag_snippets = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v16.common.TagSnippet> 
      getTagSnippetsList();
  /**
   * <pre>
   * Output only. The snippets used for tracking conversions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.TagSnippet tag_snippets = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.common.TagSnippet getTagSnippets(int index);
  /**
   * <pre>
   * Output only. The snippets used for tracking conversions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.TagSnippet tag_snippets = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTagSnippetsCount();
  /**
   * <pre>
   * Output only. The snippets used for tracking conversions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.TagSnippet tag_snippets = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.common.TagSnippetOrBuilder> 
      getTagSnippetsOrBuilderList();
  /**
   * <pre>
   * Output only. The snippets used for tracking conversions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.TagSnippet tag_snippets = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.common.TagSnippetOrBuilder getTagSnippetsOrBuilder(
      int index);

  /**
   * <pre>
   * The phone call duration in seconds after which a conversion should be
   * reported for this conversion action.
   *
   * The value must be between 0 and 10000, inclusive.
   * </pre>
   *
   * <code>optional int64 phone_call_duration_seconds = 27;</code>
   * @return Whether the phoneCallDurationSeconds field is set.
   */
  boolean hasPhoneCallDurationSeconds();
  /**
   * <pre>
   * The phone call duration in seconds after which a conversion should be
   * reported for this conversion action.
   *
   * The value must be between 0 and 10000, inclusive.
   * </pre>
   *
   * <code>optional int64 phone_call_duration_seconds = 27;</code>
   * @return The phoneCallDurationSeconds.
   */
  long getPhoneCallDurationSeconds();

  /**
   * <pre>
   * App ID for an app conversion action.
   * </pre>
   *
   * <code>optional string app_id = 28;</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * App ID for an app conversion action.
   * </pre>
   *
   * <code>optional string app_id = 28;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * App ID for an app conversion action.
   * </pre>
   *
   * <code>optional string app_id = 28;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * Output only. Mobile app vendor for an app conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.MobileAppVendorEnum.MobileAppVendor mobile_app_vendor = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for mobileAppVendor.
   */
  int getMobileAppVendorValue();
  /**
   * <pre>
   * Output only. Mobile app vendor for an app conversion action.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.MobileAppVendorEnum.MobileAppVendor mobile_app_vendor = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The mobileAppVendor.
   */
  com.google.ads.googleads.v16.enums.MobileAppVendorEnum.MobileAppVendor getMobileAppVendor();

  /**
   * <pre>
   * Output only. Firebase settings for Firebase conversion types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.FirebaseSettings firebase_settings = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the firebaseSettings field is set.
   */
  boolean hasFirebaseSettings();
  /**
   * <pre>
   * Output only. Firebase settings for Firebase conversion types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.FirebaseSettings firebase_settings = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The firebaseSettings.
   */
  com.google.ads.googleads.v16.resources.ConversionAction.FirebaseSettings getFirebaseSettings();
  /**
   * <pre>
   * Output only. Firebase settings for Firebase conversion types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.FirebaseSettings firebase_settings = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.resources.ConversionAction.FirebaseSettingsOrBuilder getFirebaseSettingsOrBuilder();

  /**
   * <pre>
   * Output only. Third Party App Analytics settings for third party conversion
   * types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.ThirdPartyAppAnalyticsSettings third_party_app_analytics_settings = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the thirdPartyAppAnalyticsSettings field is set.
   */
  boolean hasThirdPartyAppAnalyticsSettings();
  /**
   * <pre>
   * Output only. Third Party App Analytics settings for third party conversion
   * types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.ThirdPartyAppAnalyticsSettings third_party_app_analytics_settings = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The thirdPartyAppAnalyticsSettings.
   */
  com.google.ads.googleads.v16.resources.ConversionAction.ThirdPartyAppAnalyticsSettings getThirdPartyAppAnalyticsSettings();
  /**
   * <pre>
   * Output only. Third Party App Analytics settings for third party conversion
   * types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.ThirdPartyAppAnalyticsSettings third_party_app_analytics_settings = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.resources.ConversionAction.ThirdPartyAppAnalyticsSettingsOrBuilder getThirdPartyAppAnalyticsSettingsOrBuilder();

  /**
   * <pre>
   * Output only. Google Analytics 4 settings for Google Analytics 4 conversion
   * types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.GoogleAnalytics4Settings google_analytics_4_settings = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the googleAnalytics4Settings field is set.
   */
  boolean hasGoogleAnalytics4Settings();
  /**
   * <pre>
   * Output only. Google Analytics 4 settings for Google Analytics 4 conversion
   * types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.GoogleAnalytics4Settings google_analytics_4_settings = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The googleAnalytics4Settings.
   */
  com.google.ads.googleads.v16.resources.ConversionAction.GoogleAnalytics4Settings getGoogleAnalytics4Settings();
  /**
   * <pre>
   * Output only. Google Analytics 4 settings for Google Analytics 4 conversion
   * types.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionAction.GoogleAnalytics4Settings google_analytics_4_settings = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.resources.ConversionAction.GoogleAnalytics4SettingsOrBuilder getGoogleAnalytics4SettingsOrBuilder();
}
