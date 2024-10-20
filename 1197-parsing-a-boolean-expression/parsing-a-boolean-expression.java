class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st=new Stack<>();
        for(char c:expression.toCharArray()){
            if(c==','|| c=='('){
                continue;
            }
            if(c=='&'||c=='!'||c=='|'||c=='t'||c=='f'){
                st.push(c);
            }
            else if(c==')'){
                boolean hastrue =false;
                boolean hasfalse =false;
            while(st.peek()!='!'&&st.peek()!='&'&&st.peek()!='|'){
                char tv=st.pop();
                if(tv=='t'){
                hastrue=true;
                }
                if(tv=='f'){
                hasfalse=true;
                }
            }
            char op=st.pop();
            if(op=='!'){
                st.push(hastrue?'f':'t');
            }
            else if(op=='&'){
                st.push(hasfalse?'f':'t');
            }
            else{
                st.push(hastrue?'t' :'f');
            }
        }
        }
        return st.peek()=='t';
    }
}