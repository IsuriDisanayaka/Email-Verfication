package lk.wixis.springboot.springbootEmailVerification;

import static org.assertj.core.api.Assertions.assertThat;

import lk.wixis.springboot.springbootEmailVerification.entity.User;
import lk.wixis.springboot.springbootEmailVerification.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 12/10/2021
 **/
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repo;


    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("rashmiumshsnanw1@gmail.com");
        user.setPassword("rashmi1234");
        user.setFirstName("Rashmi");
        user.setLastName("Zoysa");

        User savedUser = repo.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());



    }
}
