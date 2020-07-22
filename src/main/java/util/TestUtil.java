package util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.subispeed.base.TestBase;

public class TestUtil extends TestBase {

	
	public void screenshot() {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		String destination = currentDir+"/shots/"+".png";
		try {
		FileUtils.copyFile(src, new File(destination));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
