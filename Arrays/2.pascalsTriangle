//leetcode: https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> rows, pre = null;

        for(int i = 0; i < numRows; i++){
            rows = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    rows.add(1);
                } else{
                    rows.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = rows;
            res.add(rows);
        }
        return res;
    }
}