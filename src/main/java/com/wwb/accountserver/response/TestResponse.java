package com.wwb.accountserver.response;

import lombok.Data;

import java.util.Date;

/**
 * @author weibo
 * @date 2022/3/4
 */

@Data
public class TestResponse {

    private String name;

    private Date newDate;

    private Date sendDate;


}
