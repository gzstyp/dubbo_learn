package com.fwtai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fwtai.service.ProviderService;

/**
 * 先启动ServerMain再启动本客户端[服务消费者provider]
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018年7月8日 12:31
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
public class LaunchClient{

    public static void main(String[] args){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationConsumer.xml"});
        context.start();
        final ProviderService service = context.getBean("providerService",ProviderService.class);
        System.out.println(service.sayHello("typ"));
        context.close();
    }
}