package day25_ArrayList;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SecondUnique{
    public static void main(String[] args) {
        String str="abcdabc";
        String[] arr=str.split("");
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        String unique="";
        for(String each:list) {
            int frequency=Collections.frequency(list, each);
            if(frequency==1) {
                unique += each;
            }
        }
        System.out.println(unique);

    }
}
