class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(generateRows(i));
        }
        return l;
    }
    public static List<Integer> generateRows(int n){
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(ans);
        for(int c=1;c<=n;c++){
            ans *= (n-c)+1;
            ans = ans/c;
            row.add(ans);
        }
        return row;
    }
}
