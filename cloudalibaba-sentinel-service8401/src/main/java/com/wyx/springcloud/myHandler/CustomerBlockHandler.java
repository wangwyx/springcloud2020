package com.wyx.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wyx.springcloud.entities.CommonResult;

/**
 * @auth: wangyx-p
 * @date :2020-7-15 22:27
 * @Description:
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
