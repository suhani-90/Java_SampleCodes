import java.util.*;
class forloop
{
   public static void main(String args[])
     {
       int num,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        num=s.nextInt();
  
       for(i=2;i<=num;i=i+2)
     {
        System.out.println(i);
     }
          System.out.println("the even numbers between "+num+"are : "+i);
      
 }
}