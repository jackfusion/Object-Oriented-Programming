package Module_3;

import java.util.Arrays;

public class driver {

	
	
	public static void main(String[] args) {


		int[] intArr = new int[3];
		int[] intArr2 = { 1, 2, 3, 4, 5 };
		int[] intArr3 = new int[] { 7, 8, 9 };
		
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		
		// MyArrays.print(intArr2);
		//MyArrays ma = new MyArrays();
		//ma.printNonStatic(intArr2);
		
		System.out.println( Arrays.toString(intArr3)  ); 

		
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1.clone();  // MyArrays.copy(arr1);
		arr1[1] = 222;
		
		//MyArrays.print(arr1);
		//MyArrays.print(arr2);
		
		//System.out.println( MyArrays.sum(arr1) );
		//System.out.println(MyArrays.sum(arr2));
		System.out.println(MyArrays.avarage(arr1));
		
		
		//Arrays.toString(null)
		
		
		// intArr[3] = 4;
		
		// String[] 

	}
}
