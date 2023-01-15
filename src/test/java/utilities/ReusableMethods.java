package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getScreenshot(WebDriver driver, String name) throws IOException {

        // Screenshot dosya ismi icin suanki tarihi String olarak aliyoruz.
        String date = formatCurrentDate(" yyyy.MM.dd_HH.mm.ss"); // asagida olusturdugumuz methodu kullandik.

        // Screenshot alip file objesine atiyoruz.
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Kaydedilecek dosyanin yolunu belirtiyoruz.
        String target = System.getProperty("user.dir")+ "\\test-output\\screenshot\\"+name+date+".png";

        File targetFile = new File(target);
        FileUtils.copyFile(source,targetFile);

        return target;
    }

    public static String formatCurrentDate(String pattern){

        return new SimpleDateFormat(pattern).format(new Date());
    }
}
