// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/display_keyword_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class DisplayKeywordViewProto {
  private DisplayKeywordViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_DisplayKeywordView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_DisplayKeywordView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v17/resources/dis" +
      "play_keyword_view.proto\022\"google.ads.goog" +
      "leads.v17.resources\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\"" +
      "\334\001\n\022DisplayKeywordView\022J\n\rresource_name\030" +
      "\001 \001(\tB3\340A\003\372A-\n+googleads.googleapis.com/" +
      "DisplayKeywordView:z\352Aw\n+googleads.googl" +
      "eapis.com/DisplayKeywordView\022Hcustomers/" +
      "{customer_id}/displayKeywordViews/{ad_gr" +
      "oup_id}~{criterion_id}B\211\002\n&com.google.ad" +
      "s.googleads.v17.resourcesB\027DisplayKeywor" +
      "dViewProtoP\001ZKgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v17/resources;" +
      "resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V" +
      "17.Resources\312\002\"Google\\Ads\\GoogleAds\\V17\\" +
      "Resources\352\002&Google::Ads::GoogleAds::V17:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_DisplayKeywordView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_DisplayKeywordView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_DisplayKeywordView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
