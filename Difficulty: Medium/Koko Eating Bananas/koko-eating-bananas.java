class Solution {
     public static long check(int[] nums,long lim){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            double a=(double)nums[i]/lim;
            long b=(long)Math.ceil(a);
            sum+=b;
        }
        return sum;
    }
    public int kokoEat(int[] arr, int k) {
        // code here
        //int[] nums=arr;
        int max=Integer.MIN_VALUE;
         for(int i:arr){
            max=Math.max(max,i);
         }
         long low=1,high=max;
         long ans=1;
         while(low<=high){
            long mid=(low+high)/2;
            if(check(arr,mid)<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
         }
         return (int)ans;
    }
}
