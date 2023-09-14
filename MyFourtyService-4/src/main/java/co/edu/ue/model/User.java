package co.edu.ue.model;

public class User {
	private int usuId;
	private String usePassword;
	private String usuUser;

	public User() {
		super();
	}
	public int getUsuId() {
		return usuId;
	}

	public void setUsuId(int usuId) {
		this.usuId = usuId;
	}

	public String getUsePassword() {
		return usePassword;
	}

	public void setUsePassword(String usePassword) {
		this.usePassword = usePassword;
	}

	public String getUsuUser() {
		return usuUser;
	}

	public void setUsuUser(String usuUser) {
		this.usuUser = usuUser;
	}


}
