// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/keyword_plan_campaign_keyword.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class KeywordPlanCampaignKeywordProto {
  private KeywordPlanCampaignKeywordProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_KeywordPlanCampaignKeyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_KeywordPlanCampaignKeyword_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v17/resources/key" +
      "word_plan_campaign_keyword.proto\022\"google" +
      ".ads.googleads.v17.resources\0327google/ads" +
      "/googleads/v17/enums/keyword_match_type." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\262\004\n\032KeywordPla" +
      "nCampaignKeyword\022R\n\rresource_name\030\001 \001(\tB" +
      ";\340A\005\372A5\n3googleads.googleapis.com/Keywor" +
      "dPlanCampaignKeyword\022U\n\025keyword_plan_cam" +
      "paign\030\010 \001(\tB1\372A.\n,googleads.googleapis.c" +
      "om/KeywordPlanCampaignH\000\210\001\001\022\024\n\002id\030\t \001(\003B" +
      "\003\340A\003H\001\210\001\001\022\021\n\004text\030\n \001(\tH\002\210\001\001\022Y\n\nmatch_ty" +
      "pe\030\005 \001(\0162E.google.ads.googleads.v17.enum" +
      "s.KeywordMatchTypeEnum.KeywordMatchType\022" +
      "\032\n\010negative\030\013 \001(\010B\003\340A\005H\003\210\001\001:\221\001\352A\215\001\n3goog" +
      "leads.googleapis.com/KeywordPlanCampaign" +
      "Keyword\022Vcustomers/{customer_id}/keyword" +
      "PlanCampaignKeywords/{keyword_plan_campa" +
      "ign_keyword_id}B\030\n\026_keyword_plan_campaig" +
      "nB\005\n\003_idB\007\n\005_textB\013\n\t_negativeB\221\002\n&com.g" +
      "oogle.ads.googleads.v17.resourcesB\037Keywo" +
      "rdPlanCampaignKeywordProtoP\001ZKgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v17/resources;resources\242\002\003GAA\252\002\"Google" +
      ".Ads.GoogleAds.V17.Resources\312\002\"Google\\Ad" +
      "s\\GoogleAds\\V17\\Resources\352\002&Google::Ads:" +
      ":GoogleAds::V17::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.enums.KeywordMatchTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_KeywordPlanCampaignKeyword_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_KeywordPlanCampaignKeyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_KeywordPlanCampaignKeyword_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanCampaign", "Id", "Text", "MatchType", "Negative", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.enums.KeywordMatchTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
