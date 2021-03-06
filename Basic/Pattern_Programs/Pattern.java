//--------------------------------------------------pyramid-----------------------------------------------------------
public class Main
{
	public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
	    for(int j=4;j>=i;j--)
	    {
	      System.out.print(" ");                                                                                          
       }                                                                                                                
	    for(int j=1;j<=i;j++)                                                                                             
	    {
	      System.out.print("*");
	      System.out.print(" ");
	    }
	    System.out.println(" ");
	}
	    
	}
}                                                                                                                                                                                                                                                                                  
  /*      output
        *  
       * *  
      * * *  
     * * * *  
    * * * * *  
               */     
 /*--------------------------------------------------. Right Triangle Star Pattern--------------------------------------------------------------------------    
 
 
 public class Main
{
	public static void main(String[] args) {
for(int i=1;i<=5;i++)         // 1 2 3 4 5
	 {
	     for(int j=4;j>=i;j--)      // P 4 3 2 1
	     {
	         System.out.print(" ");
	     }
	     for(int j=1;j<=i;j++)  // p 1 2 3 4 5
	     {
	         System.out.print("*");
	     }
	    System.out.println(" ");
	 }
	    
	}
}
 /*      output
            * 
           ** 
          *** 
         **** 
        ***** 

              */   */
  /*--------------------------------------------------.  Left Triangle Star Pattern--------------------------------------------------------------------------   
 public class Main
 {
	public static void main(String[] args) {
  for(int i=1;i<=5;i++)         // 1 2 3 4 5
	 {
	     for(int j=1;j<=i;j++)      // P 1 2 3 4 5
	     {
	         System.out.print("*");
	     }
	     for(int j=4;j>=i;j--)  // p 1 2 3 4 5
	     {
	         System.out.print(" ");
	     }
	    System.out.println(" ");
	 }
	}
}
 /*      output
            *     
            **    
            ***   
            ****  
            ***** 
            
              */   */
 /*--------------------------------------------------. Download Right Triangle Star Pattern--------------------------------------------------------------------------                 
  
  

public class Main
{
	public static void main(String[] args) {
  for(int i=1;i<=5;i++)         // 1 2 3 4 5
	 {
	     for(int j=5;j>=i;j--)      // P  5 4 3 2 1
	     {
	         System.out.print("*");
	     }
	     for(int j=1;j<i;j++)  // p 1 2 3 4 5
	     {
	         System.out.print(" ");
	     }
	    System.out.println(" ");
	 }
	}
}
 /*      output
            ***** 
            ****  
            ***   
            **    
            *     

              */  */
  /*--------------------------------------------------. Download Left Triangle Star Pattern--------------------------------------------------------------------------                 
  

public class Main
{
	public static void main(String[] args) {
    for(int i=1;i<=5;i++)         // 1 2 3 4 5
	 {
	     for(int j=1;j<i;j++)      // P  0 1 2 3 4 
	     {
	         System.out.print(" ");
	     }
	     for(int j=5;j>=i;j--)  // p 1 2 3 4 5
	     {
	         System.out.print("*");
	     }
	    System.out.println(" ");
	 }
	}
}
 /*      output
        ***** 
         **** 
          *** 
           ** 
            * 
              */  */
                          
     /*--------------------------------------------------. Diamond Triangle Star Pattern--------------------------------------------------------------------------                 
public class Main
{
	public static void main(String[] args) {
	for(int i=1;i<=5;i++)         // 1 2 3 4 5
	 {
	     for(int j=4;j>=i;j--)      // P 4 3 2 1
	     {
	         System.out.print(" ");
	     }
	     for(int j=1;j<=i;j++)  // p 1 2 3 4 5
	     {
	         System.out.print("*");
	     }
	     for(int j=1;j<=i;j++)      // P 1 2 3 4 5
	     {
	         System.out.print("*");
	     }
	     for(int j=4;j>=i;j--)  // p 1 2 3 4 5
	     {
	         System.out.print(" ");
	     }
	    System.out.println(" ");
	 }
	 for(int i=1;i<=5;i++)         // 1 2 3 4 5
	 {
	     for(int j=1;j<i;j++)      // P  0 1 2 3 4 
	     {
	         System.out.print(" ");
	     }
	     for(int j=5;j>=i;j--)  // p 1 2 3 4 5
	     {
	         System.out.print("*");
	     }
	     for(int j=5;j>=i;j--)      // P  5 4 3 2 1
	     {
	         System.out.print("*");
	     }
	     for(int j=1;j<i;j++)  // p 1 2 3 4 5
	     {
	         System.out.print(" ");
	     }
	    System.out.println(" ");
	   
	 }
	}
}

/*      output
            **     
           ****    
          ******   
         ********  
        ********** 
        ********** 
         ********  
          ******   
           ****    
            **     
                     */ */           
/*--------------------------------------------------. Downward Diamond --------------------------------------------------------------------------                 
public class Main
{
	public static void main(String[] args) {
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<i;j++)
        {
            System.out.print(" ");
        }
        for(int j=5;j>=i;j--)
        {
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println(" ");
    }
	    
	    
	}
}
/*        output
        * * * * *  
         * * * *  
          * * *  
           * *  
            *  
                    */ */
/*-----------------------------------------------------------------------------------------------------------------------------------------------
		      
public class Main
{
	public static void main(String[] args) {
    for(int i=1;i<=9;i++)
    { 
     
      if(i<=5)
      {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
      }
      else
      {
        for(int j=9;j>=i;j--)
        {
            System.out.print("*");
        }
      }
        System.out.println(" ");
    }
	    
	    
	}
}
/*        output
            * 
            ** 
            *** 
            **** 
            ***** 
            **** 
            *** 
            ** 
            *              */   */
		      
