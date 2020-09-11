package org.hospitality.app.service;

public interface IService <type, email>{
    type create(type t);
    type read(email email);
    type upadate(type t);
    boolean delete(email email);
}

