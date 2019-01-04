import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Javaio {

	
	public static void main(String[] args) {
		try {
			FileOutputStream fout =new FileOutputStream("Desktop:\\source.txt");
			String s="Hi this is a new fnotepad file";
			byte b[]=s.getBytes();
			try {
				fout.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//converting string into byte array
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(){    
        try{    
          FileInputStream fin=new FileInputStream("D:\\testout.txt");    
          int i=0;    
          while((i=fin.read())!=-1){    
           System.out.print((char)i);    
          }    
          fin.close();    
        }catch(Exception e){System.out.println(e);}    
       }    
	 
		  public void main1() {    
			 
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   LocalDateTime fmt = LocalDateTime.of(2018,Febraury, 28, 3, 2);
		   System.out.println(dtf.format(now));  
		  }    
		}    
      

