package p01;

public class ArrayTest01 {
		// Array : 여러 변수를 하나의 이름으로 통일해서 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "ㅇㅇㅇ";
		String name2 = "ㅁㅁㅁ";
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("ㄴㄴㄴ");
		
		String [] one = new String [] {
			// 	0		1		2
			"ㅇㅇㅇ", "ㅁㅁㅁ", "ㄴㄴㄴ"
		};
		System.out.println( one[0] );
		System.out.println( one[1] );
		System.out.println( one[2] );
		
		
		System.out.println();
		
		
		for (int i = 0; i < one.length; i++) {
			System.out.println( one[i] );
		
			
		}
	
		// System.out.println( one[1] ); 	// exception
		
	}

}
