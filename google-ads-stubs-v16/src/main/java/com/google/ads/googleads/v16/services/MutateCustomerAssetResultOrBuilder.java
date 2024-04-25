// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/customer_asset_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface MutateCustomerAssetResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.MutateCustomerAssetResult)
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
   * The mutated customer asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomerAsset customer_asset = 2;</code>
   * @return Whether the customerAsset field is set.
   */
  boolean hasCustomerAsset();
  /**
   * <pre>
   * The mutated customer asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomerAsset customer_asset = 2;</code>
   * @return The customerAsset.
   */
  com.google.ads.googleads.v16.resources.CustomerAsset getCustomerAsset();
  /**
   * <pre>
   * The mutated customer asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomerAsset customer_asset = 2;</code>
   */
  com.google.ads.googleads.v16.resources.CustomerAssetOrBuilder getCustomerAssetOrBuilder();
}
