package day2class;
import java.io.*;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter the name:");
		name=br.readLine();
		int age;
		System.out.println("Enter the age:");
		age =Integer.parseInt(br.readLine());
		float avg;
		System.out.println("Enter the Average:");
		avg=Float.parseFloat(br.readLine());
		System.out.println("Name" + name + "age" + age + "avg"+avg);
	}
		
}
