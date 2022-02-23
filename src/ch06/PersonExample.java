package ch06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person person = new Person("계백","1234-1235");
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
		//person.nation ="usa"; //final은 한번 값이 들어간 후 수정 불가
		person.name ="고쇼용";

	}

}
