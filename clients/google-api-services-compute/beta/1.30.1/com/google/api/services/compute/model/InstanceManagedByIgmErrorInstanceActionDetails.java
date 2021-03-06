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

package com.google.api.services.compute.model;

/**
 * Model definition for InstanceManagedByIgmErrorInstanceActionDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceManagedByIgmErrorInstanceActionDetails extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Action that managed instance group was executing on the instance when the error
   * occurred. Possible values:
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * [Output Only] The URL of the instance. The URL can be set even if the instance has not yet been
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * [Output Only] Version this instance was created from, or was being created from, but the
   * creation failed. Corresponds to one of the versions that were set on the Instance Group Manager
   * resource at the time this instance was being created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedInstanceVersion version;

  /**
   * [Output Only] Action that managed instance group was executing on the instance when the error
   * occurred. Possible values:
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * [Output Only] Action that managed instance group was executing on the instance when the error
   * occurred. Possible values:
   * @param action action or {@code null} for none
   */
  public InstanceManagedByIgmErrorInstanceActionDetails setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * [Output Only] The URL of the instance. The URL can be set even if the instance has not yet been
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * [Output Only] The URL of the instance. The URL can be set even if the instance has not yet been
   * created.
   * @param instance instance or {@code null} for none
   */
  public InstanceManagedByIgmErrorInstanceActionDetails setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * [Output Only] Version this instance was created from, or was being created from, but the
   * creation failed. Corresponds to one of the versions that were set on the Instance Group Manager
   * resource at the time this instance was being created.
   * @return value or {@code null} for none
   */
  public ManagedInstanceVersion getVersion() {
    return version;
  }

  /**
   * [Output Only] Version this instance was created from, or was being created from, but the
   * creation failed. Corresponds to one of the versions that were set on the Instance Group Manager
   * resource at the time this instance was being created.
   * @param version version or {@code null} for none
   */
  public InstanceManagedByIgmErrorInstanceActionDetails setVersion(ManagedInstanceVersion version) {
    this.version = version;
    return this;
  }

  @Override
  public InstanceManagedByIgmErrorInstanceActionDetails set(String fieldName, Object value) {
    return (InstanceManagedByIgmErrorInstanceActionDetails) super.set(fieldName, value);
  }

  @Override
  public InstanceManagedByIgmErrorInstanceActionDetails clone() {
    return (InstanceManagedByIgmErrorInstanceActionDetails) super.clone();
  }

}
