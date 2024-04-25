// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface PriceOfferingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.PriceOffering)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The header of the price offering.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The header.
   */
  java.lang.String getHeader();
  /**
   * <pre>
   * Required. The header of the price offering.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for header.
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <pre>
   * Required. The description of the price offering.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Required. The description of the price offering.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Required. The price value of the price offering.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.Money price = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   * <pre>
   * Required. The price value of the price offering.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.Money price = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The price.
   */
  com.google.ads.googleads.v15.common.Money getPrice();
  /**
   * <pre>
   * Required. The price value of the price offering.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.Money price = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.common.MoneyOrBuilder getPriceOrBuilder();

  /**
   * <pre>
   * The price unit of the price offering.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit unit = 4;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <pre>
   * The price unit of the price offering.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit unit = 4;</code>
   * @return The unit.
   */
  com.google.ads.googleads.v15.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit getUnit();

  /**
   * <pre>
   * Required. The final URL after all cross domain redirects.
   * </pre>
   *
   * <code>string final_url = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The finalUrl.
   */
  java.lang.String getFinalUrl();
  /**
   * <pre>
   * Required. The final URL after all cross domain redirects.
   * </pre>
   *
   * <code>string final_url = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for finalUrl.
   */
  com.google.protobuf.ByteString
      getFinalUrlBytes();

  /**
   * <pre>
   * The final mobile URL after all cross domain redirects.
   * </pre>
   *
   * <code>string final_mobile_url = 6;</code>
   * @return The finalMobileUrl.
   */
  java.lang.String getFinalMobileUrl();
  /**
   * <pre>
   * The final mobile URL after all cross domain redirects.
   * </pre>
   *
   * <code>string final_mobile_url = 6;</code>
   * @return The bytes for finalMobileUrl.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlBytes();
}
