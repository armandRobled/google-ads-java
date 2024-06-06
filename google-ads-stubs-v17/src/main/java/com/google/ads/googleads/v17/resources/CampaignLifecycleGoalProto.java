// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/campaign_lifecycle_goal.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class CampaignLifecycleGoalProto {
  private CampaignLifecycleGoalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_CampaignLifecycleGoal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_CampaignLifecycleGoal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_CustomerAcquisitionGoalSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_CustomerAcquisitionGoalSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v17/resources/cam" +
      "paign_lifecycle_goal.proto\022\"google.ads.g" +
      "oogleads.v17.resources\0325google/ads/googl" +
      "eads/v17/common/lifecycle_goals.proto\032Kg" +
      "oogle/ads/googleads/v17/enums/customer_a" +
      "cquisition_optimization_mode.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\"\214\003\n\025CampaignLifecycleGoal" +
      "\022M\n\rresource_name\030\001 \001(\tB6\340A\005\372A0\n.googlea" +
      "ds.googleapis.com/CampaignLifecycleGoal\022" +
      ";\n\010campaign\030\002 \001(\tB)\340A\003\372A#\n!googleads.goo" +
      "gleapis.com/Campaign\022t\n\"customer_acquisi" +
      "tion_goal_settings\030\003 \001(\0132C.google.ads.go" +
      "ogleads.v17.resources.CustomerAcquisitio" +
      "nGoalSettingsB\003\340A\003:q\352An\n.googleads.googl" +
      "eapis.com/CampaignLifecycleGoal\022<custome" +
      "rs/{customer_id}/campaignLifecycleGoals/" +
      "{campaign_id}\"\211\002\n\037CustomerAcquisitionGoa" +
      "lSettings\022\213\001\n\021optimization_mode\030\001 \001(\0162k." +
      "google.ads.googleads.v17.enums.CustomerA" +
      "cquisitionOptimizationModeEnum.CustomerA" +
      "cquisitionOptimizationModeB\003\340A\003\022X\n\016value" +
      "_settings\030\002 \001(\0132;.google.ads.googleads.v" +
      "17.common.LifecycleGoalValueSettingsB\003\340A" +
      "\003B\214\002\n&com.google.ads.googleads.v17.resou" +
      "rcesB\032CampaignLifecycleGoalProtoP\001ZKgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v17/resources;resources\242\002\003GAA\252\002\"" +
      "Google.Ads.GoogleAds.V17.Resources\312\002\"Goo" +
      "gle\\Ads\\GoogleAds\\V17\\Resources\352\002&Google" +
      "::Ads::GoogleAds::V17::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.common.LifecycleGoalsProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.CustomerAcquisitionOptimizationModeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_CampaignLifecycleGoal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_CampaignLifecycleGoal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_CampaignLifecycleGoal_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CustomerAcquisitionGoalSettings", });
    internal_static_google_ads_googleads_v17_resources_CustomerAcquisitionGoalSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v17_resources_CustomerAcquisitionGoalSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_CustomerAcquisitionGoalSettings_descriptor,
        new java.lang.String[] { "OptimizationMode", "ValueSettings", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.common.LifecycleGoalsProto.getDescriptor();
    com.google.ads.googleads.v17.enums.CustomerAcquisitionOptimizationModeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
