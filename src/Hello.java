public class Hello
{
    public static void main(String[] args)
    {
        //原生类型(基本类型)有八种：
        //byte short char int float long double boolean
        byte bNum = 127;//1个字节[-128, 127]
        short sNum = 3276;//2个字节
        int iNum = 128;//4个字节
        long lNum = 128;//8个字节
        char cNum = '老';//2个字节(是一种特殊的整型，不分正负)
        float fNum = 1.2f;//4个字节
        double dNum = 1.2;//8个字节
        boolean b = true;//1个字节 python: True或False
        String str = "f";
        System.out.println('A' == 65);
    }
}
