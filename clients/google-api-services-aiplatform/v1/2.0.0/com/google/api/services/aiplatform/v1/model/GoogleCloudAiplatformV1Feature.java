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

package com.google.api.services.aiplatform.v1.model;

/**
 * Feature Metadata information. For example, color is a feature that describes an apple.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1Feature extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). Timestamp when this
   * EntityType was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of the Feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Only applicable for Vertex AI Feature Store (Legacy). If not set, use the
   * monitoring_config defined for the EntityType this Feature belongs to. Only Features with type
   * (Feature.ValueType) BOOL, STRING, DOUBLE or INT64 can enable monitoring. If set to true, all
   * types of data monitoring are disabled despite the config on EntityType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableMonitoring;

  /**
   * Used to perform a consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. The labels with user-defined metadata to organize your Features. Label keys and
   * values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase
   * letters, numeric characters, underscores and dashes. International characters are allowed. See
   * https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user
   * labels can be associated with one Feature (System labels are excluded)." System reserved label
   * keys are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). The list of historical stats
   * and anomalies with specified objectives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1FeatureMonitoringStatsAnomaly> monitoringStatsAnomalies;

  /**
   * Immutable. Name of the Feature. Format: `projects/{project}/locations/{location}/featurestores/
   * {featurestore}/entityTypes/{entity_type}/features/{feature}`
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}/features/{feature}` The
   * last part feature is assigned by the client. The feature can be up to 64 characters long and
   * can consist only of ASCII Latin letters A-Z and a-z, underscore(_), and ASCII digits 0-9
   * starting with a letter. The value will be unique given an entity type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). Timestamp when this
   * EntityType was most recently updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Immutable. Only applicable for Vertex AI Feature Store (Legacy). Type of Feature value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * Only applicable for Vertex AI Feature Store. The name of the BigQuery Table/View column hosting
   * data for this version. If no value is provided, will use feature_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionColumnName;

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). Timestamp when this
   * EntityType was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). Timestamp when this
   * EntityType was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of the Feature.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the Feature.
   * @param description description or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Only applicable for Vertex AI Feature Store (Legacy). If not set, use the
   * monitoring_config defined for the EntityType this Feature belongs to. Only Features with type
   * (Feature.ValueType) BOOL, STRING, DOUBLE or INT64 can enable monitoring. If set to true, all
   * types of data monitoring are disabled despite the config on EntityType.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableMonitoring() {
    return disableMonitoring;
  }

  /**
   * Optional. Only applicable for Vertex AI Feature Store (Legacy). If not set, use the
   * monitoring_config defined for the EntityType this Feature belongs to. Only Features with type
   * (Feature.ValueType) BOOL, STRING, DOUBLE or INT64 can enable monitoring. If set to true, all
   * types of data monitoring are disabled despite the config on EntityType.
   * @param disableMonitoring disableMonitoring or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setDisableMonitoring(java.lang.Boolean disableMonitoring) {
    this.disableMonitoring = disableMonitoring;
    return this;
  }

  /**
   * Used to perform a consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Used to perform a consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. The labels with user-defined metadata to organize your Features. Label keys and
   * values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase
   * letters, numeric characters, underscores and dashes. International characters are allowed. See
   * https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user
   * labels can be associated with one Feature (System labels are excluded)." System reserved label
   * keys are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels with user-defined metadata to organize your Features. Label keys and
   * values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase
   * letters, numeric characters, underscores and dashes. International characters are allowed. See
   * https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user
   * labels can be associated with one Feature (System labels are excluded)." System reserved label
   * keys are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). The list of historical stats
   * and anomalies with specified objectives.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1FeatureMonitoringStatsAnomaly> getMonitoringStatsAnomalies() {
    return monitoringStatsAnomalies;
  }

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). The list of historical stats
   * and anomalies with specified objectives.
   * @param monitoringStatsAnomalies monitoringStatsAnomalies or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setMonitoringStatsAnomalies(java.util.List<GoogleCloudAiplatformV1FeatureMonitoringStatsAnomaly> monitoringStatsAnomalies) {
    this.monitoringStatsAnomalies = monitoringStatsAnomalies;
    return this;
  }

  /**
   * Immutable. Name of the Feature. Format: `projects/{project}/locations/{location}/featurestores/
   * {featurestore}/entityTypes/{entity_type}/features/{feature}`
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}/features/{feature}` The
   * last part feature is assigned by the client. The feature can be up to 64 characters long and
   * can consist only of ASCII Latin letters A-Z and a-z, underscore(_), and ASCII digits 0-9
   * starting with a letter. The value will be unique given an entity type.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. Name of the Feature. Format: `projects/{project}/locations/{location}/featurestores/
   * {featurestore}/entityTypes/{entity_type}/features/{feature}`
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}/features/{feature}` The
   * last part feature is assigned by the client. The feature can be up to 64 characters long and
   * can consist only of ASCII Latin letters A-Z and a-z, underscore(_), and ASCII digits 0-9
   * starting with a letter. The value will be unique given an entity type.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). Timestamp when this
   * EntityType was most recently updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Only applicable for Vertex AI Feature Store (Legacy). Timestamp when this
   * EntityType was most recently updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Immutable. Only applicable for Vertex AI Feature Store (Legacy). Type of Feature value.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * Immutable. Only applicable for Vertex AI Feature Store (Legacy). Type of Feature value.
   * @param valueType valueType or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Only applicable for Vertex AI Feature Store. The name of the BigQuery Table/View column hosting
   * data for this version. If no value is provided, will use feature_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionColumnName() {
    return versionColumnName;
  }

  /**
   * Only applicable for Vertex AI Feature Store. The name of the BigQuery Table/View column hosting
   * data for this version. If no value is provided, will use feature_id.
   * @param versionColumnName versionColumnName or {@code null} for none
   */
  public GoogleCloudAiplatformV1Feature setVersionColumnName(java.lang.String versionColumnName) {
    this.versionColumnName = versionColumnName;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1Feature set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1Feature) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1Feature clone() {
    return (GoogleCloudAiplatformV1Feature) super.clone();
  }

}
