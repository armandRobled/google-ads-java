// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/conversion_custom_variable.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface ConversionCustomVariableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.ConversionCustomVariable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the conversion custom variable.
   * Conversion custom variable resource names have the form:
   *
   * `customers/{customer_id}/conversionCustomVariables/{conversion_custom_variable_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the conversion custom variable.
   * Conversion custom variable resource names have the form:
   *
   * `customers/{customer_id}/conversionCustomVariables/{conversion_custom_variable_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the conversion custom variable.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Required. The name of the conversion custom variable.
   * Name should be unique. The maximum length of name is 100 characters.
   * There should not be any extra spaces before and after.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the conversion custom variable.
   * Name should be unique. The maximum length of name is 100 characters.
   * There should not be any extra spaces before and after.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Immutable. The tag of the conversion custom variable. It is used
   * in the event snippet and sent to Google Ads along with conversion pings.
   * For conversion uploads in Google Ads API, the resource name of the
   * conversion custom variable is used. Tag should be unique. The maximum size
   * of tag is 100 bytes. There should not be any extra spaces before and after.
   * Currently only lowercase letters, numbers and underscores are allowed in
   * the tag.
   * </pre>
   *
   * <code>string tag = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Required. Immutable. The tag of the conversion custom variable. It is used
   * in the event snippet and sent to Google Ads along with conversion pings.
   * For conversion uploads in Google Ads API, the resource name of the
   * conversion custom variable is used. Tag should be unique. The maximum size
   * of tag is 100 bytes. There should not be any extra spaces before and after.
   * Currently only lowercase letters, numbers and underscores are allowed in
   * the tag.
   * </pre>
   *
   * <code>string tag = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * The status of the conversion custom variable for conversion event accrual.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConversionCustomVariableStatusEnum.ConversionCustomVariableStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the conversion custom variable for conversion event accrual.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConversionCustomVariableStatusEnum.ConversionCustomVariableStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.ConversionCustomVariableStatusEnum.ConversionCustomVariableStatus getStatus();

  /**
   * <pre>
   * Output only. The resource name of the customer that owns the conversion
   * custom variable.
   * </pre>
   *
   * <code>string owner_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The ownerCustomer.
   */
  java.lang.String getOwnerCustomer();
  /**
   * <pre>
   * Output only. The resource name of the customer that owns the conversion
   * custom variable.
   * </pre>
   *
   * <code>string owner_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for ownerCustomer.
   */
  com.google.protobuf.ByteString
      getOwnerCustomerBytes();
}
