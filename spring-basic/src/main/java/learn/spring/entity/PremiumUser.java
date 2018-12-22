package learn.spring.entity;

public class PremiumUser implements User {

	private String userName;
	private String password;
	
	public PremiumUser(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;

	}

	@Override
	public void setPassword(String password) {
		this.password = password;

	}

}
