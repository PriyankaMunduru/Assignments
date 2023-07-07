import java.util.Scanner;
class Triangle1
{
    public static void main(String[] args)
    {
        triangle t1=new triangle();
        t1.base=4;
        t1.height=8;
        System.out.println(t1.area());
        System.out.println(t1.length());

    }
}
class triangle
{
    double base,height;
    public double area()
    {
        return 0.5*base*height;
    }
    public double length()
    {
        return 2*base*height;
    }
}
