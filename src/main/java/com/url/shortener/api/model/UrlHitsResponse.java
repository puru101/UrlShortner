package com.url.shortener.api.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An array of ballots
 */
@ApiModel(description = "An array of ballots")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-05T11:01:55.190+05:30[Asia/Calcutta]")
public class UrlHitsResponse   {
  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("statusMessage")
  private String statusMessage = null;

  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("errorMessages")
  private String errorMessages = null;

  @JsonProperty("messages")
  private String messages = null;

  @JsonProperty("results")
  @Valid
  private List<UrlHits> results = null;

  public UrlHitsResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(example = "200", value = "")

  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public UrlHitsResponse statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Get statusMessage
   * @return statusMessage
  **/
  @ApiModelProperty(example = "Operation completed successful", value = "")

  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public UrlHitsResponse pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public UrlHitsResponse errorMessages(String errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  /**
   * Get errorMessages
   * @return errorMessages
  **/
  @ApiModelProperty(example = "For Invalid URL,", value = "")

  public String getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(String errorMessages) {
    this.errorMessages = errorMessages;
  }

  public UrlHitsResponse messages(String messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(example = "if the tiny url has already been created for the provided original url,", value = "")

  public String getMessages() {
    return messages;
  }

  public void setMessages(String messages) {
    this.messages = messages;
  }

  public UrlHitsResponse results(List<UrlHits> results) {
    this.results = results;
    return this;
  }

  public UrlHitsResponse addResultsItem(UrlHits resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<UrlHits> getResults() {
    return results;
  }

  public void setResults(List<UrlHits> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlHitsResponse urlHitsResponse = (UrlHitsResponse) o;
    return Objects.equals(this.statusCode, urlHitsResponse.statusCode) &&
        Objects.equals(this.statusMessage, urlHitsResponse.statusMessage) &&
        Objects.equals(this.pagination, urlHitsResponse.pagination) &&
        Objects.equals(this.errorMessages, urlHitsResponse.errorMessages) &&
        Objects.equals(this.messages, urlHitsResponse.messages) &&
        Objects.equals(this.results, urlHitsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statusMessage, pagination, errorMessages, messages, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlHitsResponse {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
