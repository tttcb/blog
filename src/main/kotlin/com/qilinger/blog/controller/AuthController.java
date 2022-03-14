package com.qilinger.blog.controller;

import com.qilinger.blog.model.Result;
import com.qilinger.blog.model.ResultCode;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AuthController {

    @RequestMapping("/get")
    public Result get(){
        HashMap map = new HashMap();
        map.put("username","admin");
        map.put("password","123456");
        Result r = new Result();
        r.code(ResultCode.SUCCESS).message("成功访问").data(map);
        return r;
    }

    @PreAuthorize("hasAuthority('admin')")
    @RequestMapping("/del")
    public String del(){
        return "删除成功";
    }

}
