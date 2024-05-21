package com.example.demo.Service;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EmailEntity;
import com.example.demo.Entity.OrganizationEmailEntity;
import com.example.demo.Repository.EmailRepository;
import com.example.demo.Repository.OrganizationRepository;
import com.org.asset.api.model.EmailQueue;
import com.org.asset.api.model.Organization;

@Service
public class EmailServiceImpl implements EmailService {
    
    private static final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
    
    private final EmailRepository emailRepository;
    private final OrganizationRepository organizationRepository;

    @Autowired
    public EmailServiceImpl(EmailRepository emailRepository, OrganizationRepository organizationRepository) {
        this.emailRepository = emailRepository;
		this.organizationRepository = organizationRepository;
    }

    @Override
    public List<EmailQueue> queueNewOrgUserRegistrationMails() {
    	 List<EmailEntity> emailEntities = emailRepository.findAll();
         logger.info("Retrieved email entities: {}", emailEntities);

         List<EmailQueue> emailQueues = emailEntities.stream().map(entity -> {
             EmailQueue emailQueue = new EmailQueue();
             emailQueue.setId(entity.getId());
             emailQueue.mailBody(entity.getMailBody());
             emailQueue.mailFrom(entity.getMailFrom());
             emailQueue.mailSubject(entity.getMailSubject());
             emailQueue.mailTemplate(entity.getMailTemplate());
             emailQueue.mailTo(entity.getMailTo());

             OrganizationEmailEntity organization = entity.getOrganization();
                 Organization orgDTO = mapToDTO(organization);
                 emailQueue.setOrganization(orgDTO);
             
             return emailQueue;
         }).collect(Collectors.toList());

         logger.info("Emails queued successfully.");
         return emailQueues;
    }

    @Override
    public List<EmailQueue> queueNewUserRegistrationMail() {
    	try {
            List<EmailEntity> emailEntities = emailRepository.findAll();
            if (emailEntities != null && !emailEntities.isEmpty()) {
                logger.info("New user registration emails queued successfully.");
                return emailEntities.stream().map(a -> {
                    EmailQueue e = new EmailQueue();
                    e.setId(a.getId());
                    e.mailBody(a.getMailBody());
                    e.mailFrom(a.getMailFrom());
                    e.mailSubject(a.getMailSubject());
                    e.mailTemplate(a.getMailTemplate());
                    e.mailTo(a.getMailTo());
                    OrganizationEmailEntity organization = a.getOrganization();
                        Organization orgDTO = mapToDTO(organization);
                        e.setOrganization(orgDTO);
                    

                    return e;
                }).collect(Collectors.toList());
            } else {
                logger.error("No new user registration emails to queue.");
                return Collections.emptyList();
            }
        } catch (Exception e) {
            logger.error("Error occurred while queuing new user registration emails: ", e);
            throw new RuntimeException("Failed to queue new user registration emails.", e);
        }
    }
    
    private Organization mapToDTO(OrganizationEmailEntity organizationEntity) {
        Organization organizationDTO = new Organization();
        organizationDTO.setId(organizationEntity.getId());
        organizationDTO.setName(organizationEntity.getName());
        organizationDTO.setDescription(organizationEntity.getDescription());
        organizationDTO.setPhone(organizationEntity.getPhone());
        organizationDTO.setEmail(organizationEntity.getEmail());
        organizationDTO.setAddress(organizationEntity.getAddress());
        organizationDTO.setFax(organizationEntity.getFax());
        // Convert String to OffsetDateTime before setting
        organizationDTO.setDateOfEstablishment(OffsetDateTime.parse(organizationEntity.getDateOfEstablishment()));
        organizationDTO.setStatus(organizationEntity.getStatus());
        organizationDTO.setCmdbOrgId(organizationEntity.getCmdbOrgId());
        organizationDTO.setFileName(organizationEntity.getFileName());
        organizationDTO.setFileStorageLocationType(organizationEntity.getFileStorageLocationType());
        organizationDTO.setProfileImage(organizationEntity.getProfileImage());
        return organizationDTO;
    }
}
