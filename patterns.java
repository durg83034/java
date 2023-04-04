//WAP to print patterns in java.
import java.util.*;//package line
class patterns
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        while(b){  //for menu
            System.out.println("             MENU  ");
            System.out.println(" -----------******----------- ");
            System.out.println(" 1:- Triangle ");
            System.out.println(" 2:- Left Handed Triangle ");
            System.out.println(" 3:- Rectangle ");
            System.out.println(" 4:- Pyramid ");
            System.out.println(" 5:- Dimond ");
            System.out.println(" 6:- Parscal's ");
            System.out.println(" 7:- Exit ");
            System.out.println(" ----------------------------- ");
            System.out.println(" ");
            System.out.print(" Enter Choice :- ");
            int ch=sc.nextInt();//for choice
            switch(ch) //starting switch case
            {
                case 1:
                    {  System.out.println(" Enter Value  "); //entering value for rows
                        int n=sc.nextInt();
                        System.out.println(" TRIANGLE ");                        
                        for(int i=0;i<=n;i++)
                        {
                            for(int j=0;j<=i;j++){
                                System.out.print(" *");} //printing star in triangle
                            System.out.println();
                        }
                        System.out.println(" ------------------------------------ ");
                        System.out.println("");
                    } break; //case1 close 
                case 2:
                    {  System.out.println(" Enter Value ");
                        int n=sc.nextInt();
                        System.out.println("LEFT HAND TRIANGLE ");
                        for(int i=n;i>=0;i--)
                        {
                            for(int k=0;k<=i;k++)
                                System.out.print(" "); //for space 
                            for(int j=0;j<=(n-i);j++){
                                System.out.print("*");}
                            System.out.println();}
                        System.out.println(" --------------------------------- ");
                        System.out.println("");
                    } break;     //case 2 close
                case 3:
                    { System.out.println(" Enter Value ");
                        int n=sc.nextInt();
                        System.out.println("RECTANGLE");
                        for(int i=0;i<=n-2;i++)
                        {
                            for(int j=0;j<=n+5;j++){
                                System.out.print(" "+"*");} //space and printing star in rectangle
                            System.out.println();
                        }
                        System.out.println(" --------------------------------- ");
                        System.out.println("");
                    }
                    break; //case3 close
                case 4:
                    {System.out.println(" Enter Value ");
                        int n=sc.nextInt(); // reading value
                        System.out.println("PYRAMID");
                        for (int i=0; i<n; i++)  
                        { for (int j=n-i; j>1; j--) 
                            { 
                                System.out.print(" "); //for space
                            }  
                            for (int j=0; j<=i; j++ ) 
                            { 
                                System.out.print("* ");
                            } 
                            System.out.println();
                        } 
                        System.out.println(" --------------------------------- ");
                        System.out.println("");
                    }
                    break; //case4 close
                case 5:
                    {   System.out.println(" Enter Value ");
                        int n=sc.nextInt();
                        System.out.println("DIMONAD ");
                        for (int i= 1; i<=n ; i++)//upper part looping
                        {
                            for (int j=i; j<n ;j++)            
                            {
                                System.out.print(" ");//space
                            }
                            for (int k=1; k<=i;k++) { 
                                System.out.print(" "+"*"); }//space and printing star 
                            System.out.println(" "); }
                        for (int i=n; i>=1; i--) //down part looping
                        {
                            for(int j=i; j<=n;j++)
                            {
                                System.out.print(" "); //space
                            }
                            for(int k=1; k<i ;k++) 
                            {
                                System.out.print(" "+"*"); //space and printing star
                            }
                            System.out.println(" ");//space 
                        }                    
                        System.out.println(" --------------------------------- ");
                        System.out.println("");
                    }break; //case5 close
                case 6:
                    {   System.out.println(" Enter Value ");
                        int n=sc.nextInt();
                        System.out.println(" RIGHT PARSCAL'S");        
                        for (int i= 0; i<=n-1 ; i++)//first half looping right hand
                        {
                            for (int j=0; j<=i; j++) 
                            { 
                                System.out.print("*"+ " ");  //printing star and space 
                            }
                            System.out.println(""); } 
                        for (int i=n-1; i>=0; i--) //second half looping right hand
                        {
                            for(int j=0; j <= i-1;j++)
                            {
                                System.out.print("*"+" "); //printing star and space
                            }
                            System.out.println("");
                        }
                        System.out.println(" ");
                        System.out.println(" LEFT PARSCAL'S");
                        for (int i= 1; i<=n ; i++) //first half looping for left hand
                        {
                            for (int j=i; j<n+1 ;j++)            
                            {
                                System.out.print(" ");
                            }
                            for (int k=1; k<=i;k++) { 
                                System.out.print("*"); } //printing star
                            System.out.println(""); }
                        for (int i=n; i>=1; i--)  //second half looping for left hand 
                        {
                            for(int j=i; j<=n+1;j++)
                            {
                                System.out.print(" ");
                            }
                            for(int k=1; k<i ;k++) 
                            {
                                System.out.print("*");  //printing star
                            }
                            System.out.println("");

                        }
                        System.out.println(" --------------------------------- ");
                        System.out.println("");
                    } break; //case6 close
                case 7:
                    {
                        int exit; //ending program
                        b=false;
                        System.out.println(" ****** THANK YOU ******");
                        System.out.println(" -------------------------------- ");
                    } //case 7 close
                    break;
                default:
                    System.out.println();//end program
                    break; //default close or break.
            } //switch()
        } //while()
    } //public static void main()
} //class