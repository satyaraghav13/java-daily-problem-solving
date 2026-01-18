package max;

import java.io.InputStream;
import java.util.Properties;

public class ProUtility {
	private ProUtility()
	{}
	private static Properties p;
	static
	{
		try {
			 p = new Properties();
			InputStream in = p.getClass().getResourceAsStream("/log4j.properties");
			p.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getValueee(String key)
	{
		//String t = p.getProperty(key);
		return  p.getProperty(key);
	}
}
