package fileoperations;
import java.io.*;

public class FilesListFromFolder {
	
	
	public static void main(String a[]){
        File file = new File("C:/Shanthi/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }


}
