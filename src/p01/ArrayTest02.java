package p01;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] sales 	=	 new int [] {
				100, 80, 90, 110 
				
		};
		
		int 	tot 	= 	0;
		/*
		tot 			+=	sales[0]; 	// tot = tot + sales[0];
		tot				+=	sales[1];
		tot				+=	sales[2];
		tot				+=	sales[3];
		*/
		for (int i = 0; i < sales.length; i++) {
			tot	+= sales[i];
		}
		
		System.out.println(tot);
		
		// ----------------------------
		// 2차원 배열 연습 
		// 연습
		
		double 	[][] 	salesTot = new double[][] {
			// 1/4 2/4 3/4 4/4
			{ 100, 101, 90, 80 } // 	2022 : salesTot[0]
			,{ 100, 101, 90, 80 } // 	2023 : salesTot[1]
			,{ 100, 101, 90, 80 } // 	2024 : salesTot[2]
			,{ 100, 101, 90, 80 } // 	2025 : salesTot[3]
			};
			
			System.out.println("연도의 수:" + salesTot.length);
			System.out.println("2024 매출수량" + salesTot[2].length);
			System.out.println(salesTot[3][1]);
			
			// 2024 매출 수량의 합계
			tot = 0;
			// tot += salesTot[2][0]
			// tot += salesTot[2][1]
			// tot += salesTot[2][2]
			// tot += salesTot[2][3]
			
			
			for (int i = 0; i < salesTot.length; i++) {
				tot += salesTot[2][i];
				
			}
			System.out.println(tot);
			
	}

}
