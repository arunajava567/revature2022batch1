package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Snack")
public class Snack {
	
	@Id
	private int snackId;
	private String snackName;
	public Snack() {}
	public Snack(int snackId, String snackName) {
		
		this.snackId = snackId;
		this.snackName = snackName;
	}
	public int getSnackId() {
		return snackId;
	}
	public void setSnackId(int snackId) {
		this.snackId = snackId;
	}
	public String getSnackName() {
		return snackName;
	}
	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}
	
	
	
}
