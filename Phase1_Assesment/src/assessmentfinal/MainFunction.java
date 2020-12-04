package assessmentfinal;

import java.io.File;
import java.util.Scanner;

public class MainFunction {
	
	 public static void main(String[] args)
	    {
	
	
	 Scanner scn = new Scanner(System.in);
	 FirstFunction f=new FirstFunction();
	 SecondFunction s=new SecondFunction();
	 ThirdFunction t=new ThirdFunction();
	 System.out.println("***************************************Application for**************************************");
	 System.out.println("****************************************LockedMe.Com****************************************");
	 System.out.println("**********************************************************************************Version1.0");
	 System.out.println("********************************************************************Developed by: Karthick M");
	 System.out.println();
	 System.out.println("In order to get started enter the directory path where you would like to perform the operation:");
	 System.out.println("For Example : D://CoreJava//");
	 String ch="yes";
	 String path;
	
	 try{
		 do {
			 path=scn.next();
			 File dir=new File(path);
			 if(dir.isDirectory()) { 
				System.out.println("The directory is valid");
				System.out.println();
	 
				do{
	 
					System.out.println("The user can perform the below file handling operations:");
					System.out.println("    1. To list out all the files in the current directory");
					System.out.println("    2. To add/delete/search for a file ");
					System.out.println("    3. To exit from the application");
					System.out.println("\nEnter your Choice: ");

					String option = scn.next();
					
					switch (option)
					{
					case "1" : 
						try
						{
							f.list(path,dir);
						}
						catch(Exception e)
						{
							System.out.println("Error : " +e.getMessage());
						}                         
						break;   
            
					case "2" : 
						try
						{
							s.toggle(dir,path);
						}
						catch(Exception e)
						{
							System.out.println("Error : " +e.getMessage());
						}
						continue;  
        
					case "3" : 
						try
						{
							System.out.println("Are you sure to exit ? (Type Yes or No)");
							String cha = scn.next();
							cha=cha.toLowerCase();
							t.exit(cha);
						}
						catch(Exception e)
						{
							System.out.println("Error : "+e.getMessage());
						}
						break;                            
                          
					default : System.out.println("Wrong Entry \n ");
					break;
					}
					System.out.println("\n Do you want to continue ? (Type yes or no)");
					ch = scn.next();
					ch=ch.toLowerCase();
					System.out.println();
				} while (ch.equals("yes"));
		 	
			 }else {
				System.out.println("The specified path does not exist");
				System.out.println();
				System.out.println("Please enter a valid path");
				System.out.println();
			 }
		 	}while(ch.equals("yes"));
	 		}catch(SecurityException se) {
				System.out.println("The access to the file was denied");	
	 		}catch(Exception e) {
				System.out.println("Error : " +e.getMessage());
	 		}
	 scn.close();
	 }
	 
}