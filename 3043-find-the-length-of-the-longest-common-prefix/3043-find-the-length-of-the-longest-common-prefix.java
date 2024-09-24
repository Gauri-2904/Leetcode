class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // Create a HashSet to store prefixes from arr1
        Set<Integer> set = new HashSet<>();
        
        // Iterate through arr1 and extract all prefixes by continuously dividing the values by 10
        for (int val : arr1) {
            // Keep adding the value and its prefixes (by dividing by 10) until it's reduced to 0 or already in the set
            while (!set.contains(val) && val > 0) {
                set.add(val);
                val = val / 10;
            }
        }

        int res = 0; // Variable to store the maximum length of common prefix found

        // Iterate through arr2 to find the longest common prefix with any element from arr1
        for (int num : arr2) {
            // Continue dividing num by 10 until a common prefix is found or num is reduced to 0
            while (!set.contains(num) && num > 0) {
                num /= 10;
            }

            // If num is not zero, calculate the number of digits in the common prefix and update the result
            if (num > 0) {
                res = Math.max(res, (int) (Math.log10(num) + 1)); // Math.log10(num) gives the number of digits
            }
        }

        return res; // Return the maximum length of the common prefix found
    }
}
