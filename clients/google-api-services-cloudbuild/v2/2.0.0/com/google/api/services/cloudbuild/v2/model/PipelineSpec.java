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

package com.google.api.services.cloudbuild.v2.model;

/**
 * PipelineSpec defines the desired state of Pipeline.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PipelineSpec extends com.google.api.client.json.GenericJson {

  /**
   * List of Tasks that execute just before leaving the Pipeline i.e. either after all Tasks are
   * finished executing successfully or after a failure which would result in ending the Pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PipelineTask> finallyTasks;

  /**
   * Output only. auto-generated yaml that is output only for display purpose for workflows using
   * pipeline_spec, used by UI/gcloud cli for Workflows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String generatedYaml;

  /**
   * List of parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ParamSpec> params;

  static {
    // hack to force ProGuard to consider ParamSpec used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ParamSpec.class);
  }

  /**
   * List of Tasks that execute when this Pipeline is run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PipelineTask> tasks;

  /**
   * Workspaces declares a set of named workspaces that are expected to be provided by a
   * PipelineRun.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PipelineWorkspaceDeclaration> workspaces;

  /**
   * List of Tasks that execute just before leaving the Pipeline i.e. either after all Tasks are
   * finished executing successfully or after a failure which would result in ending the Pipeline.
   * @return value or {@code null} for none
   */
  public java.util.List<PipelineTask> getFinallyTasks() {
    return finallyTasks;
  }

  /**
   * List of Tasks that execute just before leaving the Pipeline i.e. either after all Tasks are
   * finished executing successfully or after a failure which would result in ending the Pipeline.
   * @param finallyTasks finallyTasks or {@code null} for none
   */
  public PipelineSpec setFinallyTasks(java.util.List<PipelineTask> finallyTasks) {
    this.finallyTasks = finallyTasks;
    return this;
  }

  /**
   * Output only. auto-generated yaml that is output only for display purpose for workflows using
   * pipeline_spec, used by UI/gcloud cli for Workflows.
   * @return value or {@code null} for none
   */
  public java.lang.String getGeneratedYaml() {
    return generatedYaml;
  }

  /**
   * Output only. auto-generated yaml that is output only for display purpose for workflows using
   * pipeline_spec, used by UI/gcloud cli for Workflows.
   * @param generatedYaml generatedYaml or {@code null} for none
   */
  public PipelineSpec setGeneratedYaml(java.lang.String generatedYaml) {
    this.generatedYaml = generatedYaml;
    return this;
  }

  /**
   * List of parameters.
   * @return value or {@code null} for none
   */
  public java.util.List<ParamSpec> getParams() {
    return params;
  }

  /**
   * List of parameters.
   * @param params params or {@code null} for none
   */
  public PipelineSpec setParams(java.util.List<ParamSpec> params) {
    this.params = params;
    return this;
  }

  /**
   * List of Tasks that execute when this Pipeline is run.
   * @return value or {@code null} for none
   */
  public java.util.List<PipelineTask> getTasks() {
    return tasks;
  }

  /**
   * List of Tasks that execute when this Pipeline is run.
   * @param tasks tasks or {@code null} for none
   */
  public PipelineSpec setTasks(java.util.List<PipelineTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  /**
   * Workspaces declares a set of named workspaces that are expected to be provided by a
   * PipelineRun.
   * @return value or {@code null} for none
   */
  public java.util.List<PipelineWorkspaceDeclaration> getWorkspaces() {
    return workspaces;
  }

  /**
   * Workspaces declares a set of named workspaces that are expected to be provided by a
   * PipelineRun.
   * @param workspaces workspaces or {@code null} for none
   */
  public PipelineSpec setWorkspaces(java.util.List<PipelineWorkspaceDeclaration> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  @Override
  public PipelineSpec set(String fieldName, Object value) {
    return (PipelineSpec) super.set(fieldName, value);
  }

  @Override
  public PipelineSpec clone() {
    return (PipelineSpec) super.clone();
  }

}
