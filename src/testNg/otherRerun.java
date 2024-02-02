package testNg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class otherRerun implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation a, Class arg1, Constructor arg2, Method arg3) {
		// TODO Auto-generated method stub
		IRetryAnalyzer retry = a.getRetryAnalyzer();
		a.setRetryAnalyzer(reRun.class);
	}
}


//IAnnotationTransformer - if 