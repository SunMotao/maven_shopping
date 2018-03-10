package com.sxt.service.impl;

import com.sxt.dao.AdminDao;
import com.sxt.po.Admin;
import com.sxt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 57056 on 2018/3/9.
 */
@Component
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin queryAdminByName(Admin admin) {
        return adminDao.queryAdminByName(admin);
    }
}
