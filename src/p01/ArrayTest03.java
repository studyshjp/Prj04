package p01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 현재 날짜와 시간 구하기 (기본 출력 형식: YYYY-MM-DDTHH:mm:ss.SS...)
        LocalDateTime now = LocalDateTime.now();
        
		System.out.println("날짜출력:" + now);
		
		String yoil = getYoil(); //"금";
		System.out.println("요일출력:" + yoil);
	}

	private static String getYoil() {
		// TODO Auto-generated method stub
		String [] y = new String[] {
				"日일","月월","化화","水수"
		};
		
		LocalDate now = LocalDate.now();
		int wk 	= now.getDayOfWeek().getValue(); // 1 ~ 7	
		String yoil = y[wk - 1];
		return yoil + "요일";
	}

}
