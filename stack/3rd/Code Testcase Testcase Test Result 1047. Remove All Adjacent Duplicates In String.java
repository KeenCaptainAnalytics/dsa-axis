class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        int i =0;
        while(i<s.length()){
            if(st.size()>0){
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else
            {
                st.push(s.charAt(i));
            }

            i++;
        }

        String ans="";
        while(st.isEmpty()==false){
            ans = st.pop()+ans;
        }

        return ans;
    }
}
