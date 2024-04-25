// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_user_access_invitation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public final class CustomerUserAccessInvitationServiceProto {
  private CustomerUserAccessInvitationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_CustomerUserAccessInvitationOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_CustomerUserAccessInvitationOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nOgoogle/ads/googleads/v15/services/cust" +
      "omer_user_access_invitation_service.prot" +
      "o\022!google.ads.googleads.v15.services\032Hgo" +
      "ogle/ads/googleads/v15/resources/custome" +
      "r_user_access_invitation.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\247\001\n)MutateCust" +
      "omerUserAccessInvitationRequest\022\030\n\013custo" +
      "mer_id\030\001 \001(\tB\003\340A\002\022`\n\toperation\030\002 \001(\0132H.g" +
      "oogle.ads.googleads.v15.services.Custome" +
      "rUserAccessInvitationOperationB\003\340A\002\"\326\001\n%" +
      "CustomerUserAccessInvitationOperation\022R\n" +
      "\006create\030\001 \001(\0132@.google.ads.googleads.v15" +
      ".resources.CustomerUserAccessInvitationH" +
      "\000\022L\n\006remove\030\002 \001(\tB:\372A7\n5googleads.google" +
      "apis.com/CustomerUserAccessInvitationH\000B" +
      "\013\n\toperation\"\211\001\n*MutateCustomerUserAcces" +
      "sInvitationResponse\022[\n\006result\030\001 \001(\0132K.go" +
      "ogle.ads.googleads.v15.services.MutateCu" +
      "stomerUserAccessInvitationResult\"}\n(Muta" +
      "teCustomerUserAccessInvitationResult\022Q\n\r" +
      "resource_name\030\001 \001(\tB:\372A7\n5googleads.goog" +
      "leapis.com/CustomerUserAccessInvitation2" +
      "\230\003\n#CustomerUserAccessInvitationService\022" +
      "\251\002\n\"MutateCustomerUserAccessInvitation\022L" +
      ".google.ads.googleads.v15.services.Mutat" +
      "eCustomerUserAccessInvitationRequest\032M.g" +
      "oogle.ads.googleads.v15.services.MutateC" +
      "ustomerUserAccessInvitationResponse\"f\332A\025" +
      "customer_id,operation\202\323\344\223\002H\"C/v15/custom" +
      "ers/{customer_id=*}/customerUserAccessIn" +
      "vitations:mutate:\001*\032E\312A\030googleads.google" +
      "apis.com\322A\'https://www.googleapis.com/au" +
      "th/adwordsB\224\002\n%com.google.ads.googleads." +
      "v15.servicesB(CustomerUserAccessInvitati" +
      "onServiceProtoP\001ZIgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v15/servic" +
      "es;services\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V15.Services\312\002!Google\\Ads\\GoogleAds\\V15" +
      "\\Services\352\002%Google::Ads::GoogleAds::V15:" +
      ":Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.resources.CustomerUserAccessInvitationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v15_services_CustomerUserAccessInvitationOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_CustomerUserAccessInvitationOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_CustomerUserAccessInvitationOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomerUserAccessInvitationResult_descriptor,
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
    com.google.ads.googleads.v15.resources.CustomerUserAccessInvitationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
