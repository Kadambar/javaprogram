package basicprogram.java;

import java.util.Arrays;

public class AscendingDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]array=new int[] {11,22,33,44,55,66};
Arrays.sort(array);
System.out.println("Elements of array in ascending order: ");
for(int i=0;i<array.length;i++) {
	System.out.println(array[i]);
}
Arrays.sort(array);
System.out.println("Elements of array sorted in descending order: ");
for(int i=array.length-1;i>=0;i--) {
	System.out.println(array[i]);
}
	}

}
