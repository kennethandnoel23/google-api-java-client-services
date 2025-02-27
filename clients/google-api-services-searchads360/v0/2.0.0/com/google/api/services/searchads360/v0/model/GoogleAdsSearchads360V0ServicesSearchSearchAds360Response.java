/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.searchads360.v0.model;

/**
 * Response message for SearchAds360Service.Search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0ServicesSearchSearchAds360Response extends com.google.api.client.json.GenericJson {

  /**
   * The headers of the conversion custom dimensions in the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0ServicesConversionCustomDimensionHeader> conversionCustomDimensionHeaders;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0ServicesConversionCustomDimensionHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0ServicesConversionCustomDimensionHeader.class);
  }

  /**
   * The headers of the conversion custom metrics in the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0ServicesConversionCustomMetricHeader> conversionCustomMetricHeaders;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0ServicesConversionCustomMetricHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0ServicesConversionCustomMetricHeader.class);
  }

  /**
   * The headers of the custom columns in the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0ServicesCustomColumnHeader> customColumnHeaders;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0ServicesCustomColumnHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0ServicesCustomColumnHeader.class);
  }

  /**
   * FieldMask that represents what fields were requested by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fieldMask;

  /**
   * Pagination token used to retrieve the next page of results. Pass the content of this string as
   * the `page_token` attribute of the next request. `next_page_token` is not returned for the last
   * page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The headers of the raw event conversion dimensions in the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0ServicesRawEventConversionDimensionHeader> rawEventConversionDimensionHeaders;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0ServicesRawEventConversionDimensionHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0ServicesRawEventConversionDimensionHeader.class);
  }

  /**
   * The headers of the raw event conversion metrics in the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0ServicesRawEventConversionMetricHeader> rawEventConversionMetricHeaders;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0ServicesRawEventConversionMetricHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0ServicesRawEventConversionMetricHeader.class);
  }

  /**
   * The list of rows that matched the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0ServicesSearchAds360Row> results;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0ServicesSearchAds360Row used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0ServicesSearchAds360Row.class);
  }

  /**
   * Summary row that contains summary of metrics in results. Summary of metrics means aggregation
   * of metrics across all results, here aggregation could be sum, average, rate, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAdsSearchads360V0ServicesSearchAds360Row summaryRow;

  /**
   * Total number of results that match the query ignoring the LIMIT clause.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalResultsCount;

  /**
   * The headers of the conversion custom dimensions in the results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0ServicesConversionCustomDimensionHeader> getConversionCustomDimensionHeaders() {
    return conversionCustomDimensionHeaders;
  }

  /**
   * The headers of the conversion custom dimensions in the results.
   * @param conversionCustomDimensionHeaders conversionCustomDimensionHeaders or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setConversionCustomDimensionHeaders(java.util.List<GoogleAdsSearchads360V0ServicesConversionCustomDimensionHeader> conversionCustomDimensionHeaders) {
    this.conversionCustomDimensionHeaders = conversionCustomDimensionHeaders;
    return this;
  }

  /**
   * The headers of the conversion custom metrics in the results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0ServicesConversionCustomMetricHeader> getConversionCustomMetricHeaders() {
    return conversionCustomMetricHeaders;
  }

  /**
   * The headers of the conversion custom metrics in the results.
   * @param conversionCustomMetricHeaders conversionCustomMetricHeaders or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setConversionCustomMetricHeaders(java.util.List<GoogleAdsSearchads360V0ServicesConversionCustomMetricHeader> conversionCustomMetricHeaders) {
    this.conversionCustomMetricHeaders = conversionCustomMetricHeaders;
    return this;
  }

  /**
   * The headers of the custom columns in the results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0ServicesCustomColumnHeader> getCustomColumnHeaders() {
    return customColumnHeaders;
  }

  /**
   * The headers of the custom columns in the results.
   * @param customColumnHeaders customColumnHeaders or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setCustomColumnHeaders(java.util.List<GoogleAdsSearchads360V0ServicesCustomColumnHeader> customColumnHeaders) {
    this.customColumnHeaders = customColumnHeaders;
    return this;
  }

  /**
   * FieldMask that represents what fields were requested by the user.
   * @return value or {@code null} for none
   */
  public String getFieldMask() {
    return fieldMask;
  }

  /**
   * FieldMask that represents what fields were requested by the user.
   * @param fieldMask fieldMask or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  /**
   * Pagination token used to retrieve the next page of results. Pass the content of this string as
   * the `page_token` attribute of the next request. `next_page_token` is not returned for the last
   * page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token used to retrieve the next page of results. Pass the content of this string as
   * the `page_token` attribute of the next request. `next_page_token` is not returned for the last
   * page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The headers of the raw event conversion dimensions in the results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0ServicesRawEventConversionDimensionHeader> getRawEventConversionDimensionHeaders() {
    return rawEventConversionDimensionHeaders;
  }

  /**
   * The headers of the raw event conversion dimensions in the results.
   * @param rawEventConversionDimensionHeaders rawEventConversionDimensionHeaders or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setRawEventConversionDimensionHeaders(java.util.List<GoogleAdsSearchads360V0ServicesRawEventConversionDimensionHeader> rawEventConversionDimensionHeaders) {
    this.rawEventConversionDimensionHeaders = rawEventConversionDimensionHeaders;
    return this;
  }

  /**
   * The headers of the raw event conversion metrics in the results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0ServicesRawEventConversionMetricHeader> getRawEventConversionMetricHeaders() {
    return rawEventConversionMetricHeaders;
  }

  /**
   * The headers of the raw event conversion metrics in the results.
   * @param rawEventConversionMetricHeaders rawEventConversionMetricHeaders or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setRawEventConversionMetricHeaders(java.util.List<GoogleAdsSearchads360V0ServicesRawEventConversionMetricHeader> rawEventConversionMetricHeaders) {
    this.rawEventConversionMetricHeaders = rawEventConversionMetricHeaders;
    return this;
  }

  /**
   * The list of rows that matched the query.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0ServicesSearchAds360Row> getResults() {
    return results;
  }

  /**
   * The list of rows that matched the query.
   * @param results results or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setResults(java.util.List<GoogleAdsSearchads360V0ServicesSearchAds360Row> results) {
    this.results = results;
    return this;
  }

  /**
   * Summary row that contains summary of metrics in results. Summary of metrics means aggregation
   * of metrics across all results, here aggregation could be sum, average, rate, etc.
   * @return value or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchAds360Row getSummaryRow() {
    return summaryRow;
  }

  /**
   * Summary row that contains summary of metrics in results. Summary of metrics means aggregation
   * of metrics across all results, here aggregation could be sum, average, rate, etc.
   * @param summaryRow summaryRow or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setSummaryRow(GoogleAdsSearchads360V0ServicesSearchAds360Row summaryRow) {
    this.summaryRow = summaryRow;
    return this;
  }

  /**
   * Total number of results that match the query ignoring the LIMIT clause.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalResultsCount() {
    return totalResultsCount;
  }

  /**
   * Total number of results that match the query ignoring the LIMIT clause.
   * @param totalResultsCount totalResultsCount or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response setTotalResultsCount(java.lang.Long totalResultsCount) {
    this.totalResultsCount = totalResultsCount;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ServicesSearchSearchAds360Response) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360Response clone() {
    return (GoogleAdsSearchads360V0ServicesSearchSearchAds360Response) super.clone();
  }

}
