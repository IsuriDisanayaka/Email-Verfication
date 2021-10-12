package lk.wixis.springboot.springbootEmailVerification.entity;

import javax.persistence.*;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 12/10/2021
 **/
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String email;
    @Column(nullable = false,unique = true,length = 45)
    private String password;

    @Column(name="frist_name",nullable = false,length = 20)
    private String firstName;

    @Column(name="last_name",nullable = false,length = 20)
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
