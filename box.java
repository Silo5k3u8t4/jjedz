class boX
{
int L,B,H;
boX(int p1,int p2,int p3)
{
L=p1;B=p2;H=p3;
}
void displayLBH()
{
System.out.println("length of the box is:"+L);
System.out.println("breath of the box is:"+B);
System.out.println("height of the box is:"+H);
}
int calcArea()
{
int ar;
ar=2*(L*H)+2*(L*B)+2*(B*H);
return ar;
}
int calcvolume()
{
return L*B*H;
}
}
class mainbox
{
public static void main(String[] args)
{
boX B=new boX(15,10,20);
B.displayLBH();
System.out.println("the area ="+B.calcArea());
System.out.println("the volume ="+B.calcvolume());
}
}




