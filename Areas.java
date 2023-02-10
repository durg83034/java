import java.io.*;
class Areas
{
    static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));

    public void area(float r)
    {
        double res=0.0;
        res=3.14*r*r;
        System.out.println("Area of Circle : "+res);
    }

    public void area (double s)
    {
        double res=0.0;
        res=s*s;
        System.out.println("Area of Square : "+res);
    }

    public void area (double l, double b)
    {
        double res=0.0;
        res=l*b;
        System.out.println("Area of Rectangle : "+res);
    } 

    public void display ()throws IOException
    {
        System.out.println("Enter your choice :- ");
        System.out.println("1-Circle  ");
        System.out.println("2-Square  ");
        System.out.println("3-Rectangle  ");
        int ch;
        ch=Integer.parseInt(in.readLine());
        getchoice(ch);
    }

    public void getchoice(int ch)
    {
        switch (ch)
        {
            case 1:
                float r=3.5f;
                System.out.println("cal. area of a circle with raddius 3.5  ");
                area(r);
                break;

            case 2:
                double s=4.5;
                System.out.println("cal.area of a square with side 4.5  ");
                area(s);
                break;
            case 3:
                double l=4.5,b=3.5;
                System.out.println("cal. area of a rectangle with length 4.5 and breadth 3.5");
                area(l,b);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public void main()throws IOException
    {
        display();
    }
}