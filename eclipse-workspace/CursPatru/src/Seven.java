
public class Seven {
	public static void main(String[] args) {
		int[] myArray = { 4, 6, 8, 10, 15, 20, 34, 11 };
		int a = 4;
		int b = 10;
		for (int i = 0; i < myArray.length; i = i + 1)
			if (myArray[i] >= a && myArray[i] <= b) {
				System.out.println(myArray[i]);
			}
	}
}
