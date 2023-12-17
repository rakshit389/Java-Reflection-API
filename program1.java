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
    private Student( String name )
    {

    }
}
public class program1 {

    public static void main(String[] args) throws ClassNotFoundException
    {
        
        Class<?> rakshit = Class.forName("Student") ;
        Class<?> prateek = rakshit.getClass() ;
        Class<?> vishal = Student.class ;
        System.out.println(rakshit.getName() );
        System.out.println(vishal.getName());
        Constructor<?>[] construct = rakshit.getDeclaredConstructors() ;
        for( Constructor<?> it : construct )
        {
            System.out.println(it.getName());
            System.out.println(it.getParameterCount() );
        }
    
    }
}

    
