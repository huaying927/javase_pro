package com.caj.advance.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.util.Arrays;


@MyAnnotation
public class MyClass
{
    //通过反射来获取
    public void test()
    {
        Class<MyClass> clazz = MyClass.class;

//        Annotation[] annotations = clazz.getAnnotations();

//        System.out.println(Arrays.toString(annotations));

        MyAnnotation ma = clazz.getAnnotation(MyAnnotation.class);


        System.out.println("测试自定义注解, value = " + ma.value() + ", age = " + ma.age());
    }

    public static void main(String[] args)
    {
        new MyClass().test();
    }
}
