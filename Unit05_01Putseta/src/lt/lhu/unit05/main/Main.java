package lt.lhu.unit05.main;

public class Main {

	public static void main(String[] args) {
		
		Triangle tr = new Triangle(2,3,5);
		tr.print();
		
		int sq1 = tr.square(tr);
		System.out.println("square = " + sq1);
		
		int pr1 = tr.perimetr(tr);
		System.out.println("perimetr = " + pr1);
	}

}
