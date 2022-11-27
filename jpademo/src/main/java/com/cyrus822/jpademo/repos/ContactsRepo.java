package com.cyrus822.jpademo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cyrus822.jpademo.models.Contacts;


public interface ContactsRepo extends JpaRepository<Contacts, Integer> {
    
}
