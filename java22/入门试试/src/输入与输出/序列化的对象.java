package 输入与输出;

import java.io.Serializable;

public class 序列化的对象 implements Serializable{
	

		String name;
		int age;
		
		
		
		
		
		
	
	
	  public String toString() { return "序列化的对象 [name=" + name + ", age=" + age +
	  "]"; }
	
		
		
		public 序列化的对象(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		

	

}
