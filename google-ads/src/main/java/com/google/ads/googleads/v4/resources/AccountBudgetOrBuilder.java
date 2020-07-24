// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/account_budget.proto

package com.google.ads.googleads.v4.resources;

public interface AccountBudgetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.resources.AccountBudget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the account-level budget.
   * AccountBudget resource names have the form:
   * `customers/{customer_id}/accountBudgets/{account_budget_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the account-level budget.
   * AccountBudget resource names have the form:
   * `customers/{customer_id}/accountBudgets/{account_budget_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the account-level budget.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the account-level budget.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the account-level budget.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. The resource name of the billing setup associated with this account-level
   * budget.  BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue billing_setup = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the billingSetup field is set.
   */
  boolean hasBillingSetup();
  /**
   * <pre>
   * Output only. The resource name of the billing setup associated with this account-level
   * budget.  BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue billing_setup = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The billingSetup.
   */
  com.google.protobuf.StringValue getBillingSetup();
  /**
   * <pre>
   * Output only. The resource name of the billing setup associated with this account-level
   * budget.  BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue billing_setup = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getBillingSetupOrBuilder();

  /**
   * <pre>
   * Output only. The status of this account-level budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.AccountBudgetStatusEnum.AccountBudgetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of this account-level budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.AccountBudgetStatusEnum.AccountBudgetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v4.enums.AccountBudgetStatusEnum.AccountBudgetStatus getStatus();

  /**
   * <pre>
   * Output only. The name of the account-level budget.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the account-level budget.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Output only. The name of the account-level budget.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Output only. The proposed start time of the account-level budget in
   * yyyy-MM-dd HH:mm:ss format.  If a start time type of NOW was proposed,
   * this is the time of request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue proposed_start_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedStartDateTime field is set.
   */
  boolean hasProposedStartDateTime();
  /**
   * <pre>
   * Output only. The proposed start time of the account-level budget in
   * yyyy-MM-dd HH:mm:ss format.  If a start time type of NOW was proposed,
   * this is the time of request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue proposed_start_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedStartDateTime.
   */
  com.google.protobuf.StringValue getProposedStartDateTime();
  /**
   * <pre>
   * Output only. The proposed start time of the account-level budget in
   * yyyy-MM-dd HH:mm:ss format.  If a start time type of NOW was proposed,
   * this is the time of request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue proposed_start_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getProposedStartDateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The approved start time of the account-level budget in yyyy-MM-dd HH:mm:ss
   * format.
   * For example, if a new budget is approved after the proposed start time,
   * the approved start time is the time of approval.
   * </pre>
   *
   * <code>.google.protobuf.StringValue approved_start_date_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedStartDateTime field is set.
   */
  boolean hasApprovedStartDateTime();
  /**
   * <pre>
   * Output only. The approved start time of the account-level budget in yyyy-MM-dd HH:mm:ss
   * format.
   * For example, if a new budget is approved after the proposed start time,
   * the approved start time is the time of approval.
   * </pre>
   *
   * <code>.google.protobuf.StringValue approved_start_date_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedStartDateTime.
   */
  com.google.protobuf.StringValue getApprovedStartDateTime();
  /**
   * <pre>
   * Output only. The approved start time of the account-level budget in yyyy-MM-dd HH:mm:ss
   * format.
   * For example, if a new budget is approved after the proposed start time,
   * the approved start time is the time of approval.
   * </pre>
   *
   * <code>.google.protobuf.StringValue approved_start_date_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getApprovedStartDateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The total adjustments amount.
   * An example of an adjustment is courtesy credits.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_adjustments_micros = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the totalAdjustmentsMicros field is set.
   */
  boolean hasTotalAdjustmentsMicros();
  /**
   * <pre>
   * Output only. The total adjustments amount.
   * An example of an adjustment is courtesy credits.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_adjustments_micros = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The totalAdjustmentsMicros.
   */
  com.google.protobuf.Int64Value getTotalAdjustmentsMicros();
  /**
   * <pre>
   * Output only. The total adjustments amount.
   * An example of an adjustment is courtesy credits.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_adjustments_micros = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTotalAdjustmentsMicrosOrBuilder();

  /**
   * <pre>
   * Output only. The value of Ads that have been served, in micros.
   * This includes overdelivery costs, in which case a credit might be
   * automatically applied to the budget (see total_adjustments_micros).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_served_micros = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the amountServedMicros field is set.
   */
  boolean hasAmountServedMicros();
  /**
   * <pre>
   * Output only. The value of Ads that have been served, in micros.
   * This includes overdelivery costs, in which case a credit might be
   * automatically applied to the budget (see total_adjustments_micros).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_served_micros = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The amountServedMicros.
   */
  com.google.protobuf.Int64Value getAmountServedMicros();
  /**
   * <pre>
   * Output only. The value of Ads that have been served, in micros.
   * This includes overdelivery costs, in which case a credit might be
   * automatically applied to the budget (see total_adjustments_micros).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_served_micros = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAmountServedMicrosOrBuilder();

  /**
   * <pre>
   * Output only. A purchase order number is a value that helps users reference this budget
   * in their monthly invoices.
   * </pre>
   *
   * <code>.google.protobuf.StringValue purchase_order_number = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the purchaseOrderNumber field is set.
   */
  boolean hasPurchaseOrderNumber();
  /**
   * <pre>
   * Output only. A purchase order number is a value that helps users reference this budget
   * in their monthly invoices.
   * </pre>
   *
   * <code>.google.protobuf.StringValue purchase_order_number = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The purchaseOrderNumber.
   */
  com.google.protobuf.StringValue getPurchaseOrderNumber();
  /**
   * <pre>
   * Output only. A purchase order number is a value that helps users reference this budget
   * in their monthly invoices.
   * </pre>
   *
   * <code>.google.protobuf.StringValue purchase_order_number = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getPurchaseOrderNumberOrBuilder();

  /**
   * <pre>
   * Output only. Notes associated with the budget.
   * </pre>
   *
   * <code>.google.protobuf.StringValue notes = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the notes field is set.
   */
  boolean hasNotes();
  /**
   * <pre>
   * Output only. Notes associated with the budget.
   * </pre>
   *
   * <code>.google.protobuf.StringValue notes = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The notes.
   */
  com.google.protobuf.StringValue getNotes();
  /**
   * <pre>
   * Output only. Notes associated with the budget.
   * </pre>
   *
   * <code>.google.protobuf.StringValue notes = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNotesOrBuilder();

  /**
   * <pre>
   * Output only. The pending proposal to modify this budget, if applicable.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.resources.AccountBudget.PendingAccountBudgetProposal pending_proposal = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the pendingProposal field is set.
   */
  boolean hasPendingProposal();
  /**
   * <pre>
   * Output only. The pending proposal to modify this budget, if applicable.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.resources.AccountBudget.PendingAccountBudgetProposal pending_proposal = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pendingProposal.
   */
  com.google.ads.googleads.v4.resources.AccountBudget.PendingAccountBudgetProposal getPendingProposal();
  /**
   * <pre>
   * Output only. The pending proposal to modify this budget, if applicable.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.resources.AccountBudget.PendingAccountBudgetProposal pending_proposal = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v4.resources.AccountBudget.PendingAccountBudgetProposalOrBuilder getPendingProposalOrBuilder();

  /**
   * <pre>
   * Output only. The proposed end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue proposed_end_date_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedEndDateTime field is set.
   */
  boolean hasProposedEndDateTime();
  /**
   * <pre>
   * Output only. The proposed end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue proposed_end_date_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedEndDateTime.
   */
  com.google.protobuf.StringValue getProposedEndDateTime();
  /**
   * <pre>
   * Output only. The proposed end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue proposed_end_date_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getProposedEndDateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The proposed end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for proposedEndTimeType.
   */
  int getProposedEndTimeTypeValue();
  /**
   * <pre>
   * Output only. The proposed end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedEndTimeType.
   */
  com.google.ads.googleads.v4.enums.TimeTypeEnum.TimeType getProposedEndTimeType();

  /**
   * <pre>
   * Output only. The approved end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue approved_end_date_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedEndDateTime field is set.
   */
  boolean hasApprovedEndDateTime();
  /**
   * <pre>
   * Output only. The approved end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue approved_end_date_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedEndDateTime.
   */
  com.google.protobuf.StringValue getApprovedEndDateTime();
  /**
   * <pre>
   * Output only. The approved end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue approved_end_date_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getApprovedEndDateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The approved end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.TimeTypeEnum.TimeType approved_end_time_type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvedEndTimeType.
   */
  int getApprovedEndTimeTypeValue();
  /**
   * <pre>
   * Output only. The approved end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.TimeTypeEnum.TimeType approved_end_time_type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedEndTimeType.
   */
  com.google.ads.googleads.v4.enums.TimeTypeEnum.TimeType getApprovedEndTimeType();

  /**
   * <pre>
   * Output only. The proposed spending limit in micros.  One million is equivalent to
   * one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value proposed_spending_limit_micros = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedSpendingLimitMicros field is set.
   */
  boolean hasProposedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The proposed spending limit in micros.  One million is equivalent to
   * one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value proposed_spending_limit_micros = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedSpendingLimitMicros.
   */
  com.google.protobuf.Int64Value getProposedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The proposed spending limit in micros.  One million is equivalent to
   * one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value proposed_spending_limit_micros = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getProposedSpendingLimitMicrosOrBuilder();

  /**
   * <pre>
   * Output only. The proposed spending limit as a well-defined type, e.g. INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for proposedSpendingLimitType.
   */
  int getProposedSpendingLimitTypeValue();
  /**
   * <pre>
   * Output only. The proposed spending limit as a well-defined type, e.g. INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedSpendingLimitType.
   */
  com.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType getProposedSpendingLimitType();

  /**
   * <pre>
   * Output only. The approved spending limit in micros.  One million is equivalent to
   * one unit.  This will only be populated if the proposed spending limit
   * is finite, and will always be greater than or equal to the
   * proposed spending limit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value approved_spending_limit_micros = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedSpendingLimitMicros field is set.
   */
  boolean hasApprovedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The approved spending limit in micros.  One million is equivalent to
   * one unit.  This will only be populated if the proposed spending limit
   * is finite, and will always be greater than or equal to the
   * proposed spending limit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value approved_spending_limit_micros = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedSpendingLimitMicros.
   */
  com.google.protobuf.Int64Value getApprovedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The approved spending limit in micros.  One million is equivalent to
   * one unit.  This will only be populated if the proposed spending limit
   * is finite, and will always be greater than or equal to the
   * proposed spending limit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value approved_spending_limit_micros = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getApprovedSpendingLimitMicrosOrBuilder();

  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, e.g. INFINITE.  This
   * will only be populated if the approved spending limit is INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvedSpendingLimitType.
   */
  int getApprovedSpendingLimitTypeValue();
  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, e.g. INFINITE.  This
   * will only be populated if the approved spending limit is INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedSpendingLimitType.
   */
  com.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType getApprovedSpendingLimitType();

  /**
   * <pre>
   * Output only. The adjusted spending limit in micros.  One million is equivalent to
   * one unit.
   * If the approved spending limit is finite, the adjusted
   * spending limit may vary depending on the types of adjustments applied
   * to this budget, if applicable.
   * The different kinds of adjustments are described here:
   * https://support.google.com/google-ads/answer/1704323
   * For example, a debit adjustment reduces how much the account is
   * allowed to spend.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value adjusted_spending_limit_micros = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the adjustedSpendingLimitMicros field is set.
   */
  boolean hasAdjustedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The adjusted spending limit in micros.  One million is equivalent to
   * one unit.
   * If the approved spending limit is finite, the adjusted
   * spending limit may vary depending on the types of adjustments applied
   * to this budget, if applicable.
   * The different kinds of adjustments are described here:
   * https://support.google.com/google-ads/answer/1704323
   * For example, a debit adjustment reduces how much the account is
   * allowed to spend.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value adjusted_spending_limit_micros = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adjustedSpendingLimitMicros.
   */
  com.google.protobuf.Int64Value getAdjustedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The adjusted spending limit in micros.  One million is equivalent to
   * one unit.
   * If the approved spending limit is finite, the adjusted
   * spending limit may vary depending on the types of adjustments applied
   * to this budget, if applicable.
   * The different kinds of adjustments are described here:
   * https://support.google.com/google-ads/answer/1704323
   * For example, a debit adjustment reduces how much the account is
   * allowed to spend.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value adjusted_spending_limit_micros = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAdjustedSpendingLimitMicrosOrBuilder();

  /**
   * <pre>
   * Output only. The adjusted spending limit as a well-defined type, e.g. INFINITE.
   * This will only be populated if the adjusted spending limit is INFINITE,
   * which is guaranteed to be true if the approved spending limit is
   * INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType adjusted_spending_limit_type = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for adjustedSpendingLimitType.
   */
  int getAdjustedSpendingLimitTypeValue();
  /**
   * <pre>
   * Output only. The adjusted spending limit as a well-defined type, e.g. INFINITE.
   * This will only be populated if the adjusted spending limit is INFINITE,
   * which is guaranteed to be true if the approved spending limit is
   * INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType adjusted_spending_limit_type = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adjustedSpendingLimitType.
   */
  com.google.ads.googleads.v4.enums.SpendingLimitTypeEnum.SpendingLimitType getAdjustedSpendingLimitType();

  public com.google.ads.googleads.v4.resources.AccountBudget.ProposedEndTimeCase getProposedEndTimeCase();

  public com.google.ads.googleads.v4.resources.AccountBudget.ApprovedEndTimeCase getApprovedEndTimeCase();

  public com.google.ads.googleads.v4.resources.AccountBudget.ProposedSpendingLimitCase getProposedSpendingLimitCase();

  public com.google.ads.googleads.v4.resources.AccountBudget.ApprovedSpendingLimitCase getApprovedSpendingLimitCase();

  public com.google.ads.googleads.v4.resources.AccountBudget.AdjustedSpendingLimitCase getAdjustedSpendingLimitCase();
}