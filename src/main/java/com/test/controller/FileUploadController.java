package com.test.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.util.WebAppRootListener;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
public class FileUploadController {
    /*
     *采用spring提供的上传文件的方法
     */
    @RequestMapping("upload.do")
    @ResponseBody
    public static String springUpload(HttpServletRequest request, Boolean isSingle) {

        try {
            long startTime = System.currentTimeMillis();
            String filePath = "";
            //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
            CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                    request.getSession().getServletContext());
            Map map = new HashMap();
            //检查form中是否有enctype="multipart/form-data"
            if (multipartResolver.isMultipart(request))

            {
                //将request变成多部分request
                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
                //获取multiRequest 中所有的文件名
                Iterator iter = multiRequest.getFileNames();
                while (iter.hasNext()) {
                    //一次遍历所有文件
                    MultipartFile file = multiRequest.getFile(iter.next().toString());
                    if (file != null) {
//                    String url = request.getSession().getServletContext().getRealPath("/") + "resources/upload/";
                        String path = "C:/work/mvc-master/src/main/webapp/resources/upload/" + startTime + ".png";
                        //上传
                        file.transferTo(new File(path));
                        filePath = path;
                        map.put(startTime, path);


                    }
                }

            }
            if (isSingle == true) return filePath;
            return JSON.toJSONString(map);
        } catch (Exception e) {
            return "error";
        }
    }
}
