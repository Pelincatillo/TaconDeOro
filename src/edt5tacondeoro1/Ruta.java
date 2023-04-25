package edt5tacondeoro1;

/**
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
        
}
