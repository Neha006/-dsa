class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        // add your code here
        HashSet<Integer> unionSet= new HashSet<Integer>();
        for(int i : arr1)
        unionSet.add(i);
        for(int i : arr2)
        unionSet.add(i);
        for(int i : unionSet)
        list.add(i);
        Collections.sort(list);
        return list;
    }
}



