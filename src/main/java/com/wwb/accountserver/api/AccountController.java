package com.wwb.accountserver.api;

import com.wwb.accountserver.request.TestRequest;
import com.wwb.accountserver.response.TestResponse;
import com.wwb.commonbase.utils.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

/**
 *
 * @author weibo
 * @date 2022/1/18
 */

@Slf4j
@RestController
@RequestMapping("/api/account")
public class AccountController {

    @PostMapping("/testProvider")
    public ResponseResult<TestResponse> testProvider(@RequestBody TestRequest testRequest){
        TestResponse testResponse = new TestResponse();
        testResponse.setName("hello world "+ testRequest.getName());
        testResponse.setSendDate(new Date());
        testResponse.setNewDate(new Date());
        return ResponseResult.success(testResponse);
    }

}