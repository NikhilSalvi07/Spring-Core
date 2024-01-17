package com.core.resoure;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.Resource;

public class ResoureInjection {
	//resource like file,img.ppt.txt
	
	private Resource file;

	public ResoureInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resource getFile() {
		return file;
	}

	public void setFile(Resource file) {
		this.file = file;
	}
	
	public void process() {
		String path="d:\\Spring Notes\\"; //we can store JDBC.txt file in this folder such as Spring Notes
		InputStream is;
		try {
			is = file.getInputStream();
			OutputStream os=new FileOutputStream(path +file.getFilename()); //fileOutputStream is an Interface
			int c;
			while ((c=is.read())!= -1) //-1 represent end of the file
				os.write(c);    //char by char is read and written to the file
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
	
	

}
