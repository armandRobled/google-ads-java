// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface CallAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.CallAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The country code in the ad.
   * </pre>
   *
   * <code>string country_code = 1;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * The country code in the ad.
   * </pre>
   *
   * <code>string country_code = 1;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * The phone number in the ad.
   * </pre>
   *
   * <code>string phone_number = 2;</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * The phone number in the ad.
   * </pre>
   *
   * <code>string phone_number = 2;</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>string business_name = 3;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>string business_name = 3;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * First headline in the ad.
   * </pre>
   *
   * <code>string headline1 = 11;</code>
   * @return The headline1.
   */
  java.lang.String getHeadline1();
  /**
   * <pre>
   * First headline in the ad.
   * </pre>
   *
   * <code>string headline1 = 11;</code>
   * @return The bytes for headline1.
   */
  com.google.protobuf.ByteString
      getHeadline1Bytes();

  /**
   * <pre>
   * Second headline in the ad.
   * </pre>
   *
   * <code>string headline2 = 12;</code>
   * @return The headline2.
   */
  java.lang.String getHeadline2();
  /**
   * <pre>
   * Second headline in the ad.
   * </pre>
   *
   * <code>string headline2 = 12;</code>
   * @return The bytes for headline2.
   */
  com.google.protobuf.ByteString
      getHeadline2Bytes();

  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>string description1 = 4;</code>
   * @return The description1.
   */
  java.lang.String getDescription1();
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>string description1 = 4;</code>
   * @return The bytes for description1.
   */
  com.google.protobuf.ByteString
      getDescription1Bytes();

  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>string description2 = 5;</code>
   * @return The description2.
   */
  java.lang.String getDescription2();
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>string description2 = 5;</code>
   * @return The bytes for description2.
   */
  com.google.protobuf.ByteString
      getDescription2Bytes();

  /**
   * <pre>
   * Whether to enable call tracking for the creative. Enabling call
   * tracking also enables call conversions.
   * </pre>
   *
   * <code>bool call_tracked = 6;</code>
   * @return The callTracked.
   */
  boolean getCallTracked();

  /**
   * <pre>
   * Whether to disable call conversion for the creative.
   * If set to `true`, disables call conversions even when `call_tracked` is
   * `true`.
   * If `call_tracked` is `false`, this field is ignored.
   * </pre>
   *
   * <code>bool disable_call_conversion = 7;</code>
   * @return The disableCallConversion.
   */
  boolean getDisableCallConversion();

  /**
   * <pre>
   * The URL to be used for phone number verification.
   * </pre>
   *
   * <code>string phone_number_verification_url = 8;</code>
   * @return The phoneNumberVerificationUrl.
   */
  java.lang.String getPhoneNumberVerificationUrl();
  /**
   * <pre>
   * The URL to be used for phone number verification.
   * </pre>
   *
   * <code>string phone_number_verification_url = 8;</code>
   * @return The bytes for phoneNumberVerificationUrl.
   */
  com.google.protobuf.ByteString
      getPhoneNumberVerificationUrlBytes();

  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * `call_tracked` is set to `true`. Otherwise this field is ignored.
   * </pre>
   *
   * <code>string conversion_action = 9;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * `call_tracked` is set to `true`. Otherwise this field is ignored.
   * </pre>
   *
   * <code>string conversion_action = 9;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The call conversion behavior of this call ad. It can use its own call
   * conversion setting, inherit the account level setting, or be disabled.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CallConversionReportingStateEnum.CallConversionReportingState conversion_reporting_state = 10;</code>
   * @return The enum numeric value on the wire for conversionReportingState.
   */
  int getConversionReportingStateValue();
  /**
   * <pre>
   * The call conversion behavior of this call ad. It can use its own call
   * conversion setting, inherit the account level setting, or be disabled.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CallConversionReportingStateEnum.CallConversionReportingState conversion_reporting_state = 10;</code>
   * @return The conversionReportingState.
   */
  com.google.ads.googleads.v15.enums.CallConversionReportingStateEnum.CallConversionReportingState getConversionReportingState();

  /**
   * <pre>
   * First part of text that can be appended to the URL in the ad. Optional.
   * </pre>
   *
   * <code>string path1 = 13;</code>
   * @return The path1.
   */
  java.lang.String getPath1();
  /**
   * <pre>
   * First part of text that can be appended to the URL in the ad. Optional.
   * </pre>
   *
   * <code>string path1 = 13;</code>
   * @return The bytes for path1.
   */
  com.google.protobuf.ByteString
      getPath1Bytes();

  /**
   * <pre>
   * Second part of text that can be appended to the URL in the ad. This field
   * can only be set when `path1` is also set. Optional.
   * </pre>
   *
   * <code>string path2 = 14;</code>
   * @return The path2.
   */
  java.lang.String getPath2();
  /**
   * <pre>
   * Second part of text that can be appended to the URL in the ad. This field
   * can only be set when `path1` is also set. Optional.
   * </pre>
   *
   * <code>string path2 = 14;</code>
   * @return The bytes for path2.
   */
  com.google.protobuf.ByteString
      getPath2Bytes();
}
