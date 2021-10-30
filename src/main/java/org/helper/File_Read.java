package org.helper;

public class File_Read {

	public Property_Reader1 getInstance1() throws Throwable {
		Property_Reader1 pro = new Property_Reader1();
		return pro;
	}

	public Property_Reader2 getInstance2() throws Throwable {
		Property_Reader2 pro = new Property_Reader2();
		return pro;
	}

	public static File_Read getFile() {
		File_Read file = new File_Read();
		return file;
	}

	private File_Read() {
		// restrict to create object in another class
	}
}
