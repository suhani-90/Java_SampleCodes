class box
{
 int width,height,depth;
 box(int w,int h,int d)
{
  width=w;
  height=h;
  depth=d;
}
  box()
{
  width=height=depth=0;
}
  box(int len)
{
  width=height=depth=len
}
  void vol()
 {
   vol=width*height*depth;
}
}
class over
   {

   public static void main(String args[])

      {

        box b1=new box(20,30,40);
         box b2=new box();  
          box b3=new box(40);

       b1.vol();
       b2.vol();
       b3.vol();
}
}
                 
             
                 