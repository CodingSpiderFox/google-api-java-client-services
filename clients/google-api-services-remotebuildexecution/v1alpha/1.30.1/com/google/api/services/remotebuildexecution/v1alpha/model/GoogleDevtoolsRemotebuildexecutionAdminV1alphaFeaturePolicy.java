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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * FeaturePolicy defines features allowed to be used on RBE instances, as well as instance-wide
 * behavior changes that take effect without opt-in or opt-out at usage time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is
   * allowed. One can allow all repositories under a project or one specific repository only. E.g.
   * container_image_sources { policy: RESTRICTED allowed_values: [ "gcr.io/project-foo", "gcr.io
   * /project-bar/repo-baz", ] } will allow any repositories under "gcr.io/project-foo" plus the
   * repository "gcr.io/project-bar/repo-baz". Default (UNSPECIFIED) is equivalent to any source is
   * allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature containerImageSources;

  /**
   * Whether dockerAddCapabilities can be used or what capabilities are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerAddCapabilities;

  /**
   * Whether dockerChrootPath can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerChrootPath;

  /**
   * Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off`
   * value only via `allowed_values`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerNetwork;

  /**
   * Whether dockerPrivileged can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerPrivileged;

  /**
   * Whether dockerRunAsRoot can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerRunAsRoot;

  /**
   * Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation
   * takes precedence, and if set, docker_runtime values may be rejected if they are incompatible
   * with the selected isolation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerRuntime;

  /**
   * Whether dockerSiblingContainers can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerSiblingContainers;

  /**
   * linux_isolation allows overriding the docker runtime used for containers started on Linux.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linuxIsolation;

  /**
   * Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is
   * allowed. One can allow all repositories under a project or one specific repository only. E.g.
   * container_image_sources { policy: RESTRICTED allowed_values: [ "gcr.io/project-foo", "gcr.io
   * /project-bar/repo-baz", ] } will allow any repositories under "gcr.io/project-foo" plus the
   * repository "gcr.io/project-bar/repo-baz". Default (UNSPECIFIED) is equivalent to any source is
   * allowed.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getContainerImageSources() {
    return containerImageSources;
  }

  /**
   * Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is
   * allowed. One can allow all repositories under a project or one specific repository only. E.g.
   * container_image_sources { policy: RESTRICTED allowed_values: [ "gcr.io/project-foo", "gcr.io
   * /project-bar/repo-baz", ] } will allow any repositories under "gcr.io/project-foo" plus the
   * repository "gcr.io/project-bar/repo-baz". Default (UNSPECIFIED) is equivalent to any source is
   * allowed.
   * @param containerImageSources containerImageSources or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setContainerImageSources(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature containerImageSources) {
    this.containerImageSources = containerImageSources;
    return this;
  }

  /**
   * Whether dockerAddCapabilities can be used or what capabilities are allowed.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getDockerAddCapabilities() {
    return dockerAddCapabilities;
  }

  /**
   * Whether dockerAddCapabilities can be used or what capabilities are allowed.
   * @param dockerAddCapabilities dockerAddCapabilities or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setDockerAddCapabilities(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerAddCapabilities) {
    this.dockerAddCapabilities = dockerAddCapabilities;
    return this;
  }

  /**
   * Whether dockerChrootPath can be used.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getDockerChrootPath() {
    return dockerChrootPath;
  }

  /**
   * Whether dockerChrootPath can be used.
   * @param dockerChrootPath dockerChrootPath or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setDockerChrootPath(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerChrootPath) {
    this.dockerChrootPath = dockerChrootPath;
    return this;
  }

  /**
   * Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off`
   * value only via `allowed_values`.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getDockerNetwork() {
    return dockerNetwork;
  }

  /**
   * Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off`
   * value only via `allowed_values`.
   * @param dockerNetwork dockerNetwork or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setDockerNetwork(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerNetwork) {
    this.dockerNetwork = dockerNetwork;
    return this;
  }

  /**
   * Whether dockerPrivileged can be used.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getDockerPrivileged() {
    return dockerPrivileged;
  }

  /**
   * Whether dockerPrivileged can be used.
   * @param dockerPrivileged dockerPrivileged or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setDockerPrivileged(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerPrivileged) {
    this.dockerPrivileged = dockerPrivileged;
    return this;
  }

  /**
   * Whether dockerRunAsRoot can be used.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getDockerRunAsRoot() {
    return dockerRunAsRoot;
  }

  /**
   * Whether dockerRunAsRoot can be used.
   * @param dockerRunAsRoot dockerRunAsRoot or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setDockerRunAsRoot(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerRunAsRoot) {
    this.dockerRunAsRoot = dockerRunAsRoot;
    return this;
  }

  /**
   * Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation
   * takes precedence, and if set, docker_runtime values may be rejected if they are incompatible
   * with the selected isolation.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getDockerRuntime() {
    return dockerRuntime;
  }

  /**
   * Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation
   * takes precedence, and if set, docker_runtime values may be rejected if they are incompatible
   * with the selected isolation.
   * @param dockerRuntime dockerRuntime or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setDockerRuntime(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerRuntime) {
    this.dockerRuntime = dockerRuntime;
    return this;
  }

  /**
   * Whether dockerSiblingContainers can be used.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature getDockerSiblingContainers() {
    return dockerSiblingContainers;
  }

  /**
   * Whether dockerSiblingContainers can be used.
   * @param dockerSiblingContainers dockerSiblingContainers or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setDockerSiblingContainers(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature dockerSiblingContainers) {
    this.dockerSiblingContainers = dockerSiblingContainers;
    return this;
  }

  /**
   * linux_isolation allows overriding the docker runtime used for containers started on Linux.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinuxIsolation() {
    return linuxIsolation;
  }

  /**
   * linux_isolation allows overriding the docker runtime used for containers started on Linux.
   * @param linuxIsolation linuxIsolation or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy setLinuxIsolation(java.lang.String linuxIsolation) {
    this.linuxIsolation = linuxIsolation;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy) super.clone();
  }

}
