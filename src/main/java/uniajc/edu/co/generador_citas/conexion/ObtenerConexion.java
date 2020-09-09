package uniajc.edu.co.generador_citas.conexion;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ObtenerConexion {
	
	@Autowired
	private EjemploDataSourceConfig dataSource;

	public Connection obtenerConexion() {
		Connection conexion = null;

		try {
			conexion = dataSource.generadorDataSource().getConnection();

		} catch (Exception e) {
			System.out.println(e);
		}
		
		return conexion;
		
	}

}
