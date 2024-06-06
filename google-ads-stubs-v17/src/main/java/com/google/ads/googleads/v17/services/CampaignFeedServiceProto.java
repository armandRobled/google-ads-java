// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/campaign_feed_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public final class CampaignFeedServiceProto {
  private CampaignFeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_CampaignFeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_CampaignFeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCampaignFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v17/services/camp" +
      "aign_feed_service.proto\022!google.ads.goog" +
      "leads.v17.services\032:google/ads/googleads" +
      "/v17/enums/response_content_type.proto\0326" +
      "google/ads/googleads/v17/resources/campa" +
      "ign_feed.proto\032\034google/api/annotations.p" +
      "roto\032\027google/api/client.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032 google/protobuf/field_mask.pr" +
      "oto\032\027google/rpc/status.proto\"\245\002\n\032MutateC" +
      "ampaignFeedsRequest\022\030\n\013customer_id\030\001 \001(\t" +
      "B\003\340A\002\022Q\n\noperations\030\002 \003(\01328.google.ads.g" +
      "oogleads.v17.services.CampaignFeedOperat" +
      "ionB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rval" +
      "idate_only\030\004 \001(\010\022j\n\025response_content_typ" +
      "e\030\005 \001(\0162K.google.ads.googleads.v17.enums" +
      ".ResponseContentTypeEnum.ResponseContent" +
      "Type\"\233\002\n\025CampaignFeedOperation\022/\n\013update" +
      "_mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022" +
      "B\n\006create\030\001 \001(\01320.google.ads.googleads.v" +
      "17.resources.CampaignFeedH\000\022B\n\006update\030\002 " +
      "\001(\01320.google.ads.googleads.v17.resources" +
      ".CampaignFeedH\000\022<\n\006remove\030\003 \001(\tB*\372A\'\n%go" +
      "ogleads.googleapis.com/CampaignFeedH\000B\013\n" +
      "\toperation\"\236\001\n\033MutateCampaignFeedsRespon" +
      "se\0221\n\025partial_failure_error\030\003 \001(\0132\022.goog" +
      "le.rpc.Status\022L\n\007results\030\002 \003(\0132;.google." +
      "ads.googleads.v17.services.MutateCampaig" +
      "nFeedResult\"\246\001\n\030MutateCampaignFeedResult" +
      "\022A\n\rresource_name\030\001 \001(\tB*\372A\'\n%googleads." +
      "googleapis.com/CampaignFeed\022G\n\rcampaign_" +
      "feed\030\002 \001(\01320.google.ads.googleads.v17.re" +
      "sources.CampaignFeed2\314\002\n\023CampaignFeedSer" +
      "vice\022\355\001\n\023MutateCampaignFeeds\022=.google.ad" +
      "s.googleads.v17.services.MutateCampaignF" +
      "eedsRequest\032>.google.ads.googleads.v17.s" +
      "ervices.MutateCampaignFeedsResponse\"W\332A\026" +
      "customer_id,operations\202\323\344\223\0028\"3/v17/custo" +
      "mers/{customer_id=*}/campaignFeeds:mutat" +
      "e:\001*\032E\312A\030googleads.googleapis.com\322A\'http" +
      "s://www.googleapis.com/auth/adwordsB\204\002\n%" +
      "com.google.ads.googleads.v17.servicesB\030C" +
      "ampaignFeedServiceProtoP\001ZIgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "17/services;services\242\002\003GAA\252\002!Google.Ads." +
      "GoogleAds.V17.Services\312\002!Google\\Ads\\Goog" +
      "leAds\\V17\\Services\352\002%Google::Ads::Google" +
      "Ads::V17::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v17.resources.CampaignFeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v17_services_CampaignFeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v17_services_CampaignFeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_CampaignFeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCampaignFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v17_services_MutateCampaignFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCampaignFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignFeed", });
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
    com.google.ads.googleads.v17.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v17.resources.CampaignFeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
