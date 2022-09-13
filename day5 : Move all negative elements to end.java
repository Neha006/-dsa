class Solution {
    
    public void segregateElements(int arr[], int n)
    {
            int j=0;
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for(int i:arr){
            if(i>0)
            positive.add(i);
            else
            negative.add(i);
        }
        for(int i=0;i<positive.size();i++)
        arr[j++]=positive.get(i);
        for(int i=0;i<negative.size();i++)
        arr[j++]=negative.get(i);
           
       
        
    }
} 
