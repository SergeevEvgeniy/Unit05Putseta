package lt.lhu.unit05.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print {

	List<Train> printTr = new ArrayList<Train>();

	public static void print(List<Train> trains) {
		for (int i = 0; i < trains.size(); i++) {
			System.out.println(trains.get(i));
		}
		System.out.println();
	}
}
