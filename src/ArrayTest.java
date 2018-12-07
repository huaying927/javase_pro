import java.util.Arrays;

public class ArrayTest
{
    public static void main(String[] args)
    {
//        testCreateArrayWithInt();
//        testCreateArrayWithInt2();
//        testCreateArrayWithInt3();
//        testForEach();

//        testBubbleSort();

//        testSort();
//        testSort2();
        testArraysUtil();
    }

    public static void testArraysUtil()
    {
        int[] arrayInt = new int[5];

        Arrays.fill(arrayInt, 1);

        int[] newArrayInt = Arrays.copyOf(arrayInt, 3);

        System.out.println(Arrays.toString(arrayInt));//Arrays中的toString()方法可以打印出数组的内容

        System.out.println(Arrays.toString(newArrayInt));//Arrays中的toString()方法可以打印出数组的内容
    }

    public static void testSort2()
    {
        int[] arrayInt = {9, 3, 5, 2, 1};

        Arrays.sort(arrayInt, 1, arrayInt.length-1);

        System.out.println(Arrays.toString(arrayInt));//Arrays中的toString()方法可以打印出数组的内容
    }

    public static void testSort()
    {
        int[] arrayInt = {9, 3, 5, 2, 1};

        Arrays.sort(arrayInt);

//        for (int i = 0; i < arrayInt.length; i++)
//        {
//            System.out.println("arrayInt[" + i + "] = " + arrayInt[i]);
//        }

//        System.out.println(arrayInt);
        System.out.println(Arrays.toString(arrayInt));//Arrays中的toString()方法可以打印出数组的内容
    }

    //冒泡排序算法
    public static void testBubbleSort()
    {
        int[] arrayInt = {9, 3, 5, 2, 1};
        for (int i = 0; i < arrayInt.length - 1; i++)//外层循环终止条件是其长度-1
        {
            for (int j = 0; j < arrayInt.length - 1 - i; j++)//内层循环是其长度-1-外层循环的变量i
            {
                if(arrayInt[j] >= arrayInt[j+1])
                {
                    int temp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arrayInt.length; i++)
        {
            System.out.println("arrayInt[" + i + "] = " + arrayInt[i]);
        }

    }


    public static void testForEach()
    {
        int[] arrayInt = {9, 3, 5, 2, 1};

        for (int temp : arrayInt)
        {
            System.out.println(temp);
        }
    }

    //赋值
    public static void testCreateArrayWithInt3()
    {
        int[] arrayInt = {9, 3, 5, 2, 1};

        for (int i = 0; i < arrayInt.length; i++)
        {
            System.out.println("arrayInt[" + i + "] = " + arrayInt[i]);
        }
    }

    //创建对象并赋值
    public static void testCreateArrayWithInt2()
    {
        int[] arrayInt = new int[]{9, 3, 5, 2, 1};

        for (int i = 0; i < arrayInt.length; i++)
        {
            System.out.println("arrayInt[" + i + "] = " + arrayInt[i]);
        }
    }

    //有规律地初始化数组
    public static void testCreateArrayWithInt()
    {
        int[] arrayInt = new int[50];//直接赋值

//        arrayInt[0] = 0;
//        arrayInt[1] = 1;
//        arrayInt[2] = 3;
//        arrayInt[3] = 3;
//        arrayInt[4] = 4;//数组中最大的下标或索引= 数组的长度-1
        //        arrayInt[5] = 5;//抛出一个ArrayIndexOutOfBoundException

        //        System.out.println(arrayInt.length);

        for (int i = 0; i < arrayInt.length; i++)
        {
            System.out.println("arrayInt[" + i + "] = " + i);
        }
    }
}
