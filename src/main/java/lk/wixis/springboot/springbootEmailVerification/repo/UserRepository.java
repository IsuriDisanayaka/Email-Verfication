package lk.wixis.springboot.springbootEmailVerification.repo;

import lk.wixis.springboot.springbootEmailVerification.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 12/10/2021
 **/
public interface UserRepository extends JpaRepository<User, Long> {
@Query("SELECT u FROM User u WHERE u.email = ?1")
public User findByEmail(String email);
}
