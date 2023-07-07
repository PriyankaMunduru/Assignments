import java.util.Scanner;
class Rectangle2
{
    public static void main(String[] args)
    {
        rectangle t1=new rectangle();
        t1.breadth=4;
        t1.length=8;
        System.out.println(t1.area());
        System.out.println(t1.perimeter());

    }
}
class rectangle
{
    double breadth,length;
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return (length*breadth)+2;
    }
}