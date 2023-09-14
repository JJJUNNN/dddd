

package src.ppt1;

public class MainClass {

	public int a;
	public MainClass() {
		
		this(10);
		System.out.println("업는새엉자");
	}
	
	public MainClass(int a) {
		System.out.println("새엉자");
		if(a<0) {
		this.a=0;
		}else {
			this.a = a;
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}

/*

package src.ppt1;

public class MainClass {

	public static void main(String[] args) {
		
		PublicClassExam test = new PublicClassExam();
		PublicClassExam test2 = new PublicClassExam(10);
		PublicClassExam test3 = new PublicClassExam("string");
		PublicClassExam test4 = new PublicClassExam(1,5);
		
	}
	
}


package src.ppt1;
import java.util.Random;
import java.util.Scanner;
public class MainClass {
	
	public static void main(String[] args) {
		int[] dice = new int[6]; 
		Random rand = new Random(); //시드 디폴트
		int value = 0 ,count =0;
		
		try(Scanner scann = new Scanner(System.in)){
		count = scann.nextInt();
		if(count < 1 || count > 100) System.exit(0);
		
		for(int i=0;i<count;i++) {
			value=rand.nextInt(6);
			System.out.println(value+1 + " ");
			System.out.print("다이스"+dice[value] + "라고");
			dice[value]++;
			
		}
		System.out.println("--------------- ");
		for(int i = 0; i < 6 ;i++) {
			System.out.println("주사위" + (i+1)+ " : " +dice[i] + "번");
		}
		
		}
	}
}
package src.ppt1;    //패키지 이름

import java.util.Random;    //랜덤이라는 ??를 패키지? 를 임포트 ==인클루드 한다
import java.util.Scanner;	//스캐너는 입력받을때 필요한 ?? 이다.

public class MainClass {	//메인 클래스에 퍼블릭이 붙어야함 파일이름 같아야함 .
	public static void main(String[] args) {  //기본 스태틱으로 생성되는 메인 함수 
	
	Scanner scan = new Scanner(System.in);  
	Random rand = new Random();
	
	int cnt = scan.nextInt();
	
	int[] arr = new int[cnt];
	for(int i =1;i<=arr.length;i++) {				//지금은 배열에받은게아니고 벨류에 한번씩 덮음
		arr[i-1] = (rand.nextInt(6)+1); //여기서 받은 랜덤한 수 를 
		//? 배열에 계속 넣는거? push_back?
		System.out.print(arr[i]);	
		//배열에 넣어서 정렬한 다음
										//i랑 같은게 몇번(cnt)넘어갔는지를 추출하고
										//출력.
	}
	scan.close();	
	}
	
	}
*/
/*
package src.ppt1;

//import java.util.Arrays;
public class MainClass {

	public static void main(String[] args) {
	
//	String[][] arr;
		String arr2[][];
	//	String[] arr3[];
		
		//arr2 = new String[2][];
		
		arr2 = new String[2][];
		arr2[0] = new String[] {"linus","nartbvg","c","c++","jaba"};
		arr2[1] = new String[]{"network","prititype","Project"};
		
//2차원배열은1차원배열로 받ㅇ짐		
		for(String[] elem : arr2) {
			for(String value : elem) {
		System.out.print(value + " ");		
			}
		
		System.out.println();
		test(arr2);
		}
	arr2.clone();
	}
public static void test(String[][] args) {
	for(String[] elem : args) {
		for(String value : elem) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
package src.ppt1;


public class MainClass {

	public static void main(String[] args) {
		//구구단
		for(int i = 1; i <= 9; i++) {
			System.out.println("===== "+ i +" 단 ======");
				for(int j = 1; j <=9; j++) {
					System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
		}		
	}
}


package src.ppt1;

import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

	
		System.out.print("세개의정수를입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.print("가장큰수는 : ");
		System.out.println((a>b ? a:b)>c ? (a>b ? a:b):c);
		
		scan.close();
		unyear ar = new unyear();
		ar.yoon();
	}
}

class unyear{
	

	boolean yoon() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if( a%4 != 0||(a%4 == 0 && a%100 != 0)|| a%100 == 0 && a%4 == 0 && a%400 == 0 || !(a%4 ==0 && a%100 == 0 && a%400 !=0 ) ) {
			System.out.println("윤년입니다");
			}
		else {
				System.out.println("윤년아입니다");
			
			}
		scan.close();
		return true;
	}
	
};
*/