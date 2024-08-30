import java.util.*;
class employee
{
  String name;
  int id,salary;
  
  Scanner s=new Scanner(System.in);
  
  void get_data()
 
  {
     System.out.println("enter name id and salary of employee:- ");
     

    name=s.next();
    id=s.nextInt(); 
    salary=s.nextInt(); 
 }
  
    void display()
 
  {
    System.out.println(" name:- "+name);
     System.out.println(" id:- "+id);       
     System.out.println(" salary:- "+salary);
  }
 }
  
  class sam
  {
   public static void main(String args[])
  {
   int i;
   employee[]obj;
   obj=new employee[5];
   
   for( i=0;i<5;i++) 
  {
   obj[i]= new employee();
  }
   for( i=0;i<5;i++)
  {
   obj[i].get_data();
   obj[i].display();
  }
 }
}          