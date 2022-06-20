package pl.witek.springdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.witek.springdata.domain.ERole;
import pl.witek.springdata.domain.Role;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}