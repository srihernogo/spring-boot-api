package com.hendisantika.springdocapisample.repository;

import com.hendisantika.springdocapisample.entity.Contact;

import java.util.List;

public interface ContactRepository {
    List<Contact> getAll();

    Contact getById(Long id);

    Contact save(Contact newContact);

    Contact update(Contact newContact);

    void delete(Long id);
}
