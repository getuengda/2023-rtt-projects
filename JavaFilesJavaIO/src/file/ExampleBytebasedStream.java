package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleBytebasedStream {
	/*
	 * We will read the data from a file and write the same data to another file
	 * using FileInputStream and FileOutputStream classes. The write() method takes
	 * an int, which contains the byte value of the byte to write, and writes the
	 * single byte to the file output stream.
	 *
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("C:/Users/Downloads/testingFile.txt");
			out = new FileOutputStream("C:/Users/Downloads/sampleOutput4.txt");
			int c;
			while ((c = in.read()) != -1) { // read byte by byte
				out.write(c); // write byte by byte}
				System.out.println("Reading and Writing has been success!!");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
