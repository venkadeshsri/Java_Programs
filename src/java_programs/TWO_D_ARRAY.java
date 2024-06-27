package java_programs;

public class TWO_D_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{100,200}, 
			      {300,400},
			      {500,600},
			      {700,800}};
	
	 for (int i=0;i<arr.length;i++)
	 {
		 for (int j=0;j<arr[i].length;j++)
		 {
			 System.out.print(arr[i][j] + "  ");
		 } System.out.println();
	 }
	}

}
