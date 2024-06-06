// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/customer_asset_set_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface MutateCustomerAssetSetResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.MutateCustomerAssetSetResult)
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
   * The mutated customer asset set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerAssetSet customer_asset_set = 2;</code>
   * @return Whether the customerAssetSet field is set.
   */
  boolean hasCustomerAssetSet();
  /**
   * <pre>
   * The mutated customer asset set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerAssetSet customer_asset_set = 2;</code>
   * @return The customerAssetSet.
   */
  com.google.ads.googleads.v17.resources.CustomerAssetSet getCustomerAssetSet();
  /**
   * <pre>
   * The mutated customer asset set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerAssetSet customer_asset_set = 2;</code>
   */
  com.google.ads.googleads.v17.resources.CustomerAssetSetOrBuilder getCustomerAssetSetOrBuilder();
}
