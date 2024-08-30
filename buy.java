import java.util.*;
class item
{
  
 int code,price;
  
  Scanner s=new Scanner(System.in);
  
  void get_data()
 
  {
     System.out.println("enter code  of items:- ");
     code=s.nextInt(); 
     System.out.println("enter price  of items:- ");
    price=s.nextInt(); 
 }
  
    void display()
 
  {
    
     System.out.println(" code:- "+code);       
     System.out.println(" price:- "+price);
  }
    
    
 }
  
  class buy
  {
   public static void main(String args[])
  {
   int i;
   item[]obj;
   obj=new item[5];
   
   for( i=0;i<5;i++) 
  {
   obj[i]= new item();
   
  }
   for( i=0;i<5;i++)
  {
   obj[i].get_data();
   obj[i].display();
  }
   

 }
}          