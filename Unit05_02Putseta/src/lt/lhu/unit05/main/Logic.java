package lt.lhu.unit05.main;


public class Logic {

	public static void FindByName(BaseOfCustomer custs) {


		for (int i = 0; i < custs.size(); i++) {
//			System.out.println("i =" + i);
			String minName = custs.getCustomer(i).getName();
			int minIndex = i;

			for (int j = i + 1; j < custs.size(); j++) {
				String currentName = custs.getCustomer(j).getName();
				if (minName.compareTo(currentName) > 0) {
					minName = currentName;
					minIndex = j;
				} else if (minName.compareTo(currentName) == 0) {
					String minSurname = custs.getCustomer(minIndex).getSurname();
					String currentSurname = custs.getCustomer(j).getSurname();
					System.out.println(minSurname + " - " + currentName);

					if (minSurname.compareTo(currentSurname) > 0) {
						Customer temp = custs.getCustomer(minIndex);
						custs.setCustomer(minIndex, custs.getCustomer(j));
						custs.setCustomer(j, temp);
					}
				}
			}

			Customer temp = custs.getCustomer(minIndex);
			custs.setCustomer(minIndex, custs.getCustomer(i));
			custs.setCustomer(i, temp);
		}
		System.out.println("Список покупателей в алфавитном порядке");
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < custs.size(); i++) {
			System.out.println(custs.getCustomer(i));
		}
		System.out.println("----------------------------------------------------");

	}
	
	public static void FindByNumber(BaseOfCustomer custs) {
		
		int Max = 60000;
		int Min = 20000;
		System.out.println("Список покупателей с номером карточки в интервале от " + " " + Min + " " + "до" + " " + Max);
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < custs.size(); i++) {
			if (custs.getCustomer(i).getNumberCard() >= Min & custs.getCustomer(i).getNumberCard() <= Max) {
				System.out.println(custs.getCustomer(i));
			}
		}
		
		
		
	}
}
