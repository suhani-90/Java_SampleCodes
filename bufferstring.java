class bufferstring
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the string: ");
    String s=sc.next();


       StringBuffer b=new StringBuffer(s);

       System.out.println(b.length());
       System.out.println(b.append("hello"));

      }
    }