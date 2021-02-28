package cda.jee.dao;

import java.util.List;
import java.util.Optional;

public interface PortefeuilleDAO<T> {

	List<T> getAll();

	Optional<T> getById(int id);

}
