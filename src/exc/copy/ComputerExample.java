package exc.copy;

public class ComputerExample {

	public static void main(String[] args) {
		int param =7;
		System.out.println("원의반지름:"+param);
		
		Calculato calculato= new Calculato();
		System.out.println("원면적"+calculato.Calculato(7));
				
		Computer computer = new Computer();
		System.out.println("원면적"+computer.Calculato(7));
	}

}
