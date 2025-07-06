public class SmallestElement {

    // 🔴 Brute Force Approach

    // 🟡 Better Approach

    // 🟢 Optimal Approach
    private static int findSmallest(int[] arr) {
        int small=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                small=arr[i];
            }

        }
        return small;
    }

    public static void main(String[] args) {
        // Test your solution here
        int[] arr = {5, 10, 3, 8, 6};
        System.out.println("Smallest Element: " + findSmallest(arr)); // Output: 3

    }


}
