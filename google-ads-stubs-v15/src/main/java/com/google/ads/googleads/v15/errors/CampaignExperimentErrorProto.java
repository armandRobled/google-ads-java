// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/campaign_experiment_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.errors;

public final class CampaignExperimentErrorProto {
  private CampaignExperimentErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_CampaignExperimentErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_CampaignExperimentErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v15/errors/campai" +
      "gn_experiment_error.proto\022\037google.ads.go" +
      "ogleads.v15.errors\"\200\004\n\033CampaignExperimen" +
      "tErrorEnum\"\340\003\n\027CampaignExperimentError\022\017" +
      "\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\022\n\016DUPLICAT" +
      "E_NAME\020\002\022\026\n\022INVALID_TRANSITION\020\003\022/\n+CANN" +
      "OT_CREATE_EXPERIMENT_WITH_SHARED_BUDGET\020" +
      "\004\0226\n2CANNOT_CREATE_EXPERIMENT_FOR_REMOVE" +
      "D_BASE_CAMPAIGN\020\005\0223\n/CANNOT_CREATE_EXPER" +
      "IMENT_FOR_NON_PROPOSED_DRAFT\020\006\022%\n!CUSTOM" +
      "ER_CANNOT_CREATE_EXPERIMENT\020\007\022%\n!CAMPAIG" +
      "N_CANNOT_CREATE_EXPERIMENT\020\010\022)\n%EXPERIME" +
      "NT_DURATIONS_MUST_NOT_OVERLAP\020\t\0228\n4EXPER" +
      "IMENT_DURATION_MUST_BE_WITHIN_CAMPAIGN_D" +
      "URATION\020\n\022*\n&CANNOT_MUTATE_EXPERIMENT_DU" +
      "E_TO_STATUS\020\013B\374\001\n#com.google.ads.googlea" +
      "ds.v15.errorsB\034CampaignExperimentErrorPr" +
      "otoP\001ZEgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v15/errors;errors\242\002\003G" +
      "AA\252\002\037Google.Ads.GoogleAds.V15.Errors\312\002\037G" +
      "oogle\\Ads\\GoogleAds\\V15\\Errors\352\002#Google:" +
      ":Ads::GoogleAds::V15::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_CampaignExperimentErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_CampaignExperimentErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_CampaignExperimentErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
