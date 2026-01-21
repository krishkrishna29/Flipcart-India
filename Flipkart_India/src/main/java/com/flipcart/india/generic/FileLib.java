package com.flipcart.india.generic;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FileLib {
	
	public String readPropertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/main/resource/drivers/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}