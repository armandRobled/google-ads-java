// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/asset_group_top_combination_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class AssetGroupTopCombinationViewProto {
  private AssetGroupTopCombinationViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AssetGroupTopCombinationView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AssetGroupTopCombinationView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AssetGroupAssetCombinationData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AssetGroupAssetCombinationData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v15/resources/ass" +
      "et_group_top_combination_view.proto\022\"goo" +
      "gle.ads.googleads.v15.resources\0321google/" +
      "ads/googleads/v15/common/asset_usage.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\"\206\003\n\034AssetGroupTop" +
      "CombinationView\022T\n\rresource_name\030\001 \001(\tB=" +
      "\340A\003\372A7\n5googleads.googleapis.com/AssetGr" +
      "oupTopCombinationView\022m\n\034asset_group_top" +
      "_combinations\030\002 \003(\0132B.google.ads.googlea" +
      "ds.v15.resources.AssetGroupAssetCombinat" +
      "ionDataB\003\340A\003:\240\001\352A\234\001\n5googleads.googleapi" +
      "s.com/AssetGroupTopCombinationView\022ccust" +
      "omers/{customer_id}/assetGroupTopCombina" +
      "tionViews/{asset_group_id}~{asset_combin" +
      "ation_category}\"{\n\036AssetGroupAssetCombin" +
      "ationData\022Y\n\037asset_combination_served_as" +
      "sets\030\001 \003(\0132+.google.ads.googleads.v15.co" +
      "mmon.AssetUsageB\003\340A\003B\223\002\n&com.google.ads." +
      "googleads.v15.resourcesB!AssetGroupTopCo" +
      "mbinationViewProtoP\001ZKgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v15/re" +
      "sources;resources\242\002\003GAA\252\002\"Google.Ads.Goo" +
      "gleAds.V15.Resources\312\002\"Google\\Ads\\Google" +
      "Ads\\V15\\Resources\352\002&Google::Ads::GoogleA" +
      "ds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.AssetUsageProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AssetGroupTopCombinationView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AssetGroupTopCombinationView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AssetGroupTopCombinationView_descriptor,
        new java.lang.String[] { "ResourceName", "AssetGroupTopCombinations", });
    internal_static_google_ads_googleads_v15_resources_AssetGroupAssetCombinationData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_resources_AssetGroupAssetCombinationData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AssetGroupAssetCombinationData_descriptor,
        new java.lang.String[] { "AssetCombinationServedAssets", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.AssetUsageProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
