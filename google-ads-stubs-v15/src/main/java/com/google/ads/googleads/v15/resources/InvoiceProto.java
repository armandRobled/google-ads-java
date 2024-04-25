// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/invoice.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class InvoiceProto {
  private InvoiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_Invoice_AccountSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_Invoice_AccountSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_Invoice_AccountBudgetSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_Invoice_AccountBudgetSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_Invoice_InvalidActivitySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_Invoice_InvalidActivitySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v15/resources/inv" +
      "oice.proto\022\"google.ads.googleads.v15.res" +
      "ources\032+google/ads/googleads/v15/common/" +
      "dates.proto\0321google/ads/googleads/v15/en" +
      "ums/invoice_type.proto\0322google/ads/googl" +
      "eads/v15/enums/month_of_year.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\"\245\'\n\007Invoice\022?\n\rresource_n" +
      "ame\030\001 \001(\tB(\340A\003\372A\"\n googleads.googleapis." +
      "com/Invoice\022\024\n\002id\030\031 \001(\tB\003\340A\003H\000\210\001\001\022N\n\004typ" +
      "e\030\003 \001(\0162;.google.ads.googleads.v15.enums" +
      ".InvoiceTypeEnum.InvoiceTypeB\003\340A\003\022\037\n\rbil" +
      "ling_setup\030\032 \001(\tB\003\340A\003H\001\210\001\001\022%\n\023payments_a" +
      "ccount_id\030\033 \001(\tB\003\340A\003H\002\210\001\001\022%\n\023payments_pr" +
      "ofile_id\030\034 \001(\tB\003\340A\003H\003\210\001\001\022\034\n\nissue_date\030\035" +
      " \001(\tB\003\340A\003H\004\210\001\001\022\032\n\010due_date\030\036 \001(\tB\003\340A\003H\005\210" +
      "\001\001\022K\n\022service_date_range\030\t \001(\0132*.google." +
      "ads.googleads.v15.common.DateRangeB\003\340A\003\022" +
      "\037\n\rcurrency_code\030\037 \001(\tB\003\340A\003H\006\210\001\001\022/\n\"adju" +
      "stments_subtotal_amount_micros\030\023 \001(\003B\003\340A" +
      "\003\022*\n\035adjustments_tax_amount_micros\030\024 \001(\003" +
      "B\003\340A\003\022,\n\037adjustments_total_amount_micros" +
      "\030\025 \001(\003B\003\340A\003\0224\n\'regulatory_costs_subtotal" +
      "_amount_micros\030\026 \001(\003B\003\340A\003\022/\n\"regulatory_" +
      "costs_tax_amount_micros\030\027 \001(\003B\003\340A\003\0221\n$re" +
      "gulatory_costs_total_amount_micros\030\030 \001(\003" +
      "B\003\340A\003\0226\n$export_charge_subtotal_amount_m" +
      "icros\030( \001(\003B\003\340A\003H\007\210\001\001\0221\n\037export_charge_t" +
      "ax_amount_micros\030) \001(\003B\003\340A\003H\010\210\001\001\0223\n!expo" +
      "rt_charge_total_amount_micros\030* \001(\003B\003\340A\003" +
      "H\t\210\001\001\022(\n\026subtotal_amount_micros\030! \001(\003B\003\340" +
      "A\003H\n\210\001\001\022#\n\021tax_amount_micros\030\" \001(\003B\003\340A\003H" +
      "\013\210\001\001\022%\n\023total_amount_micros\030# \001(\003B\003\340A\003H\014" +
      "\210\001\001\022#\n\021corrected_invoice\030$ \001(\tB\003\340A\003H\r\210\001\001" +
      "\022\036\n\021replaced_invoices\030% \003(\tB\003\340A\003\022\031\n\007pdf_" +
      "url\030& \001(\tB\003\340A\003H\016\210\001\001\022g\n\030account_budget_su" +
      "mmaries\030\022 \003(\0132@.google.ads.googleads.v15" +
      ".resources.Invoice.AccountBudgetSummaryB" +
      "\003\340A\003\022Z\n\021account_summaries\030\' \003(\0132:.google" +
      ".ads.googleads.v15.resources.Invoice.Acc" +
      "ountSummaryB\003\340A\003\032\341\r\n\016AccountSummary\022\032\n\010c" +
      "ustomer\030\001 \001(\tB\003\340A\003H\000\210\001\001\022;\n)billing_corre" +
      "ction_subtotal_amount_micros\030\002 \001(\003B\003\340A\003H" +
      "\001\210\001\001\0226\n$billing_correction_tax_amount_mi" +
      "cros\030\003 \001(\003B\003\340A\003H\002\210\001\001\0228\n&billing_correcti" +
      "on_total_amount_micros\030\004 \001(\003B\003\340A\003H\003\210\001\001\022:" +
      "\n(coupon_adjustment_subtotal_amount_micr" +
      "os\030\005 \001(\003B\003\340A\003H\004\210\001\001\0225\n#coupon_adjustment_" +
      "tax_amount_micros\030\006 \001(\003B\003\340A\003H\005\210\001\001\0227\n%cou" +
      "pon_adjustment_total_amount_micros\030\007 \001(\003" +
      "B\003\340A\003H\006\210\001\001\022A\n/excess_credit_adjustment_s" +
      "ubtotal_amount_micros\030\010 \001(\003B\003\340A\003H\007\210\001\001\022<\n" +
      "*excess_credit_adjustment_tax_amount_mic" +
      "ros\030\t \001(\003B\003\340A\003H\010\210\001\001\022>\n,excess_credit_adj" +
      "ustment_total_amount_micros\030\n \001(\003B\003\340A\003H\t" +
      "\210\001\001\0229\n\'regulatory_costs_subtotal_amount_" +
      "micros\030\013 \001(\003B\003\340A\003H\n\210\001\001\0224\n\"regulatory_cos" +
      "ts_tax_amount_micros\030\014 \001(\003B\003\340A\003H\013\210\001\001\0226\n$" +
      "regulatory_costs_total_amount_micros\030\r \001" +
      "(\003B\003\340A\003H\014\210\001\001\0226\n$export_charge_subtotal_a" +
      "mount_micros\030\021 \001(\003B\003\340A\003H\r\210\001\001\0221\n\037export_c" +
      "harge_tax_amount_micros\030\022 \001(\003B\003\340A\003H\016\210\001\001\022" +
      "3\n!export_charge_total_amount_micros\030\023 \001" +
      "(\003B\003\340A\003H\017\210\001\001\022(\n\026subtotal_amount_micros\030\016" +
      " \001(\003B\003\340A\003H\020\210\001\001\022#\n\021tax_amount_micros\030\017 \001(" +
      "\003B\003\340A\003H\021\210\001\001\022%\n\023total_amount_micros\030\020 \001(\003" +
      "B\003\340A\003H\022\210\001\001B\013\n\t_customerB,\n*_billing_corr" +
      "ection_subtotal_amount_microsB\'\n%_billin" +
      "g_correction_tax_amount_microsB)\n\'_billi" +
      "ng_correction_total_amount_microsB+\n)_co" +
      "upon_adjustment_subtotal_amount_microsB&" +
      "\n$_coupon_adjustment_tax_amount_microsB(" +
      "\n&_coupon_adjustment_total_amount_micros" +
      "B2\n0_excess_credit_adjustment_subtotal_a" +
      "mount_microsB-\n+_excess_credit_adjustmen" +
      "t_tax_amount_microsB/\n-_excess_credit_ad" +
      "justment_total_amount_microsB*\n(_regulat" +
      "ory_costs_subtotal_amount_microsB%\n#_reg" +
      "ulatory_costs_tax_amount_microsB\'\n%_regu" +
      "latory_costs_total_amount_microsB\'\n%_exp" +
      "ort_charge_subtotal_amount_microsB\"\n _ex" +
      "port_charge_tax_amount_microsB$\n\"_export" +
      "_charge_total_amount_microsB\031\n\027_subtotal" +
      "_amount_microsB\024\n\022_tax_amount_microsB\026\n\024" +
      "_total_amount_micros\032\350\007\n\024AccountBudgetSu" +
      "mmary\022\032\n\010customer\030\n \001(\tB\003\340A\003H\000\210\001\001\022+\n\031cus" +
      "tomer_descriptive_name\030\013 \001(\tB\003\340A\003H\001\210\001\001\022 " +
      "\n\016account_budget\030\014 \001(\tB\003\340A\003H\002\210\001\001\022%\n\023acco" +
      "unt_budget_name\030\r \001(\tB\003\340A\003H\003\210\001\001\022\'\n\025purch" +
      "ase_order_number\030\016 \001(\tB\003\340A\003H\004\210\001\001\022(\n\026subt" +
      "otal_amount_micros\030\017 \001(\003B\003\340A\003H\005\210\001\001\022#\n\021ta" +
      "x_amount_micros\030\020 \001(\003B\003\340A\003H\006\210\001\001\022%\n\023total" +
      "_amount_micros\030\021 \001(\003B\003\340A\003H\007\210\001\001\022U\n\034billab" +
      "le_activity_date_range\030\t \001(\0132*.google.ad" +
      "s.googleads.v15.common.DateRangeB\003\340A\003\022&\n" +
      "\024served_amount_micros\030\022 \001(\003B\003\340A\003H\010\210\001\001\022&\n" +
      "\024billed_amount_micros\030\023 \001(\003B\003\340A\003H\t\210\001\001\022,\n" +
      "\032overdelivery_amount_micros\030\024 \001(\003B\003\340A\003H\n" +
      "\210\001\001\0220\n\036invalid_activity_amount_micros\030\025 " +
      "\001(\003B\003\340A\003H\013\210\001\001\022k\n\032invalid_activity_summar" +
      "ies\030\026 \003(\0132B.google.ads.googleads.v15.res" +
      "ources.Invoice.InvalidActivitySummaryB\003\340" +
      "A\003B\013\n\t_customerB\034\n\032_customer_descriptive" +
      "_nameB\021\n\017_account_budgetB\026\n\024_account_bud" +
      "get_nameB\030\n\026_purchase_order_numberB\031\n\027_s" +
      "ubtotal_amount_microsB\024\n\022_tax_amount_mic" +
      "rosB\026\n\024_total_amount_microsB\027\n\025_served_a" +
      "mount_microsB\027\n\025_billed_amount_microsB\035\n" +
      "\033_overdelivery_amount_microsB!\n\037_invalid" +
      "_activity_amount_micros\032\201\004\n\026InvalidActiv" +
      "itySummary\022h\n\031original_month_of_service\030" +
      "\001 \001(\0162;.google.ads.googleads.v15.enums.M" +
      "onthOfYearEnum.MonthOfYearB\003\340A\003H\000\210\001\001\022*\n\030" +
      "original_year_of_service\030\002 \001(\tB\003\340A\003H\001\210\001\001" +
      "\022%\n\023original_invoice_id\030\003 \001(\tB\003\340A\003H\002\210\001\001\022" +
      ".\n\034original_account_budget_name\030\004 \001(\tB\003\340" +
      "A\003H\003\210\001\001\0220\n\036original_purchase_order_numbe" +
      "r\030\005 \001(\tB\003\340A\003H\004\210\001\001\022\037\n\ramount_micros\030\006 \001(\003" +
      "B\003\340A\003H\005\210\001\001B\034\n\032_original_month_of_service" +
      "B\033\n\031_original_year_of_serviceB\026\n\024_origin" +
      "al_invoice_idB\037\n\035_original_account_budge" +
      "t_nameB!\n\037_original_purchase_order_numbe" +
      "rB\020\n\016_amount_micros:T\352AQ\n googleads.goog" +
      "leapis.com/Invoice\022-customers/{customer_" +
      "id}/invoices/{invoice_id}B\005\n\003_idB\020\n\016_bil" +
      "ling_setupB\026\n\024_payments_account_idB\026\n\024_p" +
      "ayments_profile_idB\r\n\013_issue_dateB\013\n\t_du" +
      "e_dateB\020\n\016_currency_codeB\'\n%_export_char" +
      "ge_subtotal_amount_microsB\"\n _export_cha" +
      "rge_tax_amount_microsB$\n\"_export_charge_" +
      "total_amount_microsB\031\n\027_subtotal_amount_" +
      "microsB\024\n\022_tax_amount_microsB\026\n\024_total_a" +
      "mount_microsB\024\n\022_corrected_invoiceB\n\n\010_p" +
      "df_urlB\376\001\n&com.google.ads.googleads.v15." +
      "resourcesB\014InvoiceProtoP\001ZKgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "15/resources;resources\242\002\003GAA\252\002\"Google.Ad" +
      "s.GoogleAds.V15.Resources\312\002\"Google\\Ads\\G" +
      "oogleAds\\V15\\Resources\352\002&Google::Ads::Go" +
      "ogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.DatesProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.InvoiceTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.MonthOfYearProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_Invoice_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "BillingSetup", "PaymentsAccountId", "PaymentsProfileId", "IssueDate", "DueDate", "ServiceDateRange", "CurrencyCode", "AdjustmentsSubtotalAmountMicros", "AdjustmentsTaxAmountMicros", "AdjustmentsTotalAmountMicros", "RegulatoryCostsSubtotalAmountMicros", "RegulatoryCostsTaxAmountMicros", "RegulatoryCostsTotalAmountMicros", "ExportChargeSubtotalAmountMicros", "ExportChargeTaxAmountMicros", "ExportChargeTotalAmountMicros", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "CorrectedInvoice", "ReplacedInvoices", "PdfUrl", "AccountBudgetSummaries", "AccountSummaries", });
    internal_static_google_ads_googleads_v15_resources_Invoice_AccountSummary_descriptor =
      internal_static_google_ads_googleads_v15_resources_Invoice_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_Invoice_AccountSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_Invoice_AccountSummary_descriptor,
        new java.lang.String[] { "Customer", "BillingCorrectionSubtotalAmountMicros", "BillingCorrectionTaxAmountMicros", "BillingCorrectionTotalAmountMicros", "CouponAdjustmentSubtotalAmountMicros", "CouponAdjustmentTaxAmountMicros", "CouponAdjustmentTotalAmountMicros", "ExcessCreditAdjustmentSubtotalAmountMicros", "ExcessCreditAdjustmentTaxAmountMicros", "ExcessCreditAdjustmentTotalAmountMicros", "RegulatoryCostsSubtotalAmountMicros", "RegulatoryCostsTaxAmountMicros", "RegulatoryCostsTotalAmountMicros", "ExportChargeSubtotalAmountMicros", "ExportChargeTaxAmountMicros", "ExportChargeTotalAmountMicros", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", });
    internal_static_google_ads_googleads_v15_resources_Invoice_AccountBudgetSummary_descriptor =
      internal_static_google_ads_googleads_v15_resources_Invoice_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v15_resources_Invoice_AccountBudgetSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_Invoice_AccountBudgetSummary_descriptor,
        new java.lang.String[] { "Customer", "CustomerDescriptiveName", "AccountBudget", "AccountBudgetName", "PurchaseOrderNumber", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "BillableActivityDateRange", "ServedAmountMicros", "BilledAmountMicros", "OverdeliveryAmountMicros", "InvalidActivityAmountMicros", "InvalidActivitySummaries", });
    internal_static_google_ads_googleads_v15_resources_Invoice_InvalidActivitySummary_descriptor =
      internal_static_google_ads_googleads_v15_resources_Invoice_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v15_resources_Invoice_InvalidActivitySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_Invoice_InvalidActivitySummary_descriptor,
        new java.lang.String[] { "OriginalMonthOfService", "OriginalYearOfService", "OriginalInvoiceId", "OriginalAccountBudgetName", "OriginalPurchaseOrderNumber", "AmountMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.DatesProto.getDescriptor();
    com.google.ads.googleads.v15.enums.InvoiceTypeProto.getDescriptor();
    com.google.ads.googleads.v15.enums.MonthOfYearProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
