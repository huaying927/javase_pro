public class HelloWorld
{
    /*
       原生(基本)类型：
       1.byte     1个字节  取值范围-128-127
       2.short    2个字节
       3.char     2个字节,是一种特殊的无符号的整型，其值必须用单引号包括起来
       4.int      4个字节
       5.long     8个字节
       6.float    4个字节
       7.double   8个字节
       8.boolean  1个字节
     */
    public static void main(String[] args)
    {
//        int num = 3;
//
//        System.out.println("num = " + 3);

//        System.out.println('1' == 49);

//        String strData = "abc";
//
//        System.out.println("a" + 123);

         byte bNum = 127;

         short sNum = 1;

         char cNum = 0;

         sNum = bNum;

         int iNum = sNum;
         long lNum = 123;
         long l2Num = cNum;
         int iNum2 = (int)lNum;

        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);
        System.out.println(l2Num);

        float fNum = 1.2f;
        double dNum = 2.5;

        float f2Num = (float)dNum;

        System.out.println(f2Num);

        long longNum = (long)fNum;

        final short s = 1;
        short n = s + 1;
    }
}
