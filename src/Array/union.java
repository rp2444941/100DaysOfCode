package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class union {
   
    public static void main(String args[]) {
    int n = 10, m = 7;
    int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arr2[] = {2, 3, 4, 4, 5, 11, 12};
    ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
  System.out.println("Union of arr1 and arr2 is ");
  for (int val: Union)
            System.out.print(val+" ");
    }


    private static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {

        HashSet<Integer> s=new HashSet<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(arr1[i]);

        }
        for (int i = 0; i < m; i++) {
            s.add(arr2[i]);
            
        }
        for (int it: s) {
            Union.add(it);
            
        }
        return Union;
    }

   /* public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        HashMap<Integer,Integer> fr=new HashMap<>();
        ArrayList<Integer> union=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fr.put(arr1[i],fr.getOrDefault(arr1[i],0)+1);

        }
        for (int i = 0; i < m; i++) {
            fr.put(arr2[i],fr.getOrDefault(arr2[i],0)+1);

        }
       for(int it:fr.keySet()){
           union.add(it);
       }
return union;

    }*/

    //using hashset



}
