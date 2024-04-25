// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/brand_suggestion_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface SuggestBrandsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.SuggestBrandsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer onto which to apply the brand suggestion
   * operation.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer onto which to apply the brand suggestion
   * operation.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The prefix of a brand name.
   * </pre>
   *
   * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the brandPrefix field is set.
   */
  boolean hasBrandPrefix();
  /**
   * <pre>
   * Required. The prefix of a brand name.
   * </pre>
   *
   * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The brandPrefix.
   */
  java.lang.String getBrandPrefix();
  /**
   * <pre>
   * Required. The prefix of a brand name.
   * </pre>
   *
   * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for brandPrefix.
   */
  com.google.protobuf.ByteString
      getBrandPrefixBytes();

  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the selectedBrands.
   */
  java.util.List<java.lang.String>
      getSelectedBrandsList();
  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of selectedBrands.
   */
  int getSelectedBrandsCount();
  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The selectedBrands at the given index.
   */
  java.lang.String getSelectedBrands(int index);
  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the selectedBrands at the given index.
   */
  com.google.protobuf.ByteString
      getSelectedBrandsBytes(int index);
}
