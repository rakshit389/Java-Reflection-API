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
    public void getter()
    {

    }
    protected void setter()
    {

    }
}
public class program3 {

    public static void main(String[] args)  
    {
        Student rahul = new Student(90,39) ;

        try
        {
            Class<?> rakshit = Class.forName("Student");
            Method[] method = rakshit.getDeclaredMethods();
            for( Method mt : method )
            {
                System.out.println(mt.getName() + " " + mt.getReturnType() + " " + mt.getParameterCount() );
            }

        }
        catch( ClassNotFoundException e )
        {
            System.out.println( e.toString());
        }
        
    
    }
}

    
