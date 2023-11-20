package vn.edu.iuh.fit.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "vn.edu.iuh.fit.repositories") // Adjust the package name
@EnableTransactionManagement
public class JPAConfig {

}
