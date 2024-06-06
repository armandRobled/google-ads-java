// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/call_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class CallViewProto {
  private CallViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_CallView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_CallView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v17/resources/cal" +
      "l_view.proto\022\"google.ads.googleads.v17.r" +
      "esources\032Cgoogle/ads/googleads/v17/enums" +
      "/call_tracking_display_location.proto\032.g" +
      "oogle/ads/googleads/v17/enums/call_type." +
      "proto\032=google/ads/googleads/v17/enums/go" +
      "ogle_voice_call_status.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\"\221\005\n\010CallView\022@\n\rresource_name\030\001" +
      " \001(\tB)\340A\003\372A#\n!googleads.googleapis.com/C" +
      "allView\022 \n\023caller_country_code\030\002 \001(\tB\003\340A" +
      "\003\022\035\n\020caller_area_code\030\003 \001(\tB\003\340A\003\022\"\n\025call" +
      "_duration_seconds\030\004 \001(\003B\003\340A\003\022!\n\024start_ca" +
      "ll_date_time\030\005 \001(\tB\003\340A\003\022\037\n\022end_call_date" +
      "_time\030\006 \001(\tB\003\340A\003\022\210\001\n\036call_tracking_displ" +
      "ay_location\030\007 \001(\0162[.google.ads.googleads" +
      ".v17.enums.CallTrackingDisplayLocationEn" +
      "um.CallTrackingDisplayLocationB\003\340A\003\022H\n\004t" +
      "ype\030\010 \001(\01625.google.ads.googleads.v17.enu" +
      "ms.CallTypeEnum.CallTypeB\003\340A\003\022i\n\013call_st" +
      "atus\030\t \001(\0162O.google.ads.googleads.v17.en" +
      "ums.GoogleVoiceCallStatusEnum.GoogleVoic" +
      "eCallStatusB\003\340A\003:Z\352AW\n!googleads.googlea" +
      "pis.com/CallView\0222customers/{customer_id" +
      "}/callViews/{call_detail_id}B\377\001\n&com.goo" +
      "gle.ads.googleads.v17.resourcesB\rCallVie" +
      "wProtoP\001ZKgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v17/resources;reso" +
      "urces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V17.R" +
      "esources\312\002\"Google\\Ads\\GoogleAds\\V17\\Reso" +
      "urces\352\002&Google::Ads::GoogleAds::V17::Res" +
      "ourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.enums.CallTrackingDisplayLocationProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.CallTypeProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.GoogleVoiceCallStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_CallView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_CallView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_CallView_descriptor,
        new java.lang.String[] { "ResourceName", "CallerCountryCode", "CallerAreaCode", "CallDurationSeconds", "StartCallDateTime", "EndCallDateTime", "CallTrackingDisplayLocation", "Type", "CallStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.enums.CallTrackingDisplayLocationProto.getDescriptor();
    com.google.ads.googleads.v17.enums.CallTypeProto.getDescriptor();
    com.google.ads.googleads.v17.enums.GoogleVoiceCallStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
