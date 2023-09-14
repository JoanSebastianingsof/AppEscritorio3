package co.edu.ue.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usu_id")
	private int usuId;

	@Column(name="use_password")
	private String usePassword;

	@Column(name="usu_user")
	private String usuUser;

	public Usuario() {
	}

	public int getUsuId() {
		return this.usuId;
	}

	public void setUsuId(int usuId) {
		this.usuId = usuId;
	}

	public String getUsePassword() {
		return this.usePassword;
	}

	public void setUsePassword(String usePassword) {
		this.usePassword = usePassword;
	}

	public String getUsuUser() {
		return this.usuUser;
	}

	public void setUsuUser(String usuUser) {
		this.usuUser = usuUser;
	}

}