package work3;

public class mainClass {

	public static void main(String[] args) {
		
		// 두점 사이의 거리를 구한다
		double dis = getDistance(1, 1, 2, 2);
		System.out.println( dis );
		

		
		// shuffle
		int original[] = { 1,2,3,4,5,6,7,8,9 };
		System.out.println(java.util.Arrays.toString(original));			
		int[] result = shuffle(original);			
		System.out.println(java.util.Arrays.toString(result));
		
		
		// max
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		int r = max(data);
		System.out.println("최대값:" + r);
		
		
		// 숫자로만 되어 있는지
		String str = "123";
		boolean b = isNumber(str);
		System.out.println(str+"는 숫자입니까? "+ b);
		
		str = "1234o";
		b = isNumber(str);
		System.out.println(str+"는 숫자입니까? "+ b);
		
	}
	
	static boolean isNumber(String num) {
	//	boolean b = true;
		
		for (int i = 0; i < num.length(); i++) {
			int n = (int)num.charAt(i);
			if(n < 48 || n > 57) {
			//	b = false;
			//	break;
				return false;
			}
		}
		
	//	return b;
		return true;
	}	
	
	static int max(int array[]) {
		int max_num = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(max_num < array[i]) {
				max_num = array[i];
			}
		}	
		
		return max_num; 
	}
	
	static int[] shuffle(int[] original) {
		
		int temp;
		
		for (int i = 0; i < 1000; i++) {
			int r1 = (int)(Math.random() * original.length);
			int r2 = (int)(Math.random() * original.length);
			
			temp = original[r1];
			original[r1] = original[r2];
			original[r2] = temp;			
		}
		
		return original;
	}

	// 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		/*
		double dx, dy;
		double result;
		
		dx = Math.pow(x1 - x, 2);
		dy = Math.pow(y1 - y, 2);
		
		result = Math.sqrt(dy + dx);
		
		return result;
		*/
		return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));		
	}
	

}





