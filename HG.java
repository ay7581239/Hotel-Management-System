import java.util.Scanner; 
import java.io.*;
class HG 
{
    //++++++++++++++++++++++++++++++++++++++++++++++++  MAIN FUNCTION  ++++++++++++++++++++++++++++++++++++++++++++++++
    public static void main(String[] args) 
    {
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t       #------------------------#");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    *..| HOTEL MANAGMENT SYSTEM | .. *");
        System.out.println("\t\t\t\t\t\t\t\t\t\t       #------------------------#");
        System.out.println("\n");
        pin();
    }

    
    public static void start1()
    {
        String n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t       KINDLY ENTER YOUR NAME :-");
        n1=sc.nextLine();
        n2=n1.toUpperCase();
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t       HELLO ");
        System.out.print(n2);
        System.out.print(" ,ENTER 4 DIGIT SECURITY PIN :-");

    }


    public static int start2()
    {
        start1();
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("\n\n");
        return a;
    }


    public static void pin()
    {   
        Scanner sc=new Scanner(System.in);
        int z=start2();
        if(z==2022)
        {   
            
            System.out.println("\t\t\t\t\t\t\t\t\t\t               WELCOME..! ");
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\t\t\t       THANK YOU FOR LOGGING INN..");
            System.out.println();
            System.out.println("\n\n");

            for(int i=1;i<=97;i++)
		    {
                System.out.print("- ");
            }
            System.out.println();
            for(int i=1;i<=97;i++)
		    {
                System.out.print("* ");
            }
                System.out.println();	
            for(int i=1;i<=97;i++)
		    {
                System.out.print("- ");
            }
            System.out.println();
            System.out.println("||\t\t\t\t\t\t\t\t\t\t\t          *   *   *            \t\t\t\t\t\t\t\t\t\t||");
            System.out.println("||\t\t\t\t\t\t\t\t\t\t\t      *               *        \t\t\t\t\t\t\t\t\t\t||");
            System.out.println("||\t\t\t\t\t\t\t\t\t\t\t  *                       *    \t\t\t\t\t\t\t\t\t\t||");	
            System.out.println("||\t\t\t\t\t\t\t\t\t\t      *     H O T E L  G A L A X Y    * \t\t\t\t\t\t\t\t  \t||");
            System.out.println("||\t\t\t\t\t\t\t\t\t\t\t  *                       *    \t\t\t\t\t\t\t\t\t\t||");
            System.out.println("||\t\t\t\t\t\t\t\t\t\t\t      *               *        \t\t\t\t\t\t\t\t\t\t||");
            System.out.println("||\t\t\t\t\t\t\t\t\t\t\t          *   *   *            \t\t\t\t\t\t\t\t\t\t||");
            for(int i=1;i<=97;i++)
		    {
                System.out.print("- ");
            }
            System.out.println();
            for(int i=1;i<=97;i++)
		    {
                System.out.print("* ");
            }
            System.out.println();
            for(int i=1;i<=97;i++)
		    {
                System.out.print("- ");
            }
            System.out.println("\n");	
            
            System.out.print("\t\t\t\t\t\t\t\t\t\t       Press any no. to open MAIN MENU :-");
            int ch;
            ch=sc.nextInt();
            if(ch!=0)
                mainmenu();
            else
                mainmenu();

        }
        else
        {
            System.out.print("\t\t\t\t\t\t\t\t\t\t        OOPS!!! You Entered Wrong Pin\n");
            System.out.print("\t\t\t\t\t\t\t\t\t\t        Try agin ");
            System.out.println();
            start2();
        }
    }


