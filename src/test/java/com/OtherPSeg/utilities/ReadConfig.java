package com.OtherPSeg.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//import com.OtherPSeg.pageObjects.NewLead;

public class ReadConfig {

	Properties pro;
	// Pro is an object of property class

	// Here create a constructor with name - ReadConfig
	// When we use ReadConfig, the below constructor will get invoked.
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		// We import the file (config.properties) by using FileInputStream.
		// For this we had create a variable src which is referring the config file.

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties(); // Pro object is initiating here
			pro.load(fis); // Load is a method which is use to load complete config file
		}

		catch (Exception e) {
			System.out.println("Exceptoin is " + e.getMessage());
		}
	}

	// Here we are adding method to read the values from config file.

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getusername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getpassword() {
		String passowrd = pro.getProperty("password");
		return passowrd;
	}

	public String getchromepath() {
		String ChromePath = pro.getProperty("chromepath");
		return ChromePath;
	}

	public String getfirstname() {
		String firstname = pro.getProperty("firstname");
		return firstname;
	}

	public String getlastname() {
		String lastname = pro.getProperty("firstname");
		return lastname;
	}

	public String getMobile() {
		String Mobile = pro.getProperty("Mobile");
		return Mobile;
	}

}
