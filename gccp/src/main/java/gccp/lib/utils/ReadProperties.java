package gccp.lib.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;



public class ReadProperties {
	static String configfilename = "config.properties";
	static String objectfilename = "\\\\USHOUHOME01\\devalbr\\new_projects\\gccp\\src\\main\\java\\gccp\\data\\objectmap.properties";
	static Properties prop = new Properties();
	static Properties obj = new Properties();
	static InputStream input = null;
	static HashMap<String, String> properties = new HashMap<String, String>();
	static HashMap<String, String> obects = new HashMap<String, String>();

	/**********************************************************************************************************
	 * @readProperties method will read properties from a file and returns
	 *                 hashmap object.
	 * 
	 * @return
	 * @throws IOException
	 ***********************************************************************************************************/
	
	public  HashMap<String, String> readProperties() throws IOException {

		try {
			prop.load(new FileInputStream(configfilename));

			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				properties.put(key, value);
			}
		} catch (Exception e) {
			System.out.println("Unable to iterate the ");
		}
		return properties;
	}

	/*******************************************************************************************************
	 * ReadObject method will return the object repository as HashMap.
	 * 
	 * 
	 * @return
	 * @throws IOException
	 *******************************************************************************************************/
	
	public static HashMap<String, String> readObjectMap() throws IOException {

		try {
			obj.load(new FileInputStream(objectfilename));
			
			//obj.load(Properties.class.getClassLoader().getResourceAsStream(objectfilename));
		//	FileInputStream fis = new FileInputStream(objectfilename);
			//obj.load(fis);
			Enumeration<?> e = obj.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = obj.getProperty(key);
				obects.put(key, value);
			}
		} catch (Exception e) {
			System.out.println("unable to findout the element repository.");
		}
		return obects;
	}
	
	
	public static void main (String[] args ) throws IOException
	{
		
		obects = ReadProperties.readObjectMap();
		//obects =ReadProperties.readObjectMap();
		System.out.println(obects);
		
		
		
		
	}
}
