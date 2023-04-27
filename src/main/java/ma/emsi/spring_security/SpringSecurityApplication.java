package ma.emsi.spring_security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
        PasswordEncoder passwordEncoder = passwordEncoder();
        return args -> {

          UserDetails user = jdbcUserDetailsManager.loadUserByUsername("user1");
          if(user == null)
          jdbcUserDetailsManager.createUser(
                  User.withUsername("user1").password(passwordEncoder.encode("123")).roles("USER").build()
          );

          UserDetails admin = jdbcUserDetailsManager.loadUserByUsername("admin1");
          if(admin == null)
          jdbcUserDetailsManager.createUser(
                  User.withUsername("admin1").password(passwordEncoder.encode("123")).roles("USER","ADMIN").build()
          );
        };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
