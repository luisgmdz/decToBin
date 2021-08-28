package prueba.java.pruebajava;

/**
 *
 * @author luis
 */
public class PruebaJava {

    public static void main(String[] args) {
        //ruta de archivo con decimales
        String routeDec = "/home/luis/Documents/proyectos/java/DecToBin/src"
                + "/main/java/prueba/java/docsTxt/numerosDecimales.txt";
        
        //ruta de archivo que se va a crear con numeros binarios
        String routeBin = "/home/luis/Documents/proyectos/java/DecToBin/src"
                + "/main/java/prueba/java/docsTxt/";
        
        //se instancia un objeto con la clase doc, ya que ahí se encuentran los métodos de leer y escribir archivos
        Documento doc = new Documento();
        
        //almacenamos el contenido (numeros) del archivo en una variable
        var contenido = doc.leerDoc(routeDec);
        
        //se instancia un objeto con la clase convertidor, porque ahí está el método que pasa de decimal a binario
        Convertidor convertidor = new Convertidor();
        
        //se manda el contenido del documento al método toBinary
        String binario = convertidor.toBinary(contenido);
        
        //se manda el contenido en binario para que se almacene en un nuevo archivo, 
        //también se manda la ruta de la carpeta donde se va a alamacenar el archivo
        doc.creaDoc(binario, routeBin);
        
    }

}
