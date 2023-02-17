
public class SingleArrayEg {
	static void showArray(){//Method array declaration
		int arr1[]={1,4,8,3,9};
		for(int a:arr1){
			System.out.print(" "+a);
		}
		System.out.println();
	} 

	public static void main(String[] args) {
		showArray();
		int myarray[]=new int[4];//Declaration & instantiation
		myarray[0]=78;//initialization
		myarray[1]=97;
		myarray[2]=76;
		myarray[3]=30;
		//traversing an array
		for(int i=0;i<myarray.length;i++){//length of array
			System.out.println(myarray[i]);
		}
		float num[]={3.3f,5.5f,8.3f,9.8f};//Declaration & instantiation
		//print num array
		System.out.println("Array elements: ");
		
		for(int j=0;j<num.length;j++){
			System.out.print(num[j] + " , ");
		} 
		//or
		//for each loop
		//holds an array element in a variable , then execute 
		for(float j:num){
			System.out.print(j + " , ");
		}
	
	}

}
