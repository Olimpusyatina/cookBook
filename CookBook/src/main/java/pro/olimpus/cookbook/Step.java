package pro.olimpus.cookbook;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Step {
	private int time;
	private int number;
	private Set<Cookware> cookwares = new HashSet<Cookware>();
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
	private String description;
	private Vector<File> image = new Vector();
}
