package com.jiangxing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zengjuan on 16/12/10.
 */
@Controller
@RequestMapping("/amz")
public class AmzController {
    @RequestMapping("/hi")
    public String Hi(){
        return "Hi";
    }
}
