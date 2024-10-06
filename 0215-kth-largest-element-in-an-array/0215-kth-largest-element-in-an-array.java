class Solution {
             // sorting
        // Arrays.sort(nums); //Ascending order
        // return nums[nums.length - k];   tc.--> nlog n
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer>minheap=new PriorityQueue<>();
            for(int num:nums){
                minheap.add(num);
                if(minheap.size()>k){
                minheap.remove();
        }
            }
                
                return minheap.peek();
            // tc = nlogn
            // it can be optimized by using quick select method to O(n) 3rd approach
    
    }
}