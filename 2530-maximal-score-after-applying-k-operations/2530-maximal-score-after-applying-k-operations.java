class Solution {
    public long maxKelements(int[] nums, int k) {
        long sum=0;
        //  Collections.reverseOrder(), we ensure that the largest element can be accessed first.
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.add(num);
        }
        // This line begins a while loop that continues until k reaches 0. 
        while(k-- > 0){
            // poll() retrieves and removes the maximum element from the priority queue
           int maxElement =pq.poll();
           sum+= maxElement;
            maxElement  = (int) Math.ceil(maxElement/3.0);
            pq.add(maxElement);
        }
    
    return sum;
    }
}

