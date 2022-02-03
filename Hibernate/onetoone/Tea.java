package onetoone;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Tea")
public class Tea {
	@Id
	private int teaId;
	private String teaName;
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Snack.class)
	@JoinTable(name="teasnack")
	private Set<Snack> snacks;
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public Set<Snack> getSnacks() {
		return snacks;
	}
	public void setSnacks(Set<Snack> snacks) {
		this.snacks = snacks;
	}
	
	
	

}
