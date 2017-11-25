package com.test.services.impl;

import com.alibaba.fastjson.JSON;
import com.test.controller.FileUploadController;
import com.test.entity.ResultMsg;
import com.test.entity.TutuUserEntity;
import com.test.entity.VerifyCodeEntity;
import com.test.mapper.TutuUserEntityMapper;
import com.test.services.TutuUserEntityService;
import com.test.utils.Config;
import com.test.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Service
public class TutuUserEntityServiceImpl implements TutuUserEntityService {

    @Autowired
    TutuUserEntityMapper tutuUserEntityMapper;

    @Override
    public TutuUserEntity UpdateProfile(TutuUserEntity tutuUserEntity) {
        return null;
    }

    @Override
    public TutuUserEntity UpdatePassword(TutuUserEntity tutuUserEntity) {
        return null;
    }

    @Override
    public ResultMsg Register(HttpServletRequest request) {
        TutuUserEntity tutuUserEntity = tutuUserEntityMapper.selectByMobile(request.getParameter("mobile"));
        System.out.println(JSON.toJSON(tutuUserEntity));
        ResultMsg msg = new ResultMsg();
        msg.setResultCode(0);
        msg.setResultMsg("注册失败");
        if (tutuUserEntity == null) {
            tutuUserEntity = new TutuUserEntity();
            tutuUserEntity.setGroupId(1);
            tutuUserEntity.setGender(Integer.parseInt(request.getParameter("gender")));
            tutuUserEntity.setIsDel(false);
            tutuUserEntity.setPoint("50");
            tutuUserEntity.setLat("0");
            tutuUserEntity.setLng("0");
            tutuUserEntity.setLoginCount(0);
            tutuUserEntity.setNickName(request.getParameter("nickname"));
            tutuUserEntity.setStatus(1001);
            tutuUserEntity.setMobile(request.getParameter("mobile"));
            tutuUserEntity.setRegIp(request.getLocalAddr());
            tutuUserEntity.setRegDate(Config.getTime());
            tutuUserEntity.setHeadImage(FileUploadController.springUpload(request, true));
            tutuUserEntity.setPassword(Md5.GetMD5Code(request.getParameter("password")));
            msg.setResultMsg("注册成功");
            msg.setResultCode(1);
        } else {
            msg.setResultCode(0);
            msg.setResultMsg("用户已存在");
            return msg;
        }
        if (save(tutuUserEntity) <= 0) {
            msg.setResultCode(0);
            msg.setResultMsg("请稍后再试");
        }
        return msg;
    }

    @Override
    public TutuUserEntity FindPassword(TutuUserEntity tutuUserEntity) {
        return null;
    }

    @Override
    public TutuUserEntity LoginByPassword(TutuUserEntity tutuUserEntity) {
        return null;
    }

    @Override
    public TutuUserEntity LoginByVerifyCode(TutuUserEntity tutuUserEntity) {
        return null;
    }

    @Override
    public ResultMsg test() {
        ResultMsg msg = new ResultMsg();
        msg.setResultCode(200);
        msg.setResultMsg("测试成功");
        TutuUserEntity tutuUserEntity = tutuUserEntityMapper.selectByMobile("18200118829");
        msg.setResultObject(tutuUserEntity);
        return msg;
    }

    private int save(TutuUserEntity tutuUserEntity) {
        if (null != tutuUserEntity.getUid()) {
            return tutuUserEntityMapper.updateByPrimaryKeySelective(tutuUserEntity);
        } else {
            return tutuUserEntityMapper.insert(tutuUserEntity);
        }

    }
}
