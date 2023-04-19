package edt5tacondeoro1;

/**
 * Representa la tarjeta de cr�dito o d�bito con la que el socio pagar� el pedido. Tiene un n�mero de tarjeta y debe poder comprobarse su validez contra una entidad bancaria.
 */
public class TarjetaBancaria {

	private String numero;
        private int codSocio;

	public boolean comprobarValidez() {
		// TODO - implement TarjetaBancaria.comprobarValidez
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numero
	 */
	public TarjetaBancaria(String numero) {
		// TODO - implement TarjetaBancaria.TarjetaBancaria
		throw new UnsupportedOperationException();
	}

	public String getNumero() {
		return this.numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
        

    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
        this.codSocio = codSocio;
    }

    public TarjetaBancaria(String numero, int codSocio) {
        this.numero = numero;
        this.codSocio = codSocio;
    }
    
    
   
        

}