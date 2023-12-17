import java.lang.reflect.*;
 
class Student
{
    public int marks = 89  ;
    private int roll_no = 34 ;
    protected String student_id = "20011582" ;

}
public class program4 {

    public static void main(String[] args)  
    {
        Student rahul = new Student() ;

        Class<?> rakshit = Student.class ;
        try
        { 
            Field[] field = rakshit.getDeclaredFields() ;
            for( Field it : field )
            {
                it.setAccessible(true);
                System.out.println( "Field Name : " + it.getName() + " Value : " + it.get(rahul) );
            }
                    
            Field fld = rakshit.getField("marks");
            fld.set(rahul,10000);
            System.out.println("Modified values : " + fld.get(rahul));

        }
        catch( NoSuchFieldException | IllegalAccessException e )
        {
            System.out.println(e.getMessage());
        }
        



        
    
    }
}

    
