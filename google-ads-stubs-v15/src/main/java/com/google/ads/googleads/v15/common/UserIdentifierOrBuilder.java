// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/offline_user_data.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface UserIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.UserIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Source of the user identifier when the upload is from Store Sales,
   * ConversionUploadService, or ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.UserIdentifierSourceEnum.UserIdentifierSource user_identifier_source = 6;</code>
   * @return The enum numeric value on the wire for userIdentifierSource.
   */
  int getUserIdentifierSourceValue();
  /**
   * <pre>
   * Source of the user identifier when the upload is from Store Sales,
   * ConversionUploadService, or ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.UserIdentifierSourceEnum.UserIdentifierSource user_identifier_source = 6;</code>
   * @return The userIdentifierSource.
   */
  com.google.ads.googleads.v15.enums.UserIdentifierSourceEnum.UserIdentifierSource getUserIdentifierSource();

  /**
   * <pre>
   * Hashed email address using SHA-256 hash function after normalization.
   * Accepted for Customer Match, Store Sales, ConversionUploadService, and
   * ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>string hashed_email = 7;</code>
   * @return Whether the hashedEmail field is set.
   */
  boolean hasHashedEmail();
  /**
   * <pre>
   * Hashed email address using SHA-256 hash function after normalization.
   * Accepted for Customer Match, Store Sales, ConversionUploadService, and
   * ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>string hashed_email = 7;</code>
   * @return The hashedEmail.
   */
  java.lang.String getHashedEmail();
  /**
   * <pre>
   * Hashed email address using SHA-256 hash function after normalization.
   * Accepted for Customer Match, Store Sales, ConversionUploadService, and
   * ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>string hashed_email = 7;</code>
   * @return The bytes for hashedEmail.
   */
  com.google.protobuf.ByteString
      getHashedEmailBytes();

  /**
   * <pre>
   * Hashed phone number using SHA-256 hash function after normalization
   * (E164 standard). Accepted for Customer Match, Store Sales,
   * ConversionUploadService, and ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>string hashed_phone_number = 8;</code>
   * @return Whether the hashedPhoneNumber field is set.
   */
  boolean hasHashedPhoneNumber();
  /**
   * <pre>
   * Hashed phone number using SHA-256 hash function after normalization
   * (E164 standard). Accepted for Customer Match, Store Sales,
   * ConversionUploadService, and ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>string hashed_phone_number = 8;</code>
   * @return The hashedPhoneNumber.
   */
  java.lang.String getHashedPhoneNumber();
  /**
   * <pre>
   * Hashed phone number using SHA-256 hash function after normalization
   * (E164 standard). Accepted for Customer Match, Store Sales,
   * ConversionUploadService, and ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>string hashed_phone_number = 8;</code>
   * @return The bytes for hashedPhoneNumber.
   */
  com.google.protobuf.ByteString
      getHashedPhoneNumberBytes();

  /**
   * <pre>
   * Mobile device ID (advertising ID/IDFA). Accepted only for Customer Match.
   * </pre>
   *
   * <code>string mobile_id = 9;</code>
   * @return Whether the mobileId field is set.
   */
  boolean hasMobileId();
  /**
   * <pre>
   * Mobile device ID (advertising ID/IDFA). Accepted only for Customer Match.
   * </pre>
   *
   * <code>string mobile_id = 9;</code>
   * @return The mobileId.
   */
  java.lang.String getMobileId();
  /**
   * <pre>
   * Mobile device ID (advertising ID/IDFA). Accepted only for Customer Match.
   * </pre>
   *
   * <code>string mobile_id = 9;</code>
   * @return The bytes for mobileId.
   */
  com.google.protobuf.ByteString
      getMobileIdBytes();

  /**
   * <pre>
   * Advertiser-assigned user ID for Customer Match upload, or
   * third-party-assigned user ID for Store Sales. Accepted only for Customer
   * Match and Store Sales.
   * </pre>
   *
   * <code>string third_party_user_id = 10;</code>
   * @return Whether the thirdPartyUserId field is set.
   */
  boolean hasThirdPartyUserId();
  /**
   * <pre>
   * Advertiser-assigned user ID for Customer Match upload, or
   * third-party-assigned user ID for Store Sales. Accepted only for Customer
   * Match and Store Sales.
   * </pre>
   *
   * <code>string third_party_user_id = 10;</code>
   * @return The thirdPartyUserId.
   */
  java.lang.String getThirdPartyUserId();
  /**
   * <pre>
   * Advertiser-assigned user ID for Customer Match upload, or
   * third-party-assigned user ID for Store Sales. Accepted only for Customer
   * Match and Store Sales.
   * </pre>
   *
   * <code>string third_party_user_id = 10;</code>
   * @return The bytes for thirdPartyUserId.
   */
  com.google.protobuf.ByteString
      getThirdPartyUserIdBytes();

  /**
   * <pre>
   * Address information. Accepted only for Customer Match, Store Sales, and
   * ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.OfflineUserAddressInfo address_info = 5;</code>
   * @return Whether the addressInfo field is set.
   */
  boolean hasAddressInfo();
  /**
   * <pre>
   * Address information. Accepted only for Customer Match, Store Sales, and
   * ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.OfflineUserAddressInfo address_info = 5;</code>
   * @return The addressInfo.
   */
  com.google.ads.googleads.v15.common.OfflineUserAddressInfo getAddressInfo();
  /**
   * <pre>
   * Address information. Accepted only for Customer Match, Store Sales, and
   * ConversionAdjustmentUploadService.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.OfflineUserAddressInfo address_info = 5;</code>
   */
  com.google.ads.googleads.v15.common.OfflineUserAddressInfoOrBuilder getAddressInfoOrBuilder();

  com.google.ads.googleads.v15.common.UserIdentifier.IdentifierCase getIdentifierCase();
}
