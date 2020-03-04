// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/campaign_experiment.proto

package com.google.ads.googleads.v3.resources;

public final class CampaignExperimentProto {
  private CampaignExperimentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_CampaignExperiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_CampaignExperiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v3/resources/camp" +
      "aign_experiment.proto\022!google.ads.google" +
      "ads.v3.resources\032>google/ads/googleads/v" +
      "3/enums/campaign_experiment_status.proto" +
      "\032Jgoogle/ads/googleads/v3/enums/campaign" +
      "_experiment_traffic_split_type.proto\032\031go" +
      "ogle/api/resource.proto\032\036google/protobuf" +
      "/wrappers.proto\032\034google/api/annotations." +
      "proto\"\337\006\n\022CampaignExperiment\022\025\n\rresource" +
      "_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.protobu" +
      "f.Int64Value\0224\n\016campaign_draft\030\003 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\022*\n\004name\030\004 \001(\013" +
      "2\034.google.protobuf.StringValue\0221\n\013descri" +
      "ption\030\005 \001(\0132\034.google.protobuf.StringValu" +
      "e\022:\n\025traffic_split_percent\030\006 \001(\0132\033.googl" +
      "e.protobuf.Int64Value\022\204\001\n\022traffic_split_" +
      "type\030\007 \001(\0162h.google.ads.googleads.v3.enu" +
      "ms.CampaignExperimentTrafficSplitTypeEnu" +
      "m.CampaignExperimentTrafficSplitType\0229\n\023" +
      "experiment_campaign\030\010 \001(\0132\034.google.proto" +
      "buf.StringValue\022d\n\006status\030\t \001(\0162T.google" +
      ".ads.googleads.v3.enums.CampaignExperime" +
      "ntStatusEnum.CampaignExperimentStatus\022<\n" +
      "\026long_running_operation\030\n \001(\0132\034.google.p" +
      "rotobuf.StringValue\0220\n\nstart_date\030\013 \001(\0132" +
      "\034.google.protobuf.StringValue\022.\n\010end_dat" +
      "e\030\014 \001(\0132\034.google.protobuf.StringValue:p\352" +
      "Am\n+googleads.googleapis.com/CampaignExp" +
      "eriment\022>customers/{customer}/campaignEx" +
      "periments/{campaign_experiment}B\204\002\n%com." +
      "google.ads.googleads.v3.resourcesB\027Campa" +
      "ignExperimentProtoP\001ZJgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v3/res" +
      "ources;resources\242\002\003GAA\252\002!Google.Ads.Goog" +
      "leAds.V3.Resources\312\002!Google\\Ads\\GoogleAd" +
      "s\\V3\\Resources\352\002%Google::Ads::GoogleAds:" +
      ":V3::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.CampaignExperimentStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_CampaignExperiment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_CampaignExperiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_CampaignExperiment_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CampaignDraft", "Name", "Description", "TrafficSplitPercent", "TrafficSplitType", "ExperimentCampaign", "Status", "LongRunningOperation", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.CampaignExperimentStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}