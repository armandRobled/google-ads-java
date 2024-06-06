// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/remarketing_action_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public final class RemarketingActionServiceProto {
  private RemarketingActionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_RemarketingActionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_RemarketingActionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateRemarketingActionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v17/services/rema" +
      "rketing_action_service.proto\022!google.ads" +
      ".googleads.v17.services\032;google/ads/goog" +
      "leads/v17/resources/remarketing_action.p" +
      "roto\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      " google/protobuf/field_mask.proto\032\027googl" +
      "e/rpc/status.proto\"\303\001\n\037MutateRemarketing" +
      "ActionsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002" +
      "\022V\n\noperations\030\002 \003(\0132=.google.ads.google" +
      "ads.v17.services.RemarketingActionOperat" +
      "ionB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rval" +
      "idate_only\030\004 \001(\010\"\354\001\n\032RemarketingActionOp" +
      "eration\022/\n\013update_mask\030\004 \001(\0132\032.google.pr" +
      "otobuf.FieldMask\022G\n\006create\030\001 \001(\01325.googl" +
      "e.ads.googleads.v17.resources.Remarketin" +
      "gActionH\000\022G\n\006update\030\002 \001(\01325.google.ads.g" +
      "oogleads.v17.resources.RemarketingAction" +
      "H\000B\013\n\toperation\"\250\001\n MutateRemarketingAct" +
      "ionsResponse\0221\n\025partial_failure_error\030\003 " +
      "\001(\0132\022.google.rpc.Status\022Q\n\007results\030\002 \003(\013" +
      "2@.google.ads.googleads.v17.services.Mut" +
      "ateRemarketingActionResult\"g\n\035MutateRema" +
      "rketingActionResult\022F\n\rresource_name\030\001 \001" +
      "(\tB/\372A,\n*googleads.googleapis.com/Remark" +
      "etingAction2\345\002\n\030RemarketingActionService" +
      "\022\201\002\n\030MutateRemarketingActions\022B.google.a" +
      "ds.googleads.v17.services.MutateRemarket" +
      "ingActionsRequest\032C.google.ads.googleads" +
      ".v17.services.MutateRemarketingActionsRe" +
      "sponse\"\\\332A\026customer_id,operations\202\323\344\223\002=\"" +
      "8/v17/customers/{customer_id=*}/remarket" +
      "ingActions:mutate:\001*\032E\312A\030googleads.googl" +
      "eapis.com\322A\'https://www.googleapis.com/a" +
      "uth/adwordsB\211\002\n%com.google.ads.googleads" +
      ".v17.servicesB\035RemarketingActionServiceP" +
      "rotoP\001ZIgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v17/services;service" +
      "s\242\002\003GAA\252\002!Google.Ads.GoogleAds.V17.Servi" +
      "ces\312\002!Google\\Ads\\GoogleAds\\V17\\Services\352" +
      "\002%Google::Ads::GoogleAds::V17::Servicesb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.resources.RemarketingActionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v17_services_RemarketingActionOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v17_services_RemarketingActionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_RemarketingActionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateRemarketingActionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v17_services_MutateRemarketingActionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateRemarketingActionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v17.resources.RemarketingActionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
