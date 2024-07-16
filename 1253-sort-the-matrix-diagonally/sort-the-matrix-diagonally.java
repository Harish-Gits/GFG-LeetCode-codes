class Solution {
    public int[][] diagonalSort(int[][] mat)
    {
        int m=mat.length,n=mat[0].length;
        Map<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                PriorityQueue<Integer> curr=map.getOrDefault(i-j,new PriorityQueue<>());
                curr.add(mat[i][j]);
                map.put(i-j,curr);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                mat[i][j]=(map.get(i-j)).remove();
        }
        return mat;
    }
}