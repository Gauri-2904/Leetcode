class Solution {
//     public int minSwaps(String s) {
//         // tc= 0(N)  and sc= O(N)
//         Stack<Character>st= new Stack<>();
//         for(char ch: s.toCharArray()){
//             if(ch=='['){   // if we find opening bracket only in stack that means it will be pushed in st
//                 st.push(ch);
//             }else if(!st.isEmpty()){
//                 st.pop();// removes topmost element of the stack
//             }
//         }
//         return (st.size()+1)/2; // swap=( opening +1) /2  ,  we will take integer val of swap
//     }
// }
  public int minSwaps(String s) {
  int size =0;
  for(char ch:s.toCharArray()){
    if(ch=='['){
        size++;
    }else if( size!=0){
        size--;
    }
  }
  return (size+1)/2;
  }
}
// here this approach is without using stack   tc=O(N)  AND sc= O(1)
    