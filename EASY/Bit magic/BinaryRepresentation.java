class Solution{
    static String getBinaryRep(int n){
        StringBuilder ans = new StringBuilder();
        for(int i=29; i>=0; i--){
            int a = n >>i;
            if((a&1) != 0)
                ans.append(1);
            else
                ans.append(0);
        }
        return ans.toString();
    }
}
