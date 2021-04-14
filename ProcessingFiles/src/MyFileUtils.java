import com.erdogan.exceptions.FooRuntimeException;

public class MyFileUtils {

	public int subtract10FormlargerNumber(int number)throws FooRuntimeException {
		if(number < 10) {
			throw new FooRuntimeException("The number passed was smaller than 10 ");
		}
		return number -10 ;
	}
	
}
