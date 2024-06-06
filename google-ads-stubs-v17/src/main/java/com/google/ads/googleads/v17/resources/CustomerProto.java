// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/customer.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class CustomerProto {
  private CustomerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_Customer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_Customer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_CallReportingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_CallReportingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_ConversionTrackingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_ConversionTrackingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_RemarketingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_RemarketingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_CustomerAgreementSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_CustomerAgreementSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_LocalServicesSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_LocalServicesSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_GranularLicenseStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_GranularLicenseStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_GranularInsuranceStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_GranularInsuranceStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v17/resources/cus" +
      "tomer.proto\022\"google.ads.googleads.v17.re" +
      "sources\032=google/ads/googleads/v17/enums/" +
      "brand_safety_suitability.proto\032Dgoogle/a" +
      "ds/googleads/v17/enums/conversion_tracki" +
      "ng_status_enum.proto\032[google/ads/googlea" +
      "ds/v17/enums/customer_pay_per_conversion" +
      "_eligibility_failure_reason.proto\0324googl" +
      "e/ads/googleads/v17/enums/customer_statu" +
      "s.proto\032Ggoogle/ads/googleads/v17/enums/" +
      "local_services_verification_status.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\367\017\n\010Customer\022@\n\rres" +
      "ource_name\030\001 \001(\tB)\340A\005\372A#\n!googleads.goog" +
      "leapis.com/Customer\022\024\n\002id\030\023 \001(\003B\003\340A\003H\000\210\001" +
      "\001\022\035\n\020descriptive_name\030\024 \001(\tH\001\210\001\001\022\037\n\rcurr" +
      "ency_code\030\025 \001(\tB\003\340A\005H\002\210\001\001\022\033\n\ttime_zone\030\026" +
      " \001(\tB\003\340A\005H\003\210\001\001\022\"\n\025tracking_url_template\030" +
      "\027 \001(\tH\004\210\001\001\022\035\n\020final_url_suffix\030\030 \001(\tH\005\210\001" +
      "\001\022!\n\024auto_tagging_enabled\030\031 \001(\010H\006\210\001\001\022$\n\022" +
      "has_partners_badge\030\032 \001(\010B\003\340A\003H\007\210\001\001\022\031\n\007ma" +
      "nager\030\033 \001(\010B\003\340A\003H\010\210\001\001\022\036\n\014test_account\030\034 " +
      "\001(\010B\003\340A\003H\t\210\001\001\022X\n\026call_reporting_setting\030" +
      "\n \001(\01328.google.ads.googleads.v17.resourc" +
      "es.CallReportingSetting\022g\n\033conversion_tr" +
      "acking_setting\030\016 \001(\0132=.google.ads.google" +
      "ads.v17.resources.ConversionTrackingSett" +
      "ingB\003\340A\003\022X\n\023remarketing_setting\030\017 \001(\01326." +
      "google.ads.googleads.v17.resources.Remar" +
      "ketingSettingB\003\340A\003\022\303\001\n.pay_per_conversio" +
      "n_eligibility_failure_reasons\030\020 \003(\0162\205\001.g" +
      "oogle.ads.googleads.v17.enums.CustomerPa" +
      "yPerConversionEligibilityFailureReasonEn" +
      "um.CustomerPayPerConversionEligibilityFa" +
      "ilureReasonB\003\340A\003\022$\n\022optimization_score\030\035" +
      " \001(\001B\003\340A\003H\n\210\001\001\022&\n\031optimization_score_wei" +
      "ght\030\036 \001(\001B\003\340A\003\022V\n\006status\030$ \001(\0162A.google." +
      "ads.googleads.v17.enums.CustomerStatusEn" +
      "um.CustomerStatusB\003\340A\003\0224\n\"location_asset" +
      "_auto_migration_done\030& \001(\010B\003\340A\003H\013\210\001\001\0221\n\037" +
      "image_asset_auto_migration_done\030\' \001(\010B\003\340" +
      "A\003H\014\210\001\001\022>\n,location_asset_auto_migration" +
      "_done_date_time\030( \001(\tB\003\340A\003H\r\210\001\001\022;\n)image" +
      "_asset_auto_migration_done_date_time\030) \001" +
      "(\tB\003\340A\003H\016\210\001\001\022e\n\032customer_agreement_setti" +
      "ng\030, \001(\0132<.google.ads.googleads.v17.reso" +
      "urces.CustomerAgreementSettingB\003\340A\003\022_\n\027l" +
      "ocal_services_settings\030- \001(\01329.google.ad" +
      "s.googleads.v17.resources.LocalServicesS" +
      "ettingsB\003\340A\003\022~\n\036video_brand_safety_suita" +
      "bility\030. \001(\0162Q.google.ads.googleads.v17." +
      "enums.BrandSafetySuitabilityEnum.BrandSa" +
      "fetySuitabilityB\003\340A\003:?\352A<\n!googleads.goo" +
      "gleapis.com/Customer\022\027customers/{custome" +
      "r_id}B\005\n\003_idB\023\n\021_descriptive_nameB\020\n\016_cu" +
      "rrency_codeB\014\n\n_time_zoneB\030\n\026_tracking_u" +
      "rl_templateB\023\n\021_final_url_suffixB\027\n\025_aut" +
      "o_tagging_enabledB\025\n\023_has_partners_badge" +
      "B\n\n\010_managerB\017\n\r_test_accountB\025\n\023_optimi" +
      "zation_scoreB%\n#_location_asset_auto_mig" +
      "ration_doneB\"\n _image_asset_auto_migrati" +
      "on_doneB/\n-_location_asset_auto_migratio" +
      "n_done_date_timeB,\n*_image_asset_auto_mi" +
      "gration_done_date_time\"\234\002\n\024CallReporting" +
      "Setting\022#\n\026call_reporting_enabled\030\n \001(\010H" +
      "\000\210\001\001\022.\n!call_conversion_reporting_enable" +
      "d\030\013 \001(\010H\001\210\001\001\022S\n\026call_conversion_action\030\014" +
      " \001(\tB.\372A+\n)googleads.googleapis.com/Conv" +
      "ersionActionH\002\210\001\001B\031\n\027_call_reporting_ena" +
      "bledB$\n\"_call_conversion_reporting_enabl" +
      "edB\031\n\027_call_conversion_action\"\316\003\n\031Conver" +
      "sionTrackingSetting\022(\n\026conversion_tracki" +
      "ng_id\030\003 \001(\003B\003\340A\003H\000\210\001\001\0226\n$cross_account_c" +
      "onversion_tracking_id\030\004 \001(\003B\003\340A\003H\001\210\001\001\022)\n" +
      "\034accepted_customer_data_terms\030\005 \001(\010B\003\340A\003" +
      "\022~\n\032conversion_tracking_status\030\006 \001(\0162U.g" +
      "oogle.ads.googleads.v17.enums.Conversion" +
      "TrackingStatusEnum.ConversionTrackingSta" +
      "tusB\003\340A\003\0223\n&enhanced_conversions_for_lea" +
      "ds_enabled\030\007 \001(\010B\003\340A\003\022+\n\036google_ads_conv" +
      "ersion_customer\030\010 \001(\tB\003\340A\003B\031\n\027_conversio" +
      "n_tracking_idB\'\n%_cross_account_conversi" +
      "on_tracking_id\"Y\n\022RemarketingSetting\022(\n\026" +
      "google_global_site_tag\030\002 \001(\tB\003\340A\003H\000\210\001\001B\031" +
      "\n\027_google_global_site_tag\"A\n\030CustomerAgr" +
      "eementSetting\022%\n\030accepted_lead_form_term" +
      "s\030\001 \001(\010B\003\340A\003\"\341\001\n\025LocalServicesSettings\022a" +
      "\n\031granular_license_statuses\030\001 \003(\01329.goog" +
      "le.ads.googleads.v17.resources.GranularL" +
      "icenseStatusB\003\340A\003\022e\n\033granular_insurance_" +
      "statuses\030\002 \003(\0132;.google.ads.googleads.v1" +
      "7.resources.GranularInsuranceStatusB\003\340A\003" +
      "\"\244\002\n\025GranularLicenseStatus\022\"\n\020geo_criter" +
      "ion_id\030\001 \001(\003B\003\340A\003H\000\210\001\001\022\035\n\013category_id\030\002 " +
      "\001(\tB\003\340A\003H\001\210\001\001\022\212\001\n\023verification_status\030\003 " +
      "\001(\0162c.google.ads.googleads.v17.enums.Loc" +
      "alServicesVerificationStatusEnum.LocalSe" +
      "rvicesVerificationStatusB\003\340A\003H\002\210\001\001B\023\n\021_g" +
      "eo_criterion_idB\016\n\014_category_idB\026\n\024_veri" +
      "fication_status\"\246\002\n\027GranularInsuranceSta" +
      "tus\022\"\n\020geo_criterion_id\030\001 \001(\003B\003\340A\003H\000\210\001\001\022" +
      "\035\n\013category_id\030\002 \001(\tB\003\340A\003H\001\210\001\001\022\212\001\n\023verif" +
      "ication_status\030\003 \001(\0162c.google.ads.google" +
      "ads.v17.enums.LocalServicesVerificationS" +
      "tatusEnum.LocalServicesVerificationStatu" +
      "sB\003\340A\003H\002\210\001\001B\023\n\021_geo_criterion_idB\016\n\014_cat" +
      "egory_idB\026\n\024_verification_statusB\377\001\n&com" +
      ".google.ads.googleads.v17.resourcesB\rCus" +
      "tomerProtoP\001ZKgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v17/resources;" +
      "resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V" +
      "17.Resources\312\002\"Google\\Ads\\GoogleAds\\V17\\" +
      "Resources\352\002&Google::Ads::GoogleAds::V17:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.enums.BrandSafetySuitabilityProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.ConversionTrackingStatusEnumProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.CustomerPayPerConversionEligibilityFailureReasonProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.CustomerStatusProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.LocalServicesVerificationStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_Customer_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "DescriptiveName", "CurrencyCode", "TimeZone", "TrackingUrlTemplate", "FinalUrlSuffix", "AutoTaggingEnabled", "HasPartnersBadge", "Manager", "TestAccount", "CallReportingSetting", "ConversionTrackingSetting", "RemarketingSetting", "PayPerConversionEligibilityFailureReasons", "OptimizationScore", "OptimizationScoreWeight", "Status", "LocationAssetAutoMigrationDone", "ImageAssetAutoMigrationDone", "LocationAssetAutoMigrationDoneDateTime", "ImageAssetAutoMigrationDoneDateTime", "CustomerAgreementSetting", "LocalServicesSettings", "VideoBrandSafetySuitability", });
    internal_static_google_ads_googleads_v17_resources_CallReportingSetting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v17_resources_CallReportingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_CallReportingSetting_descriptor,
        new java.lang.String[] { "CallReportingEnabled", "CallConversionReportingEnabled", "CallConversionAction", });
    internal_static_google_ads_googleads_v17_resources_ConversionTrackingSetting_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v17_resources_ConversionTrackingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_ConversionTrackingSetting_descriptor,
        new java.lang.String[] { "ConversionTrackingId", "CrossAccountConversionTrackingId", "AcceptedCustomerDataTerms", "ConversionTrackingStatus", "EnhancedConversionsForLeadsEnabled", "GoogleAdsConversionCustomer", });
    internal_static_google_ads_googleads_v17_resources_RemarketingSetting_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v17_resources_RemarketingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_RemarketingSetting_descriptor,
        new java.lang.String[] { "GoogleGlobalSiteTag", });
    internal_static_google_ads_googleads_v17_resources_CustomerAgreementSetting_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v17_resources_CustomerAgreementSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_CustomerAgreementSetting_descriptor,
        new java.lang.String[] { "AcceptedLeadFormTerms", });
    internal_static_google_ads_googleads_v17_resources_LocalServicesSettings_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v17_resources_LocalServicesSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_LocalServicesSettings_descriptor,
        new java.lang.String[] { "GranularLicenseStatuses", "GranularInsuranceStatuses", });
    internal_static_google_ads_googleads_v17_resources_GranularLicenseStatus_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v17_resources_GranularLicenseStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_GranularLicenseStatus_descriptor,
        new java.lang.String[] { "GeoCriterionId", "CategoryId", "VerificationStatus", });
    internal_static_google_ads_googleads_v17_resources_GranularInsuranceStatus_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v17_resources_GranularInsuranceStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_GranularInsuranceStatus_descriptor,
        new java.lang.String[] { "GeoCriterionId", "CategoryId", "VerificationStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.enums.BrandSafetySuitabilityProto.getDescriptor();
    com.google.ads.googleads.v17.enums.ConversionTrackingStatusEnumProto.getDescriptor();
    com.google.ads.googleads.v17.enums.CustomerPayPerConversionEligibilityFailureReasonProto.getDescriptor();
    com.google.ads.googleads.v17.enums.CustomerStatusProto.getDescriptor();
    com.google.ads.googleads.v17.enums.LocalServicesVerificationStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
