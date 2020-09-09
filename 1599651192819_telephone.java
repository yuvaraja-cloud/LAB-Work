/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author DELL
 */
public class telephone {
    public static void main(String[] args){
        ArrayList<Double>List=new ArrayList<>();
        System.out.println("The telephone bills are:");
        List.add(120.0);
        List.add(230.0);
        List.add(100.0);
        List.add(100.0);
        List.add(100.0);
        List.add(100.0);
        List.add(50.0);
        List.add(50.0);
        List.add(50.0);
        List.add(50.0);
        List.add(30.0);
        List.add(30.0);
        System.out.println(List);
        Double sum=0.0,avg;
        for(int i=0;i<List.size();i++)
        {
        sum=(Double) (sum+List.get(i));
        }
        avg = sum/List.size();
        System.out.println("The average is:"+avg);
        Collections.sort(List);
        System.out.println("The mimimum bill amount is:"+List.get(0));
        System.out.println("The maximum bill amount is:"+List.get(List.size()-1));
    }
}
            
                
                
     
               
        
        
        
    
    


