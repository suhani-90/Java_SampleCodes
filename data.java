  import java.util.*;
class employee
{
  String name;int id,salary;
  Scanner s=new Scanner(System.in);
  
   void get_data()
  {
     System.out.println("enter name:- ");
     System.out.println("enter id:- ");       
     

    name=s.next();
    id=s.nextInt(); 
   
 }
}
    class salary extends employee
  {
    void get_salary()
   {
     System.out.println("enter salary:");
     salary=s.nextInt();

   }
    void display()
 
  {
    System.out.println(" name:- "+name);
     System.out.println(" id:- "+id);       
     System.out.println(" salary:- "+salary);
  }
 }
  
  class data
  {
   public static void main(String args[])
  {
   int i;
   salary []obj;
   obj=new salary[5];
   
   for( i=0;i<5;i++) 
  {
   obj[i]=new salary();
  }
   for( i=0;i<5;i++)
  {
   obj[i].get_data();
   obj[i].get_salary();
   obj[i].display();
  }
 }
}          