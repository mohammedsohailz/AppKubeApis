package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrganizationEmailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String phone;
    private String email;
    private String address;
    private String fax;
    private String dateOfEstablishment;
    private String status;
    private Long cmdbOrgId;
    private String fileName;
    private String fileStorageLocationType;
    private String profileImage;

 
    public OrganizationEmailEntity() {
    }

   
    public OrganizationEmailEntity(Long id, String name, String description, String phone, String email, String address,
                              String fax, String dateOfEstablishment, String status, Long cmdbOrgId, String fileName,
                              String fileStorageLocationType, String profileImage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.fax = fax;
        this.dateOfEstablishment = dateOfEstablishment;
        this.status = status;
        this.cmdbOrgId = cmdbOrgId;
        this.fileName = fileName;
        this.fileStorageLocationType = fileStorageLocationType;
        this.profileImage = profileImage;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(String dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCmdbOrgId() {
        return cmdbOrgId;
    }

    public void setCmdbOrgId(Long cmdbOrgId) {
        this.cmdbOrgId = cmdbOrgId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileStorageLocationType() {
        return fileStorageLocationType;
    }

    public void setFileStorageLocationType(String fileStorageLocationType) {
        this.fileStorageLocationType = fileStorageLocationType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @Override
    public String toString() {
        return "OrganizationEntity [id=" + id + ", name=" + name + ", description=" + description + ", phone=" + phone
                + ", email=" + email + ", address=" + address + ", fax=" + fax + ", dateOfEstablishment="
                + dateOfEstablishment + ", status=" + status + ", cmdbOrgId=" + cmdbOrgId + ", fileName=" + fileName
            + ", fileStorageLocationType=" + fileStorageLocationType + ", profileImage=" + profileImage + "]";
}
}
