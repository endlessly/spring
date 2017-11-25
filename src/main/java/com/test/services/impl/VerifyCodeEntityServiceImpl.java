package com.test.services.impl;

import com.alibaba.fastjson.JSON;
import com.test.entity.ResultMsg;
import com.test.entity.VerifyCodeEntity;
import com.test.mapper.VerifyCodeEntityMapper;
import com.test.services.VerifyCodeEntityService;
import com.test.utils.JsonUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

@Service
public class VerifyCodeEntityServiceImpl implements VerifyCodeEntityService {
    private Logger logger = Logger.getLogger(getClass());
    @Autowired
    VerifyCodeEntityMapper verifyCodeEntityMapper;

    @Override
    public ResultMsg SendVerifyCode(String mobile, String VerifyCodeType) {
        ResultMsg msg = new ResultMsg();
        VerifyCodeEntity verifyCodeEntity = verifyCodeEntityMapper.selectByMobile(mobile);
        logger.info(verifyCodeEntity);
        Long time = new Date().getTime() / 1000;
        if (null == verifyCodeEntity) {
            verifyCodeEntity = new VerifyCodeEntity();
        }
        verifyCodeEntity.setMobile(mobile);
        verifyCodeEntity.setType(Integer.parseInt(VerifyCodeType));
        verifyCodeEntity.setVerifyCode(Integer.parseInt("123456"));
        verifyCodeEntity.setCheckNum(0);
        verifyCodeEntity.setSendTime(time.intValue());
        verifyCodeEntity.setValid(false);
        logger.info(verifyCodeEntity);
        Integer d = save(verifyCodeEntity);
        logger.info(d);
        if (0 != d) {
            Map map = new HashMap<>();
            map.put("code", verifyCodeEntity.getVerifyCode());
            map.put("type", VerifyCodeType);
            msg.setResultCode(1);
            msg.setResultMsg("验证码发送成功");
            msg.setResultObject(map);
        } else {
            msg.setResultMsg("验证发送失败");
            msg.setResultCode(0);
        }
        logger.info(msg);
        return msg;
    }

    @Override
    public ResultMsg VeriFyCodeCheck(String mobile, String VerifyCodeType, String Code) {
        VerifyCodeEntity verifyCodeEntity = verifyCodeEntityMapper.selectByMobile(mobile);
        logger.info(JSON.toJSON(verifyCodeEntity));
        Long time = new Date().getTime() / 1000;
        ResultMsg msg = new ResultMsg();
        if (null == verifyCodeEntity || verifyCodeEntity.getVerifyCode() != Integer.parseInt(Code)
                || true == verifyCodeEntity.getValid() || (time.intValue() - verifyCodeEntity.getSendTime()) > 1800
                || verifyCodeEntity.getCheckNum() >= 10
                ) {
            msg.setResultMsg("验证失败");
            msg.setResultCode(0);
        } else {
            msg.setResultCode(1);
            verifyCodeEntity.setValid(true);
            msg.setResultMsg("验证成功");
        }
        verifyCodeEntity.setCheckNum(verifyCodeEntity.getCheckNum() + 1);
        if (verifyCodeEntityMapper.updateByPrimaryKeySelective(verifyCodeEntity) < 0) {
            msg.setResultMsg("验证失败");
            msg.setResultCode(0);
        }
        logger.info(JSON.toJSON(msg));
        return msg;
    }

    private int save(VerifyCodeEntity verifyCodeEntity) {
        if (null != verifyCodeEntity.getId()) {
            return verifyCodeEntityMapper.updateByPrimaryKeySelective(verifyCodeEntity);
        } else {
            return verifyCodeEntityMapper.insert(verifyCodeEntity);
        }

    }
}
