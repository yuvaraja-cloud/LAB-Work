importjava.util.scanner;
public class Shapesconvertor {
    public static void main(String[] args){
    circle c=new circle();
    c.area();
    c.circumference();
    square s=new square();
    s.area();
    s.lengthofdiagonal();
    sphere s1=new sphere();
    s1.surface();
    s1.vol();
    }
}
class shape
{
    double r,area,circumference,length,surfarea,vol;
    shape()
    {
        r=1.2;
    }
}
class circle extends shape
{
    public void area()
    {
        System.out.println("Calculating area and circumference of circle\n");
        area=Math.PI*r*r;
        System.out.println("The area of circle is:"+area+"sq units");
    }
    public void circumference()
    {
        circumference=2*Math.PI*r;
        System.out.println("The circumference of circle is:"+circumference+"cm\n===================");
    }
}
class square extends shape
{
    public void area()
    {
        System.out.println("Calculating area and diagonal length of a square\n");
        area=4*r;
        System.out.println("The area of square is:"+area+"sq units");
    }
    public void lengthofdiagonal()
    {
        length=1.414*r;
        System.out.println("The length of diagonal is :"+length+"cm\n====================");
    }
}
class sphere extends shape
{
    public void surface()
    {
        System.out.println("Calculating surface area and volume of sphere\n");
        surfarea=4*Math.PI*r*r;
        System.out.println("The surface area of sphere is:"+surfarea+"sq units");
    }
    public void vol()
    {
        vol=(4/3)*(Math.PI*(r*r*r));
        System.out.println("The volume of sphere"+vol+"cubic units");
    }
}

