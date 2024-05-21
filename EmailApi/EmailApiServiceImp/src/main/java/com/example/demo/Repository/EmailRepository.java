package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.EmailEntity;
import com.org.asset.api.model.EmailQueue;



@Repository
public interface EmailRepository extends JpaRepository<EmailEntity, Long>{
	

}
