// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad_group_label.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class AdGroupLabelProto {
  private AdGroupLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AdGroupLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AdGroupLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v16/resources/ad_" +
      "group_label.proto\022\"google.ads.googleads." +
      "v16.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\324\002\n\014Ad" +
      "GroupLabel\022D\n\rresource_name\030\001 \001(\tB-\340A\005\372A" +
      "\'\n%googleads.googleapis.com/AdGroupLabel" +
      "\022?\n\010ad_group\030\004 \001(\tB(\340A\005\372A\"\n googleads.go" +
      "ogleapis.com/AdGroupH\000\210\001\001\022:\n\005label\030\005 \001(\t" +
      "B&\340A\005\372A \n\036googleads.googleapis.com/Label" +
      "H\001\210\001\001:j\352Ag\n%googleads.googleapis.com/AdG" +
      "roupLabel\022>customers/{customer_id}/adGro" +
      "upLabels/{ad_group_id}~{label_id}B\013\n\t_ad" +
      "_groupB\010\n\006_labelB\203\002\n&com.google.ads.goog" +
      "leads.v16.resourcesB\021AdGroupLabelProtoP\001" +
      "ZKgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v16/resources;resources\242\002\003" +
      "GAA\252\002\"Google.Ads.GoogleAds.V16.Resources" +
      "\312\002\"Google\\Ads\\GoogleAds\\V16\\Resources\352\002&" +
      "Google::Ads::GoogleAds::V16::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_AdGroupLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_AdGroupLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AdGroupLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "Label", });
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
