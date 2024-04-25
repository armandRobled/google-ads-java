// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/extensions.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

public interface SitelinkFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.SitelinkFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>optional string link_text = 9;</code>
   * @return Whether the linkText field is set.
   */
  boolean hasLinkText();
  /**
   * <pre>
   * URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>optional string link_text = 9;</code>
   * @return The linkText.
   */
  java.lang.String getLinkText();
  /**
   * <pre>
   * URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>optional string link_text = 9;</code>
   * @return The bytes for linkText.
   */
  com.google.protobuf.ByteString
      getLinkTextBytes();

  /**
   * <pre>
   * First line of the description for the sitelink.
   * If this value is set, line2 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>optional string line1 = 10;</code>
   * @return Whether the line1 field is set.
   */
  boolean hasLine1();
  /**
   * <pre>
   * First line of the description for the sitelink.
   * If this value is set, line2 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>optional string line1 = 10;</code>
   * @return The line1.
   */
  java.lang.String getLine1();
  /**
   * <pre>
   * First line of the description for the sitelink.
   * If this value is set, line2 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>optional string line1 = 10;</code>
   * @return The bytes for line1.
   */
  com.google.protobuf.ByteString
      getLine1Bytes();

  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If this value is set, line1 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>optional string line2 = 11;</code>
   * @return Whether the line2 field is set.
   */
  boolean hasLine2();
  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If this value is set, line1 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>optional string line2 = 11;</code>
   * @return The line2.
   */
  java.lang.String getLine2();
  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If this value is set, line1 must also be set.
   * The length of this string should be between 0 and 35, inclusive.
   * </pre>
   *
   * <code>optional string line2 = 11;</code>
   * @return The bytes for line2.
   */
  com.google.protobuf.ByteString
      getLine2Bytes();

  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 12;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 12;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 12;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 13;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 13;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 13;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 13;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);

  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 14;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 14;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 14;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.CustomParameter url_custom_parameters = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v16.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.CustomParameter url_custom_parameters = 7;</code>
   */
  com.google.ads.googleads.v16.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.CustomParameter url_custom_parameters = 7;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.CustomParameter url_custom_parameters = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.CustomParameter url_custom_parameters = 7;</code>
   */
  com.google.ads.googleads.v16.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Final URL suffix to be appended to landing page URLs served with
   * parallel tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 15;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * Final URL suffix to be appended to landing page URLs served with
   * parallel tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 15;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * Final URL suffix to be appended to landing page URLs served with
   * parallel tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 15;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();
}
