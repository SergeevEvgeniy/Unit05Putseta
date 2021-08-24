package lt.lhu.unit05.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        List<Train> test = new ArrayList<Train>();
		
		test.add(new Train("Minsk", 5 , 14));
		test.add(new Train("Minsk", 1 , 10));
		test.add(new Train("Minsk", 3 , 8));
		test.add(new Train("Mozyr", 10 , 3));
		test.add(new Train("Gomel", 9 , 21));

		
		Print.print(Logic.sortNumber(test));	
		Print.print(Logic.sortDestination(test));	
		Logic.info(test);

		
	}

}
