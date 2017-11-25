package com.test.controller;

import com.test.entity.ResultMsg;
import com.test.entity.TutuUserEntity;
import com.test.services.SocketService;
import com.test.services.TutuUserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@Transactional
@ResponseBody
public class TuTuUserController {
    @Autowired
    TutuUserEntityService tutuUserEntityService;
    SocketService socketService;

    @ResponseBody
    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    public ResultMsg register(HttpServletRequest request) {
        return tutuUserEntityService.Register(request);
    }

    @ResponseBody
    @RequestMapping(value = "test.do", method = RequestMethod.POST)
    public ResultMsg test() {
        socketService.run();
        return tutuUserEntityService.test();
    }

}
