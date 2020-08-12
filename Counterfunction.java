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
public class Counterfunction {
     public static void main(String[] args) {
        staticvar obj=new staticvar();
        obj.display();
        staticvar obj1=new staticvar();
        obj1.display();
        staticvar obj2=new staticvar();
        obj2.display();
        obj.display1();
        obj.display1();
        obj.display1();
        
    }

        
}
class staticvar {
    static int i=20;
     int j=30;
     int k=10,l=40;
    void display()
    {

        System.out.println("Resul using static variable");
        i=i+10;
        j=j+10;
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
    void display1()
    {
        System.out.println("Result using non static variable");
        k=k+10;
        l=l+10;
        System.out.println("k="+k);
        System.out.println("l="+l);
        
 
            
    }
    
}

    

