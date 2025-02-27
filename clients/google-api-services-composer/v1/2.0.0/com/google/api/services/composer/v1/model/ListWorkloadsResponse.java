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

package com.google.api.services.composer.v1.model;

/**
 * Response to ListWorkloadsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListWorkloadsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The page token used to query for the next page if one exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of environment workloads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ComposerWorkload> workloads;

  static {
    // hack to force ProGuard to consider ComposerWorkload used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ComposerWorkload.class);
  }

  /**
   * The page token used to query for the next page if one exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token used to query for the next page if one exists.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListWorkloadsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of environment workloads.
   * @return value or {@code null} for none
   */
  public java.util.List<ComposerWorkload> getWorkloads() {
    return workloads;
  }

  /**
   * The list of environment workloads.
   * @param workloads workloads or {@code null} for none
   */
  public ListWorkloadsResponse setWorkloads(java.util.List<ComposerWorkload> workloads) {
    this.workloads = workloads;
    return this;
  }

  @Override
  public ListWorkloadsResponse set(String fieldName, Object value) {
    return (ListWorkloadsResponse) super.set(fieldName, value);
  }

  @Override
  public ListWorkloadsResponse clone() {
    return (ListWorkloadsResponse) super.clone();
  }

}
