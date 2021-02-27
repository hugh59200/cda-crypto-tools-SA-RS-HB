package cda.jee.dao;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {

	List<T> getAll();

	Optional<T> getById(int id);

}
