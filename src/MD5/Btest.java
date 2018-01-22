package MD5;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
public class Btest {
	 Btest(String str){
		try{
			BASE64Encoder encoder = new BASE64Encoder();
			BASE64Decoder decoder = new BASE64Decoder();
			String text=encoder.encode(str.getBytes("UTF-8"));
			System.out.println("º”√‹£∫"+text);
			System.out.println("Ω‚√‹£∫"+new String(decoder.decodeBuffer(text),"GBK"));
		}catch(Exception e){
			e.printStackTrace();;
		}
		
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		String str="Hello world";
		Btest bb=new Btest(str);
		
	}

}
