// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/combined_audience.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class CombinedAudienceProto {
  private CombinedAudienceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_CombinedAudience_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_CombinedAudience_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v15/resources/com" +
      "bined_audience.proto\022\"google.ads.googlea" +
      "ds.v15.resources\032=google/ads/googleads/v" +
      "15/enums/combined_audience_status.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\"\364\002\n\020CombinedAudience" +
      "\022H\n\rresource_name\030\001 \001(\tB1\340A\005\372A+\n)googlea" +
      "ds.googleapis.com/CombinedAudience\022\017\n\002id" +
      "\030\002 \001(\003B\003\340A\003\022f\n\006status\030\003 \001(\0162Q.google.ads" +
      ".googleads.v15.enums.CombinedAudienceSta" +
      "tusEnum.CombinedAudienceStatusB\003\340A\003\022\021\n\004n" +
      "ame\030\004 \001(\tB\003\340A\003\022\030\n\013description\030\005 \001(\tB\003\340A\003" +
      ":p\352Am\n)googleads.googleapis.com/Combined" +
      "Audience\022@customers/{customer_id}/combin" +
      "edAudiences/{combined_audience_id}B\207\002\n&c" +
      "om.google.ads.googleads.v15.resourcesB\025C" +
      "ombinedAudienceProtoP\001ZKgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v15/" +
      "resources;resources\242\002\003GAA\252\002\"Google.Ads.G" +
      "oogleAds.V15.Resources\312\002\"Google\\Ads\\Goog" +
      "leAds\\V15\\Resources\352\002&Google::Ads::Googl" +
      "eAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.CombinedAudienceStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_CombinedAudience_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_CombinedAudience_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_CombinedAudience_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "Name", "Description", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.CombinedAudienceStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
