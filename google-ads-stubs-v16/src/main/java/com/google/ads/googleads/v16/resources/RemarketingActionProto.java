// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/remarketing_action.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class RemarketingActionProto {
  private RemarketingActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_RemarketingAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_RemarketingAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v16/resources/rem" +
      "arketing_action.proto\022\"google.ads.google" +
      "ads.v16.resources\0321google/ads/googleads/" +
      "v16/common/tag_snippet.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\"\324\002\n\021RemarketingAction\022I\n\rresour" +
      "ce_name\030\001 \001(\tB2\340A\005\372A,\n*googleads.googlea" +
      "pis.com/RemarketingAction\022\024\n\002id\030\005 \001(\003B\003\340" +
      "A\003H\000\210\001\001\022\021\n\004name\030\006 \001(\tH\001\210\001\001\022F\n\014tag_snippe" +
      "ts\030\004 \003(\0132+.google.ads.googleads.v16.comm" +
      "on.TagSnippetB\003\340A\003:s\352Ap\n*googleads.googl" +
      "eapis.com/RemarketingAction\022Bcustomers/{" +
      "customer_id}/remarketingActions/{remarke" +
      "ting_action_id}B\005\n\003_idB\007\n\005_nameB\210\002\n&com." +
      "google.ads.googleads.v16.resourcesB\026Rema" +
      "rketingActionProtoP\001ZKgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v16/re" +
      "sources;resources\242\002\003GAA\252\002\"Google.Ads.Goo" +
      "gleAds.V16.Resources\312\002\"Google\\Ads\\Google" +
      "Ads\\V16\\Resources\352\002&Google::Ads::GoogleA" +
      "ds::V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.TagSnippetProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_RemarketingAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_RemarketingAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_RemarketingAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "TagSnippets", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.TagSnippetProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
