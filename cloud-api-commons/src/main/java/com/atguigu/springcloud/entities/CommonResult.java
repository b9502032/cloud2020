package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    Integer code;
    String  message;
    T       data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
