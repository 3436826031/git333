package 输入与输出;

import java.io.File;
import java.io.IOException;

public class 创建与删除 {
	
	
/*
       File类创建删除功能的方法
       
     - public boolean createNewFile() :当且仅当具有该名称的文件尚不存在时，创建一 个新的空文件。
     - public boolean delete() :删除由此File表示的文件或目录。
     - public boolean mkdir() :创建由此File表示的目录。
     - public boolean mkdirs() :创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
	public static void main(String[] args) throws IOException {
		
		//---------------创建文件
		File wj=new File("E:\\File\\chuangjian.txt");
		wj.createNewFile();
		new File("E:\\File\\cj2.txt").createNewFile();
		//构建方法所以在创建对象的时候就得确定路径
		
/*
	public boolean createNewFile() :当且仅当具有该名称的文件尚不存在时，创建- -个新的空文件 。
             创建文件的路径和名称在构造方法中给出(构造方法的参数)
            返回值:true:文件不存在,创建文件,返回true     
              false:文件存在，不会创建,返回false
  注意:
    1.此方法只能创建文件,不能创建文件夹
    2.创建文件的路径必须存在,否则会抛出异常
    public boolean createNewFile() throws IOExcept ion
   createNewFile声明抛出了IOException,我们调用这个方法，就必须的处理这个异常,要么throws,要么try  catch

	
	
*/
		
		
		//--------创建文件夹
		
/*
		 public boolean mkdir() :创建单级空文件夹(就算说只有一级，不能有C:\\wj1\\wj2\\wj3这种)
         public boolean mkdirs() :既可以创建单级空文件夹,也可以创建多级文件夹
 
  */
		
		File wj2=new File("E:\\File\\chuangjian");
		wj2.mkdir();
		new File("E:\\File\\111\\222\\333\\444").mkdirs();
		
		
//---------------------删除
		
		
		new File("E:\\File\\chuangjian.txt").delete();
		
		
		
		
		
		
	}
	
	
	
	

}
