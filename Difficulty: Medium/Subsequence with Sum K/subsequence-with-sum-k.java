class Solution {
    public boolean check(int idx,int k,int[] arr){
        if(k==0) return true;
        if(k<0 || idx==arr.length) return false;
        boolean path1=check(idx+1,k-arr[idx],arr);
        if(path1){
            return true;
        }
        boolean path2=check(idx+1,k,arr);
        return path1||path2;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        boolean ans=check(0,k,arr);
        return ans;
    }
}