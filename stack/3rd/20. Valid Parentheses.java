class Solution {
    public boolean isValid(String s) {
        int i=0;
        Stack<Character> st = new Stack<>();
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch =='['){
                st.push(ch);
            }
            else{
                if(st.size()>=1){
                    char top = st.pop();
                    if(top=='(' && ch==')'){

                    }
                    else if(top=='[' && ch==']'){

                    }
                    else if(top=='{' && ch=='}'){

                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
             i++;
        }
        if(st.size()>0){
            return false;
        }
        return true;
    }
}
