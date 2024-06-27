package java_programs;

public class NameOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "venkadesh"; 
	    
		int total = name.length();
		int after_remove = name.replace("e","").length(); 
		System.out.println("Total no of character occur : " + (total - after_remove));
		
		}

}
