package org.hospitality.app.repository;

// Author: Thokozile Snono
// Entity: Contact
// Date: 31 August 2020

import org.hospitality.app.entity.Contact;
import org.hospitality.app.user.IRepository;

import java.util.Set;

public interface ContactRepository extends IRepository < Contact, String> {
    Set<Contact> getAll();

    //Set<Contact> getAllStartingWithA();
}