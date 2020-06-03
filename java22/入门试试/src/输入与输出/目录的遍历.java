package 输入与输出;

import java.io.File;
import java.io.IOException;

/*
   File类遍历(文件夹)目录功能
  - public String[] list() :返回一个String数组, 表示该File目录中的所有子文件或目录。
  
  
  - public File[] listFiles() :返回一个File数组，表示该File目录中的所有的子文件或目录。
    注意:
   list方法和listFiles方法遍历的是构造方法中给出的目录*************
     如果构造方法中给出的目录的路径不存在,会抛出空指针异常
     如果构造方法中给出的路径不是一-个目录, 也会抛出空指针异常


 * */
public class 目录的遍历 {
	
	public static void main(String[] args) throws IOException {
		
		File wj=new File("E:\\File");
		
		String[] zu=wj.list();

		System.out.println(zu);
		for(int i=0;i<zu.length;i++) {
			System.out.println(zu[i]);
			
		}
		System.out.println("******************增强for*****************");
		
		//格式：for（集合/数组类型  新名称：需要便利的素组）
		for(String A:zu) 
		
		{
			System.out.println(A);
			
			
		}
		
		// ListFiles方法  同时打印出目录
		// int i=1  int sum  I++sum=sum+i
		
		System.out.println("******************ListFiles方法*****************");
		
		File wj2=new File("E:\\File");
		
		wj2.listFiles();
		
		for(File B:wj2.listFiles()) {
			
			
			System.out.println(B);
		}
		
		
		
		
		
	}

}
