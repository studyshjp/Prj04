package p02;

import java.util.Scanner;

/*
	입력 
	번호 이름 국어 영어 수학
	num, name, kor, eng, mat
	1.ㅇㅇㅇ,90,80,70
	2.ㄴㄴㄴ,100,90,90
	3.ㅇㅇㅇ,100,100,100
	출력
	번호 이름 총점 평균
	num, name, tot, avg
*/

public class FuncTest {
	
		
		// Field 
		private static int		num;
		private static String 	name;
		private static int		kor;
		private static int		eng;
		private static int		mat;
		
		//출력
		private static int		tot;
		private static double	avg;
		
		
		//method
		//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		process();
		output();
		System.out.println("end");
		
		
	}

		// input
	private static void input() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("번호:");
		num = in.nextInt();
		System.out.println("이름:");
		name = in.nextLine();
		System.out.println("국어:");
		kor = in.nextInt();
		
		System.out.println("번호, 이름, 국어, 영어, 수학");
		// li 0 1 		 2 3 4  
		// 1.ㅇㅇㅇ,90,80,70
		String 		line = 	in.nextLine();
		String []	li	 = 	line.split(","); // 문자열 - 문자열 배열
		num 			 =  Integer.parseInt(li[0].trim()); 	// int - String 
		name 			 =  li[1].trim();
		kor	 			 =  Integer.parseInt(li[2].trim());	// "100"		
		eng	 			 =  Integer.parseInt(li[3].trim());	
		mat	 			 =  Integer.parseInt(li[4].trim());
		
		
	}

	private static void process() {
		// TODO Auto-generated method stub
		// 총점
		tot = kor + eng + mat;
		// 평균
		avg = (double) tot /3;
		avg = 	(int) (tot * 100 + 0.5) / 100.0;
		
		// 숫자 - 문자열로 변환
		// String.valuef(35.6) - "35.6"
		// 35.6 + "" - 35.6
		
	}
	
		//output
	private static void output() {
		// 평균은 소수이하 세자리 출력 ()
		System.out.println(" 번호 이름 총점 평균 ");
		System.out.printf(" %d %s %d %10.3f " ,
				 num, name, tot, avg);
		
		
		
		
	}

}
