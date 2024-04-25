// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad_group_ad.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class AdGroupAdProto {
  private AdGroupAdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AdGroupAd_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AdGroupAd_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AdGroupAdPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AdGroupAdPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v16/resources/ad_" +
      "group_ad.proto\022\"google.ads.googleads.v16" +
      ".resources\032,google/ads/googleads/v16/com" +
      "mon/policy.proto\032?google/ads/googleads/v" +
      "16/enums/ad_group_ad_primary_status.prot" +
      "o\032Fgoogle/ads/googleads/v16/enums/ad_gro" +
      "up_ad_primary_status_reason.proto\0327googl" +
      "e/ads/googleads/v16/enums/ad_group_ad_st" +
      "atus.proto\0320google/ads/googleads/v16/enu" +
      "ms/ad_strength.proto\032;google/ads/googlea" +
      "ds/v16/enums/policy_approval_status.prot" +
      "o\0329google/ads/googleads/v16/enums/policy" +
      "_review_status.proto\032+google/ads/googlea" +
      "ds/v16/resources/ad.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\"\214\007\n\tAdGroupAd\022A\n\rresource_name\030\001 \001" +
      "(\tB*\340A\005\372A$\n\"googleads.googleapis.com/AdG" +
      "roupAd\022S\n\006status\030\003 \001(\0162C.google.ads.goog" +
      "leads.v16.enums.AdGroupAdStatusEnum.AdGr" +
      "oupAdStatus\022?\n\010ad_group\030\t \001(\tB(\340A\005\372A\"\n g" +
      "oogleads.googleapis.com/AdGroupH\000\210\001\001\0227\n\002" +
      "ad\030\005 \001(\0132&.google.ads.googleads.v16.reso" +
      "urces.AdB\003\340A\005\022W\n\016policy_summary\030\006 \001(\0132:." +
      "google.ads.googleads.v16.resources.AdGro" +
      "upAdPolicySummaryB\003\340A\003\022S\n\013ad_strength\030\007 " +
      "\001(\01629.google.ads.googleads.v16.enums.AdS" +
      "trengthEnum.AdStrengthB\003\340A\003\022\031\n\014action_it" +
      "ems\030\r \003(\tB\003\340A\003\022?\n\006labels\030\n \003(\tB/\340A\003\372A)\n\'" +
      "googleads.googleapis.com/AdGroupAdLabel\022" +
      "n\n\016primary_status\030\020 \001(\0162Q.google.ads.goo" +
      "gleads.v16.enums.AdGroupAdPrimaryStatusE" +
      "num.AdGroupAdPrimaryStatusB\003\340A\003\022\202\001\n\026prim" +
      "ary_status_reasons\030\021 \003(\0162].google.ads.go" +
      "ogleads.v16.enums.AdGroupAdPrimaryStatus" +
      "ReasonEnum.AdGroupAdPrimaryStatusReasonB" +
      "\003\340A\003:a\352A^\n\"googleads.googleapis.com/AdGr" +
      "oupAd\0228customers/{customer_id}/adGroupAd" +
      "s/{ad_group_id}~{ad_id}B\013\n\t_ad_group\"\302\002\n" +
      "\026AdGroupAdPolicySummary\022T\n\024policy_topic_" +
      "entries\030\001 \003(\01321.google.ads.googleads.v16" +
      ".common.PolicyTopicEntryB\003\340A\003\022e\n\rreview_" +
      "status\030\002 \001(\0162I.google.ads.googleads.v16." +
      "enums.PolicyReviewStatusEnum.PolicyRevie" +
      "wStatusB\003\340A\003\022k\n\017approval_status\030\003 \001(\0162M." +
      "google.ads.googleads.v16.enums.PolicyApp" +
      "rovalStatusEnum.PolicyApprovalStatusB\003\340A" +
      "\003B\200\002\n&com.google.ads.googleads.v16.resou" +
      "rcesB\016AdGroupAdProtoP\001ZKgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v16/" +
      "resources;resources\242\002\003GAA\252\002\"Google.Ads.G" +
      "oogleAds.V16.Resources\312\002\"Google\\Ads\\Goog" +
      "leAds\\V16\\Resources\352\002&Google::Ads::Googl" +
      "eAds::V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupAdStatusProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdStrengthProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v16.resources.AdProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_AdGroupAd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_AdGroupAd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AdGroupAd_descriptor,
        new java.lang.String[] { "ResourceName", "Status", "AdGroup", "Ad", "PolicySummary", "AdStrength", "ActionItems", "Labels", "PrimaryStatus", "PrimaryStatusReasons", });
    internal_static_google_ads_googleads_v16_resources_AdGroupAdPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_resources_AdGroupAdPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AdGroupAdPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupAdStatusProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdStrengthProto.getDescriptor();
    com.google.ads.googleads.v16.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v16.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v16.resources.AdProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
