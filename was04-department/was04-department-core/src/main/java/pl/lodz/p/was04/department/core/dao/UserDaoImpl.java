package pl.lodz.p.was04.department.core.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.lodz.p.was04.department.core.domain.User;

@Repository
@Transactional
public class UserDaoImpl extends AbstractCrudDao<User, Long> implements UserDao {

	private final static Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

	public UserDaoImpl() {
		super(User.class);
	}

	@Override
	@Transactional(readOnly = true)
	public User findByLogin(String login) {
		LOGGER.info("findByLogin: {}", login);
		return getEntityManager().createNamedQuery(User.NAMED_QUERY_FIND_BY_LOGIN, User.class)
				.setParameter("login", login).getSingleResult();
	}
}
