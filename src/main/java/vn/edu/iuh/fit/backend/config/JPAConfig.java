package vn.edu.iuh.fit.backend.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "vn.edu.iuh.fit.backend.repositories") // Adjust the package name
@EnableTransactionManagement
public class JPAConfig {

}
