package com.caj.advance.proxy.static_proxy;

//真实主题角色：真正完成任务的角色
public class RealSubject extends AbstractSubject
{
    @Override
    public void subject()
    {
        System.out.println("出租房子");
    }
}
