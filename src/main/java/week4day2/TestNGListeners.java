package week4day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestNGListeners  implements IAnnotationTransformer,IRetryAnalyzer{
int iMaxRetry = 1;
	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		arg0.setRetryAnalyzer(this.getClass());
		//arg0.setInvocationCount(1);
		//if(! testMethod.getName().equalsIgnoreCase("classnameji")){
		//arg0.setEnabled(false);
	//}
	}

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()&& iMaxRetry < 3) {
			iMaxRetry++;
			System.out.println("test case is re-executing for "+iMaxRetry+" time");
			return true;
		}else {
		return false;
	}
	}
}