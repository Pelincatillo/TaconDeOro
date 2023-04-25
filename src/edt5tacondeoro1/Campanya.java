package edt5tacondeoro1;

/**
package edt5tacondeoro1;

/**

 * La campa�a hace referencia a la temporada de venta. Hay dos campa�as por cada a�o, una para la primavera/Verano y otra para el oto�o/invierno. Se usa para agrupar los art�culos a la venta en un contenedor l�gico temporal. Puede abrirse al inicio de la temporada y cerrase al finalizar �sta, tambi�n se le pueden a�adir art�culos. No podemos cerrar una campa�a a menos que se hayan servido todos los pedidos que incluyan art�culos de la misma.
 */
public class Campanya {

        private int codCampana;
	private int anyo;
	private String temporada;

    public Campanya(int codCampana, int anyo, String temporada) {
        this.codCampana = codCampana;
        this.anyo = anyo;
        this.temporada = temporada;
    }

    public int getCodCampana() {
        return codCampana;
    }

    public void setCodCampana(int codCampana) {
        this.codCampana = codCampana;
    }
}
       

