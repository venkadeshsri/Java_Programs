package java_programs;

public class Remove_junk_splcharacters {

	public static void main(String[] args) {
	
		String s="92@#%*(@&#(#**@()#^%testing  +#$@#*junk#&";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
