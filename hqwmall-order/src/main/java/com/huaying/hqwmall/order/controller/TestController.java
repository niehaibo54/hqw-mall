package com.huaying.hqwmall.order.controller;

import com.huaying.common.controller.BaseController;
import com.huaying.common.page.PageData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController extends BaseController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        PageData pd =  this.getPageData();

        return "333";
    }
}
