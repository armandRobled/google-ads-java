// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/click_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class ClickViewProto {
  private ClickViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_ClickView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_ClickView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v16/resources/cli" +
      "ck_view.proto\022\"google.ads.googleads.v16." +
      "resources\0324google/ads/googleads/v16/comm" +
      "on/click_location.proto\032.google/ads/goog" +
      "leads/v16/common/criteria.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\"\312\006\n\tClickView\022A\n\rresource_na" +
      "me\030\001 \001(\tB*\340A\003\372A$\n\"googleads.googleapis.c" +
      "om/ClickView\022\027\n\005gclid\030\010 \001(\tB\003\340A\003H\000\210\001\001\022M\n" +
      "\020area_of_interest\030\003 \001(\0132..google.ads.goo" +
      "gleads.v16.common.ClickLocationB\003\340A\003\022Q\n\024" +
      "location_of_presence\030\004 \001(\0132..google.ads." +
      "googleads.v16.common.ClickLocationB\003\340A\003\022" +
      "\035\n\013page_number\030\t \001(\003B\003\340A\003H\001\210\001\001\022D\n\013ad_gro" +
      "up_ad\030\n \001(\tB*\340A\003\372A$\n\"googleads.googleapi" +
      "s.com/AdGroupAdH\002\210\001\001\022Y\n\030campaign_locatio" +
      "n_target\030\013 \001(\tB2\340A\003\372A,\n*googleads.google" +
      "apis.com/GeoTargetConstantH\003\210\001\001\022A\n\tuser_" +
      "list\030\014 \001(\tB)\340A\003\372A#\n!googleads.googleapis" +
      ".com/UserListH\004\210\001\001\022B\n\007keyword\030\r \001(\tB1\340A\003" +
      "\372A+\n)googleads.googleapis.com/AdGroupCri" +
      "terion\022G\n\014keyword_info\030\016 \001(\0132,.google.ad" +
      "s.googleads.v16.common.KeywordInfoB\003\340A\003:" +
      "Z\352AW\n\"googleads.googleapis.com/ClickView" +
      "\0221customers/{customer_id}/clickViews/{da" +
      "te}~{gclid}B\010\n\006_gclidB\016\n\014_page_numberB\016\n" +
      "\014_ad_group_adB\033\n\031_campaign_location_targ" +
      "etB\014\n\n_user_listB\200\002\n&com.google.ads.goog" +
      "leads.v16.resourcesB\016ClickViewProtoP\001ZKg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v16/resources;resources\242\002\003GAA" +
      "\252\002\"Google.Ads.GoogleAds.V16.Resources\312\002\"" +
      "Google\\Ads\\GoogleAds\\V16\\Resources\352\002&Goo" +
      "gle::Ads::GoogleAds::V16::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.ClickLocationProto.getDescriptor(),
          com.google.ads.googleads.v16.common.CriteriaProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_ClickView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_ClickView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_ClickView_descriptor,
        new java.lang.String[] { "ResourceName", "Gclid", "AreaOfInterest", "LocationOfPresence", "PageNumber", "AdGroupAd", "CampaignLocationTarget", "UserList", "Keyword", "KeywordInfo", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.ClickLocationProto.getDescriptor();
    com.google.ads.googleads.v16.common.CriteriaProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
