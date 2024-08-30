import java .util.*;
class student
{
 int jpr,mic,rollno;
 float total,avg;
 String name;
 Scanner s=new Scanner(System.in);
 
	void getdata()
	{
	 System.out.println("enter name : ");
	 name=s.next();
	 System.out.println("enrollment no : ");
	 rollno=s.nextInt();
	 System.out.println("enter mic marks: ");
	 mic=s.nextInt();
	 System.out.println("enter jpr marks: ");
	 jpr=s.nextInt();
 	}
	}

		class result extends student
		{
 

		 	void display()
		       {
			total=mic+jpr;
		        avg=total/2;
			System.out.println("name: "+name);
			System.out.println("roll no: "+rollno);
			System.out.println("total: "+total);
			System.out.println("average: "+avg);
		       }
		       }

				class singleinh
				{
				 public static void main(String args[])
				{
					result r=new result();
					r.getdata();
					r.display();


					int i;
   					result[]obj;
   					obj=new result[5];
   
  					 for( i=0;i<5;i++) 
  					{
  					 obj[i]= new result();
 				  
 					}
   					for( i=0;i<5;i++)
  					{
   					obj[i].getdata();
   					obj[i].display();
  					}
  					 
					}
					}
			
		 