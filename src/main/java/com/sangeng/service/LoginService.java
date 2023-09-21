package com.sangeng.service;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
