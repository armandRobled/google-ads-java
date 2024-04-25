// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_customizer_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface MutateCustomerCustomizerResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateCustomerCustomizerResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated CustomerCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerCustomizer customer_customizer = 2;</code>
   * @return Whether the customerCustomizer field is set.
   */
  boolean hasCustomerCustomizer();
  /**
   * <pre>
   * The mutated CustomerCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerCustomizer customer_customizer = 2;</code>
   * @return The customerCustomizer.
   */
  com.google.ads.googleads.v15.resources.CustomerCustomizer getCustomerCustomizer();
  /**
   * <pre>
   * The mutated CustomerCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerCustomizer customer_customizer = 2;</code>
   */
  com.google.ads.googleads.v15.resources.CustomerCustomizerOrBuilder getCustomerCustomizerOrBuilder();
}
