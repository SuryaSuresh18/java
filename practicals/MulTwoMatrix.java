
public class MulTwoMatrix {
	public void display(){
		int arr1[][]={{1,2,3},{2,0,2},{1,1,3}};
		int arr2[][]={{1,0,1},{1,2,1},{3,1,2}};
		//System.out.println("Enter the no of rows and columns: ");
		int arr3[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				arr3[i][j]=0; 
			    
			for(int k=0;k<3;k++)      
			{      
			arr3[i][j]+=arr1[i][k]*arr2[k][j];      
			}//end of k loop  
			System.out.print(arr3[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//each row in new line    
			}    
	}
	public static void main(String[] args) {
		MulTwoMatrix mt = new MulTwoMatrix();
		mt.display();

	}

}
