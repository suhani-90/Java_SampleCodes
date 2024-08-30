class para
{
 int n1,n2,sum;
 para(int x,int y)
{
 System.out.println("this is parameterized constructor");
  n1=x;
  n2=y;
}
  void calc()
{
  sum=n1+n2;
  System.out.println("addition:-  "+sum);
}
}
class pdemo
   {

   public static void main(String args[])

      {

        para p1=new para(20,60);
   
         p1.calc();
                 
                
                 }
                }  