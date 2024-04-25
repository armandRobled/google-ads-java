// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/ad_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public final class AdServiceProto {
  private AdServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_GetAdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_GetAdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateAdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateAdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_AdOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_AdOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateAdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateAdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateAdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateAdResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v15/services/ad_s" +
      "ervice.proto\022!google.ads.googleads.v15.s" +
      "ervices\032,google/ads/googleads/v15/common" +
      "/policy.proto\032:google/ads/googleads/v15/" +
      "enums/response_content_type.proto\032+googl" +
      "e/ads/googleads/v15/resources/ad.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\027google/rpc/" +
      "status.proto\"J\n\014GetAdRequest\022:\n\rresource" +
      "_name\030\001 \001(\tB#\340A\002\372A\035\n\033googleads.googleapi" +
      "s.com/Ad\"\221\002\n\020MutateAdsRequest\022\030\n\013custome" +
      "r_id\030\001 \001(\tB\003\340A\002\022G\n\noperations\030\002 \003(\0132..go" +
      "ogle.ads.googleads.v15.services.AdOperat" +
      "ionB\003\340A\002\022\027\n\017partial_failure\030\004 \001(\010\022j\n\025res" +
      "ponse_content_type\030\005 \001(\0162K.google.ads.go" +
      "ogleads.v15.enums.ResponseContentTypeEnu" +
      "m.ResponseContentType\022\025\n\rvalidate_only\030\003" +
      " \001(\010\"\346\001\n\013AdOperation\022/\n\013update_mask\030\002 \001(" +
      "\0132\032.google.protobuf.FieldMask\022_\n\033policy_" +
      "validation_parameter\030\003 \001(\0132:.google.ads." +
      "googleads.v15.common.PolicyValidationPar" +
      "ameter\0228\n\006update\030\001 \001(\0132&.google.ads.goog" +
      "leads.v15.resources.AdH\000B\013\n\toperation\"\212\001" +
      "\n\021MutateAdsResponse\0221\n\025partial_failure_e" +
      "rror\030\003 \001(\0132\022.google.rpc.Status\022B\n\007result" +
      "s\030\002 \003(\01321.google.ads.googleads.v15.servi" +
      "ces.MutateAdResult\"}\n\016MutateAdResult\0227\n\r" +
      "resource_name\030\001 \001(\tB \372A\035\n\033googleads.goog" +
      "leapis.com/Ad\0222\n\002ad\030\002 \001(\0132&.google.ads.g" +
      "oogleads.v15.resources.Ad2\275\003\n\tAdService\022" +
      "\240\001\n\005GetAd\022/.google.ads.googleads.v15.ser" +
      "vices.GetAdRequest\032&.google.ads.googlead" +
      "s.v15.resources.Ad\">\332A\rresource_name\202\323\344\223" +
      "\002(\022&/v15/{resource_name=customers/*/ads/" +
      "*}\022\305\001\n\tMutateAds\0223.google.ads.googleads." +
      "v15.services.MutateAdsRequest\0324.google.a" +
      "ds.googleads.v15.services.MutateAdsRespo" +
      "nse\"M\332A\026customer_id,operations\202\323\344\223\002.\")/v" +
      "15/customers/{customer_id=*}/ads:mutate:" +
      "\001*\032E\312A\030googleads.googleapis.com\322A\'https:" +
      "//www.googleapis.com/auth/adwordsB\372\001\n%co" +
      "m.google.ads.googleads.v15.servicesB\016AdS" +
      "erviceProtoP\001ZIgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v15/services;" +
      "services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1" +
      "5.Services\312\002!Google\\Ads\\GoogleAds\\V15\\Se" +
      "rvices\352\002%Google::Ads::GoogleAds::V15::Se" +
      "rvicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.AdProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_GetAdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_GetAdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_GetAdRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v15_services_MutateAdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_MutateAdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateAdsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ResponseContentType", "ValidateOnly", });
    internal_static_google_ads_googleads_v15_services_AdOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_AdOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_AdOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "PolicyValidationParameter", "Update", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateAdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateAdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateAdsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateAdResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v15_services_MutateAdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateAdResult_descriptor,
        new java.lang.String[] { "ResourceName", "Ad", });
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
    com.google.ads.googleads.v15.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v15.resources.AdProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
