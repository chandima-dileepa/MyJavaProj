package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class EncryptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String inputStr=bfr.readLine();
		System.out.println("Input : "+inputStr);
		messageDigest.update(inputStr.getBytes());
		String hashValue = new String(messageDigest.digest());
		System.out.println("Hashed Input : "+hashValue);
	}

}
