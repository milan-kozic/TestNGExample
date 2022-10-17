package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// Implementation of method retry() from interface IRetryAnalyzer
public class RepeatTests implements IRetryAnalyzer {

    private int numberOfAttempts = 0;
    private static int MAX_NUMBER_OF_ATTEMPTS = 3;

    public boolean retry(ITestResult testResult){

        if (!testResult.isSuccess()) {
            if(numberOfAttempts < MAX_NUMBER_OF_ATTEMPTS){
                numberOfAttempts++;
                return true;
            }
        }
        return false;
    }

}
