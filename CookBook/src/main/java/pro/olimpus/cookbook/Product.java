package pro.olimpus.cookbook;

import java.util.HashSet;
import java.util.Set;

public class Product{
	private String name;
//	private String firmName;
//	private int count;
//	private Unit unit;
	private String description;
	private Rating rating;
	private Set<Merchendise> merchendises = new HashSet<Merchendise>();
}
