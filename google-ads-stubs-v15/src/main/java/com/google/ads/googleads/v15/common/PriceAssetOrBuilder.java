// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface PriceAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.PriceAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The type of the price asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionTypeEnum.PriceExtensionType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. The type of the price asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionTypeEnum.PriceExtensionType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.ads.googleads.v15.enums.PriceExtensionTypeEnum.PriceExtensionType getType();

  /**
   * <pre>
   * The price qualifier of the price asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier price_qualifier = 2;</code>
   * @return The enum numeric value on the wire for priceQualifier.
   */
  int getPriceQualifierValue();
  /**
   * <pre>
   * The price qualifier of the price asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier price_qualifier = 2;</code>
   * @return The priceQualifier.
   */
  com.google.ads.googleads.v15.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier getPriceQualifier();

  /**
   * <pre>
   * Required. The language of the price asset.
   * Represented as BCP 47 language tag.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Required. The language of the price asset.
   * Represented as BCP 47 language tag.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * The price offerings of the price asset.
   * The size of this collection should be between 3 and 8, inclusive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PriceOffering price_offerings = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.PriceOffering> 
      getPriceOfferingsList();
  /**
   * <pre>
   * The price offerings of the price asset.
   * The size of this collection should be between 3 and 8, inclusive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PriceOffering price_offerings = 4;</code>
   */
  com.google.ads.googleads.v15.common.PriceOffering getPriceOfferings(int index);
  /**
   * <pre>
   * The price offerings of the price asset.
   * The size of this collection should be between 3 and 8, inclusive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PriceOffering price_offerings = 4;</code>
   */
  int getPriceOfferingsCount();
  /**
   * <pre>
   * The price offerings of the price asset.
   * The size of this collection should be between 3 and 8, inclusive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PriceOffering price_offerings = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.PriceOfferingOrBuilder> 
      getPriceOfferingsOrBuilderList();
  /**
   * <pre>
   * The price offerings of the price asset.
   * The size of this collection should be between 3 and 8, inclusive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PriceOffering price_offerings = 4;</code>
   */
  com.google.ads.googleads.v15.common.PriceOfferingOrBuilder getPriceOfferingsOrBuilder(
      int index);
}
