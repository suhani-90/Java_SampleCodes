import java.util.*;
class vectortest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Vector v=new Vector(5);

    System.out.println("current size"+v.size());
    v.addElement(new Integer(10));
    v.addElement(new Integer(10));
    v.addElement(new Float(4.5));
    v.addElement(new Float(80.90));

    v.addElement("abd");
    v.addElement("SUHA");

    System.out.println("current size"+v.size());
    System.out.println("first"+v.firstElement());
    System.out.println("last"+v.lastElement());
    System.out.println("all elements"+v);
  
     System.out.println("enter element to remove :- ");
     String s=sc.next();
     v.removeElement(5);
     System.out.println("after removal:- "+v);
}
}