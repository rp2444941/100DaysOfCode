public class LargestElement {

    // 🔴 Brute Force Approach

    // 🟡 Better Approach

    // 🟢 Optimal Approach
    private static int findLargest(int[] arr) {
        int large=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large){
                large=arr[i];
            }

        }
        return large;
    }

    public static void main(String[] args) {
        // Test your solution here
        int[] arr = {5, 10, 3, 8, 6};
        System.out.println("Largest Element: " + findLargest(arr));
    }


}
