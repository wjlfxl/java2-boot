package com.mydemo.service;

import com.mydemo.pojo.Admin;

public interface AdminService {

    Admin adminByNP(String name, Integer password);

    Admin adminByName(String name);

    int upDateAdmin(Admin admin);

    int deleteAdmin(String name);
}
