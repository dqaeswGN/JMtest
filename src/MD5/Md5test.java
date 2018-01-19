package MD5;

import java.security.MessageDigest;

public class Md5test {
	public void md5test(){
		try{
			MessageDigest md5 = MessageDigest.getInstance("md5");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
