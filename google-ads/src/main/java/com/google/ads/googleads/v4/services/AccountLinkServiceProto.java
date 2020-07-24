// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/account_link_service.proto

package com.google.ads.googleads.v4.services;

public final class AccountLinkServiceProto {
  private AccountLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_AccountLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_AccountLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAccountLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v4/services/accou" +
      "nt_link_service.proto\022 google.ads.google" +
      "ads.v4.services\0324google/ads/googleads/v4" +
      "/resources/account_link.proto\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\\\n\025GetAccountLi" +
      "nkRequest\022C\n\rresource_name\030\001 \001(\tB,\340A\002\372A&" +
      "\n$googleads.googleapis.com/AccountLink\"\264" +
      "\001\n\030MutateAccountLinkRequest\022\030\n\013customer_" +
      "id\030\001 \001(\tB\003\340A\002\022N\n\toperation\030\002 \001(\01326.googl" +
      "e.ads.googleads.v4.services.AccountLinkO" +
      "perationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025" +
      "\n\rvalidate_only\030\004 \001(\010\"w\n\024AccountLinkOper" +
      "ation\022@\n\006create\030\001 \001(\0132..google.ads.googl" +
      "eads.v4.resources.AccountLinkH\000\022\020\n\006remov" +
      "e\030\003 \001(\tH\000B\013\n\toperation\"f\n\031MutateAccountL" +
      "inkResponse\022I\n\006result\030\001 \001(\01329.google.ads" +
      ".googleads.v4.services.MutateAccountLink" +
      "Result\"0\n\027MutateAccountLinkResult\022\025\n\rres" +
      "ource_name\030\001 \001(\t2\332\003\n\022AccountLinkService\022" +
      "\301\001\n\016GetAccountLink\0227.google.ads.googlead" +
      "s.v4.services.GetAccountLinkRequest\032..go" +
      "ogle.ads.googleads.v4.resources.AccountL" +
      "ink\"F\202\323\344\223\0020\022./v4/{resource_name=customer" +
      "s/*/accountLinks/*}\332A\rresource_name\022\342\001\n\021" +
      "MutateAccountLink\022:.google.ads.googleads" +
      ".v4.services.MutateAccountLinkRequest\032;." +
      "google.ads.googleads.v4.services.MutateA" +
      "ccountLinkResponse\"T\202\323\344\223\0026\"1/v4/customer" +
      "s/{customer_id=*}/accountLinks:mutate:\001*" +
      "\332A\025customer_id,operation\032\033\312A\030googleads.g" +
      "oogleapis.comB\376\001\n$com.google.ads.googlea" +
      "ds.v4.servicesB\027AccountLinkServiceProtoP" +
      "\001ZHgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v4/services;services\242\002\003GA" +
      "A\252\002 Google.Ads.GoogleAds.V4.Services\312\002 G" +
      "oogle\\Ads\\GoogleAds\\V4\\Services\352\002$Google" +
      "::Ads::GoogleAds::V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.AccountLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetAccountLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v4_services_AccountLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_AccountLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_AccountLinkOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAccountLinkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateAccountLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAccountLinkResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.resources.AccountLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}