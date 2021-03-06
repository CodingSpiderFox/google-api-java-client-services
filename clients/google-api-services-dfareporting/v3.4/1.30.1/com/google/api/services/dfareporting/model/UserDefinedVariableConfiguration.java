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

package com.google.api.services.dfareporting.model;

/**
 * User Defined Variable configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserDefinedVariableConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * Data type for the variable. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataType;

  /**
   * User-friendly name for the variable which will appear in reports. This is a required field,
   * must be less than 64 characters long, and cannot contain the following characters: ""<>".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reportName;

  /**
   * Variable name in the tag. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String variableType;

  /**
   * Data type for the variable. This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataType() {
    return dataType;
  }

  /**
   * Data type for the variable. This is a required field.
   * @param dataType dataType or {@code null} for none
   */
  public UserDefinedVariableConfiguration setDataType(java.lang.String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * User-friendly name for the variable which will appear in reports. This is a required field,
   * must be less than 64 characters long, and cannot contain the following characters: ""<>".
   * @return value or {@code null} for none
   */
  public java.lang.String getReportName() {
    return reportName;
  }

  /**
   * User-friendly name for the variable which will appear in reports. This is a required field,
   * must be less than 64 characters long, and cannot contain the following characters: ""<>".
   * @param reportName reportName or {@code null} for none
   */
  public UserDefinedVariableConfiguration setReportName(java.lang.String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * Variable name in the tag. This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.String getVariableType() {
    return variableType;
  }

  /**
   * Variable name in the tag. This is a required field.
   * @param variableType variableType or {@code null} for none
   */
  public UserDefinedVariableConfiguration setVariableType(java.lang.String variableType) {
    this.variableType = variableType;
    return this;
  }

  @Override
  public UserDefinedVariableConfiguration set(String fieldName, Object value) {
    return (UserDefinedVariableConfiguration) super.set(fieldName, value);
  }

  @Override
  public UserDefinedVariableConfiguration clone() {
    return (UserDefinedVariableConfiguration) super.clone();
  }

}
