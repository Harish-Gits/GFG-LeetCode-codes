class Solution {
    public String decodeString(String s) 
    {
        Stack<Integer> ns=new Stack<>();
        Stack<StringBuilder> ss=new Stack<>();
        int num=0;
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
                num=num*10+(c-'0');
            else if(c=='[')
            {
                ss.push(str);
                str=new StringBuilder();
                ns.push(num);
                num=0;
            }
            else if(c==']')
            {
                StringBuilder temp=str;
                str=ss.pop();
                int count=ns.pop();
                while(count-->0)
                    str.append(temp);
            }
            else
                str.append(c);
        }
        return str.toString();
    }
}