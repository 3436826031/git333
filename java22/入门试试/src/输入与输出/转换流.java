package 输入与输出;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class 转换流 {
	/*
	 * OutputstreamWriter extends Write
	 * 
	 * 继承来自父类的共性方法 void write（int c）写入单个字符 void write（char[] cbuf）写入字符数组 void write
	 * （String str）写入字符串
	 * 
	 * 构造方法 OutputStreamWriter（OutputStream out，string charsetname）创建使用指定的字符集的
	 * 参数：（字节输出流。可以用来转换写入字节到文本中的编码，指定的编码名称）
	 */
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter zh=new OutputStreamWriter(new FileOutputStream("E:\\File\\转换.txt"),"UTF-8");
		
		zh.write("你好啊啊啊UTF-8");//进入缓冲区
		zh.flush();

		读取();
	}

	private static void 读取() throws IOException {
		// TODO 自动生成的方法存根
		
		InputStreamReader dr=new InputStreamReader(new FileInputStream("E:\\File\\转换读入.txt"),"UTF-8");
		InputStreamReader dr2=new InputStreamReader(new FileInputStream("E:\\File\\转换读入.txt"),"GBK");
		int i=0;
		System.out.println("UTF-8格式格式读取  ");
		while((i=dr.read())!=-1) {
			
			System.out.println(""+(char)i);
			
		}
		
		
		System.out.println("GBK格式格式读取  ");
	         while((i=dr2.read())!=-1) {
			
			System.out.print("  "+(char)i);
			
		}
		
		
		dr.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
