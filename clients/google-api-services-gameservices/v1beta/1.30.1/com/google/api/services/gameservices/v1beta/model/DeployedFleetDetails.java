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

package com.google.api.services.gameservices.v1beta.model;

/**
 * Details of the deployed Agones fleet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeployedFleetDetails extends com.google.api.client.json.GenericJson {

  /**
   * Information about the Agones autoscaler for that fleet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeployedFleetAutoscaler deployedAutoscaler;

  /**
   * Information about the Agones fleet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeployedFleet deployedFleet;

  /**
   * Information about the Agones autoscaler for that fleet.
   * @return value or {@code null} for none
   */
  public DeployedFleetAutoscaler getDeployedAutoscaler() {
    return deployedAutoscaler;
  }

  /**
   * Information about the Agones autoscaler for that fleet.
   * @param deployedAutoscaler deployedAutoscaler or {@code null} for none
   */
  public DeployedFleetDetails setDeployedAutoscaler(DeployedFleetAutoscaler deployedAutoscaler) {
    this.deployedAutoscaler = deployedAutoscaler;
    return this;
  }

  /**
   * Information about the Agones fleet.
   * @return value or {@code null} for none
   */
  public DeployedFleet getDeployedFleet() {
    return deployedFleet;
  }

  /**
   * Information about the Agones fleet.
   * @param deployedFleet deployedFleet or {@code null} for none
   */
  public DeployedFleetDetails setDeployedFleet(DeployedFleet deployedFleet) {
    this.deployedFleet = deployedFleet;
    return this;
  }

  @Override
  public DeployedFleetDetails set(String fieldName, Object value) {
    return (DeployedFleetDetails) super.set(fieldName, value);
  }

  @Override
  public DeployedFleetDetails clone() {
    return (DeployedFleetDetails) super.clone();
  }

}