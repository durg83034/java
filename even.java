//finding even and odd number
class even
{
    public static void main()
    {
       int n=100;
     System.out.println("Enter number 1to"+n+"\n");
     for(int i=100;i<=n;i++)  
     //n=i;
     if( i%2==0 ) {
     //n=n%2;
    //int d=n;
        System.out.println("Even number "+i+"\n");}
        else
        if(i%2!=0)
        System.out.println("Odd number "+i);
    }
}
