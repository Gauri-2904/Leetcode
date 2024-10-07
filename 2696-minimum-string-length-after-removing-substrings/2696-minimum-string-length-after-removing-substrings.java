class Solution {
            // while(s.contains("AB") ||  s.contains("CD")){
        //     if(s.contains("AB")){
        //         s=s.replaceFirst("AB", "");
        //     }else if(s.contains("CD")){
        //         s=s.replaceFirst("CD","");
        //     }
        // }
        // return s.length();
        // tc=O(N^2) with brute force 
        // 2nd approach using stack   tc=O(N)
    public int minLength(String s) {
    Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            if(st.isEmpty()){
            st.push(currChar);
                continue;
            }
            if(currChar=='B' && st.peek()=='A'){
                st.pop();
                }else if (currChar=='D' && st.peek()=='C') {
                    st.pop();
                    } else{
                        st.push(currChar);
                    }
            }
        return st.size();
    }
}

