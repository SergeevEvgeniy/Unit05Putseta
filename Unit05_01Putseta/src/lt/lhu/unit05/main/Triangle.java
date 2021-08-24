package lt.lhu.unit05.main;

public class Triangle {

	private int kat1;
	private int kat2;
	private int gip;
	
	public Triangle (int kat1, int kat2, int gip) {
		this.kat1 = kat1;
		this.kat2 = kat2;
		this.gip = gip;
	}
	public int getKat1() {
		return kat1;
	}
	public void setKat1(int kat1) {
		this.kat1 = kat1;
	}
	public int getKat2() {
		return kat2;
	}
	public void setKat2(int kat2) {
		this.kat2 = kat2;
	}
	public int getGip() {
		return gip;
	}
	public void setGip(int gip) {
		this.gip = gip;
	}
	
	public int square(Triangle f) {
		int sq = (f.kat1 * f.kat2)/2;
		return sq;
	}
	
	public int perimetr(Triangle f1) {
		int pr = f1.kat1 + f1.kat2 + f1.gip;
		return pr;
	}
	public void print () {
		System.out.println("katet1 = " + kat1);
		System.out.println("katet2 = " + kat2);
		System.out.println("gypotenuza = " + gip);
	}
}
