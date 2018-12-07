package com.caj.advance.reflect;

import java.lang.reflect.Field;

public class FieldTest
{
    public static void main(String[] args)
    {
        Class<String> clazz = String.class;

//        Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields)
        {
            System.out.println(field);
            System.out.println(field.getName());
        }
    }
}
