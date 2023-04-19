package edt5tacondeoro1;

/**
 * Un tipo de art�culo. Un complemento tiene, adem�s de los atributos de los art�culos su talla.
 */
public class Complemento extends Articulo {

	private int talla;
        
    public Complemento() {
	
    }
    
    public Complemento(String tipo,int talla) {
        this.talla = talla;
    }

    public Complemento(int talla,int codArticulo, String nombre, float precio, String descripcion, String material,String tipo, int stock) {
        super(codArticulo,nombre, precio, descripcion, material,tipo, stock);
        
        this.talla = talla;
    }
        

	public int getTalla() {
		return this.talla;
	}

	/**
	 * 
	 * @param talla
	 */
	public void setTalla(int talla) {
		this.talla = talla;
	}


}