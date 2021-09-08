package excelcode;

import java.io.IOException;

public class ExcelMain {
	public static void main(String args[])throws IOException
	{
		Excel ob=new Excel();
		String a=ob.readData(0,0);
		System.out.println("First Name  : "+a);
		String b=ob.readData(0,1);
		System.out.println("ID          : "+b);
		String c=ob.readData(1,0);
		System.out.println("Second Name : "+c);
		String d=ob.readData(1,1);
		System.out.println("ID          : "+d);
		String e=ob.readData(2,0);
		System.out.println("Third Name  : "+e);
		String f=ob.readData(2,1);
		System.out.println("ID          : "+f);
	}
	}


