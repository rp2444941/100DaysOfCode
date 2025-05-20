package Array;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        moveZero(n, arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void moveZero(int n, int[] arr) {
        int left=0,right=0;
        while(right<n){
            if(arr[right]==0){
                ++right;
            }else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                ++right;
                ++left;
            }

        }

    }

}
