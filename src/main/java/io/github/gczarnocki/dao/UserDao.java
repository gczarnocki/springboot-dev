package io.github.gczarnocki.dao;

import io.github.gczarnocki.models.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
    public User findByEmail(String email);
}
