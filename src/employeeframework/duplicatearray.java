package employeeframework;

public class duplicatearray 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"1", "2", "1", "2", "4", "6", "8"};
 
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }    
}