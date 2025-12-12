import java.util.*;

class ExceptionDemo6
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1=0 ,  iNo2=0 ,iAns = 0;
        

        System.out.println("Enter firest number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number :");
        iNo2 = sobj.nextInt();
        
        try
        {
           System.out.println("Inside try Block");
           iAns = iNo1 / iNo2;
        }
        //Error due to catch sequence
        catch(Exception eobj)     //generic catch
        {
            System.out.println("Inside generic catch ");
        }

        
        catch(ArithmeticException aobj)      //specific catch
        {
            System.out.println("Inside catch  Block");
            System.out.println(aobj);

        }
       

        System.out.println("Division is :"+iAns);



    }
}