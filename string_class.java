class para
{
  int num1,num2;
   public para(int x,int y)
   {
      num1=x;
      num2=y;
     }
 void sum_para()
   {
      int sum=num1+num2;
     System.out.println("addition is :"+sum);
}
}

 class display_para
 {
  public static void main(String args[])
  {
     para p=new para(10,20);
    
     p.sum_para();
 }
}
     