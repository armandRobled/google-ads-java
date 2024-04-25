// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/audiences.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

public interface AudienceDimensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.AudienceDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dimension specifying users by their age.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.AgeDimension age = 1;</code>
   * @return Whether the age field is set.
   */
  boolean hasAge();
  /**
   * <pre>
   * Dimension specifying users by their age.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.AgeDimension age = 1;</code>
   * @return The age.
   */
  com.google.ads.googleads.v16.common.AgeDimension getAge();
  /**
   * <pre>
   * Dimension specifying users by their age.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.AgeDimension age = 1;</code>
   */
  com.google.ads.googleads.v16.common.AgeDimensionOrBuilder getAgeOrBuilder();

  /**
   * <pre>
   * Dimension specifying users by their gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.GenderDimension gender = 2;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * Dimension specifying users by their gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.GenderDimension gender = 2;</code>
   * @return The gender.
   */
  com.google.ads.googleads.v16.common.GenderDimension getGender();
  /**
   * <pre>
   * Dimension specifying users by their gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.GenderDimension gender = 2;</code>
   */
  com.google.ads.googleads.v16.common.GenderDimensionOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Dimension specifying users by their household income.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.HouseholdIncomeDimension household_income = 3;</code>
   * @return Whether the householdIncome field is set.
   */
  boolean hasHouseholdIncome();
  /**
   * <pre>
   * Dimension specifying users by their household income.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.HouseholdIncomeDimension household_income = 3;</code>
   * @return The householdIncome.
   */
  com.google.ads.googleads.v16.common.HouseholdIncomeDimension getHouseholdIncome();
  /**
   * <pre>
   * Dimension specifying users by their household income.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.HouseholdIncomeDimension household_income = 3;</code>
   */
  com.google.ads.googleads.v16.common.HouseholdIncomeDimensionOrBuilder getHouseholdIncomeOrBuilder();

  /**
   * <pre>
   * Dimension specifying users by their parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.ParentalStatusDimension parental_status = 4;</code>
   * @return Whether the parentalStatus field is set.
   */
  boolean hasParentalStatus();
  /**
   * <pre>
   * Dimension specifying users by their parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.ParentalStatusDimension parental_status = 4;</code>
   * @return The parentalStatus.
   */
  com.google.ads.googleads.v16.common.ParentalStatusDimension getParentalStatus();
  /**
   * <pre>
   * Dimension specifying users by their parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.ParentalStatusDimension parental_status = 4;</code>
   */
  com.google.ads.googleads.v16.common.ParentalStatusDimensionOrBuilder getParentalStatusOrBuilder();

  /**
   * <pre>
   * Dimension specifying users by their membership in other audience
   * segments.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.AudienceSegmentDimension audience_segments = 5;</code>
   * @return Whether the audienceSegments field is set.
   */
  boolean hasAudienceSegments();
  /**
   * <pre>
   * Dimension specifying users by their membership in other audience
   * segments.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.AudienceSegmentDimension audience_segments = 5;</code>
   * @return The audienceSegments.
   */
  com.google.ads.googleads.v16.common.AudienceSegmentDimension getAudienceSegments();
  /**
   * <pre>
   * Dimension specifying users by their membership in other audience
   * segments.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.AudienceSegmentDimension audience_segments = 5;</code>
   */
  com.google.ads.googleads.v16.common.AudienceSegmentDimensionOrBuilder getAudienceSegmentsOrBuilder();

  com.google.ads.googleads.v16.common.AudienceDimension.DimensionCase getDimensionCase();
}
