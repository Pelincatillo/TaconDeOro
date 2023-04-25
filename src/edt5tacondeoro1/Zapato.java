package edt5tacondeoro1;

/**
 * Un tipo de art�culo. Los zapatos tiene, adem�s de los atributos de los art�culos, su tipo y su n�mero.
 */
public class Zapato extends Articulo {

	private float talla;

    public Zapato(int talla) {
        this.talla = talla;
    }

    public Zapato(int talla,int codArticulo, String nombre, float precio, String descripcion, String material,String tipo, int stock) {
        super(codArticulo,nombre, precio, descripcion, material,tipo, stock);
        this.talla = talla;
        
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }
       
        




	public Zapato() {
		// TODO - implement Zapato.Zapato
		throw new UnsupportedOperationException();
	}

}
