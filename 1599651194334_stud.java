/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class stud {
    public static void main(String[] args){
        student s1=new student("Sitha","19CSE20",7.8);
        ArrayList<student>List=new ArrayList<>();
        List.add(s1);
        List.add(new student("Asin","19CSE03",6.9));
        List.add(new student("Bhanu","19CSE05",9.1));
        List.add(new student("Aakash","19CSE01",9.7));
        List.add(new student("Fahad","19CSE07",5.8));
        List.add(new student("Madhu","19CSE11",8.6));
        List.add(new student("Reema","19CSE17",7.5));
        List.add(new student("Deva","19CSE06",7.4));
        List.add(new student("Moni","19CSE12",9.5));
        List.add(new student("Niviya","19CSE13",6.6));
        List.add(new student("Aasiya","19CSE02",8.6));
        List.add(new student("Aswanth","19CSE04",4.6));
        List.add(new student("Krithi","19CSE09",7.9));
        List.add(new student("Keerthi","19CSE08",6.9));
        List.add(new student("Keerthika","19CSE10",3.9));
        List.add(new student("Rithi","19CSE14",9.9));
        List.add(new student("Rekha","19CSE15",7.9));
        List.add(new student("Lavanya","19CSE19",2.9));
        List.add(new student("Leena","19CSE18",8.9));
        List.add(new student("Rama","19CSE16",6.9));
        List.add(new student("Tamil","19CSE22",6.9));
        List.add(new student("Yass","19CSE21",6.9));
        Collections.sort(List,new namesort());
        System.out.println(List);
        
        
        
    }
    
}
class student
{
    String name,roll;
    Double cgpa;
    student(String n,String r,Double c)
    {
        name=n;
        roll=r;
        cgpa=c;
    }
    public String toString()
    {
        return "\nStudent Name:"+name+"\tRoll no:"+roll+"\tCGPA:"+cgpa;
    }
}
class namesort implements Comparator<student>
{
  public int compare(student s1,student s2)
  {
      System.out.println(s2.name+"--------"+s1.name);
      return s1.name.compareTo(s2.name);
  }
}