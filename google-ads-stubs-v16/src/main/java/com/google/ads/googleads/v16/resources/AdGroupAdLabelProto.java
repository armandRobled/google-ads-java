// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad_group_ad_label.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class AdGroupAdLabelProto {
  private AdGroupAdLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AdGroupAdLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AdGroupAdLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v16/resources/ad_" +
      "group_ad_label.proto\022\"google.ads.googlea" +
      "ds.v16.resources\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\354\002\n" +
      "\016AdGroupAdLabel\022F\n\rresource_name\030\001 \001(\tB/" +
      "\340A\005\372A)\n\'googleads.googleapis.com/AdGroup" +
      "AdLabel\022D\n\013ad_group_ad\030\004 \001(\tB*\340A\005\372A$\n\"go" +
      "ogleads.googleapis.com/AdGroupAdH\000\210\001\001\022:\n" +
      "\005label\030\005 \001(\tB&\340A\005\372A \n\036googleads.googleap" +
      "is.com/LabelH\001\210\001\001:v\352As\n\'googleads.google" +
      "apis.com/AdGroupAdLabel\022Hcustomers/{cust" +
      "omer_id}/adGroupAdLabels/{ad_group_id}~{" +
      "ad_id}~{label_id}B\016\n\014_ad_group_adB\010\n\006_la" +
      "belB\205\002\n&com.google.ads.googleads.v16.res" +
      "ourcesB\023AdGroupAdLabelProtoP\001ZKgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v16/resources;resources\242\002\003GAA\252\002\"Googl" +
      "e.Ads.GoogleAds.V16.Resources\312\002\"Google\\A" +
      "ds\\GoogleAds\\V16\\Resources\352\002&Google::Ads" +
      "::GoogleAds::V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_AdGroupAdLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_AdGroupAdLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AdGroupAdLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", "Label", });
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
