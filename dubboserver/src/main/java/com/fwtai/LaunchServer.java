package com.fwtai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 先启动本服务端再启动ClientMain[服务提供者]
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018年7月8日 13:01
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
public class LaunchServer{

    public static void main(String[] args) throws IOException{
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationProvider.xml"});
        context.start();
        System.out.println("输入任意按键退出 ~ ");
        System.in.read();
        context.close();
    }
}