package discoMusical;

/**
 *
 * @author Amanda
 */
public class DiscoMusical {
        private String titulo;
	private String autor;
	private int anioEdicion;
	private String formato;
	private boolean digital;

public DiscoMusical(){
}

public DiscoMusical(String titulo, String autor, int anioEdicion, String formato, boolean digital){
	this.titulo = titulo;
	this.autor = autor;
	this.anioEdicion = anioEdicion;
	this.formato = formato;
	this.digital = digital;
}

//getters y setters
public String getTitulo(){
	return titulo;
}
public void setTitulo(String valorTitulo){
	this.titulo = valorTitulo;
}	

public String getAutor(){
	return autor;
}
public void setAutor(String valorAutor){
	this.autor = valorAutor;
}	

//
public int getAnioEdicion(){
	return anioEdicion;
}
public void setAnioEdicion(int valorAnioEdicion){
	this.anioEdicion = valorAnioEdicion;
}

//
public String getFormato(){
	return formato;
}
public void setFormato(String valorFormato){
	this.formato = valorFormato;
}	
//
public boolean getDigital(){
	return digital;
}
public void setDigital(boolean valorDigital){
	this.digital = valorDigital;
}

@Override
public String toString(){
 return "Título: " + titulo + " Autor: " + autor + " Año de Edición: "+ anioEdicion + " Formato: " + formato + " Digital: " + digital;
}

}
