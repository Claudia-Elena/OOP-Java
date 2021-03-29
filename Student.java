package tema2;

public class Student {

	private String nume;
	private String prenume;
	private int an;
	private String specializare;
	public Student(String nume, String prenume, int an, String specializare)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.an = an;
		this.specializare = specializare;
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String penume) {
		this.prenume = penume;
	}
	
	public String getSpecializare() {
		return specializare;
	}
	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	
}


