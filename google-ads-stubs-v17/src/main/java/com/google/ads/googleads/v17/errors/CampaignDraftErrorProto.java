// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/errors/campaign_draft_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.errors;

public final class CampaignDraftErrorProto {
  private CampaignDraftErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_errors_CampaignDraftErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_errors_CampaignDraftErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v17/errors/campai" +
      "gn_draft_error.proto\022\037google.ads.googlea" +
      "ds.v17.errors\"\310\003\n\026CampaignDraftErrorEnum" +
      "\"\255\003\n\022CampaignDraftError\022\017\n\013UNSPECIFIED\020\000" +
      "\022\013\n\007UNKNOWN\020\001\022\030\n\024DUPLICATE_DRAFT_NAME\020\002\022" +
      "*\n&INVALID_STATUS_TRANSITION_FROM_REMOVE" +
      "D\020\003\022+\n\'INVALID_STATUS_TRANSITION_FROM_PR" +
      "OMOTED\020\004\0221\n-INVALID_STATUS_TRANSITION_FR" +
      "OM_PROMOTE_FAILED\020\005\022 \n\034CUSTOMER_CANNOT_C" +
      "REATE_DRAFT\020\006\022 \n\034CAMPAIGN_CANNOT_CREATE_" +
      "DRAFT\020\007\022\030\n\024INVALID_DRAFT_CHANGE\020\010\022\035\n\031INV" +
      "ALID_STATUS_TRANSITION\020\t\022-\n)MAX_NUMBER_O" +
      "F_DRAFTS_PER_CAMPAIGN_REACHED\020\n\022\'\n#LIST_" +
      "ERRORS_FOR_PROMOTED_DRAFT_ONLY\020\013B\367\001\n#com" +
      ".google.ads.googleads.v17.errorsB\027Campai" +
      "gnDraftErrorProtoP\001ZEgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v17/err" +
      "ors;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds." +
      "V17.Errors\312\002\037Google\\Ads\\GoogleAds\\V17\\Er" +
      "rors\352\002#Google::Ads::GoogleAds::V17::Erro" +
      "rsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v17_errors_CampaignDraftErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_errors_CampaignDraftErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_errors_CampaignDraftErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
