package file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamExample {
	/*
	 * read() method return type is int, although it returns a byte value. It
	 * returns-1 if the end of the file is reached, indicating that there are no
	 * more bytes to read. To read all bytes in a Java InputStream, you must keep
	 * reading until the value -1 is returned.This value means that there are no
	 * more bytes to read from the InputStream.
	 */

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:/Downloads/testingFile.txt");
			int i = 0;
			// system.out.println(fin.read())
			while((i = fin.read()) != -1) {
				System.out.println((char) i);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
