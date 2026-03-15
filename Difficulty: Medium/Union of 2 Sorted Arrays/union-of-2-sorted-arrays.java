class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> unionArr = new ArrayList<>();
        
        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != a[i]){
                    unionArr.add(a[i]);
                }
                i++;
            }else{
                if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]){
                    unionArr.add(b[j]);
                }
                j++;
            }
        }
        
        while(i < n1){
            if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != a[i]){
                unionArr.add(a[i]);
            }
            i++;
        }
        
        while(j<n2){
            if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]){
                unionArr.add(b[j]);
            }
            j++;
        }
        
        return unionArr;
    }
}
