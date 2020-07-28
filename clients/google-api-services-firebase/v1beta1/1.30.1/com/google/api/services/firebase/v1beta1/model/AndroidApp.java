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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Details of a Firebase App for Android.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidApp extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`.
   *
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * The user-assigned display name for the `AndroidApp`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the AndroidApp, in the format:
   * projects/PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)   ***(recommended)***   or
   * its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id).   Learn more about using
   * project identifiers in   Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
   * Note that the value for PROJECT_IDENTIFIER in any   response body will be the `ProjectId`. *
   * APP_ID: the globally unique, Firebase-assigned identifier   for the App   (see
   * [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. The canonical package name of the Android app as would appear in the Google Play
   * Developer Console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the
   * `AndroidApp`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`.
   *
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`.
   *
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @param appId appId or {@code null} for none
   */
  public AndroidApp setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The user-assigned display name for the `AndroidApp`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-assigned display name for the `AndroidApp`.
   * @param displayName displayName or {@code null} for none
   */
  public AndroidApp setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the AndroidApp, in the format:
   * projects/PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)   ***(recommended)***   or
   * its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id).   Learn more about using
   * project identifiers in   Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
   * Note that the value for PROJECT_IDENTIFIER in any   response body will be the `ProjectId`. *
   * APP_ID: the globally unique, Firebase-assigned identifier   for the App   (see
   * [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the AndroidApp, in the format:
   * projects/PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
   * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)   ***(recommended)***   or
   * its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id).   Learn more about using
   * project identifiers in   Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
   * Note that the value for PROJECT_IDENTIFIER in any   response body will be the `ProjectId`. *
   * APP_ID: the globally unique, Firebase-assigned identifier   for the App   (see
   * [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
   * @param name name or {@code null} for none
   */
  public AndroidApp setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The canonical package name of the Android app as would appear in the Google Play
   * Developer Console.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Immutable. The canonical package name of the Android app as would appear in the Google Play
   * Developer Console.
   * @param packageName packageName or {@code null} for none
   */
  public AndroidApp setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the
   * `AndroidApp`.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the
   * `AndroidApp`.
   * @param projectId projectId or {@code null} for none
   */
  public AndroidApp setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public AndroidApp set(String fieldName, Object value) {
    return (AndroidApp) super.set(fieldName, value);
  }

  @Override
  public AndroidApp clone() {
    return (AndroidApp) super.clone();
  }

}
