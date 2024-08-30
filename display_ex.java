import java.util.*;
class negativesalary extends Exception
{
   public negativesalary()
   {
      System.out.println("An exception has occured");
   }
}
 

class display_ex
{
   public static void main(String args [])
   {
      Scanner s=new Scanner(System.in);
      try
  {
     System.out.print("enter your name: ");
     String name=s.next();
     System.out.print("enter your salary: ");
      int salary=s.nextInt();
  
    if(salary<0)
   {
  throw new negativesalary();
   }
}
 catch(negativesalary.e)
{
   System.out.println(" salary is negative  "+e);
 }

}
}
     
