package com.orangehrm.baseclass;
import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakingScreenshot  extends Constants{

	@Test
	public void screenshotTest() throws IOException
	{
		String runMode=eo.getCellData(dataEngine, 0,3,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Skipping screenshot test case");
		}
		sc.captureScrrenshot(driver,scrFolderPath+"AddEmp.png");
	}
}
