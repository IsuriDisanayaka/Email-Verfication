package lk.wixis.springboot.springbootEmailVerification.repo;

import lk.wixis.springboot.springbootEmailVerification.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 12/10/2021
 **/
public interface UserRepository extends JpaRepository<User, Long> {
}
