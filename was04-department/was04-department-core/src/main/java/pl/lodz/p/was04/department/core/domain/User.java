package pl.lodz.p.was04.department.core.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.domain.Persistable;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.google.common.collect.Lists;

@Entity
@Table(name = "users")
@NamedQuery(name = User.NAMED_QUERY_FIND_BY_LOGIN, query = "SELECT u from User u WHERE u.username = :login")
public class User implements UserDetails, Persistable<Long> {

	public static final String NAMED_QUERY_FIND_BY_LOGIN = "User.findByLogin";

	private static final long serialVersionUID = 861141317002943612L;

	@Id
	@SequenceGenerator(name = "users_sequence", sequenceName = "users_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
	@Column(name = "user_id")
	private Long id;

	@Column(name = "login", length = 20, unique = true, nullable = false)
	private String username;

	@Column(length = 64, nullable = false)
	private String password;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public boolean isNew() {
		return id == null;
	}

	@Override
	public Collection<SimpleGrantedAuthority> getAuthorities() {
		return Lists.newArrayList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
