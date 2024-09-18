import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length; // Get the length of the input array
        String[] elements = new String[n]; // Array to hold the string representations of numbers

        // Convert each integer in the array to a string
        for (int i = 0; i < n; i++) {
            elements[i] = Integer.toString(nums[i]);
        }

        // Sort the string array using a custom comparator
        // The comparator concatenates two strings in both possible orders and compares them
        Arrays.sort(elements, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Concatenate in both possible orders
                String first = a + b;
                String second = b + a;

                // Sort in descending order by comparing concatenated results
                return second.compareTo(first);
            }
        });
        if(elements[0].equals("0")){
            return "0";
}

        // Use StringBuilder to efficiently concatenate the sorted strings
        StringBuilder sb = new StringBuilder();
        for (String val : elements) {
            sb.append(val);
        }

        // Convert the StringBuilder to a string and return it
        return sb.toString();
    }
}
