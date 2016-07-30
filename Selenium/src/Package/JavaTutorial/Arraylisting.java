package Package.JavaTutorial;

import java.util.ArrayList;
import java.util.List;

public class Arraylisting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> AL= new ArrayList<>();
AL.add("Selenium");
AL.add("WebDriver");
AL.add("Appium");
AL.add("Protractor");
AL.add("AngularJS");
AL.add("Selenium");
System.out.println(AL.size());
for(int i=0;i<AL.size();i++)
{
System.out.println(AL.get(i));	
}

	}

}
