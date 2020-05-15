/*
 * Pravega Schema Registry APIs
 * REST APIs for Pravega Schema Registry.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.pravega.schemaregistry.contract.generated.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.pravega.schemaregistry.contract.generated.rest.model.GroupProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;

/**
 * Map of Group names to group properties. For partially created groups, the group properties may be null.
 */
@ApiModel(description = "Map of Group names to group properties. For partially created groups, the group properties may be null.")

public class ListGroupsResponse   {
  @JsonProperty("groups")
  private Map<String, GroupProperties> groups = null;

  @JsonProperty("continuationToken")
  private String continuationToken = null;

  public ListGroupsResponse groups(Map<String, GroupProperties> groups) {
    this.groups = groups;
    return this;
  }

  public ListGroupsResponse putGroupsItem(String key, GroupProperties groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<String, GroupProperties>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @JsonProperty("groups")
  @ApiModelProperty(value = "")
  public Map<String, GroupProperties> getGroups() {
    return groups;
  }

  public void setGroups(Map<String, GroupProperties> groups) {
    this.groups = groups;
  }

  public ListGroupsResponse continuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
    return this;
  }

  /**
   * Continuation token to identify the position of last group in the response.
   * @return continuationToken
   **/
  @JsonProperty("continuationToken")
  @ApiModelProperty(required = true, value = "Continuation token to identify the position of last group in the response.")
  @NotNull
  public String getContinuationToken() {
    return continuationToken;
  }

  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGroupsResponse listGroupsResponse = (ListGroupsResponse) o;
    return Objects.equals(this.groups, listGroupsResponse.groups) &&
        Objects.equals(this.continuationToken, listGroupsResponse.continuationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, continuationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGroupsResponse {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    continuationToken: ").append(toIndentedString(continuationToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
