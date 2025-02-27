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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at
 * lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting
 * level. For example, the playback_interruption_settings at fulfillment level only overrides the
 * playback_interruption_settings at the agent level, leaving other settings at the agent level
 * unchanged. DTMF settings does not override each other. DTMF settings set at different levels
 * define DTMF detections running in parallel. Hierarchy: Agent->Flow->Page->Fulfillment/Parameter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1AdvancedSettings extends com.google.api.client.json.GenericJson {

  /**
   * If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage
   * destination. Exposed at the following levels: - Agent level - Flow level
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1GcsDestination audioExportGcsDestination;

  /**
   * Settings for DTMF. Exposed at the following levels: - Agent level - Flow level - Page level -
   * Parameter level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1AdvancedSettingsDtmfSettings dtmfSettings;

  /**
   * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver
   * logs, and speech logging. Exposed at the following levels: - Agent level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings loggingSettings;

  /**
   * If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage
   * destination. Exposed at the following levels: - Agent level - Flow level
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1GcsDestination getAudioExportGcsDestination() {
    return audioExportGcsDestination;
  }

  /**
   * If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage
   * destination. Exposed at the following levels: - Agent level - Flow level
   * @param audioExportGcsDestination audioExportGcsDestination or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1AdvancedSettings setAudioExportGcsDestination(GoogleCloudDialogflowCxV3beta1GcsDestination audioExportGcsDestination) {
    this.audioExportGcsDestination = audioExportGcsDestination;
    return this;
  }

  /**
   * Settings for DTMF. Exposed at the following levels: - Agent level - Flow level - Page level -
   * Parameter level.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1AdvancedSettingsDtmfSettings getDtmfSettings() {
    return dtmfSettings;
  }

  /**
   * Settings for DTMF. Exposed at the following levels: - Agent level - Flow level - Page level -
   * Parameter level.
   * @param dtmfSettings dtmfSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1AdvancedSettings setDtmfSettings(GoogleCloudDialogflowCxV3beta1AdvancedSettingsDtmfSettings dtmfSettings) {
    this.dtmfSettings = dtmfSettings;
    return this;
  }

  /**
   * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver
   * logs, and speech logging. Exposed at the following levels: - Agent level.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings getLoggingSettings() {
    return loggingSettings;
  }

  /**
   * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver
   * logs, and speech logging. Exposed at the following levels: - Agent level.
   * @param loggingSettings loggingSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1AdvancedSettings setLoggingSettings(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings loggingSettings) {
    this.loggingSettings = loggingSettings;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1AdvancedSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1AdvancedSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1AdvancedSettings clone() {
    return (GoogleCloudDialogflowCxV3beta1AdvancedSettings) super.clone();
  }

}
