package Array;

public class RotateArray {
    public static void main(String[] args) {
      /*  int n=5;

        int arr[]= {1,2,3,4,5};
        solve(arr, n);*/

        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        Rotatetoright(arr, n, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Rotatetoright(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int temp[]=new int[k];
        for (int i = n-k; i <n ; i++) {
            temp[i-n+k]=arr[i];

        }
        for (int i = n-k-1; i >=0 ; i--) {
            arr[i+k]=arr[i];

        }
        for (int i = 0; i < k; i++) {
            arr[i]=temp[i];

        }


    }

  /*  private static void solve(int[] arr, int n) {
      *//* Time Complexity: O(n)
           Space Complexity: O(n)*//*
       *//* int temp[]=new int[n];
        for (int i = 1; i <n; i++) {
            temp[i-1]=arr[i];

        }
        temp[n-1]=arr[0];
        for (int i = 0; i <n ; i++) {
            System.out.println(temp[i]+" ");

        }
*//*

        *//*int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i]=arr[i+1];

        }
        arr[n-1]=temp;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");

        }*//*


    }
*/
}
