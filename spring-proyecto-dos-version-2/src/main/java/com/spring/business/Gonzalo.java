package com.spring.business;

/**
 * Clase Gonzalo
 *
 * @author Netasystems / Gonzalo
 * @version 1.0.0 Fecha 05/09/2018
 * 
 */
public class Gonzalo implements Programmer{

    /**
     * Clase Languaje
     */
    private Languaje languaje;

    /**
     * Constructor vacio
     */
    public Gonzalo() {
		super();	
	}

	/**
	 * Constructor
	 * @param languaje
	 */
	public Gonzalo(Languaje languaje){
        this.languaje = languaje;
    }

	
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
	 * Metodo lenguaje programacion
	 */
	public String hacktheWordId() {
        return "Programador en a: "+ languaje.descripcion();
    }

	/**
	 * Metodo version
	 */
	@Override
	public String versionLeng() {
		
		return " Version = " + languaje.version();
	}

}
