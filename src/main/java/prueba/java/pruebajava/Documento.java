/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.java.pruebajava;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author luis
 */
public class Documento {

    public int[] leerDoc(String route) {
        File docDecimal;
        FileReader fileReader;
        BufferedReader buffer;
        int indexDatos = 0;
        int[] data = null;
        try {
            docDecimal = new File(route);
            fileReader = new FileReader(docDecimal);
            buffer = new BufferedReader(fileReader);

            //verificamos número de datos en el txt leyendo linea a linea
            String linea;
            while ((linea = buffer.readLine()) != null) {
                ++indexDatos;
            }
            //se crea el arreglo del tamaño del número de datos
            data = new int[indexDatos];

            indexDatos = 0;
            fileReader = new FileReader(docDecimal);
            buffer = new BufferedReader(fileReader);

            while ((linea = buffer.readLine()) != null) {
                data[indexDatos] = Integer.parseInt(linea);
                ++indexDatos;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return data;
    }

    public void creaDoc(String conten, String route) {
        //se obtiene fecha para almacenar el archivo con binarios

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd-HH-mm-ss");
        String strDate = dateFormat.format(date);
        System.out.println("strDate = " + strDate);
        try {
            File file = new File(route + strDate + ".txt");

            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(conten);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
