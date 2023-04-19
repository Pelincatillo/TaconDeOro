package edt5tacondeoro1;

/**
 * Uno de los n�cleos centrales del sistema. Representa los art�culos que se venden a trav�s del sistema. De un art�culo almacenamos su nombre, descripci�n, precio, material, stock y una fotograf�a.
 */
public class Articulo {

        private int codArticulo;
	private String nombre;
	private float precio;
	private String descripcion;
	private String material;
        private String tipo;//Bolso,Zapato y complemento
	private int stock;
	
        
        public Articulo(){
            
        }

    public Articulo(int codArticulo,String nombre, float precio, String descripcion, String material,String tipo, int stock) {
        this.codArticulo = codArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.material = material;
        this.tipo = tipo;
        this.stock = stock;
        
    }

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		// TODO - implement Articulo.setDescripcion
		throw new UnsupportedOperationException();
	}

	public String getMaterial() {
		return this.material;
	}

	/**
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	public int getStock() {
		return this.stock;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}






}