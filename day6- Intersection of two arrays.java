class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        HashSet<Integer> intersection = new HashSet<Integer>();
        
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(a[i]<b[j])
            i++;
            else if(a[i]>b[j])
            j++;
            else if(a[i]==b[j]){
                intersection.add(a[i]);
                i++;
                j++;
                
            }
        }
        return intersection.size();
    }
}
