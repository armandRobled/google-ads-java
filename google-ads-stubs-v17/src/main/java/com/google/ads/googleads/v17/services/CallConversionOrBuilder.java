// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/conversion_upload_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface CallConversionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.CallConversion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign, for example, "+16502531234".
   * </pre>
   *
   * <code>optional string caller_id = 7;</code>
   * @return Whether the callerId field is set.
   */
  boolean hasCallerId();
  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign, for example, "+16502531234".
   * </pre>
   *
   * <code>optional string caller_id = 7;</code>
   * @return The callerId.
   */
  java.lang.String getCallerId();
  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign, for example, "+16502531234".
   * </pre>
   *
   * <code>optional string caller_id = 7;</code>
   * @return The bytes for callerId.
   */
  com.google.protobuf.ByteString
      getCallerIdBytes();

  /**
   * <pre>
   * The date time at which the call occurred. The timezone must be specified.
   * The format is "yyyy-mm-dd hh:mm:ss+|-hh:mm",
   * for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string call_start_date_time = 8;</code>
   * @return Whether the callStartDateTime field is set.
   */
  boolean hasCallStartDateTime();
  /**
   * <pre>
   * The date time at which the call occurred. The timezone must be specified.
   * The format is "yyyy-mm-dd hh:mm:ss+|-hh:mm",
   * for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string call_start_date_time = 8;</code>
   * @return The callStartDateTime.
   */
  java.lang.String getCallStartDateTime();
  /**
   * <pre>
   * The date time at which the call occurred. The timezone must be specified.
   * The format is "yyyy-mm-dd hh:mm:ss+|-hh:mm",
   * for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string call_start_date_time = 8;</code>
   * @return The bytes for callStartDateTime.
   */
  com.google.protobuf.ByteString
      getCallStartDateTimeBytes();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 9;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 9;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 9;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after the call
   * time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 10;</code>
   * @return Whether the conversionDateTime field is set.
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after the call
   * time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 10;</code>
   * @return The conversionDateTime.
   */
  java.lang.String getConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after the call
   * time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 10;</code>
   * @return The bytes for conversionDateTime.
   */
  com.google.protobuf.ByteString
      getConversionDateTimeBytes();

  /**
   * <pre>
   * The value of the conversion for the advertiser.
   * </pre>
   *
   * <code>optional double conversion_value = 11;</code>
   * @return Whether the conversionValue field is set.
   */
  boolean hasConversionValue();
  /**
   * <pre>
   * The value of the conversion for the advertiser.
   * </pre>
   *
   * <code>optional double conversion_value = 11;</code>
   * @return The conversionValue.
   */
  double getConversionValue();

  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>optional string currency_code = 12;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>optional string currency_code = 12;</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>optional string currency_code = 12;</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.CustomVariable custom_variables = 13;</code>
   */
  java.util.List<com.google.ads.googleads.v17.services.CustomVariable> 
      getCustomVariablesList();
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.CustomVariable custom_variables = 13;</code>
   */
  com.google.ads.googleads.v17.services.CustomVariable getCustomVariables(int index);
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.CustomVariable custom_variables = 13;</code>
   */
  int getCustomVariablesCount();
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.CustomVariable custom_variables = 13;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v17.services.CustomVariableOrBuilder> 
      getCustomVariablesOrBuilderList();
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.CustomVariable custom_variables = 13;</code>
   */
  com.google.ads.googleads.v17.services.CustomVariableOrBuilder getCustomVariablesOrBuilder(
      int index);

  /**
   * <pre>
   * The consent setting for the event.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.Consent consent = 14;</code>
   * @return Whether the consent field is set.
   */
  boolean hasConsent();
  /**
   * <pre>
   * The consent setting for the event.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.Consent consent = 14;</code>
   * @return The consent.
   */
  com.google.ads.googleads.v17.common.Consent getConsent();
  /**
   * <pre>
   * The consent setting for the event.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.Consent consent = 14;</code>
   */
  com.google.ads.googleads.v17.common.ConsentOrBuilder getConsentOrBuilder();
}
