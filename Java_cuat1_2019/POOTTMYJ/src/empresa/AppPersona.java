
//Clase 09/04 martes
package empresa;

public class AppPersona {

    public static void main(String[] args) {
        Gerentes ger = new Gerentes("Juan", "Perez",0,0,0,0);
        Operarios ope = new Operarios("Marcos", "Saldivar",0,0,0,0);
        Tecnicos tec = new Tecnicos("Lucas", "Martinez", 0,0,0,0);
        Administrativos adm = new Administrativos("Ignacio", "Peralta",0,0,0,0);
        
        System.out.println(ger);
        System.out.println(ope);
        System.out.println(tec);
        System.out.println(adm);    
    }    
}
