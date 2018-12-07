package com.caj.advance.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation
{
    String value() default "laosun";

    int age() default 0;
}
