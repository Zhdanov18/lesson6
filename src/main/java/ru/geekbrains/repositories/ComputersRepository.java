package ru.geekbrains.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.entities.Computer;

@Repository
public interface ComputersRepository extends CrudRepository<Computer, Long> {
}
