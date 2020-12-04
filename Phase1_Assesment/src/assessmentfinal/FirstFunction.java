package assessmentfinal;

import java.io.File;
import java.util.*;


public class FirstFunction  {
	
	public void list(String path,File dir) {
		
		try {
				String[] dirContents=dir.list();
				ArrayList<String> h2 = new ArrayList<String> ();
				for(int i=0;i<dirContents.length;i++) {
					h2.add(dirContents[i]);
				}
				Collections.sort(h2, new AddFunction());
				int i=1;
				System.out.println("The specified path contains the following folders and files");
				for(String h:h2) {
					System.out.println("   "+i+". "+h);
					i++;
				}
			
		}catch(SecurityException s) {
			System.out.println("The access to the file was denied");	
		}catch(Exception e) {
			System.out.println("Error : " +e.getMessage());
		}
		
	}

}

