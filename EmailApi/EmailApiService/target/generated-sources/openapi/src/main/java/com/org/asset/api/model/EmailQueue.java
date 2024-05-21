package com.org.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.asset.api.model.Organization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * EmailQueue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T14:42:54.862704300+05:30[Asia/Calcutta]")
public class EmailQueue  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("status")
  private JsonNullable<String> status = JsonNullable.undefined();

  @JsonProperty("mailType")
  private JsonNullable<String> mailType = JsonNullable.undefined();

  @JsonProperty("mailFrom")
  private JsonNullable<String> mailFrom = JsonNullable.undefined();

  @JsonProperty("mailTo")
  private JsonNullable<String> mailTo = JsonNullable.undefined();

  @JsonProperty("mailSubject")
  private JsonNullable<String> mailSubject = JsonNullable.undefined();

  @JsonProperty("mailBody")
  private JsonNullable<String> mailBody = JsonNullable.undefined();

  @JsonProperty("mailTemplate")
  private JsonNullable<String> mailTemplate = JsonNullable.undefined();

  @JsonProperty("userName")
  private JsonNullable<String> userName = JsonNullable.undefined();

  @JsonProperty("organization")
  private Organization organization;

  public EmailQueue id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EmailQueue status(String status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Current status of the email processing queue.
   * @return status
  */
  @ApiModelProperty(value = "Current status of the email processing queue.")


  public JsonNullable<String> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<String> status) {
    this.status = status;
  }

  public EmailQueue mailType(String mailType) {
    this.mailType = JsonNullable.of(mailType);
    return this;
  }

  /**
   * Type of email being processed (e.g., user registration, password reset).
   * @return mailType
  */
  @ApiModelProperty(value = "Type of email being processed (e.g., user registration, password reset).")


  public JsonNullable<String> getMailType() {
    return mailType;
  }

  public void setMailType(JsonNullable<String> mailType) {
    this.mailType = mailType;
  }

  public EmailQueue mailFrom(String mailFrom) {
    this.mailFrom = JsonNullable.of(mailFrom);
    return this;
  }

  /**
   * The sender's email address.
   * @return mailFrom
  */
  @ApiModelProperty(value = "The sender's email address.")


  public JsonNullable<String> getMailFrom() {
    return mailFrom;
  }

  public void setMailFrom(JsonNullable<String> mailFrom) {
    this.mailFrom = mailFrom;
  }

  public EmailQueue mailTo(String mailTo) {
    this.mailTo = JsonNullable.of(mailTo);
    return this;
  }

  /**
   * The recipient's email address.
   * @return mailTo
  */
  @ApiModelProperty(value = "The recipient's email address.")


  public JsonNullable<String> getMailTo() {
    return mailTo;
  }

  public void setMailTo(JsonNullable<String> mailTo) {
    this.mailTo = mailTo;
  }

  public EmailQueue mailSubject(String mailSubject) {
    this.mailSubject = JsonNullable.of(mailSubject);
    return this;
  }

  /**
   * Subject line of the email.
   * @return mailSubject
  */
  @ApiModelProperty(value = "Subject line of the email.")


  public JsonNullable<String> getMailSubject() {
    return mailSubject;
  }

  public void setMailSubject(JsonNullable<String> mailSubject) {
    this.mailSubject = mailSubject;
  }

  public EmailQueue mailBody(String mailBody) {
    this.mailBody = JsonNullable.of(mailBody);
    return this;
  }

  /**
   * Body content of the email.
   * @return mailBody
  */
  @ApiModelProperty(value = "Body content of the email.")


  public JsonNullable<String> getMailBody() {
    return mailBody;
  }

  public void setMailBody(JsonNullable<String> mailBody) {
    this.mailBody = mailBody;
  }

  public EmailQueue mailTemplate(String mailTemplate) {
    this.mailTemplate = JsonNullable.of(mailTemplate);
    return this;
  }

  /**
   * Template used for generating the email body.
   * @return mailTemplate
  */
  @ApiModelProperty(value = "Template used for generating the email body.")


  public JsonNullable<String> getMailTemplate() {
    return mailTemplate;
  }

  public void setMailTemplate(JsonNullable<String> mailTemplate) {
    this.mailTemplate = mailTemplate;
  }

  public EmailQueue userName(String userName) {
    this.userName = JsonNullable.of(userName);
    return this;
  }

  /**
   * Name of the user associated with the email.
   * @return userName
  */
  @ApiModelProperty(value = "Name of the user associated with the email.")


  public JsonNullable<String> getUserName() {
    return userName;
  }

  public void setUserName(JsonNullable<String> userName) {
    this.userName = userName;
  }

  public EmailQueue organization(Organization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  */
  @ApiModelProperty(value = "")

  @Valid

  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailQueue emailQueue = (EmailQueue) o;
    return Objects.equals(this.id, emailQueue.id) &&
        Objects.equals(this.status, emailQueue.status) &&
        Objects.equals(this.mailType, emailQueue.mailType) &&
        Objects.equals(this.mailFrom, emailQueue.mailFrom) &&
        Objects.equals(this.mailTo, emailQueue.mailTo) &&
        Objects.equals(this.mailSubject, emailQueue.mailSubject) &&
        Objects.equals(this.mailBody, emailQueue.mailBody) &&
        Objects.equals(this.mailTemplate, emailQueue.mailTemplate) &&
        Objects.equals(this.userName, emailQueue.userName) &&
        Objects.equals(this.organization, emailQueue.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, mailType, mailFrom, mailTo, mailSubject, mailBody, mailTemplate, userName, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailQueue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    mailFrom: ").append(toIndentedString(mailFrom)).append("\n");
    sb.append("    mailTo: ").append(toIndentedString(mailTo)).append("\n");
    sb.append("    mailSubject: ").append(toIndentedString(mailSubject)).append("\n");
    sb.append("    mailBody: ").append(toIndentedString(mailBody)).append("\n");
    sb.append("    mailTemplate: ").append(toIndentedString(mailTemplate)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

