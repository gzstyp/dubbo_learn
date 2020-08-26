package com.fwtai.service.impl;

import com.fwtai.service.ProviderService;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018-07-03 20:17
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
public class ProviderServiceImpl implements ProviderService{

    public String sayHello(final String name){
        System.out.println("hello : " + name);
        return "hello:" + name;
    }
}