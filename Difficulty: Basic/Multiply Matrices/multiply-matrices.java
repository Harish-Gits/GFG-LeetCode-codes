//{ Driver Code Starts
import java.util.Scanner;
class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int[][] b = new int[n][n];
			int[][] c = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j]=sc.nextInt();
			for(int i = 0 ;i < n; i++)
				for(int j = 0; j < n; j++)
					b[i][j]=sc.nextInt();
			GfG g = new GfG();
			g.multiply(a,b,c,n);
			for (int i = 0; i < n; i++)
			{for (int j = 0; j < n; j++)
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
            int r1=A.length,c1=A[0].length;
            int r2=B.length,c2=B[0].length;
            
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    for(int k=0;k<c2;k++)
                    {
                        C[i][j]+=A[i][k]*B[k][j];
                    }
                }
            }
        }
}