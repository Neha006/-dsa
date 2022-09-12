class Compute 
{
    
    static pair getMinMax(long a[], long n)  
    {
       pair minMax= new pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
       // to keep track till where we checked
       int i;
       // to check array has even no. of element
       if(n%2==0){
           if(a[0]>a[1]){
               minMax.second=a[0];
               minMax.first=a[1];
           }
           else{
               minMax.second=a[1];
               minMax.first=a[0];
           }
           i=2;
       }
       else{
           minMax.second=a[0];
           minMax.first=a[0];
           i=1;
       }
       while(i<n-1){
           if(a[i]>a[i+1]){
               if(a[i]>minMax.second)
               minMax.second=a[i];
               if(a[i+1]<minMax.first)
               minMax.first=a[i+1];
           }
           else{
               if(a[i+1]>minMax.second)
               minMax.second=a[i+1];
               if(a[i]<minMax.first)
               minMax.first=a[i];
           }
           i+=2;
       }
       return minMax;
    }
}
