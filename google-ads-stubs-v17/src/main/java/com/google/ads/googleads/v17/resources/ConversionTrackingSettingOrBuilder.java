// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/customer.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface ConversionTrackingSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.ConversionTrackingSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The conversion tracking id used for this account. This id
   * doesn't indicate whether the customer uses conversion tracking
   * (conversion_tracking_status does). This field is read-only.
   * </pre>
   *
   * <code>optional int64 conversion_tracking_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the conversionTrackingId field is set.
   */
  boolean hasConversionTrackingId();
  /**
   * <pre>
   * Output only. The conversion tracking id used for this account. This id
   * doesn't indicate whether the customer uses conversion tracking
   * (conversion_tracking_status does). This field is read-only.
   * </pre>
   *
   * <code>optional int64 conversion_tracking_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The conversionTrackingId.
   */
  long getConversionTrackingId();

  /**
   * <pre>
   * Output only. The conversion tracking id of the customer's manager. This is
   * set when the customer is opted into cross account conversion tracking, and
   * it overrides conversion_tracking_id. This field can only be managed through
   * the Google Ads UI. This field is read-only.
   * </pre>
   *
   * <code>optional int64 cross_account_conversion_tracking_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the crossAccountConversionTrackingId field is set.
   */
  boolean hasCrossAccountConversionTrackingId();
  /**
   * <pre>
   * Output only. The conversion tracking id of the customer's manager. This is
   * set when the customer is opted into cross account conversion tracking, and
   * it overrides conversion_tracking_id. This field can only be managed through
   * the Google Ads UI. This field is read-only.
   * </pre>
   *
   * <code>optional int64 cross_account_conversion_tracking_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The crossAccountConversionTrackingId.
   */
  long getCrossAccountConversionTrackingId();

  /**
   * <pre>
   * Output only. Whether the customer has accepted customer data terms. If
   * using cross-account conversion tracking, this value is inherited from the
   * manager. This field is read-only. For more
   * information, see https://support.google.com/adspolicy/answer/7475709.
   * </pre>
   *
   * <code>bool accepted_customer_data_terms = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The acceptedCustomerDataTerms.
   */
  boolean getAcceptedCustomerDataTerms();

  /**
   * <pre>
   * Output only. Conversion tracking status. It indicates whether the customer
   * is using conversion tracking, and who is the conversion tracking owner of
   * this customer. If this customer is using cross-account conversion tracking,
   * the value returned will differ based on the `login-customer-id` of the
   * request.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ConversionTrackingStatusEnum.ConversionTrackingStatus conversion_tracking_status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for conversionTrackingStatus.
   */
  int getConversionTrackingStatusValue();
  /**
   * <pre>
   * Output only. Conversion tracking status. It indicates whether the customer
   * is using conversion tracking, and who is the conversion tracking owner of
   * this customer. If this customer is using cross-account conversion tracking,
   * the value returned will differ based on the `login-customer-id` of the
   * request.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ConversionTrackingStatusEnum.ConversionTrackingStatus conversion_tracking_status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The conversionTrackingStatus.
   */
  com.google.ads.googleads.v17.enums.ConversionTrackingStatusEnum.ConversionTrackingStatus getConversionTrackingStatus();

  /**
   * <pre>
   * Output only. Whether the customer is opted-in for enhanced conversions
   * for leads. If using cross-account conversion tracking, this value is
   * inherited from the manager. This field is read-only.
   * </pre>
   *
   * <code>bool enhanced_conversions_for_leads_enabled = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enhancedConversionsForLeadsEnabled.
   */
  boolean getEnhancedConversionsForLeadsEnabled();

  /**
   * <pre>
   * Output only. The resource name of the customer where conversions are
   * created and managed. This field is read-only.
   * </pre>
   *
   * <code>string google_ads_conversion_customer = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The googleAdsConversionCustomer.
   */
  java.lang.String getGoogleAdsConversionCustomer();
  /**
   * <pre>
   * Output only. The resource name of the customer where conversions are
   * created and managed. This field is read-only.
   * </pre>
   *
   * <code>string google_ads_conversion_customer = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for googleAdsConversionCustomer.
   */
  com.google.protobuf.ByteString
      getGoogleAdsConversionCustomerBytes();
}
