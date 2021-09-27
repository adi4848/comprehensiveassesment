package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PROPERTYFILEREADER {
	public static Properties loadFile() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\Properties.properties");
		prop.load(fis);
		return prop;
	}

}
