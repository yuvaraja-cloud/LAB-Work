/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class complex{
     Scanner s=new Scanner(System.in);
        int r1=s.nextInt();
        int c1=s.nextInt();
        int r2=s.nextInt();
        int c2=s.nextInt();
        void arith(){
           System.out.println("add:"+(r1+r2)+"+i"+(c1+c2));
        System.out.println("sub:"+(r1-r2)+"+i"+(c1-c2));
        System.out.println("mul:"+(r1*r2)+"+i"+(c1*c2));
        System.out.println("divi:"+(r1/r2)+"+i"+(c1/c2));   
        }
    
}
public class Main
{
   public static void main(String []args){
       complex obj=new complex();
       obj.arith();
       
      
     }
}
