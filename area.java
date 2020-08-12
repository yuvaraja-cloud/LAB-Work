/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;
class Rect
{
            int l,b;
}
public class Main
{
            public static void main (String[] args)
            {
                        int a;
                        float b;
                        Scanner s =new Scanner(System.in);
                        Rect rect = new Rect();
                        rect.l=s.nextInt();
                        rect.b=s.nextInt();
                        a=rect.l*rect.b;
                        b=(2*(rect.l+rect.b));
                        System.out.println("Area of Rectangle is : "+a);
                        System.out.println(" the perimeter is :"+b);
            }
}