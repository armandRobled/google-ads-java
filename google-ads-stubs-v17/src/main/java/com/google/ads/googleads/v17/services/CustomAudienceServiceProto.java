// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/custom_audience_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public final class CustomAudienceServiceProto {
  private CustomAudienceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_CustomAudienceOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_CustomAudienceOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCustomAudienceResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCustomAudienceResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v17/services/cust" +
      "om_audience_service.proto\022!google.ads.go" +
      "ogleads.v17.services\0328google/ads/googlea" +
      "ds/v17/resources/custom_audience.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\"\244\001\n\034MutateCu" +
      "stomAudiencesRequest\022\030\n\013customer_id\030\001 \001(" +
      "\tB\003\340A\002\022S\n\noperations\030\002 \003(\0132:.google.ads." +
      "googleads.v17.services.CustomAudienceOpe" +
      "rationB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\"\243\002\n\027C" +
      "ustomAudienceOperation\022/\n\013update_mask\030\004 " +
      "\001(\0132\032.google.protobuf.FieldMask\022D\n\006creat" +
      "e\030\001 \001(\01322.google.ads.googleads.v17.resou" +
      "rces.CustomAudienceH\000\022D\n\006update\030\002 \001(\01322." +
      "google.ads.googleads.v17.resources.Custo" +
      "mAudienceH\000\022>\n\006remove\030\003 \001(\tB,\372A)\n\'google" +
      "ads.googleapis.com/CustomAudienceH\000B\013\n\to" +
      "peration\"o\n\035MutateCustomAudiencesRespons" +
      "e\022N\n\007results\030\001 \003(\0132=.google.ads.googlead" +
      "s.v17.services.MutateCustomAudienceResul" +
      "t\"a\n\032MutateCustomAudienceResult\022C\n\rresou" +
      "rce_name\030\001 \001(\tB,\372A)\n\'googleads.googleapi" +
      "s.com/CustomAudience2\326\002\n\025CustomAudienceS" +
      "ervice\022\365\001\n\025MutateCustomAudiences\022?.googl" +
      "e.ads.googleads.v17.services.MutateCusto" +
      "mAudiencesRequest\032@.google.ads.googleads" +
      ".v17.services.MutateCustomAudiencesRespo" +
      "nse\"Y\332A\026customer_id,operations\202\323\344\223\002:\"5/v" +
      "17/customers/{customer_id=*}/customAudie" +
      "nces:mutate:\001*\032E\312A\030googleads.googleapis." +
      "com\322A\'https://www.googleapis.com/auth/ad" +
      "wordsB\206\002\n%com.google.ads.googleads.v17.s" +
      "ervicesB\032CustomAudienceServiceProtoP\001ZIg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v17/services;services\242\002\003GAA\252\002" +
      "!Google.Ads.GoogleAds.V17.Services\312\002!Goo" +
      "gle\\Ads\\GoogleAds\\V17\\Services\352\002%Google:" +
      ":Ads::GoogleAds::V17::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.resources.CustomAudienceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", });
    internal_static_google_ads_googleads_v17_services_CustomAudienceOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v17_services_CustomAudienceOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_CustomAudienceOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCustomAudiencesResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v17_services_MutateCustomAudienceResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v17_services_MutateCustomAudienceResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCustomAudienceResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.resources.CustomAudienceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
