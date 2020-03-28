package com.testNG_RetryFailedTests_IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			System.out.println("Retrying "+result.getName()+" again and the count is :"+(retryCount+1));
			retryCount++;
			return true;
		}
		return false;
	}
}
