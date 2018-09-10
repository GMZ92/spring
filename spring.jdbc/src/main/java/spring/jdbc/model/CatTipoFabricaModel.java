package spring.jdbc.model;

import java.util.Date;

/**
 * Clase CatTipoFabricaModel
 *
 * @author Netasystems / Gonzalo
 * @version 1.0.0 Fecha 10/09/2018
 *
 */
public class CatTipoFabricaModel {

	/**
	 * Id de Tipo de Fabrica 
	 */
	private long idCatTipoFabrica;
	/**
	 * Nombre de la fabrica
	 */
	private String nombre;
	/**
	 * Estatus de la fabrica
	 */
	private Character status;
	/**
	 * Fecha modificacion
	 */
	private Date fechaModificacion;
	/**
	 * Id de Usuario
	 */
	private Long idUsuario;
	
	
	
	public CatTipoFabricaModel() {
		super();

	}



	/**
	 * Constructor
	 * @param idCatTipoFabrica
	 * @param nombre
	 * @param status
	 * @param fechaModificacion
	 * @param idUsuario
	 */
	public CatTipoFabricaModel(long idCatTipoFabrica, String nombre, Character status, Date fechaModificacion,
			Long idUsuario) {
		super();
		this.idCatTipoFabrica = idCatTipoFabrica;
		this.nombre = nombre;
		this.status = status;
		this.fechaModificacion = fechaModificacion;
		this.idUsuario = idUsuario;
	}



	/**
	 * Para obtener el valor
	 * @return long Para obtener el valor de idCatTipoFabrica
	 */
	public long getIdCatTipoFabrica() {
		return idCatTipoFabrica;
	}



	/**
	 * Para asignar el valor
	 * @param idCatTipoFabrica Asigna el valor idCatTipoFabrica
	 */
	public void setIdCatTipoFabrica(long idCatTipoFabrica) {
		this.idCatTipoFabrica = idCatTipoFabrica;
	}



	/**
	 * Para obtener el valor
	 * @return String Para obtener el valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * Para asignar el valor
	 * @param nombre Asigna el valor nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * Para obtener el valor
	 * @return Character Para obtener el valor de status
	 */
	public Character getStatus() {
		return status;
	}



	/**
	 * Para asignar el valor
	 * @param status Asigna el valor status
	 */
	public void setStatus(Character status) {
		this.status = status;
	}



	/**
	 * Para obtener el valor
	 * @return Date Para obtener el valor de fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}



	/**
	 * Para asignar el valor
	 * @param fechaModificacion Asigna el valor fechaModificacion
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	/**
	 * Para obtener el valor
	 * @return Long Para obtener el valor de idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}



	/**
	 * Para asignar el valor
	 * @param idUsuario Asigna el valor idUsuario
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaModificacion == null) ? 0 : fechaModificacion.hashCode());
		result = prime * result + (int) (idCatTipoFabrica ^ (idCatTipoFabrica >>> 32));
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatTipoFabricaModel other = (CatTipoFabricaModel) obj;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (idCatTipoFabrica != other.idCatTipoFabrica)
			return false;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "CatTipoFabricaModel [idCatTipoFabrica=" + idCatTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaModificacion=" + fechaModificacion + ", idUsuario=" + idUsuario + "]";
	}

	
	
}
