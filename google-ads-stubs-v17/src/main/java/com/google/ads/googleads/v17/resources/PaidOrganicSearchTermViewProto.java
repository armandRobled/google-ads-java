// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/paid_organic_search_term_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class PaidOrganicSearchTermViewProto {
  private PaidOrganicSearchTermViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_PaidOrganicSearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_PaidOrganicSearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v17/resources/pai" +
      "d_organic_search_term_view.proto\022\"google" +
      ".ads.googleads.v17.resources\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\"\275\002\n\031PaidOrganicSearchTermView\022Q" +
      "\n\rresource_name\030\001 \001(\tB:\340A\003\372A4\n2googleads" +
      ".googleapis.com/PaidOrganicSearchTermVie" +
      "w\022\035\n\013search_term\030\003 \001(\tB\003\340A\003H\000\210\001\001:\235\001\352A\231\001\n" +
      "2googleads.googleapis.com/PaidOrganicSea" +
      "rchTermView\022ccustomers/{customer_id}/pai" +
      "dOrganicSearchTermViews/{campaign_id}~{a" +
      "d_group_id}~{base64_search_term}B\016\n\014_sea" +
      "rch_termB\220\002\n&com.google.ads.googleads.v1" +
      "7.resourcesB\036PaidOrganicSearchTermViewPr" +
      "otoP\001ZKgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v17/resources;resourc" +
      "es\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V17.Reso" +
      "urces\312\002\"Google\\Ads\\GoogleAds\\V17\\Resourc" +
      "es\352\002&Google::Ads::GoogleAds::V17::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_PaidOrganicSearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_PaidOrganicSearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_PaidOrganicSearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", });
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
