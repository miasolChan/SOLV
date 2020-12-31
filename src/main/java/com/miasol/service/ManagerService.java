package com.miasol.service;

import com.miasol.pojo.Admin;

public interface ManagerService {

    Admin selByName(String name);

    Admin selByNameAndPassword(String name,String password);
}
