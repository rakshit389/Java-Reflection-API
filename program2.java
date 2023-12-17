import java.lang.reflect.*;;

class Student
{
    public int marks ;
    private int roll_no ;
    public Student(int a , int b)
    {
        this.marks = 90 ;
        this.roll_no = 41 ;
    }
    private void display()
    {
        System.out.println("Method Invoked");
        System.out.println("Marks :" + this.marks + " " + "Roll No :" + this.roll_no );
    }
}
public class program2 {

    public static void main(String[] args)  
    {
        Student rahul = new Student(90,39) ;

        try
        {
            Class<?> rakshit = Class.forName("Student");
            Class<?> param = null ;
            Method method = rakshit.getDeclaredMethod("display");
            System.out.println(method.getName());
            System.out.println(method.getParameterTypes() );
            System.out.println( method.getReturnType() );
            method.setAccessible(true);
            method.invoke(rahul);

        }
        catch( ClassNotFoundException |  NoSuchMethodException | SecurityException  | IllegalAccessException | InvocationTargetException e )
        {
            System.out.println( e.toString() );
        }
        
    
    }
}

    
