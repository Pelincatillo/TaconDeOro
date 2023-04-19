package edt5tacondeoro1;

/**
 * Representa una ruta de env�o de paquetes de los socios. Los pedidos se asignan a las rutas en funci�n de la poblaci�n del socio que ha hecho el pedido. Una ruta almacena un �rea de influencia y unos d�as de reparto.
 */
public class Ruta {
    
        private int codRuta;
        private int codEmpresaTransporte;
	private String[] areaInfluencia;
	private String[] diasReparto;
        
	EmpresaDeTransporte EmpresaDeTransportesRol;

    public Ruta(int codRuta, int codEmpresaTransporte, String[] areaInfluencia, String[] diasReparto) {
        this.codRuta = codRuta;
        this.codEmpresaTransporte = codEmpresaTransporte;
        this.areaInfluencia = areaInfluencia;
        this.diasReparto = diasReparto;
    }

    public int getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(int codRuta) {
        this.codRuta = codRuta;
    }

    public int getCodEmpresaTransporte() {
        return codEmpresaTransporte;
    }

    public void setCodEmpresaTransporte(int codEmpresaTransporte) {
        this.codEmpresaTransporte = codEmpresaTransporte;
    }
        
        

	public String[] getAreaInfluencia() {
		return this.areaInfluencia;
	}

	/**
	 * 
	 * @param areaInfluencia
	 */
	public void setAreaInfluencia(String[] areaInfluencia) {
		this.areaInfluencia = areaInfluencia;
	}

	public String[] getDiasReparto() {
		return this.diasReparto;
	}

	/**
	 * 
	 * @param diasReparto
	 */
	public void setDiasReparto(String[] diasReparto) {
		this.diasReparto = diasReparto;
	}

	public Ruta() {
		// TODO - implement Ruta.Ruta
		throw new UnsupportedOperationException();
	}

}