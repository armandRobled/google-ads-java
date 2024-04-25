// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/ad_parameter_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public final class AdParameterServiceProto {
  private AdParameterServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateAdParametersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateAdParametersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_AdParameterOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_AdParameterOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateAdParametersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateAdParametersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateAdParameterResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateAdParameterResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v16/services/ad_p" +
      "arameter_service.proto\022!google.ads.googl" +
      "eads.v16.services\032:google/ads/googleads/" +
      "v16/enums/response_content_type.proto\0325g" +
      "oogle/ads/googleads/v16/resources/ad_par" +
      "ameter.proto\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032 google/protobuf/field_mask.prot" +
      "o\032\027google/rpc/status.proto\"\243\002\n\031MutateAdP" +
      "arametersRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340" +
      "A\002\022P\n\noperations\030\002 \003(\01327.google.ads.goog" +
      "leads.v16.services.AdParameterOperationB" +
      "\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidat" +
      "e_only\030\004 \001(\010\022j\n\025response_content_type\030\005 " +
      "\001(\0162K.google.ads.googleads.v16.enums.Res" +
      "ponseContentTypeEnum.ResponseContentType" +
      "\"\227\002\n\024AdParameterOperation\022/\n\013update_mask" +
      "\030\004 \001(\0132\032.google.protobuf.FieldMask\022A\n\006cr" +
      "eate\030\001 \001(\0132/.google.ads.googleads.v16.re" +
      "sources.AdParameterH\000\022A\n\006update\030\002 \001(\0132/." +
      "google.ads.googleads.v16.resources.AdPar" +
      "ameterH\000\022;\n\006remove\030\003 \001(\tB)\372A&\n$googleads" +
      ".googleapis.com/AdParameterH\000B\013\n\toperati" +
      "on\"\234\001\n\032MutateAdParametersResponse\0221\n\025par" +
      "tial_failure_error\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022K\n\007results\030\002 \003(\0132:.google.ads.googl" +
      "eads.v16.services.MutateAdParameterResul" +
      "t\"\242\001\n\027MutateAdParameterResult\022@\n\rresourc" +
      "e_name\030\001 \001(\tB)\372A&\n$googleads.googleapis." +
      "com/AdParameter\022E\n\014ad_parameter\030\002 \001(\0132/." +
      "google.ads.googleads.v16.resources.AdPar" +
      "ameter2\307\002\n\022AdParameterService\022\351\001\n\022Mutate" +
      "AdParameters\022<.google.ads.googleads.v16." +
      "services.MutateAdParametersRequest\032=.goo" +
      "gle.ads.googleads.v16.services.MutateAdP" +
      "arametersResponse\"V\332A\026customer_id,operat" +
      "ions\202\323\344\223\0027\"2/v16/customers/{customer_id=" +
      "*}/adParameters:mutate:\001*\032E\312A\030googleads." +
      "googleapis.com\322A\'https://www.googleapis." +
      "com/auth/adwordsB\203\002\n%com.google.ads.goog" +
      "leads.v16.servicesB\027AdParameterServicePr" +
      "otoP\001ZIgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v16/services;services" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V16.Servic" +
      "es\312\002!Google\\Ads\\GoogleAds\\V16\\Services\352\002" +
      "%Google::Ads::GoogleAds::V16::Servicesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.resources.AdParameterProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_services_MutateAdParametersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_services_MutateAdParametersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateAdParametersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v16_services_AdParameterOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_services_AdParameterOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_AdParameterOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v16_services_MutateAdParametersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_services_MutateAdParametersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateAdParametersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v16_services_MutateAdParameterResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v16_services_MutateAdParameterResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateAdParameterResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdParameter", });
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
    com.google.ads.googleads.v16.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v16.resources.AdParameterProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
