package com.caj.advance.io.byte_io.input_stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class InputStreamTest
{
    public static void main(String[] args)
    {
        //        testReadFile();

        //        testReadFile2();

        testReadFile3();

    }

    public static void testReadFile3()
    {
        try
        {
            FileUtils.write(new File("/Users/sunfei/laosun_abc.txt"), "adsjfkla;jfdasljkfa;", "utf8");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void testReadFile2()
    {
        File file = new File("/Users/sunfei/sunfei.txt");

        try
        {

            FileUtils.copyFile(new File("/Users/sunfei/sunfei.txt"), new File("/Users/sunfei/laosun.txt"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void testReadFile()
    {
        File file = new File("/Users/sunfei/sunfei.txt");

        //实现Closeable或AutoCloseable接口的实现类，这种语法不需要再用到finally,
        // 因为此中语法会隐士执行finally中的代码
        try (InputStream is = new FileInputStream(file);)
        {
            byte[] b = new byte[512];

            int len = 0;

            while ((len = is.read(b)) != -1)
            {
                String str = new String(b, 0, len);

                System.out.println(str);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
