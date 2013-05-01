package test;

import java.security.MessageDigest;

public class EncryptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		messageDigest.update("Chandima".getBytes());
		String encryptedString = new String(messageDigest.digest());
		System.out.println(encryptedString);
	}

}
