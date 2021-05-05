package Module_3;

public class MyArrays {
	
	public void printNonStatic(int[] arr) {
		
		for(int a : arr) {
			System.out.print( a + " " );
		}
		System.out.println();
	}
	
	public static void print(int[] arr) {
		
		for(int a : arr) {
			System.out.print( a + " " );
		}
		System.out.println();
	}

	public static int[] copy( int[] arr ) {
		
		int[] copied = new int[arr.length];
		
		for (int i = 0; i < copied.length; i++) {
			copied[i] = arr[i];
		}
		
		return copied;
	}

	public static int sum( int[] arr ) {
		int res = 0;
		
		for(int a : arr) {
			res += a;
		}
		
		return res;
	}

	public static int avarage(int[] arr) {
		
		int res = 0;
		
		for (int a : arr) {
			(res += a)/arr.length;
		}
		return 0;
	}
}
