import java.io.File;
import java.io.IOException;
public class file {
	public static void main(String[]args) throws IOException {
		File file=new File("C:\\Users\\ASUS\\Documents");
		System.out.println("File  Name: " + file.getName());
		 System.out.println("File  exists: " + file.exists());
		    System.out.println("Absolute Path: " + file.getAbsolutePath());
		    System.out.println("Canonical Path: " + file.getCanonicalPath());
		    
		    String contents[]=file.list();
		    if(!file.isDirectory()) {
		    	System.out.println("Not a directory");
		    }else if(file.length()==0) {
		    	System.out.println("empty");
		    }else {
		    	for(int i=0;i<contents.length;i++) {
		    		System.out.print(contents[i]+" ");
		    		System.out.println("");
		    	}
		    }
	}

}
