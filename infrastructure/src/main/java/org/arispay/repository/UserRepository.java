package org.arispay.repository;

import org.arispay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

	User findById(int id);

	User findByUsername(String username);

	Optional<User> findByToken(String token);
}
