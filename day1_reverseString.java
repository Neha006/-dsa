
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n=str.length();
        if(n==0)
            return "";
        int l=0;
        int r=n-1;
        char [] wordArray=str.toCharArray();
        while(l<r){
            char ch=wordArray[l];
            wordArray[l]=wordArray[r];
            wordArray[r]=ch;
            l++;
            r--;
        }
        return new String(wordArray);
    }
}
