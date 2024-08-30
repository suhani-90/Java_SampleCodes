import java.util.*;
class LIBRARY
{
 String name;
  int rollno,semester;

 public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   System.out.println("ENTER YOUR NAME :- ");
    name=s.next();
   System.out.println("ENTER YOUR ENROLLMENT NUMBER :- ");
    rollno=s.nextInt();
   System.out.println("IN WHICH SEMESTER YOU ARE STUDYING :- ");
    semester=s.nextInt();
   System.out.println("WHICH SUBJECT BOOK YOU WANT :- ");
    subject=s.next();

   String subject=s.next();


  switch (subject)
 {
  case "jpr": 
    System.out.println("BOOKS AVAILABLE:HEAD FIRST WITH JAVA"/t"Core Java Volume I ");
  break;

  case "mic":
    System.out.println("BOOKS AVAILABLE:Microprocessors and Its Interfacing"/t"Core Java Volume I ");
break;

case "dcc":
    System.out.println("BOOKS AVAILABLE:HEAD FIRST WITH JAVA"/t"Core Java Volume I ");
break;

case "gad":
    System.out.println("BOOKS AVAILABLE:HEAD FIRST WITH JAVA"/t"Core Java Volume I ");
break;


case "sen":
    System.out.println("BOOKS AVAILABLE:HEAD FIRST WITH JAVA"/t"Core Java Volume I ");
break;

case "maths":
    System.out.println("BOOKS AVAILABLE:HEAD FIRST WITH JAVA"/t"Core Java Volume I ");
break;



default:
    System.out.println("INVALID SUBJECT ");
break;
}
}
}