//Example 1
// Input:
// N=2,M=3
// Grid= [[1,0,1],[-8,9,-2]]
// Output:
// 1
// Explanation:The sum of all elements of the matrix is (1+0+1-8+9-2)=1.

//Example 2
// Input:
// N=3,M=5
// Grid=[[1,0,1,0,1],[0,1,0,1,0],[-1,-1,-1,-1,-1]]
// Output:
// 0
// Explanation: The sum of all elements of the matrix are (1+0+1+0+1+0+1+0+1+0-1-1-1-1-1)=0.

class SumofElementsInMatrix {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum=0;
        for(int i=0;i<Grid.length;i++)
        {
            for(int j=0;j<Grid[i].length;j++)
            {
               sum=sum+Grid[i][j];
            }
        }
        return sum;
    }
}
