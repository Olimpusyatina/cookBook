package pro.olimpus.cookbook;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"login"})})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "firstName", length = 60)
	private String firstName;
	@Column(name = "middleName", length = 60)
	private String middleName;
	@Column(name = "lastName", length = 60)
	private String lastName;
	
	@Column(name = "login", nullable = false, length = 60)
	private String login;
	@Column(name = "password", nullable = false, length = 100)
	private String password;
	
	@Column(name = "email", length = 40)
	private String email;
	@Column(name = "phoneNumber", length = 12)
	private String phoneNumber;
	
	@Column(name = "faceBook")
	private String faceBook;
	@Column(name = "vk")
	private String vk;
	@Column(name = "instagram")
	private String instagram;
	@Column(name = "moyMir")
	private String moyMir;
	
	@Lob
	@Column(name = "avatar")
	private byte[] avatar;
	@Column(name = "description", length = 700)
	private String description;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@Column(name = "reciept")
	private Set<Reciept> reciepts = new HashSet<Reciept>();
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name  = "user", joinColumns = {@JoinColumn (name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "user_id")})
	private Set<User> friends = new HashSet<User>();
}
