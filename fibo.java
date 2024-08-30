import java.util.*;

class fibo

   {

   public static void main(String args[])

      {

        int a=0,b=1,c,term;
         Scanner s=new Scanner(System.in);
         System.out.print(" enter the number of terms you want in the series - ");
          term=s.nextInt();
  
                
                  for(int i=1 ; i<=term ; i++)

               {
                  System.out.print ( a+ " " );

                  c = a+b;
                  a = b;
                  b = c;
                 }
               }    
             }