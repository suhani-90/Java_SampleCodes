import java.util.*;
class student
{
   int id;
   String name;
   Scanner s=new Scanner(System.in);
 
   void SetData()
  {
    System.out.println("enter student id :");
     id=s.nextInt();
     System.out.println("enter the name of student: ");
     name=s.next();
    }
    void display()
   {
       System.out.println(" student id : "+id);
         System.out.println(" student name : "+name);

    }
  }
     
 class displaydata
 {
    public static void main(String args[])
   {
      student a=new student();
     
    int i;
  student[]obj;
   obj=new student[5];
   
   for( i=0;i<5;i++) 
  {
   obj[i]= new student();
   
  }
   for( i=0;i<5;i++)
  {
   obj[i].SetData();
   obj[i].display();
   }
} 
}    
      