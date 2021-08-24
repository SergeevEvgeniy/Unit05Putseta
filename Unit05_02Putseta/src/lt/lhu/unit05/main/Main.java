package lt.lhu.unit05.main;

public class Main {

	public static void main(String[] args) {
	
		BaseOfCustomer customers = new BaseOfCustomer();

		customers.add(new Customer(2, "Ivan", "Ivanov", "Ivanovich", "Minsk", 23123, 4242122));
		customers.add(new Customer(14, "Artem", "Artemov", "Artemovich", "Oshmyany", 64534, 1346325));
		customers.add(new Customer(74, "Stepan", "Stepanov", "Stepanovich", "Mozyr", 54265, 9532467));
		customers.add(new Customer(42, "Andrei", "Andrievskiy", "Aleksandrovich", "Vitebsk", 40000, 4682519));
		
		Logic.FindByName(customers);
		Logic.FindByNumber(customers);
		
	}

}
