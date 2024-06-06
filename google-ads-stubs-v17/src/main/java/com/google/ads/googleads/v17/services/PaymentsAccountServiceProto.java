// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/payments_account_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public final class PaymentsAccountServiceProto {
  private PaymentsAccountServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v17/services/paym" +
      "ents_account_service.proto\022!google.ads.g" +
      "oogleads.v17.services\0329google/ads/google" +
      "ads/v17/resources/payments_account.proto" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\"7\n\033ListPaymentsAccountsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\"n\n\034ListPayment" +
      "sAccountsResponse\022N\n\021payments_accounts\030\001" +
      " \003(\01323.google.ads.googleads.v17.resource" +
      "s.PaymentsAccount2\300\002\n\026PaymentsAccountSer" +
      "vice\022\336\001\n\024ListPaymentsAccounts\022>.google.a" +
      "ds.googleads.v17.services.ListPaymentsAc" +
      "countsRequest\032?.google.ads.googleads.v17" +
      ".services.ListPaymentsAccountsResponse\"E" +
      "\332A\013customer_id\202\323\344\223\0021\022//v17/customers/{cu" +
      "stomer_id=*}/paymentsAccounts\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\207\002\n%com.google.ads." +
      "googleads.v17.servicesB\033PaymentsAccountS" +
      "erviceProtoP\001ZIgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v17/services;" +
      "services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1" +
      "7.Services\312\002!Google\\Ads\\GoogleAds\\V17\\Se" +
      "rvices\352\002%Google::Ads::GoogleAds::V17::Se" +
      "rvicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.resources.PaymentsAccountProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsRequest_descriptor,
        new java.lang.String[] { "CustomerId", });
    internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_ListPaymentsAccountsResponse_descriptor,
        new java.lang.String[] { "PaymentsAccounts", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.resources.PaymentsAccountProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
