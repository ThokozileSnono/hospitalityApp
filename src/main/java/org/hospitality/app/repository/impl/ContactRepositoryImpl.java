package org.hospitality.app.repository.impl;

import org.hospitality.app.entity.Contact;
import org.hospitality.app.repository.ContactRepository;

import java.util.HashSet;
import java.util.Set;

public class ContactRepositoryImpl implements ContactRepository {

    private static ContactRepository repository = null;
    private Set <Contact> contactDB;
    private String email;

    private ContactRepositoryImpl() { this.contactDB = new HashSet<>();}

    public static ContactRepository getRepository() {
        if (repository == null) repository = new ContactRepositoryImpl();
        return repository;
    }


    @Override
    public  Set<Contact> getAll(){
        return this.contactDB;
        //public Set<Contact> getAll() {
        //return null;
    }

//    @Override
//    public Set< Contact > getAllStartingWithA() {
//        //this.repository.getAllStartingWithA();
//        return null;
//    }

    @Override
    public Contact create(Contact contact) {
        this.contactDB.add(contact);
        return null;
    }

    @Override
    public Contact read(String email) {
        //this.email = email;
        //Contact contact = this.contactDB.stream().filter(r -> r.getEmail().trim().equalsIgnoreCase(email)).findAny().orElse(null);

        for (Contact c: this.contactDB){
            if (c.getEmail().equalsIgnoreCase(email)) return c;
        }
        return null;
    }

    //@Override
    public Contact upadate(Contact contact) {
        return null;
    }

//    @Override
//    public Contact upadate(Object t) {
//        return null;
//    }

    //@Override
    public Contact update(Contact contact) {
        boolean deleteContact = delete(contact.getEmail());
        if (deleteContact){
            this.contactDB.add(contact);
            //this.contactDB.add(contact);
            return contact;
        }
        return null;
    }

    public boolean delete(String email) {
        Contact contact = read(email);
        if (contact != null){
            this.contactDB.remove(contact);
            return  true;
        }
        return false;
    }

//    public  Set<Contact> getAll(){
//        return this.contactDB;
//    }
}
