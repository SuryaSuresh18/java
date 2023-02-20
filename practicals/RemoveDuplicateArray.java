public class RemoveDuplicateArray {
	public static int removeDuplicate(int arr[],int n){
		if(n==0 || n==1){
			return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		//change original array
		for(int i=0;i<j;i++){
			arr[i]=temp[i];
			}
		return j;
	}
	public static void main(String[] args) {
		int arr[]={10,20,5,22,66,35,10,5,70,68};
		int l=arr.length;
		l=removeDuplicate(arr, l);
		//printing array elements
		for(int i=0;i<l;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
