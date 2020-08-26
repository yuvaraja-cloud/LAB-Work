
import java.util.Scanner
public class bondprgm {
    public static void main(String[] args){
        bond a=new bond();
        convertiblebond b=new convertiblebond();
        for(int i=0;i<6;i++)
        {
            int c;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the choice 1 for bond and 2 for convertible bond");
            c=obj.nextInt();
            switch(c)
            {
                case 1:
                    a.display();
                    break;
                case 2:
                    b.display();
                    break;
            }
            
        }
    }
    
}
class bond
{
    void display()
    {
        System.out.println("Bond");
    }
}
class convertiblebond extends bond
{
    void display()
    {
        System.out.println("Convertiblebond");
    }
}