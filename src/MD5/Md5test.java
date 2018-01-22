package MD5;

import java.security.MessageDigest;

public class Md5test {
	/**
	 * MD5
	 * @param text
	 * @return
	 */
	public static  String  md5test(String text){
		StringBuffer sb=new StringBuffer();
		try{
			MessageDigest md5 = MessageDigest.getInstance("md5");
			byte[] data=md5.digest(text.getBytes());
			
			for(byte bak:data){
				String value=Integer.toHexString(bak&0xff);
				sb.append(value.length() == 1?"0"+value:value);
			}
			System.out.println(sb.toString());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return sb.toString(); 
	}
	
	public static void main(String[] args){
		md5test("hello");
		
	}
}
