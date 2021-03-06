package pl.lodz.p.was04.department.core.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Persistable;
import org.springframework.data.repository.CrudRepository;

public interface CrudDao<T extends Persistable<ID>, ID extends Serializable> extends CrudRepository<T, ID> {

	@Override
	List<T> findAll();

	@Override
	List<T> findAll(Iterable<ID> ids);
}
