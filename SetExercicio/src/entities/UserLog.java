package entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

public class UserLog {
	private String name;
	private Instant instant_acess;
	
	public UserLog(String name, Instant instant_acess) {
		this.name = name;
		this.instant_acess = instant_acess;
	}

	public String getName() {
		return name;
	}

	public Instant getInstant_acess() {
		return instant_acess;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLog other = (UserLog) obj;
		return Objects.equals(name, other.name);
	}
}
