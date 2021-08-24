package lt.lhu.unit05.main;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String midlleName;
	private String adress;
	private int numberCard;
	private int numberBank;
	
	public Customer (int id, String surname, String name, String middleName, String adress, int numberCard, int numberBank) {
		
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.midlleName = middleName;
		this.adress = adress;
		this.numberCard = numberCard;
		this.numberBank = numberBank;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMidlleName() {
		return midlleName;
	}
	public void setMidlleName(String midlleName) {
		this.midlleName = midlleName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getNumberCard() {
		return numberCard;
	}
	public void setNumberCard(int numberCard) {
		this.numberCard = numberCard;
	}
	public int getNumberBank() {
		return numberBank;
	}
	public void setNumberBank(int numberBank) {
		this.numberBank = numberBank;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", midlleName=" + midlleName
				+ ", adress=" + adress + ", numberCard=" + numberCard + ", numberBank=" + numberBank + "]";
	}
	
	
	
	
}
