package basicprogram.java;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int original[][]= {{1,2,3},{4,5,6},{7,8,9}};
int transpose[][]=new int[3][3];
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		transpose[i][j]=original[j][i];
	}
}
System.out.println("PRINTING MATRIX WITHOUT TRANSPOSE : ");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.println(original[i][j]);
	}
	System.out.println();
}
System.out.println("PRINTING MATRIX AFTER TRANSPOSE : ");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.println(original[i][j]);
	}
}
	}

}
