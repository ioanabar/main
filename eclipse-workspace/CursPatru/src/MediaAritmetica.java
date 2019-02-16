import java.util.Arrays;

public class MediaAritmetica {
public static void main(String[] args) {
	int [] myArray = {1, 2, 3, 4};
	Arrays.sort(myArray);
	double sum = 0;
	for (int i = 1; i < myArray.length-1; i++)
		sum = sum + myArray[i];
	System.out.println("media aritmetica"  +  "cel mai mare este " + sum / (myArray.length-2));
}
}
