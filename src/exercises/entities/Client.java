package exercises.entities;

import java.util.Date;
import java.util.Objects;

public class Client {

	private String userName;
	private Date instant;

	public Client(String userName, Date instant) {
		this.userName = userName;
		this.instant = instant;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getInstant() {
		return instant;
	}

	public void setInstant(Date instant) {
		this.instant = instant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(userName, other.userName);
	}

}
