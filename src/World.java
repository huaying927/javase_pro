import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class World
{
    public static void main(String[] args)
    {
//        World.add(2, 3);

        int[] arr = {9, 3, 2, 5, 1};

        World.bubbleSort(arr);

    }

    public static void add(int num, int num2)
    {
        System.out.println(num + num2);
    }

    public static void bubbleSort(int[] sortedArr)
    {
        for (int i = 0; i < sortedArr.length - 1; i++)
        {
            for (int j = 0; j < sortedArr.length - i - 1; j++)
            {
                if(sortedArr[j] > sortedArr[j+1])
                {
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j+1];
                    sortedArr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < sortedArr.length; i++)
        {
            System.out.println(sortedArr[i]);
        }
    }
}
