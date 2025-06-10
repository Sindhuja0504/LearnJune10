package com.org.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {
	public static void read() {
	
		try {
			FileReader read = new FileReader("C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\Hotel.properties");
		    Properties prop= new Properties();
		    prop.load(read);
		  String url=  prop.getProperty("url");
		  System.out.println(url);
		  String username = prop.getProperty("username");
		  System.out.println(username);
		  String password= prop.getProperty("password");
		  System.out.println(password);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			read();

	}

}
