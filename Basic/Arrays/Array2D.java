public class Array2D {

	public static void main(String[] args) {
       Array2D o=new Array2D();
       
       
       int d[][] = {
    		   {1,2,3,4},
    		   {1,2,3},
    		   {1,2,3,6}
       };
       for(int i=0;i<d.length;i++)   //rows
       {
    	   for(int j=0;j<d[i].length;j++) //columns 	
    	   {
    		   System.out.print(" " + d[i][j]);
    	   }
    	   System.out.println( );
       }
    

	}

}