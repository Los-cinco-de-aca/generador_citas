package uniajc.edu.co.generador_citas.conexion;


import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


@Configuration
@ConfigurationProperties(prefix = "basedatos.datasource")
@Service
public class EjemploDataSourceConfig extends HikariConfig{
	
	@Bean(name = "basedatosDataSource")
	@Primary
	public DataSource generadorDataSource() {
		return new HikariDataSource(this);
	}

}
