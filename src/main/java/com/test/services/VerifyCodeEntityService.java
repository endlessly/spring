package com.test.services;

import com.test.entity.ResultMsg;
import com.test.entity.VerifyCodeEntity;

public interface VerifyCodeEntityService {
    ResultMsg SendVerifyCode(String mobile, String VerifyCodeType);

    ResultMsg VeriFyCodeCheck(String mobile, String VerifyCodeType, String Code);

//    VerifyCodeEntity selectByMobile(String mobile);

}
