import java.util.*;
class data
{
  String name;
  int rollno;
  Scanner s=new Scanner(System.in);
 void getdata()
 {
  System.out.print("PLEASE ENTER YOUR NAME: ");
     name=s.next();
    System.out.print("ENTER YOUR ROLL NO: ");
     rollno=s.nextInt();
   System.out.println(" ");//line seprator
 }
}
   
 

class books extends data
{
   public void getbook()
 {
   
   System.out.print("WHICH SUBJECT BOOK YOU WANT :- ");
   String subject=s.next();
    

  switch (subject)
 {
  case "java": 
    System.out.println("BOOKS AVAILABLE: ");
    System.out.println("Core Java Volume I – Fundamentals. ");
     System.out.println("Java: A Beginner's Guide ");
     System.out.println("Java - The Complete Reference ");
     System.out.println("Head First Java. ");
     System.out.println("Head First Object-Oriented Analysis Design. ");
  break;

  case "mic":
     System.out.println("BOOKS AVAILABLE:");
    System.out.println("Microprocessors for MSBTE I Scheme (IV - Comp. - 22415) ");
     System.out.println("MICROPROCESSORS AND MICROCONTROLLERS 2/E ");
     System.out.println("Microprocessors – For Diploma in Computer Engineering  ");
   break;

 case "dcc":
    System.out.println("BOOKS AVAILABLE: ");
    System.out.println("Data Communications and Networking  4th Edition ");
     System.out.println("Computer Networks 5th Edition ");
     System.out.println("DATA COMMUNICATION ESSENTIALS AND NETWORKING ");
break;

case "gad":
   System.out.println("BOOKS AVAILABLE: ");
   
     System.out.println("Programming In Vb .Net ");
     System.out.println("Beginning VB.NET ");
break;


case "sen":
    System.out.println("BOOKS AVAILABLE: ");
    System.out.println("Software Engineering for MSBTE I Scheme IV - Comp. - 22413 ");
     System.out.println("Software Engineering  Sem 4 Computer MSBTE Diploma");
     System.out.println("Software Engineering New Approach");
break;

case "maths":
     System.out.println("BOOKS AVAILABLE: ");
    System.out.println("Mathematical Foundations of Computer Science First Edition ");
     System.out.println("FUNDAMENTAL MATHEMATICS FOR COMPUTER APPLICATIONS ");
     System.out.println("Computers In Science And Mathematics -Scitus by Boris Waxweiler , Scitus Academics ");
break;



default:
    System.out.println("sorry!books unavailable currently");
break;
}
}
}


class issue extends books
{
  void getissue()
 {
    System.out.println(" ");//line seprator
   System.out.println("DO YOU WANT TO ISSUE ANY OF THESE BOOK :- ");
   String issue=s.next();
  
     if(issue.equals("yes"))
    {
     System.out.println("enter the  book name you want to issue:- ");
        String bookname=s.next();
     System.out.println(" ");//line seprator
     System.out.println(" ");//line seprator
     System.out.println("BOOK ISSUED SUCESSFULLY ");
     System.out.println("NAME:"+name);
     System.out.println("ENROLLMENT NUMBER: "+rollno);
    }
     else
    {
     System.out.println(" NO BOOK ISSUED ");
    }
 }
}


class library
{
  public static void main(String args[])
 {
   issue b=new issue();
   b.getdata();
   b.getbook();
   b.getissue();
 }
}