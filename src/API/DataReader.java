package API;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class DataReader {

	public static void main(String[] args) throws IOException {
	
		String path = "C:\\Users\\Desktop\\Desktop\\serial.txt";
		String text = "";
		FileReader fr = null;
		//BufferedReader bf = 
		try {
			fr = new FileReader(path);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		//FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		try{
		while((text = bf.readLine())!=null){
			System.out.println("Serial Number is:");
			System.out.println(text);
		}
		}catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(bf!=null){
					fr.close();
					
				} 
			}catch(IOException e ){	e.printStackTrace();}
			try{
				if(bf!=null){
					bf.close();
				}
			}catch (IOException e ){
				e.printStackTrace();
			}
		}
	}

}
