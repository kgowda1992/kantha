package Kantha;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;


public class Run3 {

	public static void main(String[] args) throws IOException 
	{
	
		for(int i=0;i<=10000;i++)
		{
		
		File f=new File("C:\\Users\\Kinara\\Desktop\\demo\\2023"+i);
		//f.mkdir();
		f.delete();
	   
	}

	}
}
