package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int [] data = {-4, 11, 7, -12, 6, 1};
        System.out.print("Round 0:");
        for (int el:data)
            System.out.print(" " + el);
        System.out.println();
        ArrayBubbleSorter(data);
    }

    static void ArraySelectionSorter(int[] input)
    {
        for (int i = 0; i < input.length - 1; i++)
        {
            int indSmallest = i;
            for (int j = i + 1; j < input.length; j++)
            {
                if (input[j] < input[indSmallest])
                    indSmallest = j;
            }
            swap(input, i, indSmallest);

            //printing intermediate steps
            System.out.print("Round " + (i+1) + ": ");
            String result = "";
            for (int element: input)
                result=result + element + " ";
            System.out.println(result.trim());
        }
    }

    static void swap(int[] input, int i, int j)
    {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    static void ArrayBubbleSorter(int [] input)
    {
        int counter=0;
        while(true)
        {
            boolean changed = false;
            for (int i = 1; i<input.length;i++)
            {
                if (input[i-1]>input[i])
                {
                    swap(input,i-1,i);
                    changed = true;
                }
            }
            if (!changed)
                System.exit(0);
            counter++;

            //printing intermediate steps
            System.out.print("Round " + counter + ": ");
            for (int el: input)
                System.out.print(el + " ");
            System.out.println();
        }
    }
}
