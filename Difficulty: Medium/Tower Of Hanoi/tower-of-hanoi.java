class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n==1){
            return 1;
        }
        int c=0;
        c+=towerOfHanoi(n-1,from,aux,to);
        c++;
        c+=towerOfHanoi(n-1,aux,to,from);
        return c;
    }
}
