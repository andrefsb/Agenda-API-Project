package com.example.Agenda.API.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Agenda.API.Project.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
