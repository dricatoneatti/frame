package support;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
	private static String path = "src/test/resources/properties/";

	public String getPropWeb(String valor) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(path + "web.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(valor);
	}
}
