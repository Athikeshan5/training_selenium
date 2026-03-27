package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	FileInputStream fs;
	FileOutputStream fos;
	Properties prop;
	
	//Read
	public String getPropertyKeyValue(String key) throws IOException {
		fs=new FileInputStream("./src/test/resources/orangehrmCommonData/parameterizaionPropertiesFile.properties");
		//pass the compiler to understand key value pair data
		prop=new Properties();
		prop.load(fs);
		String value=prop.getProperty(key);
		return value;
	}
	
	//write
	public void setPropertyKeyValue(String key,String value) throws IOException {
		prop=new Properties();
		prop.setProperty(key, value);
		fos=new FileOutputStream("D:\\selenium-main\\selenium-main\\FrameworkTesting\\src\\test\\resources\\orangehrmCommonData\\rewrite.properties");
		prop.store(fos, "updated common data");
		fs.close();
		
	}
}
