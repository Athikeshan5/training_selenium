package Demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMObjectRepository.LoginPage;

public class ReadingFromcsvfile extends BaseClass{
@Test
public void demo() throws IOException {
	LoginPage lp=new LoginPage(driver);
	BufferedReader br=new BufferedReader(new FileReader("./src/test/resources/orangehrmTestScriptData/csvfile.csv"));
//in path we use . and remove projectname it must start from src
String line="";
//String line = br.readLine();  it only read first line and the cursor move to nextline so in loop it will get next data
while((line=br.readLine())!=null) {//it will read every line because of loop
	String data[]=line.split(",");
	String key=data[0];
	String value=data[1];
	System.out.println(key+" "+value);
}

}
}
