package com.test.controller;

import com.test.entity.ResultMsg;
import com.test.services.VerifyCodeEntityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@Transactional
public class VerifuCodeController {

    private Logger logger = Logger.getLogger(getClass());
    @Autowired
    VerifyCodeEntityService verifyCodeEntityService;

    @ResponseBody
    @RequestMapping(value = "codeSend.do", method = RequestMethod.POST)
    public ResultMsg CodeSend(HttpServletRequest request) {
        String Mobile = request.getParameter("mobile");
        String type = request.getParameter("type");
        return verifyCodeEntityService.SendVerifyCode(Mobile, type);
    }

    /**
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "check.do", method = RequestMethod.POST)
    public ResultMsg CodeCheck(HttpServletRequest request) {
        String Mobile = request.getParameter("mobile");
        String type = request.getParameter("type");
        String code = request.getParameter("code");
        return verifyCodeEntityService.VeriFyCodeCheck(Mobile, type, code);
    }
}
