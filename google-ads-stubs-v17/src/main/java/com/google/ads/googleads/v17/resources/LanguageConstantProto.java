// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/language_constant.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class LanguageConstantProto {
  private LanguageConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_LanguageConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_LanguageConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v17/resources/lan" +
      "guage_constant.proto\022\"google.ads.googlea" +
      "ds.v17.resources\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\272\002\n" +
      "\020LanguageConstant\022H\n\rresource_name\030\001 \001(\t" +
      "B1\340A\003\372A+\n)googleads.googleapis.com/Langu" +
      "ageConstant\022\024\n\002id\030\006 \001(\003B\003\340A\003H\000\210\001\001\022\026\n\004cod" +
      "e\030\007 \001(\tB\003\340A\003H\001\210\001\001\022\026\n\004name\030\010 \001(\tB\003\340A\003H\002\210\001" +
      "\001\022\034\n\ntargetable\030\t \001(\010B\003\340A\003H\003\210\001\001:P\352AM\n)go" +
      "ogleads.googleapis.com/LanguageConstant\022" +
      " languageConstants/{criterion_id}B\005\n\003_id" +
      "B\007\n\005_codeB\007\n\005_nameB\r\n\013_targetableB\207\002\n&co" +
      "m.google.ads.googleads.v17.resourcesB\025La" +
      "nguageConstantProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v17/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V17.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V17\\Resources\352\002&Google::Ads::Google" +
      "Ads::V17::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_LanguageConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_LanguageConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_LanguageConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Code", "Name", "Targetable", });
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
