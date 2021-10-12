package lk.wixis.springboot.springbootEmailVerification.detail;


/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 12/10/2021
 **/



import lk.wixis.springboot.springbootEmailVerification.entity.User;
import lk.wixis.springboot.springbootEmailVerification.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }

}


