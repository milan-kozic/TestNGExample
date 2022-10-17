package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    private int numberOfPassedTests = 0;
    private int numberOfFailedTests = 0;
    private int numberOfSkippedTests = 0;

    public void onStart(ITestContext context) {

        System.out.println("\n.............................................");

        System.out.println("\nName of suite: " + context.getSuite().getName());

        System.out.println("\n.............................................\n\n");

    }

    public void onFinish(ITestContext context) {

        System.out.println("\n.............................................");

        System.out.println("\nNumber of passed tests: " + numberOfPassedTests);
        System.out.println("\nNumber of failed tests: " + numberOfFailedTests);
        System.out.println("\nNumber of skipped tests: " + numberOfSkippedTests);

        System.out.println("\n.............................................\n\n");

    }

    public void onTestStart(ITestResult testResult) {

        System.out.println("\n------------------------------------------");

        System.out.println("\nStarting test - " + testResult.getName());

    }


    public void onTestSuccess(ITestResult testResult) {

        System.out.println("\nTest - " + testResult.getName() + " - PASSED!");

        System.out.println( totalTestRun(testResult) );

        System.out.println("\n------------------------------------------");

        numberOfPassedTests++;

    }

    public void onTestFailure(ITestResult testResult) {

        System.out.println("\nTest - " + testResult.getName() + " - FAILED!");

        System.out.println( totalTestRun(testResult) );

        System.out.println("\n------------------------------------------");

        numberOfFailedTests++;

    }
    
    public void onTestSkipped(ITestResult testResult) {

        System.out.println("\nTest - " + testResult.getName() + " - SKIPPED!");

        System.out.println( totalTestRun(testResult) );

        System.out.println("\n------------------------------------------");

        numberOfSkippedTests++;
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    private String totalTestRun(ITestResult testResult){

        long testRunningTime = testResult.getEndMillis() - testResult.getStartMillis();

        return  "\nTest runnint time: " + testRunningTime + " ms";

    }
}
