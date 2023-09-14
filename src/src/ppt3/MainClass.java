package src.ppt3;

/**
 * 자바 ppt3 실습용 메인클래스 
 */
public class MainClass {

	public static void main(String[] args) {

		Person lee = new Person("lee", 20 ,"810000-200000");
		Student cho = new Student("che", 21 , "910000-0000000","한직교", 1, 3);
		
		lee.greeting();

		System.out.println("============================");
		
		cho.greeting();
		System.out.println("============================");
		cho.changeName("cho yung n");
		lee.greeting();
		
		System.out.println("============================");
		
		cho.greeting();
		System.out.println("============================");
		
}


}