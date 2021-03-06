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

package com.google.api.services.androidpublisher.model;

/**
 * Defines an APK available for this application that is hosted externally and not uploaded to
 * Google Play. This function is only available to organizations using Managed Play whose
 * application is configured to restrict distribution to the organizations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternallyHostedApk extends com.google.api.client.json.GenericJson {

  /**
   * The application label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationLabel;

  /**
   * A certificate (or array of certificates if a certificate-chain is used) used to sign this APK,
   * represented as a base64 encoded byte array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> certificateBase64s;

  /**
   * The URL at which the APK is hosted. This must be an https URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externallyHostedUrl;

  /**
   * The sha1 checksum of this APK, represented as a base64 encoded byte array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileSha1Base64;

  /**
   * The sha256 checksum of this APK, represented as a base64 encoded byte array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileSha256Base64;

  /**
   * The file size in bytes of this APK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fileSize;

  /**
   * The icon image from the APK, as a base64 encoded byte array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconBase64;

  /**
   * The maximum SDK supported by this APK (optional).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumSdk;

  /**
   * The minimum SDK targeted by this APK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minimumSdk;

  /**
   * The native code environments supported by this APK (optional).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> nativeCodes;

  /**
   * The package name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * The features required by this APK (optional).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> usesFeatures;

  /**
   * The permissions requested by this APK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UsesPermission> usesPermissions;

  /**
   * The version code of this APK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer versionCode;

  /**
   * The version name of this APK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionName;

  /**
   * The application label.
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationLabel() {
    return applicationLabel;
  }

  /**
   * The application label.
   * @param applicationLabel applicationLabel or {@code null} for none
   */
  public ExternallyHostedApk setApplicationLabel(java.lang.String applicationLabel) {
    this.applicationLabel = applicationLabel;
    return this;
  }

  /**
   * A certificate (or array of certificates if a certificate-chain is used) used to sign this APK,
   * represented as a base64 encoded byte array.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCertificateBase64s() {
    return certificateBase64s;
  }

  /**
   * A certificate (or array of certificates if a certificate-chain is used) used to sign this APK,
   * represented as a base64 encoded byte array.
   * @param certificateBase64s certificateBase64s or {@code null} for none
   */
  public ExternallyHostedApk setCertificateBase64s(java.util.List<java.lang.String> certificateBase64s) {
    this.certificateBase64s = certificateBase64s;
    return this;
  }

  /**
   * The URL at which the APK is hosted. This must be an https URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternallyHostedUrl() {
    return externallyHostedUrl;
  }

  /**
   * The URL at which the APK is hosted. This must be an https URL.
   * @param externallyHostedUrl externallyHostedUrl or {@code null} for none
   */
  public ExternallyHostedApk setExternallyHostedUrl(java.lang.String externallyHostedUrl) {
    this.externallyHostedUrl = externallyHostedUrl;
    return this;
  }

  /**
   * The sha1 checksum of this APK, represented as a base64 encoded byte array.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileSha1Base64() {
    return fileSha1Base64;
  }

  /**
   * The sha1 checksum of this APK, represented as a base64 encoded byte array.
   * @param fileSha1Base64 fileSha1Base64 or {@code null} for none
   */
  public ExternallyHostedApk setFileSha1Base64(java.lang.String fileSha1Base64) {
    this.fileSha1Base64 = fileSha1Base64;
    return this;
  }

  /**
   * The sha256 checksum of this APK, represented as a base64 encoded byte array.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileSha256Base64() {
    return fileSha256Base64;
  }

  /**
   * The sha256 checksum of this APK, represented as a base64 encoded byte array.
   * @param fileSha256Base64 fileSha256Base64 or {@code null} for none
   */
  public ExternallyHostedApk setFileSha256Base64(java.lang.String fileSha256Base64) {
    this.fileSha256Base64 = fileSha256Base64;
    return this;
  }

  /**
   * The file size in bytes of this APK.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFileSize() {
    return fileSize;
  }

  /**
   * The file size in bytes of this APK.
   * @param fileSize fileSize or {@code null} for none
   */
  public ExternallyHostedApk setFileSize(java.lang.Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The icon image from the APK, as a base64 encoded byte array.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconBase64() {
    return iconBase64;
  }

  /**
   * The icon image from the APK, as a base64 encoded byte array.
   * @param iconBase64 iconBase64 or {@code null} for none
   */
  public ExternallyHostedApk setIconBase64(java.lang.String iconBase64) {
    this.iconBase64 = iconBase64;
    return this;
  }

  /**
   * The maximum SDK supported by this APK (optional).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumSdk() {
    return maximumSdk;
  }

  /**
   * The maximum SDK supported by this APK (optional).
   * @param maximumSdk maximumSdk or {@code null} for none
   */
  public ExternallyHostedApk setMaximumSdk(java.lang.Integer maximumSdk) {
    this.maximumSdk = maximumSdk;
    return this;
  }

  /**
   * The minimum SDK targeted by this APK.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinimumSdk() {
    return minimumSdk;
  }

  /**
   * The minimum SDK targeted by this APK.
   * @param minimumSdk minimumSdk or {@code null} for none
   */
  public ExternallyHostedApk setMinimumSdk(java.lang.Integer minimumSdk) {
    this.minimumSdk = minimumSdk;
    return this;
  }

  /**
   * The native code environments supported by this APK (optional).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNativeCodes() {
    return nativeCodes;
  }

  /**
   * The native code environments supported by this APK (optional).
   * @param nativeCodes nativeCodes or {@code null} for none
   */
  public ExternallyHostedApk setNativeCodes(java.util.List<java.lang.String> nativeCodes) {
    this.nativeCodes = nativeCodes;
    return this;
  }

  /**
   * The package name.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * The package name.
   * @param packageName packageName or {@code null} for none
   */
  public ExternallyHostedApk setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * The features required by this APK (optional).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUsesFeatures() {
    return usesFeatures;
  }

  /**
   * The features required by this APK (optional).
   * @param usesFeatures usesFeatures or {@code null} for none
   */
  public ExternallyHostedApk setUsesFeatures(java.util.List<java.lang.String> usesFeatures) {
    this.usesFeatures = usesFeatures;
    return this;
  }

  /**
   * The permissions requested by this APK.
   * @return value or {@code null} for none
   */
  public java.util.List<UsesPermission> getUsesPermissions() {
    return usesPermissions;
  }

  /**
   * The permissions requested by this APK.
   * @param usesPermissions usesPermissions or {@code null} for none
   */
  public ExternallyHostedApk setUsesPermissions(java.util.List<UsesPermission> usesPermissions) {
    this.usesPermissions = usesPermissions;
    return this;
  }

  /**
   * The version code of this APK.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersionCode() {
    return versionCode;
  }

  /**
   * The version code of this APK.
   * @param versionCode versionCode or {@code null} for none
   */
  public ExternallyHostedApk setVersionCode(java.lang.Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * The version name of this APK.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionName() {
    return versionName;
  }

  /**
   * The version name of this APK.
   * @param versionName versionName or {@code null} for none
   */
  public ExternallyHostedApk setVersionName(java.lang.String versionName) {
    this.versionName = versionName;
    return this;
  }

  @Override
  public ExternallyHostedApk set(String fieldName, Object value) {
    return (ExternallyHostedApk) super.set(fieldName, value);
  }

  @Override
  public ExternallyHostedApk clone() {
    return (ExternallyHostedApk) super.clone();
  }

}
