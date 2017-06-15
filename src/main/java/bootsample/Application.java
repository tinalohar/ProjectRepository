package bootsample;




import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


@SpringBootApplication
@MapperScan("bootsample.dao")
public class Application {
	
	

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    

@Bean
@Primary
@ConfigurationProperties(prefix="spring.datasource")
public DataSource dataSource() {
	
	return DataSourceBuilder.create().build();
}

@Bean
public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
	SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	sessionFactory.setDataSource(dataSource());
	sessionFactory.setTypeAliasesPackage("bootsample.model");
	return sessionFactory;
	}
}

 

