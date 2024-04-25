// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/life_event.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class LifeEventProto {
  private LifeEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_LifeEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_LifeEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v16/resources/lif" +
      "e_event.proto\022\"google.ads.googleads.v16." +
      "resources\032Egoogle/ads/googleads/v16/comm" +
      "on/criterion_category_availability.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\206\003\n\tLifeEvent\022A\n\rre" +
      "source_name\030\001 \001(\tB*\340A\003\372A$\n\"googleads.goo" +
      "gleapis.com/LifeEvent\022\017\n\002id\030\002 \001(\003B\003\340A\003\022\021" +
      "\n\004name\030\003 \001(\tB\003\340A\003\022:\n\006parent\030\004 \001(\tB*\340A\003\372A" +
      "$\n\"googleads.googleapis.com/LifeEvent\022\034\n" +
      "\017launched_to_all\030\005 \001(\010B\003\340A\003\022[\n\016availabil" +
      "ities\030\006 \003(\0132>.google.ads.googleads.v16.c" +
      "ommon.CriterionCategoryAvailabilityB\003\340A\003" +
      ":[\352AX\n\"googleads.googleapis.com/LifeEven" +
      "t\0222customers/{customer_id}/lifeEvents/{l" +
      "ife_event_id}B\200\002\n&com.google.ads.googlea" +
      "ds.v16.resourcesB\016LifeEventProtoP\001ZKgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v16/resources;resources\242\002\003GAA\252\002\"" +
      "Google.Ads.GoogleAds.V16.Resources\312\002\"Goo" +
      "gle\\Ads\\GoogleAds\\V16\\Resources\352\002&Google" +
      "::Ads::GoogleAds::V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.CriterionCategoryAvailabilityProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_LifeEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_LifeEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_LifeEvent_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Parent", "LaunchedToAll", "Availabilities", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.CriterionCategoryAvailabilityProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
