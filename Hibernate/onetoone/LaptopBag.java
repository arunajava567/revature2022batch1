package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop_Bag")
public class LaptopBag {
	@Id
	private int bagId;
	private String color;
	
	/*
	 * @OneToOne(mappedBy="bag",cascade=CascadeType.ALL) private Scholar scholar;
	 */	
	public int getBagId() {
		return bagId;
	}
	public void setBagId(int bagId) {
		this.bagId = bagId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/*
	 * public Scholar getScholar() { return scholar; } public void
	 * setScholar(Scholar scholar) { this.scholar = scholar; }
	 */
	
	

}
