package 输入与输出;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ces implements ActionListener {
	static JButton anj= new JButton("下一页");
	static JButton anj2= new JButton("上一页");
	static JButton anj3= new JButton("提交");
	static JButton anj4= new JButton("转化输出");
	JPanel mb=new JPanel();
	TextField tf = new TextField("输入标记");

	 JLabel wb= new JLabel("12");
	 String[] s=new String[100];
	 static int i=0;
	 JTextArea wb2=new JTextArea("---《aaaa》-------");
	  JComboBox xl=new JComboBox();
	  Object[] xx= {"UTF-8","JBK"};
	  
	 
	  public  ces() throws IOException{
		
		wb2.setLineWrap(true);//设置自动换行
		
		InputStreamReader zhuan=new InputStreamReader(new FileInputStream("E:\\File\\ces读取.txt"),"UTF-8");
		


		
		FileReader dur=new FileReader("E:\\File\\ces读取.txt");
		
		int j=0;
		char[] zs=new char[200];
		int A=0;
	    while((A=zhuan.read(zs))!=-1){ 
		s[j]=new String(zs,0,200);
		j++;
		   
	   }
		
	 
	 anj.addActionListener(this);
	 anj2.addActionListener(this);
	 anj3.addActionListener(this);
	 anj4.addActionListener(this);
	 xl.addItem(xx[0]);
	 xl.addItem(xx[1]);
	 
	 mb.setLayout(new GridLayout(3,3,10,10));
	 mb.add(wb2);
	 mb.add(xl);
	 mb.add(tf);
	 mb.add(anj4);
	JFrame kj=new JFrame("写入");
	kj.setLayout(new BorderLayout(5,10));
	kj.add(anj,BorderLayout.SOUTH);
	kj.add(anj2,BorderLayout.NORTH);
	kj.add(anj3,BorderLayout.WEST);
	
    kj.add(mb);
	
	 kj.setBounds(600,200,600,350);
     kj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 kj.setVisible(true);

		
	}
	
	
	public static void main(String[] args) throws IOException {
          new ces();
	
	}

	private static void whlie(boolean b) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		
		if(e.getSource()==anj) {
				wb2.setText(s[i]);
				i++;
				 System.out.println(s[i]);
		}
		
		
		
		if(e.getSource()==anj2) {
	
			wb2.setText(s[i]);
			--i;
         System.out.println(s[i]);
		
	}
		
		if(e.getSource()==anj3) {
			
	        tf.setForeground(Color.RED);
	        
			wb2.insert("{-- "+tf.getText()+" --}", wb2.getCaretPosition());
			System.out.println(wb2.getText());
				
		
	}
		
		
		
if(e.getSource()==anj4) {
			int hq=xl.getSelectedIndex();
			
			
			if(hq==0) {
				
				try {
					OutputStreamWriter zh=new OutputStreamWriter(new FileOutputStream("E:\\File\\ces输出UTF8.txt"),"UTF-8");
					
					try {
						zh.write("  UTF-8导出"+s[i]);
						zh.close();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					
				} catch (UnsupportedEncodingException | FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				
				
			}
			else
			{
				try {
					OutputStreamWriter zh2=new OutputStreamWriter(new FileOutputStream("E:\\File\\ces输出GBK.txt"),"GBK");
					
					try {
						zh2.write("  GBK导出"+s[i]);
						zh2.close();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					
				} catch (UnsupportedEncodingException | FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				
				
			}

	}
		
		
	}

}
