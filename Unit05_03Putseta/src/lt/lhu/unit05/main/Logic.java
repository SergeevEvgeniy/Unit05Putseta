package lt.lhu.unit05.main;

import java.util.List;
import java.util.Scanner;

public class Logic {

	public static List<Train> sortNumber(List<Train> trains) {

		for (int i = 0; i < trains.size(); i++) {

			int min = trains.get(i).getNumber();
			int pos = i;

			for (int j = i + 1; j < trains.size(); j++) {
				int curr = trains.get(j).getNumber();
				if (curr < min) {
					min = curr;
					pos = j;
				}
			}
			Train temp = trains.get(pos);
			trains.set(pos, trains.get(i));
			trains.set(i, temp);
		}
		System.out.println("Сортировка по номеру поезда");
		return trains;
	}

	public static void info(List<Train> trains) {

		System.out.println("Введите номер поезда чтобы узнать информацию о нем.");
		System.out.print("Доступные номера поездов: ");
		for (int i = 0; i < trains.size(); i++) {
			System.out.printf("%3d" + ",", trains.get(i).getNumber());
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Введите номер из доступных номеров поездов");
			sc.next();
		}
		int num = sc.nextInt();
		if (num > 10 || num < 0) {
			System.out.println("Поезда с таким номером не существует");
		}
		for (int i = 0; i < trains.size(); i++) {
			if (num == trains.get(i).getNumber()) {
				System.out.println(trains.get(i));
			}
		}
	}
	
	public static List<Train> sortDestination(List<Train> trains) {

		for (int i = 0; i < trains.size(); i++) {

			String min = trains.get(i).getDestination();
			int pos = i;

			for (int j = i + 1; j < trains.size(); j++) {
				String curr = trains.get(j).getDestination();
				if (min.compareTo(curr) > 0) {
					min = curr;
					pos = j;
				}
				else if (min.compareTo(curr) > 0) {
					int minTime = trains.get(pos).getTime();
					int currTime = trains.get(j).getTime();
					if (minTime > currTime) {
						
						Train temp = trains.get(pos);
						trains.set(pos, trains.get(i));
						trains.set(i, temp);
					}
				}
			}
			Train temp = trains.get(pos);
			trains.set(pos, trains.get(i));
			trains.set(i, temp);
		}
		System.out.println("Сортировка по пункту назначения");
		return trains;
	}
	
}