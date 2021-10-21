package utils;

import drivers.DriverSingleton;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Utils {
    public static int testCount = 0;
    public static boolean takeScreenshot(){
        File file = ((TakesScreenshot) DriverSingleton.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileCopyUtils.copy(file, new File(Constants.SCREENSHOTS_FOLDER + generateRandomString(Constants.SCREENSHOT_NAME_LENGTH) + Constants.SCREENSHOT_EXTENSION));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private static String generateRandomString(int length){
        String seedChars = "ABCDEFGHIJKLMNOPQRSTWXZYUV";
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        Random random = new Random();
        while (i < length){
            sb.append(seedChars.charAt(random.nextInt(seedChars.length())));
            i++;
        }
        return sb.toString();
    }
}