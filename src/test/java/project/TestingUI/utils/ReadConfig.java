package project.TestingUI.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src = new File("./Configuration/Config.properties");	
	try {
		FileInputStream fis= new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}catch(Exception e) {
		System.out.println("Exception is : " +e.getMessage());
	}
}
	public String getApplicationurl() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	// Data base details
	public String getDB_url() {
		String DB_url = pro.getProperty("DB_url");
		return DB_url;
	}
	public String getdbusername() {
		String DB_username = pro.getProperty("Username");
		return DB_username;
	} 
	public String getdbpassword() {
		String DB_password = pro.getProperty("Password");
		return DB_password;
	}


}
