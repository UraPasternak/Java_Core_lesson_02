
public class Lesson_02 {

	public static void main(String[] args) {
		//Завдання 1
				boolean a;
				byte s;
				char d;
				short f;
				int i;
				long l;
				float k;
				double v;
				
				//Завдання 2
				System.out.println("Byte max = " + Byte.MAX_VALUE);
				System.out.println("Byte min = " + Byte.MIN_VALUE);
				System.out.println("Short max = " + Short.MAX_VALUE);
				System.out.println("Short min = " + Short.MIN_VALUE);
				System.out.println("Int max = " + Integer.MAX_VALUE);
				System.out.println("Int min = " + Integer.MIN_VALUE);
				System.out.println("Long max = " + Long.MAX_VALUE);
				System.out.println("Long min = " + Long.MIN_VALUE);
				System.out.println("Float max = " + Float.MAX_VALUE);
				System.out.println("Float min = " + Float.MIN_VALUE);
				System.out.println("Double max = " + Double.MAX_VALUE);
				System.out.println("Double min = " + Double.MIN_VALUE);
				System.out.println("Boolean = " + Boolean.TRUE);
				System.out.println("Boolean = " + Boolean.FALSE);
				System.out.println("Chat max = " + Character.MAX_RADIX);
				System.out.println("Char min = " + Character.MIN_RADIX);

				//Завдання 3
				int[] ar = {2, 5, 3, 25, 7, 15, 6, 1, 9, 12};
				max(ar);
				min(ar);

				}
			public static void max(int []a){
			int max = a[0];
			for(int i = 1; i<a.length;i++){
				if(a[i]> max) max = a[i];}
			System.out.println("Max arrey = " + max);
			}

			public static void min(int []a){
			int min = a[0];
			for(int i = 1; i<a.length;i++){
				if(min>a[i]){min=a[i];}
			}
			System.out.println("Min arrey = " + min);
			}

}
