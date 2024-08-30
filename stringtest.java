import java.util.*;
class stringtest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter password :- ");
    String s=sc.next();

    if(s.equals("SYCO"))
    {
     System.out.println("good");
    }
     else
    {
      System.out.println("wrong");
    }

   StringBuffer sb=new StringBuffer(s);
   System.out.println("reverse is :-  "+sb.reverse());
  
    System.out.println("reverse is :-  "+sb.append("welcome"));
}
}