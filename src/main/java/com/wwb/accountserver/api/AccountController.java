package com.wwb.accountserver.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weibo
 * @date 2022/1/18
 */


@Slf4j
@RestController
@RequestMapping("/api/account")
public class AccountController {

    @PostMapping("/testProvider")
    public String testProvider(){
//        ResponsePageResult responsePageResult = new ResponsePageResult();
        return "hello world";
    }

}
