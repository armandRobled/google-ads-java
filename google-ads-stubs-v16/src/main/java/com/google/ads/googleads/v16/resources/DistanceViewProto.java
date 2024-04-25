// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/distance_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class DistanceViewProto {
  private DistanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_DistanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_DistanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v16/resources/dis" +
      "tance_view.proto\022\"google.ads.googleads.v" +
      "16.resources\0324google/ads/googleads/v16/e" +
      "nums/distance_bucket.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\"\344\002\n\014DistanceView\022D\n\rresource_name" +
      "\030\001 \001(\tB-\340A\003\372A\'\n%googleads.googleapis.com" +
      "/DistanceView\022_\n\017distance_bucket\030\002 \001(\0162A" +
      ".google.ads.googleads.v16.enums.Distance" +
      "BucketEnum.DistanceBucketB\003\340A\003\022\037\n\rmetric" +
      "_system\030\004 \001(\010B\003\340A\003H\000\210\001\001:z\352Aw\n%googleads." +
      "googleapis.com/DistanceView\022Ncustomers/{" +
      "customer_id}/distanceViews/{placeholder_" +
      "chain_id}~{distance_bucket}B\020\n\016_metric_s" +
      "ystemB\203\002\n&com.google.ads.googleads.v16.r" +
      "esourcesB\021DistanceViewProtoP\001ZKgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v16/resources;resources\242\002\003GAA\252\002\"Googl" +
      "e.Ads.GoogleAds.V16.Resources\312\002\"Google\\A" +
      "ds\\GoogleAds\\V16\\Resources\352\002&Google::Ads" +
      "::GoogleAds::V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.DistanceBucketProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_DistanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_DistanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_DistanceView_descriptor,
        new java.lang.String[] { "ResourceName", "DistanceBucket", "MetricSystem", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.DistanceBucketProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
