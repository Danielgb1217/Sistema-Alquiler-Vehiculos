package utilidades;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

public class EscribirArchivoPlano {

    public static void escribir(Usuario usuario) {

        File archivo = new File("src/Listado de usuarios.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
//            salida.println("");
            salida.println(usuario.obtenerArregloObjeto()[0] + ";"
                    + usuario.obtenerArregloObjeto()[1] + ";"
                    + usuario.obtenerArregloObjeto()[2] + ";" + usuario.obtenerArregloObjeto()[3] + ";"
                    + usuario.obtenerArregloObjeto()[4] + ";" + usuario.obtenerArregloObjeto()[5]
                    + ";" + usuario.obtenerArregloObjeto()[6] + ";" + usuario.obtenerArregloObjeto()[7]
                    + ";" + usuario.obtenerArregloObjeto()[8]);
            salida.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribir(Camioneta camioneta) {

        File archivo = new File("src/Listado de Vehiculos.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println("");
            salida.print("1;" + camioneta.obtenerArregloObjeto()[1] + ";"
                    + camioneta.obtenerArregloObjeto()[2] + ";" + camioneta.obtenerArregloObjeto()[3] + ";"
                    + camioneta.obtenerArregloObjeto()[4] + ";" + camioneta.obtenerArregloObjeto()[5]);
            salida.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Escribir para tipo carro
    public static void escribirCarro(Carro carro) {

        File archivo = new File("src/Listado de Vehiculos.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println("");
            salida.print("2;" + carro.obtenerArregloObjeto()[1] + ";"
                    + carro.obtenerArregloObjeto()[2] + ";" + carro.obtenerArregloObjeto()[3] + ";"
                    + carro.obtenerArregloObjeto()[4] + ";" + carro.obtenerArregloObjeto()[5]);
            salida.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Escribir ara tipo moto
    public static void escribirMoto(Moto moto) {

        File archivo = new File("src/Listado de Vehiculos.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println("");
            salida.print("3;" + moto.obtenerArregloObjeto()[1] + ";"
                    + moto.obtenerArregloObjeto()[2] + ";" + moto.obtenerArregloObjeto()[3] + ";"
                    + moto.obtenerArregloObjeto()[4] + ";" + moto.obtenerArregloObjeto()[5]);
            salida.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribirInformeAlquiler(Object[] informeAlquiler) {

        File archivo = new File("src/Informe de Vehiculos.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println("");
            salida.print(informeAlquiler[0] + ";"
                    + informeAlquiler[1] + ";" + informeAlquiler[2] + ";"
                    + informeAlquiler[3] + ";" + informeAlquiler[4] + ";" + informeAlquiler[5]);
            salida.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribirReporteHorasAlquiler(InformeAlquiler reporteHoras) {

        File archivo = new File("src/Reporte Horas de Alquiler.txt");
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println("");
            salida.print(reporteHoras.getVehiculo() + ";"
                    + reporteHoras.getMatricula() + ";" + reporteHoras.getFechaInicio() + ";"
                    + reporteHoras.getFechaFinal() + ";" + reporteHoras.getDiasAlquiler());
            salida.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Elimina todo el archivo---------------------------------------------------------------------
    public static void borrarArchivo() {

//        abrir un stream de escritura sobre el fichero. Para ello necesitaremos de un FileWriter y un BufferedWriter.
        BufferedWriter bw;
        try {
            //tener cuidado de que el fichero exista o se nos generará una excepción FileNotFoundException o IOException.
            bw = new BufferedWriter(new FileWriter("src/Listado de Vehiculos.txt"));
            bw.write("");  //escribir una línea vacía. Para ello utilizamos el método .write(). Borra todo el contenido archivo
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(EscribirArchivoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void borrarArchivoInformeVehiculos() {

//        abrir un stream de escritura sobre el fichero. Para ello necesitaremos de un FileWriter y un BufferedWriter.
        BufferedWriter bw;
        try {
            //tener cuidado de que el fichero exista o se nos generará una excepción FileNotFoundException o IOException.
            bw = new BufferedWriter(new FileWriter("src/Informe de Vehiculos.txt"));
            bw.write("");  //escribir una línea vacía. Para ello utilizamos el método .write(). Borra todo el contenido archivo
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(EscribirArchivoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void borrarArchivoReporteHorasVehiculos() {

//        abrir un stream de escritura sobre el fichero. Para ello necesitaremos de un FileWriter y un BufferedWriter.
        BufferedWriter bw;
        try {
            //tener cuidado de que el fichero exista o se nos generará una excepción FileNotFoundException o IOException.
            bw = new BufferedWriter(new FileWriter("src/Reporte Horas de Alquiler.txt"));
            bw.write("");  //escribir una línea vacía. Para ello utilizamos el método .write(). Borra todo el contenido archivo
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(EscribirArchivoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void borrarArchivoConfiguracionUsuario() {

//        abrir un stream de escritura sobre el fichero. Para ello necesitaremos de un FileWriter y un BufferedWriter.
        BufferedWriter bw;
        try {
            //tener cuidado de que el fichero exista o se nos generará una excepción FileNotFoundException o IOException.
            bw = new BufferedWriter(new FileWriter("src/Listado de Usuarios.txt"));
            bw.write("");  //escribir una línea vacía. Para ello utilizamos el método .write(). Borra todo el contenido archivo
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(EscribirArchivoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
