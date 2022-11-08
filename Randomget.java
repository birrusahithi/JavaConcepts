import java.util.*;

public class Randomget {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        Set<Integer> l1 = new HashSet<>();
        StringBuilder str = new StringBuilder();
        str.append("ash");
        System.out.println(str);
        str.delete(0, 1);
        System.out.println(str);

        int[] arr = {100, 200, 800, 900, 1009, 500, 300};
        Random obj = new Random();
        for(int i=0; i<arr.length; i++) {
            int a = obj.nextInt(arr.length);
            System.out.println(a);
            int temp = arr[a];
            System.out.println(set);
            arr[i]= temp;
        }

        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
