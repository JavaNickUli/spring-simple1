package uli.nick.spring.repository;

import org.springframework.data.repository.CrudRepository;
import uli.nick.spring.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
