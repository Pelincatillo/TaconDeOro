package edt5tacondeoro1;

import java.util.Date;

/**
 * Representa cualquier incidente fuera de lo normal que ocurra mientras el pedido es distribuido. Se almacena su fecha y una descripci�n.
 */
public class Incidencia {

	private Date fechaIncidencia;
	private String descripcion;
        private int codPedidio;
        private int codSocio;

    public Incidencia(Date fechaIncidencia, String descripcion, int codPedidio, int codSocio) {
        this.fechaIncidencia = fechaIncidencia;
        this.descripcion = descripcion;
        this.codPedidio = codPedidio;
        this.codSocio = codSocio;
    }

    public int getCodPedidio() {
        return codPedidio;
    }

    public void setCodPedidio(int codPedidio) {
        this.codPedidio = codPedidio;
    }

    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
        this.codSocio = codSocio;
    }
        

	public Date getFechaIncidencia() {
		return this.fechaIncidencia;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaIncidencia(Date fecha) {
		this.fechaIncidencia = fecha;
	}

	public String getDescripcion() {
		// TODO - implement Incidencia.getDescripcion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		// TODO - implement Incidencia.setDescripcion
		throw new UnsupportedOperationException();
	}

	public Incidencia() {
		// TODO - implement Incidencia.Incidencia
		throw new UnsupportedOperationException();
	}

}