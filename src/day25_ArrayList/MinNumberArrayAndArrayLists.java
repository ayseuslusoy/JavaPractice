package day25_ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class MinNumberArrayAndArrayLists {
    public static void main(String[] args) {
        int[]  numbers={1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        int min=numbers[0];
        for(Integer each:numbers) {//for(int i=0; i<numbers.length; i++){
            if (each < min) { //if(numbers[i]<min
                min = each;//min=numbers[i]
            }
        }
                System.out.println(min);

        ArrayList<Integer> number=new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5));
        int minn=number.get(0);
        for (Integer each:number){
            if(each<min){
                min=each;

        }

            }
        System.out.println(min);


    }
}