// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/campaign_asset_set.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface CampaignAssetSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.CampaignAssetSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign asset set.
   * Asset set asset resource names have the form:
   *
   * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign asset set.
   * Asset set asset resource names have the form:
   *
   * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign to which this asset set is linked.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which this asset set is linked.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Immutable. The asset set which is linked to the campaign.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetSet.
   */
  java.lang.String getAssetSet();
  /**
   * <pre>
   * Immutable. The asset set which is linked to the campaign.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetSet.
   */
  com.google.protobuf.ByteString
      getAssetSetBytes();

  /**
   * <pre>
   * Output only. The status of the campaign asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the campaign asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v17.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus getStatus();
}
