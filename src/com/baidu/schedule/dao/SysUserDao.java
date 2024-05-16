package com.baidu.schedule.dao;

import com.baidu.schedule.pojo.SysUser;

public interface SysUserDao {
    int addSysUser(SysUser sysUser);

    SysUser findUserByUsername(String username);
}
