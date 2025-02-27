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

package com.google.api.services.logging.v2.model;

/**
 * Describes a query that has been saved by a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SavedQuery extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the saved query was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A human readable description of the saved query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. The user specified title for the SavedQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Logging query that can be executed in Logs Explorer or via Logging API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LoggingQuery loggingQuery;

  /**
   * Output only. Resource name of the saved query.In the format:
   * "projects/[PROJECT_ID]/locations/[LOCATION_ID]/savedQueries/[QUERY_ID]" For a list of supported
   * locations, see Supported Regions (https://cloud.google.com/logging/docs/region-support#bucket-
   * regions)After the saved query is created, the location cannot be changed.If the user doesn't
   * provide a QUERY_ID, the system will generate an alphanumeric ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Analytics query that can be executed in Log Analytics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OpsAnalyticsQuery opsAnalyticsQuery;

  /**
   * Output only. The timestamp when the saved query was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the saved query was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the saved query was created.
   * @param createTime createTime or {@code null} for none
   */
  public SavedQuery setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A human readable description of the saved query.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A human readable description of the saved query.
   * @param description description or {@code null} for none
   */
  public SavedQuery setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. The user specified title for the SavedQuery.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. The user specified title for the SavedQuery.
   * @param displayName displayName or {@code null} for none
   */
  public SavedQuery setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Logging query that can be executed in Logs Explorer or via Logging API.
   * @return value or {@code null} for none
   */
  public LoggingQuery getLoggingQuery() {
    return loggingQuery;
  }

  /**
   * Logging query that can be executed in Logs Explorer or via Logging API.
   * @param loggingQuery loggingQuery or {@code null} for none
   */
  public SavedQuery setLoggingQuery(LoggingQuery loggingQuery) {
    this.loggingQuery = loggingQuery;
    return this;
  }

  /**
   * Output only. Resource name of the saved query.In the format:
   * "projects/[PROJECT_ID]/locations/[LOCATION_ID]/savedQueries/[QUERY_ID]" For a list of supported
   * locations, see Supported Regions (https://cloud.google.com/logging/docs/region-support#bucket-
   * regions)After the saved query is created, the location cannot be changed.If the user doesn't
   * provide a QUERY_ID, the system will generate an alphanumeric ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the saved query.In the format:
   * "projects/[PROJECT_ID]/locations/[LOCATION_ID]/savedQueries/[QUERY_ID]" For a list of supported
   * locations, see Supported Regions (https://cloud.google.com/logging/docs/region-support#bucket-
   * regions)After the saved query is created, the location cannot be changed.If the user doesn't
   * provide a QUERY_ID, the system will generate an alphanumeric ID.
   * @param name name or {@code null} for none
   */
  public SavedQuery setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Analytics query that can be executed in Log Analytics.
   * @return value or {@code null} for none
   */
  public OpsAnalyticsQuery getOpsAnalyticsQuery() {
    return opsAnalyticsQuery;
  }

  /**
   * Analytics query that can be executed in Log Analytics.
   * @param opsAnalyticsQuery opsAnalyticsQuery or {@code null} for none
   */
  public SavedQuery setOpsAnalyticsQuery(OpsAnalyticsQuery opsAnalyticsQuery) {
    this.opsAnalyticsQuery = opsAnalyticsQuery;
    return this;
  }

  /**
   * Output only. The timestamp when the saved query was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the saved query was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public SavedQuery setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public SavedQuery set(String fieldName, Object value) {
    return (SavedQuery) super.set(fieldName, value);
  }

  @Override
  public SavedQuery clone() {
    return (SavedQuery) super.clone();
  }

}
