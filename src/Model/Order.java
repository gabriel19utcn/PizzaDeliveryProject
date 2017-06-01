package Model;

public class Order {
	
	private int id;
	private String pizza;
	private String tip;
	private String nume;
	private int nrtel;
	private String adresa;
	private int pret;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrtel() {
		return nrtel;
	}
	public void setNrtel(int nrtel) {
		this.nrtel = nrtel;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	
	 
	public Order(String pizza, String tip, String nume, int nrtel, String adresa, int pret) {
		super();
		this.pizza = pizza;
		this.tip = tip;
		this.nume = nume;
		this.nrtel = nrtel;
		this.adresa = adresa;
		this.pret = pret;
		
	}
	
	
	public Order(int id, String pizza, String tip, String nume, int nrtel, String adresa , int pret) {
		super();
		this.id = id;
		this.pizza = pizza;
		this.tip = tip;
		this.nume = nume;
		this.nrtel = nrtel;
		this.adresa = adresa;
		this.pret = pret;
	}
	
	

	
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", pizza=" + pizza + ", tip=" + tip + ", nume=" + nume + ", nrtel=" + nrtel
				+ ", adresa=" + adresa + ", pret=" + pret + "]";
	}
	public Order() {
		super();
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	
	
	

}
