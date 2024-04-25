// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/keyword_plan_campaign_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public final class KeywordPlanCampaignServiceProto {
  private KeywordPlanCampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_KeywordPlanCampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_KeywordPlanCampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v16/services/keyw" +
      "ord_plan_campaign_service.proto\022!google." +
      "ads.googleads.v16.services\032>google/ads/g" +
      "oogleads/v16/resources/keyword_plan_camp" +
      "aign.proto\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032 google/protobuf/field_mask.proto\032" +
      "\027google/rpc/status.proto\"\307\001\n!MutateKeywo" +
      "rdPlanCampaignsRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022X\n\noperations\030\002 \003(\0132?.google.ad" +
      "s.googleads.v16.services.KeywordPlanCamp" +
      "aignOperationB\003\340A\002\022\027\n\017partial_failure\030\003 " +
      "\001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\267\002\n\034KeywordPl" +
      "anCampaignOperation\022/\n\013update_mask\030\004 \001(\013" +
      "2\032.google.protobuf.FieldMask\022I\n\006create\030\001" +
      " \001(\01327.google.ads.googleads.v16.resource" +
      "s.KeywordPlanCampaignH\000\022I\n\006update\030\002 \001(\0132" +
      "7.google.ads.googleads.v16.resources.Key" +
      "wordPlanCampaignH\000\022C\n\006remove\030\003 \001(\tB1\372A.\n" +
      ",googleads.googleapis.com/KeywordPlanCam" +
      "paignH\000B\013\n\toperation\"\254\001\n\"MutateKeywordPl" +
      "anCampaignsResponse\0221\n\025partial_failure_e" +
      "rror\030\003 \001(\0132\022.google.rpc.Status\022S\n\007result" +
      "s\030\002 \003(\0132B.google.ads.googleads.v16.servi" +
      "ces.MutateKeywordPlanCampaignResult\"k\n\037M" +
      "utateKeywordPlanCampaignResult\022H\n\rresour" +
      "ce_name\030\001 \001(\tB1\372A.\n,googleads.googleapis" +
      ".com/KeywordPlanCampaign2\357\002\n\032KeywordPlan" +
      "CampaignService\022\211\002\n\032MutateKeywordPlanCam" +
      "paigns\022D.google.ads.googleads.v16.servic" +
      "es.MutateKeywordPlanCampaignsRequest\032E.g" +
      "oogle.ads.googleads.v16.services.MutateK" +
      "eywordPlanCampaignsResponse\"^\332A\026customer" +
      "_id,operations\202\323\344\223\002?\":/v16/customers/{cu" +
      "stomer_id=*}/keywordPlanCampaigns:mutate" +
      ":\001*\032E\312A\030googleads.googleapis.com\322A\'https" +
      "://www.googleapis.com/auth/adwordsB\213\002\n%c" +
      "om.google.ads.googleads.v16.servicesB\037Ke" +
      "ywordPlanCampaignServiceProtoP\001ZIgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v16/services;services\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V16.Services\312\002!Google\\Ad" +
      "s\\GoogleAds\\V16\\Services\352\002%Google::Ads::" +
      "GoogleAds::V16::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.resources.KeywordPlanCampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v16_services_KeywordPlanCampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_services_KeywordPlanCampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_KeywordPlanCampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateKeywordPlanCampaignResult_descriptor,
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
    com.google.ads.googleads.v16.resources.KeywordPlanCampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
