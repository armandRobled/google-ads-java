// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

public interface WebhookDeliveryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.common.WebhookDelivery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Webhook url specified by advertiser to send the lead.
   * </pre>
   *
   * <code>optional string advertiser_webhook_url = 4;</code>
   * @return Whether the advertiserWebhookUrl field is set.
   */
  boolean hasAdvertiserWebhookUrl();
  /**
   * <pre>
   * Webhook url specified by advertiser to send the lead.
   * </pre>
   *
   * <code>optional string advertiser_webhook_url = 4;</code>
   * @return The advertiserWebhookUrl.
   */
  java.lang.String getAdvertiserWebhookUrl();
  /**
   * <pre>
   * Webhook url specified by advertiser to send the lead.
   * </pre>
   *
   * <code>optional string advertiser_webhook_url = 4;</code>
   * @return The bytes for advertiserWebhookUrl.
   */
  com.google.protobuf.ByteString
      getAdvertiserWebhookUrlBytes();

  /**
   * <pre>
   * Anti-spoofing secret set by the advertiser as part of the webhook payload.
   * </pre>
   *
   * <code>optional string google_secret = 5;</code>
   * @return Whether the googleSecret field is set.
   */
  boolean hasGoogleSecret();
  /**
   * <pre>
   * Anti-spoofing secret set by the advertiser as part of the webhook payload.
   * </pre>
   *
   * <code>optional string google_secret = 5;</code>
   * @return The googleSecret.
   */
  java.lang.String getGoogleSecret();
  /**
   * <pre>
   * Anti-spoofing secret set by the advertiser as part of the webhook payload.
   * </pre>
   *
   * <code>optional string google_secret = 5;</code>
   * @return The bytes for googleSecret.
   */
  com.google.protobuf.ByteString
      getGoogleSecretBytes();

  /**
   * <pre>
   * The schema version that this delivery instance will use.
   * </pre>
   *
   * <code>optional int64 payload_schema_version = 6;</code>
   * @return Whether the payloadSchemaVersion field is set.
   */
  boolean hasPayloadSchemaVersion();
  /**
   * <pre>
   * The schema version that this delivery instance will use.
   * </pre>
   *
   * <code>optional int64 payload_schema_version = 6;</code>
   * @return The payloadSchemaVersion.
   */
  long getPayloadSchemaVersion();
}
