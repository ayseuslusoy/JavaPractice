package day25_ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class AverageNumberArrayAndArrayList {
    public static void main(String[] args) {
        int[] average = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(average));
          double sum=0;
        for (int i = 0; i < average.length; i++) {
            sum += average[i];
        }
            double avNumber=sum/average.length;

        System.out.println(avNumber);
        ArrayList<Integer> aver=new ArrayList<>();
        aver.addAll(Arrays.asList(1,2,3,4));
        double summ=0;
        for(Integer each:aver) {
            summ += each;
        }

            double averagee=sum/aver.size();
        System.out.println(averagee);
        }

    }

