package pro.olimpus.cookbook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "UNIT", uniqueConstraints = {@UniqueConstraint(columnNames = {"unit_name"})})
public class Unit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "unit_id")
	private Integer id;
	
	@Column(name = "unit_name", nullable = false, length = 60)
	private String name;
	
	@Column(name = "isLiquid", length = 3)
	private String isLiquid;
	
	public Unit () {
	}
	public Unit (String name) {
		super();
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
