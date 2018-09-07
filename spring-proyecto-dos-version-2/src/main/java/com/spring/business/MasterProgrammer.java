package com.spring.business;

/**
 * Clase MasterProgrammer
 *
 * @author Netasystems / Gonzalo
 * @version 1.0.0 Fecha 05/09/2018
 *
 */
public class MasterProgrammer implements Programmer{

    /**
     * tipo Languaje
     */
    private Languaje languaje;

    
    /**
	 * Valor a obtener
	 * @return El valor languaje
	 */
	public Languaje getLanguaje() {
		return languaje;
	}

	/**
	 * Valor asignar
	 * @param languaje La languaje asignar
	 */
	public void setLanguaje(Languaje languaje) {
		this.languaje = languaje;
	}

	/**
	 * Metodo descripcion
	 */
	public String hacktheWordId() {
        return "Programador en: " + languaje.descripcion();
    }

	/**
	 * Metodo version
	 */
	@Override
	public String versionLeng() {
		
		return " Version = " + languaje.version();
	}
    
}