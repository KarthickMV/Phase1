package assessmentfinal;



public class ThirdFunction {
	
	public void exit(String ch) {
		
		
		try {
			if(ch.equals("yes")) {
				System.exit(0);
			}else if(ch.equals("no")) {
				System.out.println("The application was not closed");
			}else {
				System.out.println("Invalid input and the application continues");
			}
				
		}catch(Exception e){
			System.out.println("Error : " +e.getMessage());
		}
	
	}

}

