package com.yamsaika.learnspringboot.propertyeditor;

public class Solution {
    public static void main(String[] args)
    {
        int[] numbers = {38,223,100,123,406,234,256,93,222,259,233,69,139,245,45};
        int[] count = new int[numbers.length];
        int denominator = 1000000007;
        for(int i=1;i<numbers.length;i++)
        {
            int mins = 0;
            for(int j=i-1;j>=0;j--)
            {
                if(numbers[j]<numbers[i])
                    mins+=1;
            }
            count[i] = mins;
            System.out.println(count[i]);
        }
        int prod = 1;
        for(int i=1;i<count.length;i++)
            prod = ((prod%denominator)*(count[i]%denominator))%denominator;
        System.out.println(prod);
    }
}
