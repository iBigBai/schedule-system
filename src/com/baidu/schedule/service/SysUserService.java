package com.baidu.schedule.service;

import com.baidu.schedule.pojo.SysUser;

public interface SysUserService {
    int register(SysUser sysUser);

    SysUser findUserByUsername(String username);
}
