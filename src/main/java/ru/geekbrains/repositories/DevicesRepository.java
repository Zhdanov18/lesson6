package ru.geekbrains.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.entities.Device;

@Repository
public interface DevicesRepository extends CrudRepository<Device, Long> {
}
