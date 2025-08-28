package xceptionsEx;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		try
		{
		System.out.println(arr[5]);}
		
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.Exception caught " +e);
        }
            finally
            {
            	System.out.println("program executed ");
            }
	}

}
