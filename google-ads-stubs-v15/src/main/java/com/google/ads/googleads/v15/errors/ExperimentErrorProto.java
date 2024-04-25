// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/experiment_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.errors;

public final class ExperimentErrorProto {
  private ExperimentErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v15/errors/experi" +
      "ment_error.proto\022\037google.ads.googleads.v" +
      "15.errors\"\310\010\n\023ExperimentErrorEnum\"\260\010\n\017Ex" +
      "perimentError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOW" +
      "N\020\001\022!\n\035CANNOT_SET_START_DATE_IN_PAST\020\002\022\036" +
      "\n\032END_DATE_BEFORE_START_DATE\020\003\022 \n\034START_" +
      "DATE_TOO_FAR_IN_FUTURE\020\004\022\035\n\031DUPLICATE_EX" +
      "PERIMENT_NAME\020\005\022$\n CANNOT_MODIFY_REMOVED" +
      "_EXPERIMENT\020\006\022\035\n\031START_DATE_ALREADY_PASS" +
      "ED\020\007\022\037\n\033CANNOT_SET_END_DATE_IN_PAST\020\010\022 \n" +
      "\034CANNOT_SET_STATUS_TO_REMOVED\020\t\022\037\n\033CANNO" +
      "T_MODIFY_PAST_END_DATE\020\n\022\022\n\016INVALID_STAT" +
      "US\020\013\022!\n\035INVALID_CAMPAIGN_CHANNEL_TYPE\020\014\022" +
      "&\n\"OVERLAPPING_MEMBERS_AND_DATE_RANGE\020\r\022" +
      "#\n\037INVALID_TRIAL_ARM_TRAFFIC_SPLIT\020\016\022\035\n\031" +
      "TRAFFIC_SPLIT_OVERLAPPING\020\017\022E\nASUM_TRIAL" +
      "_ARM_TRAFFIC_UNEQUALS_TO_TRIAL_TRAFFIC_S" +
      "PLIT_DENOMINATOR\020\020\022+\n\'CANNOT_MODIFY_TRAF" +
      "FIC_SPLIT_AFTER_START\020\021\022\030\n\024EXPERIMENT_NO" +
      "T_FOUND\020\022\022\036\n\032EXPERIMENT_NOT_YET_STARTED\020" +
      "\023\022%\n!CANNOT_HAVE_MULTIPLE_CONTROL_ARMS\020\024" +
      "\022\037\n\033IN_DESIGN_CAMPAIGNS_NOT_SET\020\025\022\"\n\036CAN" +
      "NOT_SET_STATUS_TO_GRADUATED\020\026\0228\n4CANNOT_" +
      "CREATE_EXPERIMENT_CAMPAIGN_WITH_SHARED_B" +
      "UDGET\020\027\0228\n4CANNOT_CREATE_EXPERIMENT_CAMP" +
      "AIGN_WITH_CUSTOM_BUDGET\020\030\022\035\n\031STATUS_TRAN" +
      "SITION_INVALID\020\031\022&\n\"DUPLICATE_EXPERIMENT" +
      "_CAMPAIGN_NAME\020\032\022(\n$CANNOT_REMOVE_IN_CRE" +
      "ATION_EXPERIMENT\020\033\0220\n,CANNOT_ADD_CAMPAIG" +
      "N_WITH_DEPRECATED_AD_TYPES\020\034B\364\001\n#com.goo" +
      "gle.ads.googleads.v15.errorsB\024Experiment" +
      "ErrorProtoP\001ZEgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v15/errors;err" +
      "ors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V15.Err" +
      "ors\312\002\037Google\\Ads\\GoogleAds\\V15\\Errors\352\002#" +
      "Google::Ads::GoogleAds::V15::Errorsb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
