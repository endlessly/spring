package com.test.services;

import com.test.entity.ResultMsg;
import com.test.entity.TutuUserEntity;

import javax.servlet.http.HttpServletRequest;

public interface TutuUserEntityService {
    ResultMsg Register(HttpServletRequest request);

    TutuUserEntity LoginByPassword(TutuUserEntity tutuUserEntity);

    TutuUserEntity LoginByVerifyCode(TutuUserEntity tutuUserEntity);

    TutuUserEntity UpdateProfile(TutuUserEntity tutuUserEntity);

    TutuUserEntity UpdatePassword(TutuUserEntity tutuUserEntity);

    TutuUserEntity FindPassword(TutuUserEntity tutuUserEntity);
    ResultMsg test();
}
