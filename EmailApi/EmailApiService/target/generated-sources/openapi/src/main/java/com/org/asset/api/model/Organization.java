package com.org.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Organization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T14:42:54.862704300+05:30[Asia/Calcutta]")
public class Organization  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("address")
  private String address;

  @JsonProperty("fax")
  private String fax;

  @JsonProperty("dateOfEstablishment")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateOfEstablishment;

  @JsonProperty("status")
  private String status;

  @JsonProperty("cmdbOrgId")
  private Long cmdbOrgId;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("fileStorageLocationType")
  private String fileStorageLocationType;

  @JsonProperty("profileImage")
  private String profileImage;

  public Organization id(Long id) {
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

  public Organization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Organization phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Organization email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Organization address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Organization fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
  */
  @ApiModelProperty(value = "")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Organization dateOfEstablishment(OffsetDateTime dateOfEstablishment) {
    this.dateOfEstablishment = dateOfEstablishment;
    return this;
  }

  /**
   * Get dateOfEstablishment
   * @return dateOfEstablishment
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateOfEstablishment() {
    return dateOfEstablishment;
  }

  public void setDateOfEstablishment(OffsetDateTime dateOfEstablishment) {
    this.dateOfEstablishment = dateOfEstablishment;
  }

  public Organization status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Organization cmdbOrgId(Long cmdbOrgId) {
    this.cmdbOrgId = cmdbOrgId;
    return this;
  }

  /**
   * Get cmdbOrgId
   * @return cmdbOrgId
  */
  @ApiModelProperty(value = "")


  public Long getCmdbOrgId() {
    return cmdbOrgId;
  }

  public void setCmdbOrgId(Long cmdbOrgId) {
    this.cmdbOrgId = cmdbOrgId;
  }

  public Organization fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  */
  @ApiModelProperty(value = "")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Organization fileStorageLocationType(String fileStorageLocationType) {
    this.fileStorageLocationType = fileStorageLocationType;
    return this;
  }

  /**
   * Get fileStorageLocationType
   * @return fileStorageLocationType
  */
  @ApiModelProperty(value = "")


  public String getFileStorageLocationType() {
    return fileStorageLocationType;
  }

  public void setFileStorageLocationType(String fileStorageLocationType) {
    this.fileStorageLocationType = fileStorageLocationType;
  }

  public Organization profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
  */
  @ApiModelProperty(value = "")


  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.description, organization.description) &&
        Objects.equals(this.phone, organization.phone) &&
        Objects.equals(this.email, organization.email) &&
        Objects.equals(this.address, organization.address) &&
        Objects.equals(this.fax, organization.fax) &&
        Objects.equals(this.dateOfEstablishment, organization.dateOfEstablishment) &&
        Objects.equals(this.status, organization.status) &&
        Objects.equals(this.cmdbOrgId, organization.cmdbOrgId) &&
        Objects.equals(this.fileName, organization.fileName) &&
        Objects.equals(this.fileStorageLocationType, organization.fileStorageLocationType) &&
        Objects.equals(this.profileImage, organization.profileImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, phone, email, address, fax, dateOfEstablishment, status, cmdbOrgId, fileName, fileStorageLocationType, profileImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    dateOfEstablishment: ").append(toIndentedString(dateOfEstablishment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cmdbOrgId: ").append(toIndentedString(cmdbOrgId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileStorageLocationType: ").append(toIndentedString(fileStorageLocationType)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
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

