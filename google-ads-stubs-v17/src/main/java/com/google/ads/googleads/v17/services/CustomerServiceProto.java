// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/customer_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public final class CustomerServiceProto {
  private CustomerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_CreateCustomerClientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_CreateCustomerClientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_CustomerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_CustomerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_CreateCustomerClientResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_CreateCustomerClientResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCustomerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_MutateCustomerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_MutateCustomerResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v17/services/cust" +
      "omer_service.proto\022!google.ads.googleads" +
      ".v17.services\0320google/ads/googleads/v17/" +
      "enums/access_role.proto\032:google/ads/goog" +
      "leads/v17/enums/response_content_type.pr" +
      "oto\0321google/ads/googleads/v17/resources/" +
      "customer.proto\032\034google/api/annotations.p" +
      "roto\032\027google/api/client.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032 google/protobuf/field_mask.pr" +
      "oto\"\202\002\n\025MutateCustomerRequest\022\030\n\013custome" +
      "r_id\030\001 \001(\tB\003\340A\002\022L\n\toperation\030\004 \001(\01324.goo" +
      "gle.ads.googleads.v17.services.CustomerO" +
      "perationB\003\340A\002\022\025\n\rvalidate_only\030\005 \001(\010\022j\n\025" +
      "response_content_type\030\006 \001(\0162K.google.ads" +
      ".googleads.v17.enums.ResponseContentType" +
      "Enum.ResponseContentType\"\230\002\n\033CreateCusto" +
      "merClientRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340" +
      "A\002\022J\n\017customer_client\030\002 \001(\0132,.google.ads" +
      ".googleads.v17.resources.CustomerB\003\340A\002\022\032" +
      "\n\remail_address\030\005 \001(\tH\000\210\001\001\022N\n\013access_rol" +
      "e\030\004 \001(\01629.google.ads.googleads.v17.enums" +
      ".AccessRoleEnum.AccessRole\022\025\n\rvalidate_o" +
      "nly\030\006 \001(\010B\020\n\016_email_address\"\202\001\n\021Customer" +
      "Operation\022<\n\006update\030\001 \001(\0132,.google.ads.g" +
      "oogleads.v17.resources.Customer\022/\n\013updat" +
      "e_mask\030\002 \001(\0132\032.google.protobuf.FieldMask" +
      "\"v\n\034CreateCustomerClientResponse\022=\n\rreso" +
      "urce_name\030\002 \001(\tB&\372A#\n!googleads.googleap" +
      "is.com/Customer\022\027\n\017invitation_link\030\003 \001(\t" +
      "\"a\n\026MutateCustomerResponse\022G\n\006result\030\002 \001" +
      "(\01327.google.ads.googleads.v17.services.M" +
      "utateCustomerResult\"\225\001\n\024MutateCustomerRe" +
      "sult\022=\n\rresource_name\030\001 \001(\tB&\372A#\n!google" +
      "ads.googleapis.com/Customer\022>\n\010customer\030" +
      "\002 \001(\0132,.google.ads.googleads.v17.resourc" +
      "es.Customer\" \n\036ListAccessibleCustomersRe" +
      "quest\"9\n\037ListAccessibleCustomersResponse" +
      "\022\026\n\016resource_names\030\001 \003(\t2\365\005\n\017CustomerSer" +
      "vice\022\317\001\n\016MutateCustomer\0228.google.ads.goo" +
      "gleads.v17.services.MutateCustomerReques" +
      "t\0329.google.ads.googleads.v17.services.Mu" +
      "tateCustomerResponse\"H\332A\025customer_id,ope" +
      "ration\202\323\344\223\002*\"%/v17/customers/{customer_i" +
      "d=*}:mutate:\001*\022\320\001\n\027ListAccessibleCustome" +
      "rs\022A.google.ads.googleads.v17.services.L" +
      "istAccessibleCustomersRequest\032B.google.a" +
      "ds.googleads.v17.services.ListAccessible" +
      "CustomersResponse\".\202\323\344\223\002(\022&/v17/customer" +
      "s:listAccessibleCustomers\022\365\001\n\024CreateCust" +
      "omerClient\022>.google.ads.googleads.v17.se" +
      "rvices.CreateCustomerClientRequest\032?.goo" +
      "gle.ads.googleads.v17.services.CreateCus" +
      "tomerClientResponse\"\\\332A\033customer_id,cust" +
      "omer_client\202\323\344\223\0028\"3/v17/customers/{custo" +
      "mer_id=*}:createCustomerClient:\001*\032E\312A\030go" +
      "ogleads.googleapis.com\322A\'https://www.goo" +
      "gleapis.com/auth/adwordsB\200\002\n%com.google." +
      "ads.googleads.v17.servicesB\024CustomerServ" +
      "iceProtoP\001ZIgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v17/services;ser" +
      "vices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V17.S" +
      "ervices\312\002!Google\\Ads\\GoogleAds\\V17\\Servi" +
      "ces\352\002%Google::Ads::GoogleAds::V17::Servi" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.enums.AccessRoleProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v17.resources.CustomerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_services_MutateCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_services_MutateCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCustomerRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v17_services_CreateCustomerClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v17_services_CreateCustomerClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_CreateCustomerClientRequest_descriptor,
        new java.lang.String[] { "CustomerId", "CustomerClient", "EmailAddress", "AccessRole", "ValidateOnly", });
    internal_static_google_ads_googleads_v17_services_CustomerOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v17_services_CustomerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_CustomerOperation_descriptor,
        new java.lang.String[] { "Update", "UpdateMask", });
    internal_static_google_ads_googleads_v17_services_CreateCustomerClientResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v17_services_CreateCustomerClientResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_CreateCustomerClientResponse_descriptor,
        new java.lang.String[] { "ResourceName", "InvitationLink", });
    internal_static_google_ads_googleads_v17_services_MutateCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v17_services_MutateCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCustomerResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v17_services_MutateCustomerResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v17_services_MutateCustomerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_MutateCustomerResult_descriptor,
        new java.lang.String[] { "ResourceName", "Customer", });
    internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_services_ListAccessibleCustomersResponse_descriptor,
        new java.lang.String[] { "ResourceNames", });
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
    com.google.ads.googleads.v17.enums.AccessRoleProto.getDescriptor();
    com.google.ads.googleads.v17.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v17.resources.CustomerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
