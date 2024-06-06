// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/product_category_constant.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface ProductCategoryConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.ProductCategoryConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the product category.
   * Product category resource names have the form:
   *
   * `productCategoryConstants/{level}~{category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the product category.
   * Product category resource names have the form:
   *
   * `productCategoryConstants/{level}~{category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the product category.
   *
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>int64 category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryId.
   */
  long getCategoryId();

  /**
   * <pre>
   * Output only. Resource name of the parent product category.
   * </pre>
   *
   * <code>optional string product_category_constant_parent = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the productCategoryConstantParent field is set.
   */
  boolean hasProductCategoryConstantParent();
  /**
   * <pre>
   * Output only. Resource name of the parent product category.
   * </pre>
   *
   * <code>optional string product_category_constant_parent = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The productCategoryConstantParent.
   */
  java.lang.String getProductCategoryConstantParent();
  /**
   * <pre>
   * Output only. Resource name of the parent product category.
   * </pre>
   *
   * <code>optional string product_category_constant_parent = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for productCategoryConstantParent.
   */
  com.google.protobuf.ByteString
      getProductCategoryConstantParentBytes();

  /**
   * <pre>
   * Output only. Level of the product category.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ProductCategoryLevelEnum.ProductCategoryLevel level = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * Output only. Level of the product category.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ProductCategoryLevelEnum.ProductCategoryLevel level = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The level.
   */
  com.google.ads.googleads.v17.enums.ProductCategoryLevelEnum.ProductCategoryLevel getLevel();

  /**
   * <pre>
   * Output only. State of the product category.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ProductCategoryStateEnum.ProductCategoryState state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the product category.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ProductCategoryStateEnum.ProductCategoryState state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.ads.googleads.v17.enums.ProductCategoryStateEnum.ProductCategoryState getState();

  /**
   * <pre>
   * Output only. List of all available localizations of the product category.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalization localizations = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalization> 
      getLocalizationsList();
  /**
   * <pre>
   * Output only. List of all available localizations of the product category.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalization localizations = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalization getLocalizations(int index);
  /**
   * <pre>
   * Output only. List of all available localizations of the product category.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalization localizations = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getLocalizationsCount();
  /**
   * <pre>
   * Output only. List of all available localizations of the product category.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalization localizations = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalizationOrBuilder> 
      getLocalizationsOrBuilderList();
  /**
   * <pre>
   * Output only. List of all available localizations of the product category.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalization localizations = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v17.resources.ProductCategoryConstant.ProductCategoryLocalizationOrBuilder getLocalizationsOrBuilder(
      int index);
}
