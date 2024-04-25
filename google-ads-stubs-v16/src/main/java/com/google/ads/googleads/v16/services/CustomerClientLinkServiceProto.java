// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/customer_client_link_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public final class CustomerClientLinkServiceProto {
  private CustomerClientLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_CustomerClientLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_CustomerClientLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v16/services/cust" +
      "omer_client_link_service.proto\022!google.a" +
      "ds.googleads.v16.services\032=google/ads/go" +
      "ogleads/v16/resources/customer_client_li" +
      "nk.proto\032\034google/api/annotations.proto\032\027" +
      "google/api/client.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032 google/protobuf/field_mask.proto\"\252\001" +
      "\n\037MutateCustomerClientLinkRequest\022\030\n\013cus" +
      "tomer_id\030\001 \001(\tB\003\340A\002\022V\n\toperation\030\002 \001(\0132>" +
      ".google.ads.googleads.v16.services.Custo" +
      "merClientLinkOperationB\003\340A\002\022\025\n\rvalidate_" +
      "only\030\003 \001(\010\"\357\001\n\033CustomerClientLinkOperati" +
      "on\022/\n\013update_mask\030\004 \001(\0132\032.google.protobu" +
      "f.FieldMask\022H\n\006create\030\001 \001(\01326.google.ads" +
      ".googleads.v16.resources.CustomerClientL" +
      "inkH\000\022H\n\006update\030\002 \001(\01326.google.ads.googl" +
      "eads.v16.resources.CustomerClientLinkH\000B" +
      "\013\n\toperation\"u\n MutateCustomerClientLink" +
      "Response\022Q\n\006result\030\001 \001(\0132A.google.ads.go" +
      "ogleads.v16.services.MutateCustomerClien" +
      "tLinkResult\"i\n\036MutateCustomerClientLinkR" +
      "esult\022G\n\rresource_name\030\001 \001(\tB0\372A-\n+googl" +
      "eads.googleapis.com/CustomerClientLink2\346" +
      "\002\n\031CustomerClientLinkService\022\201\002\n\030MutateC" +
      "ustomerClientLink\022B.google.ads.googleads" +
      ".v16.services.MutateCustomerClientLinkRe" +
      "quest\032C.google.ads.googleads.v16.service" +
      "s.MutateCustomerClientLinkResponse\"\\\332A\025c" +
      "ustomer_id,operation\202\323\344\223\002>\"9/v16/custome" +
      "rs/{customer_id=*}/customerClientLinks:m" +
      "utate:\001*\032E\312A\030googleads.googleapis.com\322A\'" +
      "https://www.googleapis.com/auth/adwordsB" +
      "\212\002\n%com.google.ads.googleads.v16.service" +
      "sB\036CustomerClientLinkServiceProtoP\001ZIgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v16/services;services\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V16.Services\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V16\\Services\352\002%Google::A" +
      "ds::GoogleAds::V16::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.resources.CustomerClientLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", });
    internal_static_google_ads_googleads_v16_services_CustomerClientLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_services_CustomerClientLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_CustomerClientLinkOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateCustomerClientLinkResult_descriptor,
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
    com.google.ads.googleads.v16.resources.CustomerClientLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
