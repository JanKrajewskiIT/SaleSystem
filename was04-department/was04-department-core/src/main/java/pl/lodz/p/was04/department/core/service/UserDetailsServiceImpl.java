package pl.lodz.p.was04.department.core.service;

import javax.inject.Named;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.google.common.collect.Lists;

@Named
public class UserDetailsServiceImpl implements UserDetailsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LOGGER.debug("loadUserByUsername: {}", username);
		if ("admin".equals(username)) {
			return new User("admin", DigestUtils.sha256Hex("admin"), true, true, true, true,
					Lists.newArrayList(new SimpleGrantedAuthority("ROLE_ADMIN")));
		}

		return null;
	}

}
