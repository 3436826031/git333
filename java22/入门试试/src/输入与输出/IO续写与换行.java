package 输入与输出;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*追加
调用其构造方法
FileOutputStream（String name boolean append ）创建一个向具有指定name的文件中写入数据的输出文件流
FileOutputStream（File file boolean append ）创建一个向指定file对象表示的文件中写入数据的文件输出流
阐述String name File file写入数据的目的地
boolean append 追加写开关*/

/*
换行符号：
windows \r\n
linux /n
mac /r
写出即可*/

public class IO续写与换行 {
	public static void main(String[] args) throws IOException {
		FileOutputStream zj=new FileOutputStream("E:\\File\\续写.txt",true);//是在原有文本的基础上续写啊
	 
		
		for(int i=0;i<3;i++) {
			zj.write(69);		
		zj.write("你好".getBytes());
		zj.write("\r\n".getBytes());
		}
	
	
	}


	
	
}