    public static void mainmenu()
    {   
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t    *----------------------------------*");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |======== M A I N  M E N U ========| ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    *----------------------------------*");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    --------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |  (1) | Room Booking Menu            |"); 
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |  (2) | Display All Booking Details  |"); 
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |  (3) | Restaurant Service           |"); 
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |  (4) | Exit                         |"); 
        System.out.println("\t\t\t\t\t\t\t\t\t\t    --------------------------------------");
        System.out.println("\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t       Enter your Choice :- ");
        ch=sc.nextInt();
        if(ch==1)
            book();
        else if(ch==2)
            details();
        else if(ch==3)
            restaurant();
        else if(ch==4)
            close();


    }


    public static void book()
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            FileWriter fw=new FileWriter("rooms.txt",true);
            BufferedWriter b=new BufferedWriter(fw);
            String name,add,mob,email,cin,cout,nday,rno,rcharge; 
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Customer's Name:- ");
            name=sc.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Customer's Address:- ");
            add=sc.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Mobile No.:- ");
            mob=sc.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Email Id:- ");
            email=sc.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Check In Date (dd/mm/yy):- ");
            cin=sc.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Check Out Date (dd/mm/yy):- ");
            cout=sc.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    No. of Days:- ");
            nday=sc.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Room no.:- ");
            rno=sc.nextLine();
            System.out.println("\t\t\t\t\t\t\t\t\t\t  Room Charge= Rs.2000 * no. of days ");
            System.out.println();
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Room Charge:- ");
            rcharge=sc.nextLine();
            b.write("==> [Customer's Name:- "+name+" ] [Customer's Address:- "+add+" ] [Mobile No.:- "+mob+" ] [Email Id:- "+email+" ] [Check In:- "+cin+" ] [Check Out:- "+cout+" ] [No. of Days:- "+nday+" ] [Room no.:- "+rno+" ] [Room Charge.:- "+rcharge+" ]");
            b.newLine();
            b.close();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   *---------------------*");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   | YOUR DATA IS SAVED  |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   *---------------------*");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    Thanks for Booking..");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t  Press 1 for Resuming Room Booking");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  Press 2 for MAIN MENU");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t    Enter your Choice:-");
        int c;
        c=sc.nextInt();
        if(c==1)
        {
            book();
        }
        else
        {
            mainmenu();
        }
    }


    public static void details()
    {   
        try
        {
            Scanner sc=new Scanner(System.in);
            FileInputStream f=new FileInputStream("rooms.txt");
            int i;
            while((i=f.read())!=-1)
            {   System.out.print((char)i);
            }
            f.close();
        

        System.out.print("\t\t\t\t\t\t\t\t\t\t       Press any no. to open MAIN MENU :-");
        int c;
        c=sc.nextInt();
        if(c!=0)
            mainmenu();
        else
            mainmenu();
        }
        
         catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }
    

    public static void restaurant()
    {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t   #======== R E S T A U R A N T  S E R V I C E ========# ");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t   ---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t   | S.No. | ITEMS        | RATE |      | S.No. | ITEMS         |RATE  |" );
        System.out.println("\t\t\t\t\t\t\t\t   ---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t   |  1    | Coffee       | 20   |      |  11   | Chapati       | 10   |");
        System.out.println("\t\t\t\t\t\t\t\t   |  2    | Tea          | 10   |      |  12   | Matar Paneer  | 120  |");
        System.out.println("\t\t\t\t\t\t\t\t   |  3    | Cold Drink   | 50   |      |  13   | Zeera Rice    | 50   |");
        System.out.println("\t\t\t\t\t\t\t\t   |  4    | Noodles      | 120  |      |  14   | Fried Dal     | 120  |");
        System.out.println("\t\t\t\t\t\t\t\t   |  5    | Masala Dosa  | 150  |      |  15   | Chicken Curry | 150  |");
        System.out.println("\t\t\t\t\t\t\t\t   |  6    | Chola Bhature| 120  |      |  16   | Egg Curry     | 120  |");
        System.out.println("\t\t\t\t\t\t\t\t   |  7    | Special Thali| 250  |      |  17   | Maharaja Thali| 300  |");
        System.out.println("\t\t\t\t\t\t\t\t   |  8    | Samosa       | 20   |      |  18   | Non-Veg Thali | 300  |");
        System.out.println("\t\t\t\t\t\t\t\t   |  9    | Burger       | 120  |      |  19   | Gulab Jamun   | 20   |");
        System.out.println("\t\t\t\t\t\t\t\t   |  10   | Pizza        | 150  |      |  20   | Chocolate     | 20   |");
        System.out.println("\t\t\t\t\t\t\t\t   |  0    | No Booking   |  -   |      |  -    |     -         |  -   |");
        System.out.println("\t\t\t\t\t\t\t\t   ---------------------------------------------------------------------");
        System.out.println("\n");
        dish();


    }

    public static void dish()
    {
        int a=0,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t\t\t       Enter the total numbers of items you want to order :-");
        ch=sc.nextInt();
        int s=0;
        for(int i=1;i<=ch;i++)
        {
            int item;
            System.out.println();
            System.out.print("\t\t\t\t\t\t\t\t\t\t Enter the S.No. of Item :");
            item=sc.nextInt();
            System.out.println("\t\t\t\t\t\t\t\t\t\t  ---------------------------");
            if (item==1 || item==8 || item==19 || item==20)
            {
                a=20;
                System.out.print("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else if(item==4 || item==6 || item==9 || item==12 || item==14 || item==16)
            {
                a=120;
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else if(item==2 || item==11)
            {
                a=10;
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else if( item==3 || item==13)
            { 
                a=50;
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else if( item==5 || item==10 || item==15)
            { 
                a=150;
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else if( item==7)
            { 
                a=250;
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else if( item==17 || item==18)
            {
                a=300;
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else if( item==0)
            {
                a=0;
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs."+a+"/-  ");
            }
            else
            {    
                System.out.println("\t\t\t\t\t\t\t\t\t\t  Amount = Rs.0 /-  ");
            } 
        
        s=s+a;
        }

        System.out.println("\t\t\t\t\t\t\t\t\t\t  ---------------------------");
        
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  *---------------------------*");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  |  TOTAL BILL= Rs. " +s +"      |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  *---------------------------*");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t  THANKS FOR ORDERING");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t  Press 1 for Ordering more Items");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  Press 2 for MAIN MENU");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t    Enter your Choice:-");
        int c;
        c=sc.nextInt();
        if(c==1)
        {
            dish();
        }
        else
        {
            mainmenu();
        }

    }

    public static void close()
    {
        System.exit(0);
    }
}
