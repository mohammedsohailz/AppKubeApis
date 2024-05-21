package com.example.demo.Service;

import java.util.List;

import com.org.asset.api.model.EmailQueue;

public interface EmailService {
	 List<EmailQueue> queueNewOrgUserRegistrationMails();
	 List<EmailQueue> queueNewUserRegistrationMail();
}
