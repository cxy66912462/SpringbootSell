package com.imooc.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-09-20
 * Time: 18:21
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
