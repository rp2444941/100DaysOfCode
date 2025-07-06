import java.util.Arrays;

public class ReverseArray {

    // 🔴 Brute Force Approach

    // 🟡 Better Approach


    private static int[] reverseBrute(int[] arr) {
        int[] reverse=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i]=arr[arr.length-1-i];

        }
        return reverse;
    }
    // 🟢 Optimal Approach
    private static void reverseOptimal(int[] arr1) {
        int left=0;
        int right= arr1.length-1;
       while(left<right){
           int temp=arr1[left];
           arr1[left]=arr1[right];
           arr1[right]=temp;
           left++;
           right--;
       }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = reverseBrute(arr);
        System.out.println(Arrays.toString(result));

        int[] arr1 = {1, 2, 3, 4, 5};
        reverseOptimal(arr1);
        System.out.println(Arrays.toString(arr1));
    }



}
