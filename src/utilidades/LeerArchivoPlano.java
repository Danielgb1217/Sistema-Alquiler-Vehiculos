package utilidades;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

public class LeerArchivoPlano {

    private static List<AbstractVehiculo> listadoVehiculos = new ArrayList<>();
    private static List<InformeAlquiler> listadoInformeAlquiler = new ArrayList<>();
    private static List<InformeAlquiler> reporteDisponibilidadVehiculos= new ArrayList<>();

    public static List<Usuario> cargarUsuarios(TipoUsuario[] tipos) {

        List<Usuario> listado = new ArrayList<>();  //Declara una lista de usuarios de tipo lista Usuario
        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

        try {
            archivo = new File("src/Listado de usuarios.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea;
//            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string
                //Instanciamos el objetos usuario con lo que leemos de la fila del archivo
                Usuario usuario = new Usuario(datos[0], datos[1], tipos[Byte.parseByte(datos[2]) - 1], datos[3], datos[4],
                        datos[5], Byte.parseByte(datos[6]), Boolean.parseBoolean(datos[7]), Boolean.parseBoolean(datos[8]));       //Este metodo recivo el arreglo de tipo TipoUsuario---> en esta linea hace uso
                listado.add(usuario);    //de ese arreglo tipos en la posicion [datos 3]-1 que es igual a la posicion
            }                            //del areglo tipos donde sacara la instancia de tipos determinada --> Administrador
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return listado;
    }

    //Leer datos de lista de Vehiculos
    public static List<AbstractVehiculo> cargarVehiculos(TipoVehiculo[] tipoVehiculo) {

        listadoVehiculos.clear();   //CONDICION NECESARIA PARA QUE AL MOMENTO DE LLAMAR A LA LISTA DESDE EL MDI NO ME
        //DUPLIQUE LOS VEHICULOS EN LAS TABLAS...PASA POR QUE NO ESTABA LIMPIANDO LA LISTA CADA
        //QUE LA LLAMABA Y ME REPETIA LOS VEHICULOS CAUNDO LA LLAMABA VARIAS VECES 
        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

        try {
            archivo = new File("src/Listado de Vehiculos.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea;
            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string

                //Es una camioneta codigo = 1 posicion 1 de la fila
                if (datos[0].equals("1")) {

                    AbstractVehiculo camioneta = new Camioneta(tipoVehiculo[Integer.parseInt(datos[0]) - 1],
                            Short.parseShort(datos[1]), datos[2],
                            Integer.parseInt(datos[3]), Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
                    listadoVehiculos.add(camioneta);
                } //Es un Carro codigo = 2 posicion 1 de la fila
                else if (datos[0].equals("2")) {

                    AbstractVehiculo carro = new Carro(tipoVehiculo[Integer.parseInt(datos[0]) - 1], Boolean.parseBoolean(datos[1]), datos[2],
                            Integer.parseInt(datos[3]), Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
                    listadoVehiculos.add(carro);
                } //Es un Carro codigo = 2 posicion 1 de la fila
                else if (datos[0].equals("3")) {

                    AbstractVehiculo moto = new Moto(tipoVehiculo[Integer.parseInt(datos[0]) - 1], Boolean.parseBoolean(datos[1]), datos[2], Integer.parseInt(datos[3]),
                            Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
                    listadoVehiculos.add(moto);
                } //Es un Carro codigo = 2 posicion 1 de la fila

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("arregloInformeAlquiler = " + listadoVehiculos);
        return listadoVehiculos;

    }

    public static List<InformeAlquiler> cargarInformeAlquiler() {

        listadoInformeAlquiler.clear();   //CONDICION NECESARIA PARA QUE AL MOMENTO DE LLAMAR A LA LISTA DESDE EL MDI NO ME
        //DUPLIQUE LOS VEHICULOS EN LAS TABLAS...PASA POR QUE NO ESTABA LIMPIANDO LA LISTA CADA
        //QUE LA LLAMABA Y ME REPETIA LOS VEHICULOS CAUNDO LA LLAMABA VARIAS VECES 
        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

        try {
            archivo = new File("src/Informe de Vehiculos.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea;
            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string

                //Es una camioneta codigo = 1 posicion 1 de la fila
                InformeAlquiler informeAlquiler = new InformeAlquiler(datos[0], datos[1],
                        datos[2], datos[3], datos[4], datos[5]);
//                  Object lista   = new Object {datos[0],datos[1],datos[2],datos[3],datos[4],datos[5]};
                listadoInformeAlquiler.add(informeAlquiler);
//listadoInformeAlquiler.add(arregloInformeAlquiler);

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return listadoInformeAlquiler;

    }

    public static List<InformeAlquiler> cargarReporteDisponibilidad() {

        reporteDisponibilidadVehiculos.clear();   //CONDICION NECESARIA PARA QUE AL MOMENTO DE LLAMAR A LA LISTA DESDE EL MDI NO ME
        //DUPLIQUE LOS VEHICULOS EN LAS TABLAS...PASA POR QUE NO ESTABA LIMPIANDO LA LISTA CADA
        //QUE LA LLAMABA Y ME REPETIA LOS VEHICULOS CAUNDO LA LLAMABA VARIAS VECES 
        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

        try {
            archivo = new File("src/Reporte Horas de Alquiler.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea;
            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string

                //Es una camioneta codigo = 1 posicion 1 de la fila
                InformeAlquiler reporte = new InformeAlquiler(datos[0], datos[1],
                        datos[2], datos[3], datos[4]);
//                  Object lista   = new Object {datos[0],datos[1],datos[2],datos[3],datos[4],datos[5]};
                reporteDisponibilidadVehiculos.add(reporte);
//listadoInformeAlquiler.add(arregloInformeAlquiler);

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return reporteDisponibilidadVehiculos;

    }

//    public static List<AbstractVehiculo> cargarCarros(TipoVehiculo[] tipoCarro) {
//
//        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
//        // List<Carro> listadoCarros = new ArrayList<>();
//        File archivo = null;    //Declara objeto de tipo archivo
//        FileReader fr = null;   //Objeto que permite leer archivos
//        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram
//
//        try {
//            archivo = new File("src/Listado de Vehiculos.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
//            fr = new FileReader(archivo);
//
//            br = new BufferedReader(fr);
//            String linea;
//            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
//            while ((linea = br.readLine()) != null) {
//
//                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string
//
//                //Es una camioneta codigo = 1 posicion 1 de la fila
//                if (datos[0].equals("2")) {
//
//                    AbstractVehiculo carro = new Carro(tipoCarro[Integer.parseInt(datos[0]) - 1], Boolean.parseBoolean(datos[1]), datos[2],
//                            Integer.parseInt(datos[3]), Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
//                    listadoVehiculos.add(carro);
//                } //Es un Carro codigo = 2 posicion 1 de la fila
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//
//            try {
//                if (null != fr) {
//                    fr.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//
//        return listadoVehiculos;
//
//    }
//
//    public static List<AbstractVehiculo> cargarMotos(TipoVehiculo[] tipoMoto) {
//
//        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
//        List<Moto> listadoMotos = new ArrayList<>();
//
//        File archivo = null;    //Declara objeto de tipo archivo
//        FileReader fr = null;   //Objeto que permite leer archivos
//        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram
//
//        try {
//            archivo = new File("src/Listado de Vehiculos.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
//            fr = new FileReader(archivo);
//
//            br = new BufferedReader(fr);
//            String linea;
//            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
//            while ((linea = br.readLine()) != null) {
//
//                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string
//
//                //Es una camioneta codigo = 1 posicion 1 de la fila
//                if (datos[0].equals("3")) {
//
//                    AbstractVehiculo moto = new Moto(tipoMoto[Integer.parseInt(datos[0]) - 1], Boolean.parseBoolean(datos[1]), datos[2], Integer.parseInt(datos[3]),
//                            Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
//                    listadoVehiculos.add(moto);
//                } //Es un Carro codigo = 2 posicion 1 de la fila
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//
//            try {
//                if (null != fr) {
//                    fr.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//
//        return listadoVehiculos;
//
//    }
}
