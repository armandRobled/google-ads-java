// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/asset_set_asset.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class AssetSetAssetProto {
  private AssetSetAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AssetSetAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AssetSetAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v15/resources/ass" +
      "et_set_asset.proto\022\"google.ads.googleads" +
      ".v15.resources\032;google/ads/googleads/v15" +
      "/enums/asset_set_asset_status.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\"\234\003\n\rAssetSetAsset\022E\n\rres" +
      "ource_name\030\001 \001(\tB.\340A\005\372A(\n&googleads.goog" +
      "leapis.com/AssetSetAsset\022<\n\tasset_set\030\002 " +
      "\001(\tB)\340A\005\372A#\n!googleads.googleapis.com/As" +
      "setSet\0225\n\005asset\030\003 \001(\tB&\340A\005\372A \n\036googleads" +
      ".googleapis.com/Asset\022`\n\006status\030\004 \001(\0162K." +
      "google.ads.googleads.v15.enums.AssetSetA" +
      "ssetStatusEnum.AssetSetAssetStatusB\003\340A\003:" +
      "m\352Aj\n&googleads.googleapis.com/AssetSetA" +
      "sset\022@customers/{customer_id}/assetSetAs" +
      "sets/{asset_set_id}~{asset_id}B\204\002\n&com.g" +
      "oogle.ads.googleads.v15.resourcesB\022Asset" +
      "SetAssetProtoP\001ZKgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v15/resourc" +
      "es;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAd" +
      "s.V15.Resources\312\002\"Google\\Ads\\GoogleAds\\V" +
      "15\\Resources\352\002&Google::Ads::GoogleAds::V" +
      "15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.AssetSetAssetStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AssetSetAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AssetSetAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AssetSetAsset_descriptor,
        new java.lang.String[] { "ResourceName", "AssetSet", "Asset", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.AssetSetAssetStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
