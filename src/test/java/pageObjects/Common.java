package pageObjects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	static WebDriver driver = null;

	public static void fnCloseBrowser() {
		driver.close();
	}

	public static void fnWriteLogs(String LogComment) throws ParseException {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
			simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			String currentTime = simpleDateFormat.format(new Date());

			FileWriter myWriter = new FileWriter("./Report/Logs.txt", true);
			myWriter.append("[ " + currentTime + " ]  " + LogComment + "\n");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void fnTakeScreenshot(String FileName) throws IOException {
		try {
		File File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(File, new File("./Report/" + FileName + ".jpeg"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
