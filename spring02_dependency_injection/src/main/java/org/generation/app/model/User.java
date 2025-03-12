package org.generation.app.model;

/**
 *  La capa Model en una API REST representa 
 *  la estructura de los datos de la aplicación. 
 *  
 *  Se encarga de definir las entidades, 
 *  sus atributos y relaciones con 
 *  la base de datos.
 */
public class User {
	private long id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String avatar;
	
	public User() {}
	
	public User(long id, String email, String password, String firstName, String lastName, String avatar) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.avatar = avatar;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", avatar=");
		builder.append(avatar);
		builder.append("]");
		return builder.toString();
	}



}
