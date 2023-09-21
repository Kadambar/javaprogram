package basicprogram.java;

public class ThreeaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][][] test= {
		{
			{1,2,3},
			{4,5,6}
		},
		{
			{-2,-3,-4},
			{1},
			{-5,-6}
		},
};
for(int[][] array2D:test) {
	for(int[] array1D:array2D) {
		for(int item:array1D) {
			System.out.println(item);
		}
	}
}
	}

}
