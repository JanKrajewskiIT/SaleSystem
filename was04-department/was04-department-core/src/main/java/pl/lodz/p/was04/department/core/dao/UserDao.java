package pl.lodz.p.was04.department.core.dao;

import pl.lodz.p.was04.department.core.domain.User;

public interface UserDao extends CrudDao<User, Long> {

	User findByLogin(String login);
}
