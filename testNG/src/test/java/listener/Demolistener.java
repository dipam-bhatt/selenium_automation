package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Demolistener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}
@Override
public void onTestFailure(ITestResult result) {
	System.out.println("test failed");
}
@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("test success");
}

@Override
public void onFinish(ITestContext context) {
	System.out.println("test finished");
}
}
