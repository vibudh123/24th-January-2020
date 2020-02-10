import java.io.*;
import java.util.Scanner;

class FileType{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");

		String fileName = sc.nextLine();
		String[] format = fileName.split("\\.");

		File file = new File(fileName);

		if(file.exists()){
			System.out.println("File exists.");
			System.out.println("File format:" + format[1]);
			if(file.canRead()){
				System.out.println("File is readable.");
			}
			else{
				System.out.println("File is not readable.");
			}
			if(file.canWrite()){
				System.out.println("File is writeable.");
			}
			else{
				System.out.println("File is not writeable.");
			}
			System.out.println(file.length());

		}
	}
}