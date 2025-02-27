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

package com.google.api.services.dlp.v2.model;

/**
 * Configuration for a custom dictionary created from a data source of any size up to the maximum
 * size defined in the [limits](https://cloud.google.com/dlp/limits) page. The artifacts of
 * dictionary creation are stored in the specified Cloud Storage location. Consider using
 * `CustomInfoType.Dictionary` for smaller dictionaries that satisfy the size requirements.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2LargeCustomDictionaryConfig extends com.google.api.client.json.GenericJson {

  /**
   * Field in a BigQuery table where each cell represents a dictionary phrase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryField bigQueryField;

  /**
   * Set of files containing newline-delimited lists of dictionary phrases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CloudStorageFileSet cloudStorageFileSet;

  /**
   * Location to store dictionary artifacts in Cloud Storage. These files will only be accessible by
   * project owners and the DLP API. If any of these artifacts are modified, the dictionary is
   * considered invalid and can no longer be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CloudStoragePath outputPath;

  /**
   * Field in a BigQuery table where each cell represents a dictionary phrase.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryField getBigQueryField() {
    return bigQueryField;
  }

  /**
   * Field in a BigQuery table where each cell represents a dictionary phrase.
   * @param bigQueryField bigQueryField or {@code null} for none
   */
  public GooglePrivacyDlpV2LargeCustomDictionaryConfig setBigQueryField(GooglePrivacyDlpV2BigQueryField bigQueryField) {
    this.bigQueryField = bigQueryField;
    return this;
  }

  /**
   * Set of files containing newline-delimited lists of dictionary phrases.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CloudStorageFileSet getCloudStorageFileSet() {
    return cloudStorageFileSet;
  }

  /**
   * Set of files containing newline-delimited lists of dictionary phrases.
   * @param cloudStorageFileSet cloudStorageFileSet or {@code null} for none
   */
  public GooglePrivacyDlpV2LargeCustomDictionaryConfig setCloudStorageFileSet(GooglePrivacyDlpV2CloudStorageFileSet cloudStorageFileSet) {
    this.cloudStorageFileSet = cloudStorageFileSet;
    return this;
  }

  /**
   * Location to store dictionary artifacts in Cloud Storage. These files will only be accessible by
   * project owners and the DLP API. If any of these artifacts are modified, the dictionary is
   * considered invalid and can no longer be used.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CloudStoragePath getOutputPath() {
    return outputPath;
  }

  /**
   * Location to store dictionary artifacts in Cloud Storage. These files will only be accessible by
   * project owners and the DLP API. If any of these artifacts are modified, the dictionary is
   * considered invalid and can no longer be used.
   * @param outputPath outputPath or {@code null} for none
   */
  public GooglePrivacyDlpV2LargeCustomDictionaryConfig setOutputPath(GooglePrivacyDlpV2CloudStoragePath outputPath) {
    this.outputPath = outputPath;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2LargeCustomDictionaryConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2LargeCustomDictionaryConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2LargeCustomDictionaryConfig clone() {
    return (GooglePrivacyDlpV2LargeCustomDictionaryConfig) super.clone();
  }

}
