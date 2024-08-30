import java.util.*;

class facto
   {

   public static void main(String args[])

      {

        int fact=1;
         Scanner s=new Scanner(System.in);
         System.out.print("enter the number of terms  - ");
          int term=s.nextInt();
  
                
                  for(int i=1 ; i<=term ; i++)

               {
                 fact=fact*i;
               }
                  System.out.print(  "factorial  of " +term + " is :- " +fact);

                
                 }
                }  