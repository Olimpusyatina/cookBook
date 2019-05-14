package pro.olimpus.cookbook;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reciept")
public class Reciept {

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
	private Set<Step> steps = new HashSet<Step>();
}
