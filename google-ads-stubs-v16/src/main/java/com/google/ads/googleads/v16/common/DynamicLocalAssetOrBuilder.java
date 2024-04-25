// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

public interface DynamicLocalAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.DynamicLocalAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Deal ID which can be any sequence of letters and digits, and must
   * be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string deal_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dealId.
   */
  java.lang.String getDealId();
  /**
   * <pre>
   * Required. Deal ID which can be any sequence of letters and digits, and must
   * be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string deal_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for dealId.
   */
  com.google.protobuf.ByteString
      getDealIdBytes();

  /**
   * <pre>
   * Required. Deal name, for example, 50% off at Mountain View Grocers.
   * Required.
   * </pre>
   *
   * <code>string deal_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dealName.
   */
  java.lang.String getDealName();
  /**
   * <pre>
   * Required. Deal name, for example, 50% off at Mountain View Grocers.
   * Required.
   * </pre>
   *
   * <code>string deal_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for dealName.
   */
  com.google.protobuf.ByteString
      getDealNameBytes();

  /**
   * <pre>
   * Subtitle, for example, Groceries.
   * </pre>
   *
   * <code>string subtitle = 3;</code>
   * @return The subtitle.
   */
  java.lang.String getSubtitle();
  /**
   * <pre>
   * Subtitle, for example, Groceries.
   * </pre>
   *
   * <code>string subtitle = 3;</code>
   * @return The bytes for subtitle.
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  /**
   * <pre>
   * Description, for example, Save on your weekly bill.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description, for example, Save on your weekly bill.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Price which can be a number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 100.00 USD.
   * </pre>
   *
   * <code>string price = 5;</code>
   * @return The price.
   */
  java.lang.String getPrice();
  /**
   * <pre>
   * Price which can be a number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 100.00 USD.
   * </pre>
   *
   * <code>string price = 5;</code>
   * @return The bytes for price.
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <pre>
   * Sale price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 80.00 USD.
   * Must be less than the 'price' field.
   * </pre>
   *
   * <code>string sale_price = 6;</code>
   * @return The salePrice.
   */
  java.lang.String getSalePrice();
  /**
   * <pre>
   * Sale price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 80.00 USD.
   * Must be less than the 'price' field.
   * </pre>
   *
   * <code>string sale_price = 6;</code>
   * @return The bytes for salePrice.
   */
  com.google.protobuf.ByteString
      getSalePriceBytes();

  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 7;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 7;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403.
   * </pre>
   *
   * <code>string address = 8;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403.
   * </pre>
   *
   * <code>string address = 8;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Category, for example, Food.
   * </pre>
   *
   * <code>string category = 9;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <pre>
   * Category, for example, Food.
   * </pre>
   *
   * <code>string category = 9;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <pre>
   * Contextual keywords, for example, Save groceries coupons.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @return A list containing the contextualKeywords.
   */
  java.util.List<java.lang.String>
      getContextualKeywordsList();
  /**
   * <pre>
   * Contextual keywords, for example, Save groceries coupons.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @return The count of contextualKeywords.
   */
  int getContextualKeywordsCount();
  /**
   * <pre>
   * Contextual keywords, for example, Save groceries coupons.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @param index The index of the element to return.
   * @return The contextualKeywords at the given index.
   */
  java.lang.String getContextualKeywords(int index);
  /**
   * <pre>
   * Contextual keywords, for example, Save groceries coupons.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contextualKeywords at the given index.
   */
  com.google.protobuf.ByteString
      getContextualKeywordsBytes(int index);

  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $100.00.
   * </pre>
   *
   * <code>string formatted_price = 11;</code>
   * @return The formattedPrice.
   */
  java.lang.String getFormattedPrice();
  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $100.00.
   * </pre>
   *
   * <code>string formatted_price = 11;</code>
   * @return The bytes for formattedPrice.
   */
  com.google.protobuf.ByteString
      getFormattedPriceBytes();

  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $80.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 12;</code>
   * @return The formattedSalePrice.
   */
  java.lang.String getFormattedSalePrice();
  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $80.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 12;</code>
   * @return The bytes for formattedSalePrice.
   */
  com.google.protobuf.ByteString
      getFormattedSalePriceBytes();

  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 13;</code>
   * @return The androidAppLink.
   */
  java.lang.String getAndroidAppLink();
  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 13;</code>
   * @return The bytes for androidAppLink.
   */
  com.google.protobuf.ByteString
      getAndroidAppLinkBytes();

  /**
   * <pre>
   * Similar deal IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_deal_ids = 14;</code>
   * @return A list containing the similarDealIds.
   */
  java.util.List<java.lang.String>
      getSimilarDealIdsList();
  /**
   * <pre>
   * Similar deal IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_deal_ids = 14;</code>
   * @return The count of similarDealIds.
   */
  int getSimilarDealIdsCount();
  /**
   * <pre>
   * Similar deal IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_deal_ids = 14;</code>
   * @param index The index of the element to return.
   * @return The similarDealIds at the given index.
   */
  java.lang.String getSimilarDealIds(int index);
  /**
   * <pre>
   * Similar deal IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_deal_ids = 14;</code>
   * @param index The index of the value to return.
   * @return The bytes of the similarDealIds at the given index.
   */
  com.google.protobuf.ByteString
      getSimilarDealIdsBytes(int index);

  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 15;</code>
   * @return The iosAppLink.
   */
  java.lang.String getIosAppLink();
  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 15;</code>
   * @return The bytes for iosAppLink.
   */
  com.google.protobuf.ByteString
      getIosAppLinkBytes();

  /**
   * <pre>
   * iOS app store ID. This is used to check if the user has the app installed
   * on their device before deep linking. If this field is set, then the
   * ios_app_link field must also be present.
   * </pre>
   *
   * <code>int64 ios_app_store_id = 16;</code>
   * @return The iosAppStoreId.
   */
  long getIosAppStoreId();
}
