package 输入与输出;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 字符流读取 {
	
	//字符流       Reader最顶层的接口，子类（实现类）：FileReader
	//
	//
	
	public static void main(String[] args) throws IOException {
		FileReader zf=new FileReader("E:\\File\\字符读取.txt");
	
		//System.out.println(zf.read());//直接打印出一块整个的字符码
		
        
		/*System.out.println((char)zf.read());
		char[] A=new char[3];
	    zf.read(A);
		
		System.out.println(new String(A));
		
		
		*/
		//zf.close();
		
		int cs=0;
		char[] A1=new char[1024];
		
		
		while((cs=zf.read(A1))!=-1 ) {
			
			System.out.println((char)cs);
			System.out.println(new String(A1, 0,cs));
		}
	//	char[] A1=new char[3];
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
