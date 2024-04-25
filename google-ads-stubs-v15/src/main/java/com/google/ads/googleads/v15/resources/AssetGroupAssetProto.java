// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/asset_group_asset.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class AssetGroupAssetProto {
  private AssetGroupAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AssetGroupAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AssetGroupAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v15/resources/ass" +
      "et_group_asset.proto\022\"google.ads.googlea" +
      "ds.v15.resources\0322google/ads/googleads/v" +
      "15/common/asset_policy.proto\0324google/ads" +
      "/googleads/v15/common/policy_summary.pro" +
      "to\0325google/ads/googleads/v15/enums/asset" +
      "_field_type.proto\032>google/ads/googleads/" +
      "v15/enums/asset_link_primary_status.prot" +
      "o\032Egoogle/ads/googleads/v15/enums/asset_" +
      "link_primary_status_reason.proto\0326google" +
      "/ads/googleads/v15/enums/asset_link_stat" +
      "us.proto\032<google/ads/googleads/v15/enums" +
      "/asset_performance_label.proto\0321google/a" +
      "ds/googleads/v15/enums/asset_source.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\"\354\010\n\017AssetGroupAsse" +
      "t\022G\n\rresource_name\030\001 \001(\tB0\340A\005\372A*\n(google" +
      "ads.googleapis.com/AssetGroupAsset\022@\n\013as" +
      "set_group\030\002 \001(\tB+\340A\005\372A%\n#googleads.googl" +
      "eapis.com/AssetGroup\0225\n\005asset\030\003 \001(\tB&\340A\005" +
      "\372A \n\036googleads.googleapis.com/Asset\022U\n\nf" +
      "ield_type\030\004 \001(\0162A.google.ads.googleads.v" +
      "15.enums.AssetFieldTypeEnum.AssetFieldTy" +
      "pe\022S\n\006status\030\005 \001(\0162C.google.ads.googlead" +
      "s.v15.enums.AssetLinkStatusEnum.AssetLin" +
      "kStatus\022n\n\016primary_status\030\010 \001(\0162Q.google" +
      ".ads.googleads.v15.enums.AssetLinkPrimar" +
      "yStatusEnum.AssetLinkPrimaryStatusB\003\340A\003\022" +
      "\202\001\n\026primary_status_reasons\030\t \003(\0162].googl" +
      "e.ads.googleads.v15.enums.AssetLinkPrima" +
      "ryStatusReasonEnum.AssetLinkPrimaryStatu" +
      "sReasonB\003\340A\003\022c\n\026primary_status_details\030\n" +
      " \003(\0132>.google.ads.googleads.v15.common.A" +
      "ssetLinkPrimaryStatusDetailsB\003\340A\003\022o\n\021per" +
      "formance_label\030\006 \001(\0162O.google.ads.google" +
      "ads.v15.enums.AssetPerformanceLabelEnum." +
      "AssetPerformanceLabelB\003\340A\003\022K\n\016policy_sum" +
      "mary\030\007 \001(\0132..google.ads.googleads.v15.co" +
      "mmon.PolicySummaryB\003\340A\003\022P\n\006source\030\013 \001(\0162" +
      ";.google.ads.googleads.v15.enums.AssetSo" +
      "urceEnum.AssetSourceB\003\340A\003:\200\001\352A}\n(googlea" +
      "ds.googleapis.com/AssetGroupAsset\022Qcusto" +
      "mers/{customer_id}/assetGroupAssets/{ass" +
      "et_group_id}~{asset_id}~{field_type}B\206\002\n" +
      "&com.google.ads.googleads.v15.resourcesB" +
      "\024AssetGroupAssetProtoP\001ZKgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v15" +
      "/resources;resources\242\002\003GAA\252\002\"Google.Ads." +
      "GoogleAds.V15.Resources\312\002\"Google\\Ads\\Goo" +
      "gleAds\\V15\\Resources\352\002&Google::Ads::Goog" +
      "leAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.AssetPolicyProto.getDescriptor(),
          com.google.ads.googleads.v15.common.PolicySummaryProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AssetGroupAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AssetGroupAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AssetGroupAsset_descriptor,
        new java.lang.String[] { "ResourceName", "AssetGroup", "Asset", "FieldType", "Status", "PrimaryStatus", "PrimaryStatusReasons", "PrimaryStatusDetails", "PerformanceLabel", "PolicySummary", "Source", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.AssetPolicyProto.getDescriptor();
    com.google.ads.googleads.v15.common.PolicySummaryProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
