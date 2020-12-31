package com.miasol.service.impl;

import com.miasol.mapper.AdminMapper;
import com.miasol.pojo.Admin;
import com.miasol.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author miasol
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Resource
    AdminMapper adminMapper;

    @Override
    public Admin selByName(String name) {
        return adminMapper.selByName(name);
    }

    @Override
    public Admin selByNameAndPassword(String name, String password) {
        return adminMapper.selByNameAndPassword(name,password);
    }
}
