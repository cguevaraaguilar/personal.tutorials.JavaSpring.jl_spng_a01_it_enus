package fooddemo;

public class Meal {

	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable veg;
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getVeg() {
		return veg;
	}
	public void setVeg(Vegetable veg) {
		this.veg = veg;
	}
	
	public Meal () {
		
	}
	
	public Meal (Fruit f, Dairy d, Grain g, Meat m, Vegetable v) {
		
		this.fruit = f;
		this.dairy = d;
		this.grain = g;
		this.meat = m;
		this.veg = v;
	}
	
	public String whatsInThisMeal () {
		
		String answer = "This meal contains: ";
		
		if (fruit != null) answer += "some fruit: ";
		if (dairy != null) answer += "some dairy: ";
		if (grain != null) answer += "some grain: ";
		if (meat != null) answer += "some meat: ";
		if (veg != null) answer += "some vegetables: ";
		
		return (answer);
	}
	
}
