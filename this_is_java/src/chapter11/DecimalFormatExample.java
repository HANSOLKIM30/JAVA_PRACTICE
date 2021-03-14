package chapter11;

import java.text.DecimalFormat;

/*
 * [Format]
 * **1. DecimalFormat
 * 2. SimpleDateFormat
 * 3. MessageForamy
 */

// 숫자를 원하는 형식으로 출력: *****format에서 표시되지 않은 소수점 단위는 반올림되어 표시*****
public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		// 10진수: 빈자리는 0으로 채움
		// 형식에 소수점이 표시되지 않았으므로, 반올림.
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		// 형식에 첫번째 소수점까지만 표시되었으므로, 두번째 소수점에서 반올림.
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
	}
}
