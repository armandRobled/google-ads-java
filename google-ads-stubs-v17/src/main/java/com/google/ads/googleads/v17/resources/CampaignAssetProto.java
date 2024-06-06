// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/campaign_asset.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class CampaignAssetProto {
  private CampaignAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_CampaignAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_CampaignAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v17/resources/cam" +
      "paign_asset.proto\022\"google.ads.googleads." +
      "v17.resources\0322google/ads/googleads/v17/" +
      "common/asset_policy.proto\0325google/ads/go" +
      "ogleads/v17/enums/asset_field_type.proto" +
      "\032>google/ads/googleads/v17/enums/asset_l" +
      "ink_primary_status.proto\032Egoogle/ads/goo" +
      "gleads/v17/enums/asset_link_primary_stat" +
      "us_reason.proto\0326google/ads/googleads/v1" +
      "7/enums/asset_link_status.proto\0321google/" +
      "ads/googleads/v17/enums/asset_source.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\"\303\007\n\rCampaignAsset" +
      "\022E\n\rresource_name\030\001 \001(\tB.\340A\005\372A(\n&googlea" +
      "ds.googleapis.com/CampaignAsset\022@\n\010campa" +
      "ign\030\006 \001(\tB)\340A\005\372A#\n!googleads.googleapis." +
      "com/CampaignH\000\210\001\001\022:\n\005asset\030\007 \001(\tB&\340A\005\372A " +
      "\n\036googleads.googleapis.com/AssetH\001\210\001\001\022Z\n" +
      "\nfield_type\030\004 \001(\0162A.google.ads.googleads" +
      ".v17.enums.AssetFieldTypeEnum.AssetField" +
      "TypeB\003\340A\005\022P\n\006source\030\010 \001(\0162;.google.ads.g" +
      "oogleads.v17.enums.AssetSourceEnum.Asset" +
      "SourceB\003\340A\003\022S\n\006status\030\005 \001(\0162C.google.ads" +
      ".googleads.v17.enums.AssetLinkStatusEnum" +
      ".AssetLinkStatus\022n\n\016primary_status\030\t \001(\016" +
      "2Q.google.ads.googleads.v17.enums.AssetL" +
      "inkPrimaryStatusEnum.AssetLinkPrimarySta" +
      "tusB\003\340A\003\022c\n\026primary_status_details\030\n \003(\013" +
      "2>.google.ads.googleads.v17.common.Asset" +
      "LinkPrimaryStatusDetailsB\003\340A\003\022\202\001\n\026primar" +
      "y_status_reasons\030\013 \003(\0162].google.ads.goog" +
      "leads.v17.enums.AssetLinkPrimaryStatusRe" +
      "asonEnum.AssetLinkPrimaryStatusReasonB\003\340" +
      "A\003:y\352Av\n&googleads.googleapis.com/Campai" +
      "gnAsset\022Lcustomers/{customer_id}/campaig" +
      "nAssets/{campaign_id}~{asset_id}~{field_" +
      "type}B\013\n\t_campaignB\010\n\006_assetB\204\002\n&com.goo" +
      "gle.ads.googleads.v17.resourcesB\022Campaig" +
      "nAssetProtoP\001ZKgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v17/resources" +
      ";resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds." +
      "V17.Resources\312\002\"Google\\Ads\\GoogleAds\\V17" +
      "\\Resources\352\002&Google::Ads::GoogleAds::V17" +
      "::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.common.AssetPolicyProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.AssetLinkPrimaryStatusProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.AssetLinkPrimaryStatusReasonProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.AssetLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.AssetSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_CampaignAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_CampaignAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_CampaignAsset_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "Asset", "FieldType", "Source", "Status", "PrimaryStatus", "PrimaryStatusDetails", "PrimaryStatusReasons", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.common.AssetPolicyProto.getDescriptor();
    com.google.ads.googleads.v17.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v17.enums.AssetLinkPrimaryStatusProto.getDescriptor();
    com.google.ads.googleads.v17.enums.AssetLinkPrimaryStatusReasonProto.getDescriptor();
    com.google.ads.googleads.v17.enums.AssetLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v17.enums.AssetSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
