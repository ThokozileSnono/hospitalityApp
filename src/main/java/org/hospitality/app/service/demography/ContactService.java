package org.hospitality.app.service.demography;

import org.hospitality.app.entity.Contact;
import org.hospitality.app.service.IService;
import java.util.Set;

public interface ContactService extends IService < Contact, String>{
    Set<Contact> getAll();

    Set<Contact> getAllStartingWithA();
}
