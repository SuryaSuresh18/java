//// print elements of an present at even/odd position
public class EvenOddPosition {

	public static void main(String[] args) {
		int [] arr= new int []{31,24,63,94,25,6};
		System.out.println("Odd Position: ");
		for (int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
		System.out.println("Even position: ");
		for (int j = 1; j < arr.length; j = j+2) {
			System.out.println(arr[j]);
		}

	}

}