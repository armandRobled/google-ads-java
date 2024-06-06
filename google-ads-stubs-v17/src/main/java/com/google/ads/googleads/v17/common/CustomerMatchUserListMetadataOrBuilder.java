// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/offline_user_data.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

public interface CustomerMatchUserListMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.common.CustomerMatchUserListMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return Whether the userList field is set.
   */
  boolean hasUserList();
  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return The userList.
   */
  java.lang.String getUserList();
  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return The bytes for userList.
   */
  com.google.protobuf.ByteString
      getUserListBytes();

  /**
   * <pre>
   * The consent setting for all the users in this job.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.Consent consent = 3;</code>
   * @return Whether the consent field is set.
   */
  boolean hasConsent();
  /**
   * <pre>
   * The consent setting for all the users in this job.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.Consent consent = 3;</code>
   * @return The consent.
   */
  com.google.ads.googleads.v17.common.Consent getConsent();
  /**
   * <pre>
   * The consent setting for all the users in this job.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v17.common.Consent consent = 3;</code>
   */
  com.google.ads.googleads.v17.common.ConsentOrBuilder getConsentOrBuilder();
}
