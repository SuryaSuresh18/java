class NestedForLoop {
	
	public static void main(String args[]){
		int rows=5;
		//outer loop
		for(int i=1; i<=rows;i++){
			//inner loop for cols
			for(int j=1;j<=i;j++)//to print pattern
			{
				System.out.print(j + " ");
			}
			System.out.println(" ");
			
		
	    } 
    }
}