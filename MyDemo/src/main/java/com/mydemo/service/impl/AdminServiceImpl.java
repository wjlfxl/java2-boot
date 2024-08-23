package com.mydemo.service.impl;

import com.mydemo.mapper.AdminMapper;
import com.mydemo.pojo.Admin;
import com.mydemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin adminByNP(String name, Integer password) {
        return adminMapper.adminByNP(name, password);
    }

    @Override
    public Admin adminByName(String name) {
        return adminMapper.adminByName(name);
    }

    @Override
    public int upDateAdmin(Admin admin) {
        return adminMapper.upDateAdmin(admin);
    }

    @Override
    public int deleteAdmin(String name) {
        return adminMapper.deleteAdmin(name);
    }
}
