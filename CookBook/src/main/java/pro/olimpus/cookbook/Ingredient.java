package pro.olimpus.cookbook;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ingredient_id")
	private int ingredient_id;
	
	@Column(name = "name")
	private String name;
	
	private int count;
	private Unit unit;
	private Set<Product> products = new HashSet<Product>();
	private Reciept reciept;
}
