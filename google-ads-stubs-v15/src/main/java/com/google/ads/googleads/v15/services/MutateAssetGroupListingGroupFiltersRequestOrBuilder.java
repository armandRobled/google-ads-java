// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/asset_group_listing_group_filter_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface MutateAssetGroupListingGroupFiltersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateAssetGroupListingGroupFiltersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose asset group listing group filters
   * are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose asset group listing group filters
   * are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on individual asset group
   * listing group filters.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual asset group
   * listing group filters.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual asset group
   * listing group filters.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual asset group
   * listing group filters.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual asset group
   * listing group filters.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.AssetGroupListingGroupFilterOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
   * @return The enum numeric value on the wire for responseContentType.
   */
  int getResponseContentTypeValue();
  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
   * @return The responseContentType.
   */
  com.google.ads.googleads.v15.enums.ResponseContentTypeEnum.ResponseContentType getResponseContentType();
}
