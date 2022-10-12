package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int [] data = {-4, 11, 7, -12, 6, 1};
        ArraySelectionSorter(data);
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
}
