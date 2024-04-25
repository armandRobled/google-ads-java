// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/label_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public final class LabelServiceProto {
  private LabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_LabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_LabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v16/services/labe" +
      "l_service.proto\022!google.ads.googleads.v1" +
      "6.services\032:google/ads/googleads/v16/enu" +
      "ms/response_content_type.proto\032.google/a" +
      "ds/googleads/v16/resources/label.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\027google/rpc/" +
      "status.proto\"\227\002\n\023MutateLabelsRequest\022\030\n\013" +
      "customer_id\030\001 \001(\tB\003\340A\002\022J\n\noperations\030\002 \003" +
      "(\01321.google.ads.googleads.v16.services.L" +
      "abelOperationB\003\340A\002\022\027\n\017partial_failure\030\003 " +
      "\001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025response_c" +
      "ontent_type\030\005 \001(\0162K.google.ads.googleads" +
      ".v16.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\"\377\001\n\016LabelOperation\022/\n\013upd" +
      "ate_mask\030\004 \001(\0132\032.google.protobuf.FieldMa" +
      "sk\022;\n\006create\030\001 \001(\0132).google.ads.googlead" +
      "s.v16.resources.LabelH\000\022;\n\006update\030\002 \001(\0132" +
      ").google.ads.googleads.v16.resources.Lab" +
      "elH\000\0225\n\006remove\030\003 \001(\tB#\372A \n\036googleads.goo" +
      "gleapis.com/LabelH\000B\013\n\toperation\"\220\001\n\024Mut" +
      "ateLabelsResponse\0221\n\025partial_failure_err" +
      "or\030\003 \001(\0132\022.google.rpc.Status\022E\n\007results\030" +
      "\002 \003(\01324.google.ads.googleads.v16.service" +
      "s.MutateLabelResult\"\211\001\n\021MutateLabelResul" +
      "t\022:\n\rresource_name\030\001 \001(\tB#\372A \n\036googleads" +
      ".googleapis.com/Label\0228\n\005label\030\002 \001(\0132).g" +
      "oogle.ads.googleads.v16.resources.Label2" +
      "\251\002\n\014LabelService\022\321\001\n\014MutateLabels\0226.goog" +
      "le.ads.googleads.v16.services.MutateLabe" +
      "lsRequest\0327.google.ads.googleads.v16.ser" +
      "vices.MutateLabelsResponse\"P\332A\026customer_" +
      "id,operations\202\323\344\223\0021\",/v16/customers/{cus" +
      "tomer_id=*}/labels:mutate:\001*\032E\312A\030googlea" +
      "ds.googleapis.com\322A\'https://www.googleap" +
      "is.com/auth/adwordsB\375\001\n%com.google.ads.g" +
      "oogleads.v16.servicesB\021LabelServiceProto" +
      "P\001ZIgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v16/services;services\242\002\003" +
      "GAA\252\002!Google.Ads.GoogleAds.V16.Services\312" +
      "\002!Google\\Ads\\GoogleAds\\V16\\Services\352\002%Go" +
      "ogle::Ads::GoogleAds::V16::Servicesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.resources.LabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_services_MutateLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_services_MutateLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v16_services_LabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_services_LabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_LabelOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v16_services_MutateLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_services_MutateLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v16_services_MutateLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v16_services_MutateLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateLabelResult_descriptor,
        new java.lang.String[] { "ResourceName", "Label", });
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
    com.google.ads.googleads.v16.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v16.resources.LabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
