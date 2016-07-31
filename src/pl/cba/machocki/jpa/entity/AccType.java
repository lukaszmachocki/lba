package pl.cba.machocki.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AccType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
