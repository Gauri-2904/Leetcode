class Solution {

    // Calculates the product of all elements except itself for each element in the array
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int result[] = new int[n];
        
        // Initialize first element of result as 1 (no elements on the left of index 0)
        result[0] = 1;
        
        // Compute left product for each element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        int right = 1; // Holds the right product
        
        // Compute right product and multiply it with the left product for each element
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i]; // Update right product
        }
        
        return result; // Return the final result array
    }
}
