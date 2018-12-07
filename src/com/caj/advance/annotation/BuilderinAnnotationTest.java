package com.caj.advance.annotation;

/**
 * java注解：
 * 1.内建注解：Ovveride Deparecated SuppressWarnings
 * 2.元注解：Target Retention Documented Inherited
 * 元注解是声明其他注解的注解
 */
public class BuilderinAnnotationTest
{
    @Override
    public String toString()
    {
        return super.toString();
    }

    @Deprecated
    public void testDeprecated()
    {
        System.out.println("过时的");
    }

    @SuppressWarnings({"unused", "serial"})
    public void testSuppressWarnings()
    {

    }

    public static void main(String[] args)
    {
        new BuilderinAnnotationTest().testDeprecated();
    }
}
