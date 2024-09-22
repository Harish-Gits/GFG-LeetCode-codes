class Solution
{
    public String reverseWords(String s)
    {
        String[] strArr=s.split(" +");
        int low=0,high=strArr.length-1;
        while(low<=high)
        {
            String str=strArr[low];
            strArr[low]=strArr[high];
            strArr[high]=str;
            low++;
            high--;
        }
        StringBuilder sb=new StringBuilder();
        for(String str:strArr)
            sb.append(str+" ");
        return sb.toString().trim();

    }
}