import java.io.*;

import java.util.*;

class operator

{

    public static void main(String args[])

    {

        int ch,a,b;

        Scanner in=new Scanner (System.in);

        for(;;)

        {

            System.out.println("ARITHMETIC OPERATIONS");

            System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS\n6.EXIT\n");

            System.out.println("ENTER YOUR CHOICE:");

            ch=in.nextInt();

            switch(ch)

            {

                case 1:

                    System.out.println("ENTER TWO NUMBERS:");

                    a=in.nextInt();

                    b=in.nextInt();

                    System.out.println("\nSUM OF 2 NUMBERS IS:"+(a+b));

                    break;

                case 2:

                    System.out.println("ENTER TWO NUMBERS:");

                    a=in.nextInt();

                    b=in.nextInt();

                    System.out.println("\nSUBTRACTION OF 2 NUMBERS IS:"+(a-b));

                    break;

                case 3:

                    System.out.println("ENTER TWO NUMBERS:");

                    a=in.nextInt();

                    b=in.nextInt();

                    System.out.println("\nMULTIPLICATION OF 2 NUMBERS IS:"+(a*b));

                    break;

                case 4:

                    System.out.println("ENTER TWO NUMBERS:");

                    a=in.nextInt();

                    b=in.nextInt();

                    System.out.println("\nDIVISION OF 2 NUMBERS IS:"+(a/b));

                    break;

                case 5:

                    System.out.println("ENTER TWO NUMBERS:");

                    a=in.nextInt();

                    b=in.nextInt();

                    System.out.println("\nMODULUS OF 2 NUMBERS IS:"+(a%b));

                    break;

                case 6:

                    System.exit(0);

                    break;

                default:

                    System.out.println("\nYOUR STATEMENT HAS NOT BEEN VALID");

                    break;

            }

        }

    }

}

 