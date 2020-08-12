/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author DELL
 */
public class trueORfalse {
    public static void main(String[] args) {
        argument obj=new argument();
       // obj.majority();
        boolean c=argument.majority(true,false,false);
        if(c==true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
      
    }
    
}
class argument  {
    //boolean a,b,c; 
    static boolean majority(boolean a,boolean b, boolean c)
    {
        if(a==true && b==true)
            return true;
        else if(b==true && c==true)
            return true;
        else if(a==true && c==true)
            return true;
        else 
            return false;
        
    }
}

    

