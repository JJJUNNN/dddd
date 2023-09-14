package src.ppt3;

public class Person {
protected String name;
private String rrn;
private int age;

public Person() {}


public Person(String name, int age, String rrn) {
	this.name = name;
	this.age = age;
	this.rrn = rrn;
	this.toString();
	}

public void greeting() {
	
	System.out.println("안녕하세요:"+name+"입니다");
}

}
