class Solution
{
   
    public static void sort012(int a[], int n)
    {
        // code here 
        int temp=0;
        int i=0;
        int j=0;
        int k=n-1;
        while(j<=k){
            switch(a[j]){
                case 0:
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    i++;
                    j++;
                    break;
                case 1:
                    j++;
                    break;
                case 2:
                    temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                    k--;
                    
            }
        }
    }
}
