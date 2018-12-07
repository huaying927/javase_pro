package com.caj.advance.io.file;

import java.io.File;
import java.io.IOException;

public class FileTest
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("/Users/sunfei/sunfei.txt");

//        if(file.exists())
//        {
//            System.out.println("文件已存在");
//        }
//        else
//        {
//            try
//            {
//                file.createNewFile();
//                System.out.println("文件创建成功");
//            }
//            catch (IOException e)
//            {
//                e.printStackTrace();
//            }
//        }


//        if(file.isFile())
//        {
//            System.out.println("是文件");
//        }
//        else if(file.isDirectory())
//        {
//            System.out.println("是路径");
//        }

//        System.out.println(file.canExecute());

//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalPath());

        //File中的静态属性
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);
        System.out.println(File.separatorChar);


    }
}
