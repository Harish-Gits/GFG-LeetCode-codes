class Solution
{
    // Reverse function to reverse a 1D array
    public void reverse(int arr[], int st, int end)
    {
        while(st < end)
        {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    // Swap function to swap elements in the matrix
    public void swap(int[][] matrix, int i, int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    // Function to rotate the matrix 90 degrees clockwise
    public void rotate(int[][] matrix)
    {
        int n = matrix.length;

        // Transpose the matrix
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
                swap(matrix, i, j);
        }

        // Reverse each row to get the 90 degree rotation
        for(int i = 0; i < n; i++)
            reverse(matrix[i], 0, n - 1);
    }
}
