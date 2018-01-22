package MD5;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import sun.misc.BASE64Encoder;

public class DEStest {
	/**
	 * DES∂‘≥∆º”√‹/Ω‚√‹
	 * @param str
	 */
	public DEStest(String str,String key){
		try{			
			DESKeySpec  desk=new DESKeySpec(key.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("des");  
			SecretKey secretKey = keyFactory.generateSecret(desk);
			
			SecureRandom random = new SecureRandom();
			Cipher cipher = Cipher.getInstance("des");  
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, random);  
			byte[] cipherData = cipher.doFinal(str.getBytes());  
			System.out.println("cipherText : " + new BASE64Encoder().encode(cipherData));  
			
			cipher.init(Cipher.DECRYPT_MODE, secretKey, random);  
		    byte[] plainData = cipher.doFinal(cipherData);  
		    System.out.println("plainText : " + new String(plainData)); 
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String str="aaaaa";
		String key="12345678";
		DEStest test=new DEStest(str,key);
	}

}
