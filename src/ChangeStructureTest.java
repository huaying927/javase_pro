import java.util.Scanner;

public class ChangeStructureTest
{
    public static void main(String[] args)
    {
        //        testChangeStructure();
        //        testSwitchStructure();
        //        testSwitchStructure2();
        //        testSwitchStructure3();

        System.out.println(5 / 0);//ArithmeticException

        Scanner s = new Scanner(System.in);

        int value = s.nextInt();//InputMismatchException

        switch (value)
        {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
            default:
                System.out.println();
                break;
        }


    }

    public static void testSwitchStructure3()
    {

        switch (EnumType.A)//小括号内部接收一个常量
        {
            case A:
                //                System.out.println("优秀");
                //                break;//强制终止程序在其作用域内的执行
            case B:
                //                System.out.println("优秀");
                //                break;
            case C://分支
                System.out.println("优秀");
                break;
            case D://分支
                System.out.println("良好");
                break;
            case E://分支
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格或无成绩");
                break;
        }
    }

    public static void testSwitchStructure2()
    {
        Scanner scanner = new Scanner(System.in);//具备从控制台输入数据的功能

        //从控制台输入一个字符串并且赋值给整型变量scoreLevel
        String scoreLevel = scanner.next();

        switch (scoreLevel)//小括号内部接收一个常量
        {
            case "A":
                //                System.out.println("优秀");
                //                break;//强制终止程序在其作用域内的执行
            case "B":
                //                System.out.println("优秀");
                //                break;
            case "C"://分支
                System.out.println("优秀");
                break;
            case "D"://分支
                System.out.println("良好");
                break;
            case "E"://分支
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格或无成绩");
                break;
        }
    }

    public static void testSwitchStructure()
    {
        Scanner scanner = new Scanner(System.in);//具备从控制台输入数据的功能

        int score = scanner.nextInt();//从控制台输入一个整数并且赋值给整型变量score

        //switch可以接收六种数据类型：byte short char int String enum
        switch (score / 10)//小括号内部接收一个常量
        {
            case 10:
                //                System.out.println("优秀");
                //                break;//强制终止程序在其作用域内的执行
            case 9:
                //                System.out.println("优秀");
                //                break;
            case 8://分支
                System.out.println("优秀");
                break;
            case 7://分支
                System.out.println("良好");
                break;
            case 6://分支
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格或无成绩");
                break;
        }
    }

    public static void testChangeStructure()
    {
        //具备从控制台输入数据的功能
        Scanner s = new Scanner(System.in);

        //输入一个整数并返回
        int result = s.nextInt();

        if (result == 1)
        {
            System.out.println("走楼梯");
        }
        else if (result == 2)
        {
            System.out.println("坐电梯");
        }
        else
        {
            System.out.println("跳楼");
        }

    }


    public void test()
    {
        switch (1)
        {
            case 1:
                System.out.println();
                break;
        }
    }
}

enum EnumType
{
    A, B, C, D, E;
}
