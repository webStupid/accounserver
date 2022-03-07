package com.wwb.accountserver.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author weibo
 * @date 2022/3/4
 */

@Data
public class TestRequest {

    @NotNull
    private String name;

}
