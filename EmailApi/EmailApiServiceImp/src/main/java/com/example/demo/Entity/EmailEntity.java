package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Email_Queue")
public class EmailEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mailType;
    private String mailFrom;
    private String mailTo;
    private String mailSubject;
    private String mailBody;
    private String mailTemplate;
    private String userName;

    @OneToOne(targetEntity = OrganizationEmailEntity.class, fetch = jakarta.persistence.FetchType.EAGER)
    @JsonIgnoreProperties(value = "organizations", allowSetters = true)
    private OrganizationEmailEntity organization;

   
    public EmailEntity() {
    }

   
    public EmailEntity(Long id, String mailType, String mailFrom, String mailTo, String mailSubject, String mailBody,
                       String mailTemplate, String userName, OrganizationEmailEntity organization) {
        this.id = id;
        this.mailType = mailType;
        this.mailFrom = mailFrom;
        this.mailTo = mailTo;
        this.mailSubject = mailSubject;
        this.mailBody = mailBody;
        this.mailTemplate = mailTemplate;
        this.userName = userName;
        this.organization = organization;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMailType() {
        return mailType;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public String getMailTemplate() {
        return mailTemplate;
    }

    public void setMailTemplate(String mailTemplate) {
        this.mailTemplate = mailTemplate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OrganizationEmailEntity getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationEmailEntity organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "EmailEntity [id=" + id + ", mailType=" + mailType + ", mailFrom=" + mailFrom + ", mailTo=" + mailTo
                + ", mailSubject=" + mailSubject + ", mailBody=" + mailBody + ", mailTemplate=" + mailTemplate
                + ", userName=" + userName + ", organization=" + organization + "]";
    }
}
