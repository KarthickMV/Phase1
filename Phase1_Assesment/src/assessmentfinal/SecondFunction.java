package assessmentfinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SecondFunction {
	
	public void toggle(File dir,String path) {
		Scanner sjn=new Scanner(System.in); 
		boolean va =true; 

				do{
					System.out.println("Please select any one of the option");
					System.out.println("    1. Add a file");
					System.out.println("    2. Delete a file ");
					System.out.println("    3. Search for a file");
					System.out.println("    4. Go back to the previous menu");
					System.out.println("\nEnter your Choice: ");
					String opt= sjn.next();
					switch (opt)
					{
					case "1" :             
						try
						{
							System.out.println("Enter the name of the file to be created...");
							Create(sjn.next(),path); 
						}
						catch(Exception e)
						{
							System.out.println("Error : " +e.getMessage());
						}                         
						break;   
            
					case "2" : 
						try
						{
							System.out.println("Enter the name of the file to be deleted...");
							Delete(sjn.next(),path,dir);
						}
						catch(Exception e)
						{
							System.out.println("Error : " +e.getMessage());
						}
						break;  
        
					case "3" : 
						try
						{
							System.out.println("Enter the name of the file to be searched...");
							Search(sjn.next(),path,dir);
						}
						catch(Exception e)
						{
							System.out.println("Error : "+e.getMessage());
						}
						break;
					case "4" : 
						try
						{
							System.out.println("Returning back to the previous menu");
							System.out.println();
							va=false;
							
						}
						catch(Exception e)
						{
							System.out.println("Error : "+e.getMessage());
						}
						break; 
                          
					default : System.out.println("Invalid Input\n ");
						break;
					}
				}while(va == true);
			}
					

	
	public static void Create(String h,String path) { 
	File f = new File(path+"//"+h);
	try {	
		if (f.createNewFile()) {
			System.out.println("The new file was Created");
			System.out.println();
		}else {
			System.out.println("The file already exists");
			System.out.println();
		}}
	catch(IOException e) {
		 e.printStackTrace();
	}

}

	public static void Delete(String h,String path, File dir) {
	try {
		String[] dirContents=dir.list();
		ArrayList<String> h2 = new ArrayList<String> ();
		for(int i=0;i<dirContents.length;i++) {
			h2.add(dirContents[i]);
		}
		if (h2.contains(h)) {
			File f = new File(path+"//"+h);
			f.delete();
			System.out.println("The file was deleted");
			System.out.println();
		}else {
			System.out.println("File Not Found");
			System.out.println();
		}
	}catch(SecurityException s) {
		System.out.println("The access to the file was denied");
	}catch(Exception e) {
		System.out.println("Error : " +e.getMessage());
	}
}

	public static void Search(String h,String path, File dir) {

	try {
		String[] dirContents=dir.list();
		ArrayList<String> h2 = new ArrayList<String> ();
		for(int i=0;i<dirContents.length;i++) {
			h2.add(dirContents[i]);
		}
		if (h2.contains(h)) {
			System.out.println("The file was found");
			System.out.println();
		}else {
			System.out.println("File Not Found");
			System.out.println();
		}
	}catch(SecurityException s) {
		System.out.println("The access to the file was denied");
	}
	
}

}

