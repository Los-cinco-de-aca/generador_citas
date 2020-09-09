package uniajc.edu.co.generador_citas.dao;

import org.springframework.beans.factory.annotation.Autowired;

import uniajc.edu.co.generador_citas.conexion.ObtenerConexion;
import uniajc.edu.co.generador_citas.response.ConsultarCitasResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.NoResultException;

public class GeneradorCitasDAO implements IGeneradorCitasDAO{
	
	@Autowired
	private ObtenerConexion obtenerConexion;

	@Override
	public ConsultarCitasResponse consultarCitas() {
		
		ConsultarCitasResponse strRespuesta = new ConsultarCitasResponse();
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			
			String sql = "SELECT ID, NOMBRE FROM loscincodeaca.citas";
			
			conexion = obtenerConexion.obtenerConexion();
			ps = conexion.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {			
				strRespuesta.setId(rs.getInt("id"));
				strRespuesta.setNombre(rs.getString("nombre"));				
			}
				
	       } catch (NoResultException e) {
	    	   strRespuesta.setMensaje(e.getMessage());
	        } catch (Exception e) {
	        	strRespuesta.setMensaje(e.getMessage());
	        }finally {
	            if (rs != null) {
	                try {
	                    rs.close();
	                } catch (SQLException e) {
	                	strRespuesta.setMensaje(e.getMessage());
	                }
	            }
	            if (ps != null) {
	                try {
	                    ps.close();
	                } catch (SQLException e) {
	                	strRespuesta.setMensaje(e.getMessage());
	                }
	            }
	            if (conexion != null) {
	                try {
	                    conexion.close();
	                } catch (SQLException e) {
	                	strRespuesta.setMensaje(e.getMessage());
	                }
	            }
	        }
	    
		return strRespuesta;
		
	}
	    
}


