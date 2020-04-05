
package program2;

import static java.lang.Math.sqrt;

public class Program2 {
    public static boolean functionAdd(double a, double b,double c)
    {
        double x=0;
        if(a!=0)
        {
         x= (-b+sqrt(b*b-4*a*c))/2*a;
         System.out.println("X= "+ x);
         return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean functionMinus(double a, double b,double c)
    {
        double x=0;
        if(a!=0)
        {
         x= (-b-sqrt(b*b-4*a*c))/2*a;
         System.out.println("X= "+ x);
         return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
      /* functionAdd(1,5,6);
       functionMinus(1,5,6);*/
              Double v=null;
               System.out.println(v);
    }
    
}
