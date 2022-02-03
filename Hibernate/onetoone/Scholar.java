package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Scholar_Tab")
public class Scholar {
	@Id
	private int scholarId;
	private String scholarName;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=LaptopBag.class)
	@JoinColumn(name="bagId") //foreign key
	private LaptopBag bag;
	
	
	
	public int getScholarId() {
		return scholarId;
	}
	public void setScholarId(int scholarId) {
		this.scholarId = scholarId;
	}
	public String getScholarName() {
		return scholarName;
	}
	public void setScholarName(String scholarName) {
		this.scholarName = scholarName;
	}
	public LaptopBag getBag() {
		return bag;
	}
	public void setBag(LaptopBag bag) {
		this.bag = bag;
	}
	
	

}
