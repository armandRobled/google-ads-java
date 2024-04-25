// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/customer_customizer.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public interface CustomerCustomizerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.CustomerCustomizer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer customizer.
   * Customer customizer resource names have the form:
   *
   * `customers/{customer_id}/customerCustomizers/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer customizer.
   * Customer customizer resource names have the form:
   *
   * `customers/{customer_id}/customerCustomizers/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Required. Immutable. The customizer attribute which is linked to the
   * customer.
   * </pre>
   *
   * <code>string customizer_attribute = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The customizerAttribute.
   */
  java.lang.String getCustomizerAttribute();
  /**
   * <pre>
   * Required. Immutable. The customizer attribute which is linked to the
   * customer.
   * </pre>
   *
   * <code>string customizer_attribute = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customizerAttribute.
   */
  com.google.protobuf.ByteString
      getCustomizerAttributeBytes();

  /**
   * <pre>
   * Output only. The status of the customer customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomizerValueStatusEnum.CustomizerValueStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the customer customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomizerValueStatusEnum.CustomizerValueStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v16.enums.CustomizerValueStatusEnum.CustomizerValueStatus getStatus();

  /**
   * <pre>
   * Required. The value to associate with the customizer attribute at this
   * level. The value must be of the type specified for the CustomizerAttribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.CustomizerValue value = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Required. The value to associate with the customizer attribute at this
   * level. The value must be of the type specified for the CustomizerAttribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.CustomizerValue value = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The value.
   */
  com.google.ads.googleads.v16.common.CustomizerValue getValue();
  /**
   * <pre>
   * Required. The value to associate with the customizer attribute at this
   * level. The value must be of the type specified for the CustomizerAttribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.CustomizerValue value = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v16.common.CustomizerValueOrBuilder getValueOrBuilder();
}
