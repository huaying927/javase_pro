package com.caj.oop.inner_class;

import com.caj.oop.inner_class.OuterClass.StaitcInnerClass;

public class OuterClassTest
{
    public static void main(String[] args)
    {
        OuterClass oc = new OuterClass();

        oc.test();

        OuterClass.InnerClass ic = new OuterClass().new InnerClass();

        ic.testInnerClass();

        StaitcInnerClass sic = new OuterClass.StaitcInnerClass();

        sic.testStaticInnerClass();

    }
}
