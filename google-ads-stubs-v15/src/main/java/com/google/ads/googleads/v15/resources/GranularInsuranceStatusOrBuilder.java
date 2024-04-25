// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/customer.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface GranularInsuranceStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.GranularInsuranceStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Geotarget criterion ID associated with the status. Can be on
   * country or state/province geo level, depending on requirements and
   * location. See https://developers.google.com/google-ads/api/data/geotargets
   * for more information.
   * </pre>
   *
   * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the geoCriterionId field is set.
   */
  boolean hasGeoCriterionId();
  /**
   * <pre>
   * Output only. Geotarget criterion ID associated with the status. Can be on
   * country or state/province geo level, depending on requirements and
   * location. See https://developers.google.com/google-ads/api/data/geotargets
   * for more information.
   * </pre>
   *
   * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The geoCriterionId.
   */
  long getGeoCriterionId();

  /**
   * <pre>
   * Output only. Service category associated with the status. For example,
   * xcat:service_area_business_plumber.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the categoryId field is set.
   */
  boolean hasCategoryId();
  /**
   * <pre>
   * Output only. Service category associated with the status. For example,
   * xcat:service_area_business_plumber.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryId.
   */
  java.lang.String getCategoryId();
  /**
   * <pre>
   * Output only. Service category associated with the status. For example,
   * xcat:service_area_business_plumber.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for categoryId.
   */
  com.google.protobuf.ByteString
      getCategoryIdBytes();

  /**
   * <pre>
   * Output only. Granular insurance status, per geo + vertical.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the verificationStatus field is set.
   */
  boolean hasVerificationStatus();
  /**
   * <pre>
   * Output only. Granular insurance status, per geo + vertical.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for verificationStatus.
   */
  int getVerificationStatusValue();
  /**
   * <pre>
   * Output only. Granular insurance status, per geo + vertical.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The verificationStatus.
   */
  com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus getVerificationStatus();
}
