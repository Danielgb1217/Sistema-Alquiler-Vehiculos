package vista;

import Excepciones.UsuarioException;
import Excepciones.VehiculosException;
import controlador.*;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.*;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import utilidades.*;
import java.time.format.DateTimeFormatter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author tecnicoper1
 */
public class MdiVehiculos extends javax.swing.JFrame {

    private static List<Integer> vehiculoAlquilar;

    private AlquilaVehiculo alquilarVehiculo;
    private GestionUsuario gestionUsuario;
    private Usuario usuarioAutenticado;
    private GestionVehiculo gestionVehiculo;
    private AbstractVehiculo vehiculo;
    private AlquilaVehiculo alquilaVehiculo;
    private static List<InformeAlquiler> reporteHorasAlquiler = new ArrayList<>();
    private Encriptacion encriptar;
    private EnviarCorreo enviarCorreo;

    DefaultTableModel modeloTblCamionetas;
    DefaultTableModel modeloTblCarros;
    DefaultTableModel modeloTblMotos;
    DefaultTableModel modeloAlquilerVehiculo;
    DefaultTableModel modeloTblInformeAlquiler;
    DefaultTableModel modeloTblConfiguracionUsuario;
    DefaultTableModel modeloTblReporteDisponibilidadVehiculos;

    public MdiVehiculos() {
        initComponents();

        encriptar = new Encriptacion();
        enviarCorreo = new EnviarCorreo();

        gestionUsuario = new GestionUsuario(); //Instancio el control que permite crear la lista llenar usuarios y cargar
        alquilaVehiculo = new AlquilaVehiculo();    //Controlador para< alquilar vehiculos
        modeloTblCamionetas = (DefaultTableModel) tblListadosCamionetas.getModel();
        modeloTblCarros = (DefaultTableModel) tblListadoCarros.getModel();
        modeloTblMotos = (DefaultTableModel) tblListadoMotos.getModel();
        modeloAlquilerVehiculo = (DefaultTableModel) tblAlquilarVehiculo.getModel();
        modeloTblInformeAlquiler = (DefaultTableModel) tblInformeAlquiler.getModel();
        modeloTblConfiguracionUsuario = (DefaultTableModel) tblConfiguracionUsuario.getModel();
        modeloTblReporteDisponibilidadVehiculos = (DefaultTableModel) tblReporteDisponibilidadVehiculos.getModel();
        vehiculoAlquilar = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jifDefault = new javax.swing.JInternalFrame();
        jLabel25 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jifLogin = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jifListadoVehiculos = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadosCamionetas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListadoCarros = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListadoMotos = new javax.swing.JTable();
        jpConfiguracionVehiculo = new javax.swing.JPanel();
        btnActivar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jcbTipoVehiculo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jspCapacidadVehiculo = new javax.swing.JSpinner();
        chbExtras = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        chbCasco = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        chbDisponibilidad = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtValorAlquiler = new javax.swing.JTextField();
        btnAgregarVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGuardarConfiguracionVehiculo = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnGenerarReportePdf = new javax.swing.JButton();
        jifRegistrarUsuario = new javax.swing.JInternalFrame();
        jLabel11 = new javax.swing.JLabel();
        txtRegistrarNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRegistrarApellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRegistrarCedula = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRegistrarCorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRegistarPassword = new javax.swing.JPasswordField();
        btnRegistrarUsuario = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtRegistrarEdad = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jifAlquilarVehiculo = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAlquilarVehiculo = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jdFechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jdFechaFinal = new com.toedter.calendar.JDateChooser();
        bntConfirmarAlquiler = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jifInformeAlquiler = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblInformeAlquiler = new javax.swing.JTable();
        jifRecepcionVehiculo = new javax.swing.JInternalFrame();
        txtBuscarMatriculaRecepcionVehiculo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnBuscarMatriculaRecepcionVehiculo = new javax.swing.JButton();
        jpRecepcionVehiculoCamioneta = new javax.swing.JPanel();
        chbCojineria = new javax.swing.JCheckBox();
        chbLuces = new javax.swing.JCheckBox();
        chbAntena = new javax.swing.JCheckBox();
        chbRadio = new javax.swing.JCheckBox();
        chbCarroceria = new javax.swing.JCheckBox();
        chbTapetes = new javax.swing.JCheckBox();
        chbBotiquin = new javax.swing.JCheckBox();
        chbKitCarreteras = new javax.swing.JCheckBox();
        txtKmRecpcion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jpRecepcionVehiculo = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtpRecepcionVehiculo = new javax.swing.JTextPane();
        btnCalcularValorPagar = new javax.swing.JButton();
        txtValorPagar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jifConfiguracionUsuario = new javax.swing.JInternalFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblConfiguracionUsuario = new javax.swing.JTable();
        btnGuardarConfiguracionUsuario = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jifEstadisticaDisponibilidadVehiculos = new javax.swing.JInternalFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblReporteDisponibilidadVehiculos = new javax.swing.JTable();
        jdFechaInicialReporteDisponibilidad = new com.toedter.calendar.JDateChooser();
        jdFechaFinalReporteDisponibilidad = new com.toedter.calendar.JDateChooser();
        btnReporteDisponibilidad = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jcbReporteDisponibilidad = new javax.swing.JComboBox<>();
        jifInicio = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuPrincipal = new javax.swing.JMenu();
        mnuVehiculosDisponilbes = new javax.swing.JMenuItem();
        mnuAlquilarVehiculos = new javax.swing.JMenuItem();
        mnuRecepcionVehiculo = new javax.swing.JMenuItem();
        mnuReporteVehiculos = new javax.swing.JMenuItem();
        mnuEstadisticasDisponibilidad = new javax.swing.JMenu();
        mnuEstadisticaDisponibilidad = new javax.swing.JMenuItem();
        mnuCargarVehiculos = new javax.swing.JMenuItem();
        mnuConfiguracionUsuario = new javax.swing.JMenuItem();
        mnuCerrarSesion = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        jifDefault.setVisible(true);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Chevrolet_Camaro_SSBlack_450505.jpg"))); // NOI18N
        jLabel25.setText("jLabel25");

        javax.swing.GroupLayout jifDefaultLayout = new javax.swing.GroupLayout(jifDefault.getContentPane());
        jifDefault.getContentPane().setLayout(jifDefaultLayout);
        jifDefaultLayout.setHorizontalGroup(
            jifDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifDefaultLayout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jifDefaultLayout.setVerticalGroup(
            jifDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 519, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifLogin.setTitle("Login");
        jifLogin.setVisible(true);
        jifLogin.getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User*");
        jifLogin.getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 100, 60, 33);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password*");
        jifLogin.getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 140, 60, 34);
        jifLogin.getContentPane().add(txtLogin);
        txtLogin.setBounds(460, 100, 205, 33);
        jifLogin.getContentPane().add(txtPassword);
        txtPassword.setBounds(460, 140, 205, 34);

        btnIngresar.setText("Entrar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jifLogin.getContentPane().add(btnIngresar);
        btnIngresar.setBounds(460, 180, 100, 40);

        btnRegistrarse.setText("Registarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jifLogin.getContentPane().add(btnRegistrarse);
        btnRegistrarse.setBounds(560, 180, 110, 40);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.JPG"))); // NOI18N
        jLabel23.setText("Usuario");
        jifLogin.getContentPane().add(jLabel23);
        jLabel23.setBounds(40, 70, 1040, 550);

        desktopPane.add(jifLogin);
        jifLogin.setBounds(40, 40, 700, 370);
        try {
            jifLogin.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifListadoVehiculos.setClosable(true);
        jifListadoVehiculos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifListadoVehiculos.setIconifiable(true);
        jifListadoVehiculos.setMaximizable(true);
        jifListadoVehiculos.setTitle("Listado de Vehiculos");
        jifListadoVehiculos.setVisible(false);
        jifListadoVehiculos.getContentPane().setLayout(null);

        tblListadosCamionetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)}
            },
            new String [] {
                "Tipo", "Capacidad", "Matricula", "Km", "Disponibilidad", "Valor de Alquiler", "Activo/Inactivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Short.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListadosCamionetas);

        jifListadoVehiculos.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 620, 146);

        tblListadoCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)}
            },
            new String [] {
                "Tipo", "Extras", "Matricula", "Km", "Disponibilidad", "Valor de Alquiler", "Activo/Inactivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListadoCarros);

        jifListadoVehiculos.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 163, 620, 136);

        tblListadoMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)}
            },
            new String [] {
                "Tipo", "Casco", "Matricula", "Km", "Disponibilidad", "Valor de Alquiler", "Activo/Inactivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblListadoMotos);

        jifListadoVehiculos.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 305, 620, 149);

        jpConfiguracionVehiculo.setLayout(null);
        jifListadoVehiculos.getContentPane().add(jpConfiguracionVehiculo);
        jpConfiguracionVehiculo.setBounds(960, 500, 70, 40);

        btnActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActivar.JPG"))); // NOI18N
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(btnActivar);
        btnActivar.setBounds(910, 310, 60, 56);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo*");
        jifListadoVehiculos.getContentPane().add(jLabel5);
        jLabel5.setBounds(780, 80, 37, 14);

        jcbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camioneta", "Carro", "Moto" }));
        jifListadoVehiculos.getContentPane().add(jcbTipoVehiculo);
        jcbTipoVehiculo.setBounds(810, 80, 75, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Capacidad");
        jifListadoVehiculos.getContentPane().add(jLabel6);
        jLabel6.setBounds(710, 120, 62, 14);

        jspCapacidadVehiculo.setModel(new javax.swing.SpinnerNumberModel(Short.valueOf((short)0), Short.valueOf((short)0), Short.valueOf((short)10), Short.valueOf((short)1)));
        jifListadoVehiculos.getContentPane().add(jspCapacidadVehiculo);
        jspCapacidadVehiculo.setBounds(770, 120, 46, 21);

        chbExtras.setText("Extras");
        jifListadoVehiculos.getContentPane().add(chbExtras);
        chbExtras.setBounds(820, 120, 57, 23);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Complementarios");
        jifListadoVehiculos.getContentPane().add(jLabel4);
        jLabel4.setBounds(810, 100, 166, 14);

        chbCasco.setText("Casco");
        jifListadoVehiculos.getContentPane().add(chbCasco);
        chbCasco.setBounds(890, 120, 55, 23);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                      Configuracion de Vehiculos");
        jifListadoVehiculos.getContentPane().add(jLabel3);
        jLabel3.setBounds(700, 40, 245, 36);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Matricula*");
        jifListadoVehiculos.getContentPane().add(jLabel7);
        jLabel7.setBounds(710, 160, 62, 14);

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(txtMatricula);
        txtMatricula.setBounds(770, 150, 168, 20);
        jifListadoVehiculos.getContentPane().add(txtKm);
        txtKm.setBounds(770, 180, 168, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Km*");
        jifListadoVehiculos.getContentPane().add(jLabel8);
        jLabel8.setBounds(740, 190, 20, 14);

        chbDisponibilidad.setText("Disponibilidad");
        jifListadoVehiculos.getContentPane().add(chbDisponibilidad);
        chbDisponibilidad.setBounds(770, 220, 89, 23);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valor Alquiler*");
        jifListadoVehiculos.getContentPane().add(jLabel10);
        jLabel10.setBounds(700, 260, 68, 14);
        jifListadoVehiculos.getContentPane().add(txtValorAlquiler);
        txtValorAlquiler.setBounds(770, 260, 162, 20);

        btnAgregarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar.JPG"))); // NOI18N
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(btnAgregarVehiculo);
        btnAgregarVehiculo.setBounds(640, 310, 60, 56);

        btnEliminarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEliminar.JPG"))); // NOI18N
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(btnEliminarVehiculo);
        btnEliminarVehiculo.setBounds(700, 310, 60, 56);

        btnDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDesactivar.JPG"))); // NOI18N
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(btnDesactivar);
        btnDesactivar.setBounds(970, 310, 60, 55);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBuscar.JPG"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(btnBuscar);
        btnBuscar.setBounds(760, 310, 60, 56);

        btnGuardarConfiguracionVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar.JPG"))); // NOI18N
        btnGuardarConfiguracionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarConfiguracionVehiculoActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(btnGuardarConfiguracionVehiculo);
        btnGuardarConfiguracionVehiculo.setBounds(640, 400, 60, 56);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crudListadoVehiculos.JPG"))); // NOI18N
        jifListadoVehiculos.getContentPane().add(jLabel29);
        jLabel29.setBounds(590, 30, 440, 440);

        btnGenerarReportePdf.setText("Reporte PDF");
        btnGenerarReportePdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReportePdfActionPerformed(evt);
            }
        });
        jifListadoVehiculos.getContentPane().add(btnGenerarReportePdf);
        btnGenerarReportePdf.setBounds(530, 470, 130, 30);

        desktopPane.add(jifListadoVehiculos);
        jifListadoVehiculos.setBounds(640, 0, 102, 30);
        try {
            jifListadoVehiculos.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifRegistrarUsuario.setClosable(true);
        jifRegistrarUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRegistrarUsuario.setIconifiable(true);
        jifRegistrarUsuario.setMaximizable(true);
        jifRegistrarUsuario.setTitle("Registrarse");
        jifRegistrarUsuario.setVisible(false);
        jifRegistrarUsuario.getContentPane().setLayout(null);

        jLabel11.setText("Nombre*");
        jifRegistrarUsuario.getContentPane().add(jLabel11);
        jLabel11.setBounds(158, 38, 112, 32);
        jifRegistrarUsuario.getContentPane().add(txtRegistrarNombre);
        txtRegistrarNombre.setBounds(220, 40, 170, 32);

        jLabel12.setText("Apellido*");
        jifRegistrarUsuario.getContentPane().add(jLabel12);
        jLabel12.setBounds(158, 76, 120, 29);
        jifRegistrarUsuario.getContentPane().add(txtRegistrarApellido);
        txtRegistrarApellido.setBounds(220, 80, 170, 29);

        jLabel13.setText("C.C*");
        jifRegistrarUsuario.getContentPane().add(jLabel13);
        jLabel13.setBounds(158, 116, 120, 36);
        jifRegistrarUsuario.getContentPane().add(txtRegistrarCedula);
        txtRegistrarCedula.setBounds(220, 110, 170, 30);

        jLabel14.setText("Correo*");
        jifRegistrarUsuario.getContentPane().add(jLabel14);
        jLabel14.setBounds(150, 190, 70, 40);
        jifRegistrarUsuario.getContentPane().add(txtRegistrarCorreo);
        txtRegistrarCorreo.setBounds(220, 200, 242, 30);

        jLabel15.setText("Password");
        jifRegistrarUsuario.getContentPane().add(jLabel15);
        jLabel15.setBounds(150, 240, 70, 30);
        jifRegistrarUsuario.getContentPane().add(txtRegistarPassword);
        txtRegistarPassword.setBounds(220, 240, 240, 30);

        btnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRegistro.JPG"))); // NOI18N
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        jifRegistrarUsuario.getContentPane().add(btnRegistrarUsuario);
        btnRegistrarUsuario.setBounds(290, 310, 90, 30);

        jLabel20.setText("Edad");
        jifRegistrarUsuario.getContentPane().add(jLabel20);
        jLabel20.setBounds(160, 150, 120, 36);
        jifRegistrarUsuario.getContentPane().add(txtRegistrarEdad);
        txtRegistrarEdad.setBounds(220, 150, 170, 37);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroUsuario.JPG"))); // NOI18N
        jifRegistrarUsuario.getContentPane().add(jLabel26);
        jLabel26.setBounds(280, 10, 660, 460);

        desktopPane.add(jifRegistrarUsuario);
        jifRegistrarUsuario.setBounds(760, 110, 60, 90);
        try {
            jifRegistrarUsuario.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifAlquilarVehiculo.setClosable(true);
        jifAlquilarVehiculo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifAlquilarVehiculo.setIconifiable(true);
        jifAlquilarVehiculo.setMaximizable(true);
        jifAlquilarVehiculo.setTitle("Alquilar Vehiculo");
        jifAlquilarVehiculo.setVisible(false);
        jifAlquilarVehiculo.getContentPane().setLayout(null);

        tblAlquilarVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Vehiculo", "Capacidad-Extras-Casco", "Matricula", "Km", "Disponibilidad", "Valor Alquiler", "Estado Avtivo - Inactivo", "Alquilar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblAlquilarVehiculo);

        jifAlquilarVehiculo.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 6, 606, 520);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fecha Alquiler");
        jifAlquilarVehiculo.getContentPane().add(jLabel17);
        jLabel17.setBounds(740, 240, 100, 30);
        jifAlquilarVehiculo.getContentPane().add(jdFechaInicial);
        jdFechaInicial.setBounds(830, 240, 134, 30);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha Entrega");
        jifAlquilarVehiculo.getContentPane().add(jLabel18);
        jLabel18.setBounds(740, 290, 106, 30);
        jifAlquilarVehiculo.getContentPane().add(jdFechaFinal);
        jdFechaFinal.setBounds(830, 290, 134, 30);

        bntConfirmarAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bntRentar.JPG"))); // NOI18N
        bntConfirmarAlquiler.setText("Alquilar");
        bntConfirmarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConfirmarAlquilerActionPerformed(evt);
            }
        });
        jifAlquilarVehiculo.getContentPane().add(bntConfirmarAlquiler);
        bntConfirmarAlquiler.setBounds(830, 340, 140, 50);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alquilarVehiculo.JPG"))); // NOI18N
        jifAlquilarVehiculo.getContentPane().add(jLabel27);
        jLabel27.setBounds(620, 0, 410, 540);

        desktopPane.add(jifAlquilarVehiculo);
        jifAlquilarVehiculo.setBounds(640, 420, 106, 30);
        try {
            jifAlquilarVehiculo.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifInformeAlquiler.setClosable(true);
        jifInformeAlquiler.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifInformeAlquiler.setIconifiable(true);
        jifInformeAlquiler.setMaximizable(true);
        jifInformeAlquiler.setTitle("Informde de Alquiler");
        jifInformeAlquiler.setVisible(false);

        tblInformeAlquiler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Vehiculo", "Matricula", "Fecha de Despacho", "Fecha de Entrega", "Km  Alquiler"
            }
        ));
        tblInformeAlquiler.setEnabled(false);
        jScrollPane5.setViewportView(tblInformeAlquiler);

        javax.swing.GroupLayout jifInformeAlquilerLayout = new javax.swing.GroupLayout(jifInformeAlquiler.getContentPane());
        jifInformeAlquiler.getContentPane().setLayout(jifInformeAlquilerLayout);
        jifInformeAlquilerLayout.setHorizontalGroup(
            jifInformeAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        jifInformeAlquilerLayout.setVerticalGroup(
            jifInformeAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifInformeAlquilerLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        desktopPane.add(jifInformeAlquiler);
        jifInformeAlquiler.setBounds(180, 440, 768, 549);
        try {
            jifInformeAlquiler.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifRecepcionVehiculo.setClosable(true);
        jifRecepcionVehiculo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRecepcionVehiculo.setIconifiable(true);
        jifRecepcionVehiculo.setMaximizable(true);
        jifRecepcionVehiculo.setTitle("Recepcion de Vehiculos");
        jifRecepcionVehiculo.setVisible(false);
        jifRecepcionVehiculo.getContentPane().setLayout(null);

        txtBuscarMatriculaRecepcionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMatriculaRecepcionVehiculoActionPerformed(evt);
            }
        });
        jifRecepcionVehiculo.getContentPane().add(txtBuscarMatriculaRecepcionVehiculo);
        txtBuscarMatriculaRecepcionVehiculo.setBounds(770, 10, 100, 30);

        jLabel16.setText("Matricula");
        jifRecepcionVehiculo.getContentPane().add(jLabel16);
        jLabel16.setBounds(700, 10, 75, 29);

        btnBuscarMatriculaRecepcionVehiculo.setText("Buscar");
        btnBuscarMatriculaRecepcionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMatriculaRecepcionVehiculoActionPerformed(evt);
            }
        });
        jifRecepcionVehiculo.getContentPane().add(btnBuscarMatriculaRecepcionVehiculo);
        btnBuscarMatriculaRecepcionVehiculo.setBounds(870, 10, 82, 29);

        chbCojineria.setText("Cojineria");
        chbCojineria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbCojineriaActionPerformed(evt);
            }
        });

        chbLuces.setText("Luces");

        chbAntena.setText("Antena");

        chbRadio.setText("Radio");

        chbCarroceria.setText("Carroceria");

        chbTapetes.setText("Tapetes");

        chbBotiquin.setText("Botiquin");

        chbKitCarreteras.setText("Kit de Carreteras");

        jLabel19.setText("Km");

        javax.swing.GroupLayout jpRecepcionVehiculoCamionetaLayout = new javax.swing.GroupLayout(jpRecepcionVehiculoCamioneta);
        jpRecepcionVehiculoCamioneta.setLayout(jpRecepcionVehiculoCamionetaLayout);
        jpRecepcionVehiculoCamionetaLayout.setHorizontalGroup(
            jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecepcionVehiculoCamionetaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRecepcionVehiculoCamionetaLayout.createSequentialGroup()
                        .addComponent(txtKmRecpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbKitCarreteras)
                    .addComponent(chbBotiquin)
                    .addComponent(chbTapetes)
                    .addComponent(chbCarroceria)
                    .addComponent(chbRadio)
                    .addComponent(chbAntena)
                    .addComponent(chbLuces)
                    .addComponent(chbCojineria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpRecepcionVehiculoCamionetaLayout.setVerticalGroup(
            jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecepcionVehiculoCamionetaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(chbCojineria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbLuces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbAntena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbRadio)
                .addGap(6, 6, 6)
                .addComponent(chbCarroceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbTapetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbBotiquin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbKitCarreteras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKmRecpcion))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jifRecepcionVehiculo.getContentPane().add(jpRecepcionVehiculoCamioneta);
        jpRecepcionVehiculoCamioneta.setBounds(820, 190, 160, 270);

        jpRecepcionVehiculo.setEnabled(false);
        jpRecepcionVehiculo.setLayout(null);

        jScrollPane6.setViewportView(txtpRecepcionVehiculo);

        jpRecepcionVehiculo.add(jScrollPane6);
        jScrollPane6.setBounds(10, 20, 326, 109);

        jifRecepcionVehiculo.getContentPane().add(jpRecepcionVehiculo);
        jpRecepcionVehiculo.setBounds(640, 50, 350, 160);

        btnCalcularValorPagar.setText("Valor a Pagar");
        btnCalcularValorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularValorPagarActionPerformed(evt);
            }
        });
        jifRecepcionVehiculo.getContentPane().add(btnCalcularValorPagar);
        btnCalcularValorPagar.setBounds(660, 270, 110, 40);
        jifRecepcionVehiculo.getContentPane().add(txtValorPagar);
        txtValorPagar.setBounds(660, 230, 155, 37);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recepcionVehiculo.JPG"))); // NOI18N
        jifRecepcionVehiculo.getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 10, 630, 450);

        desktopPane.add(jifRecepcionVehiculo);
        jifRecepcionVehiculo.setBounds(780, 50, 107, 30);
        try {
            jifRecepcionVehiculo.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifConfiguracionUsuario.setClosable(true);
        jifConfiguracionUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifConfiguracionUsuario.setIconifiable(true);
        jifConfiguracionUsuario.setMaximizable(true);
        jifConfiguracionUsuario.setTitle("Configuración de Usuario");
        jifConfiguracionUsuario.setVisible(false);
        jifConfiguracionUsuario.getContentPane().setLayout(null);

        tblConfiguracionUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Correo", "Password", "Tipo Usuario", "Nombre", "Apellido", "Cedula", "Edad", "Estado de Vision", "Estado de Audición"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblConfiguracionUsuario);

        jifConfiguracionUsuario.getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(0, 0, 695, 511);

        btnGuardarConfiguracionUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar.JPG"))); // NOI18N
        btnGuardarConfiguracionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarConfiguracionUsuarioActionPerformed(evt);
            }
        });
        jifConfiguracionUsuario.getContentPane().add(btnGuardarConfiguracionUsuario);
        btnGuardarConfiguracionUsuario.setBounds(780, 410, 100, 80);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracionUsuario.JPG"))); // NOI18N
        jifConfiguracionUsuario.getContentPane().add(jLabel28);
        jLabel28.setBounds(600, -90, 430, 650);

        desktopPane.add(jifConfiguracionUsuario);
        jifConfiguracionUsuario.setBounds(310, 0, 110, 30);
        try {
            jifConfiguracionUsuario.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifEstadisticaDisponibilidadVehiculos.setClosable(true);
        jifEstadisticaDisponibilidadVehiculos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifEstadisticaDisponibilidadVehiculos.setIconifiable(true);
        jifEstadisticaDisponibilidadVehiculos.setMaximizable(true);
        jifEstadisticaDisponibilidadVehiculos.setTitle("Estadistica de Disponibilidad de Vehiculos");
        jifEstadisticaDisponibilidadVehiculos.setToolTipText("");
        jifEstadisticaDisponibilidadVehiculos.setVisible(false);

        tblReporteDisponibilidadVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vehiculo", "Matricula", "Fecha Alquiler", "Fecha Recepción", "Dias Alquilados"
            }
        ));
        jScrollPane8.setViewportView(tblReporteDisponibilidadVehiculos);

        btnReporteDisponibilidad.setText("Generar Reporte");
        btnReporteDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDisponibilidadActionPerformed(evt);
            }
        });

        jLabel21.setText("Fecha Fin");

        jLabel22.setText("Fecha Inicio");

        jcbReporteDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camioneta", "Carro", "Moto", " " }));
        jcbReporteDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReporteDisponibilidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jifEstadisticaDisponibilidadVehiculosLayout = new javax.swing.GroupLayout(jifEstadisticaDisponibilidadVehiculos.getContentPane());
        jifEstadisticaDisponibilidadVehiculos.getContentPane().setLayout(jifEstadisticaDisponibilidadVehiculosLayout);
        jifEstadisticaDisponibilidadVehiculosLayout.setHorizontalGroup(
            jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                                .addComponent(jdFechaInicialReporteDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaFinalReporteDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                        .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnReporteDisponibilidad))
                            .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jcbReporteDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jifEstadisticaDisponibilidadVehiculosLayout.setVerticalGroup(
            jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jcbReporteDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaFinalReporteDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaInicialReporteDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btnReporteDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jifEstadisticaDisponibilidadVehiculosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPane.add(jifEstadisticaDisponibilidadVehiculos);
        jifEstadisticaDisponibilidadVehiculos.setBounds(620, 0, 849, 228);
        try {
            jifEstadisticaDisponibilidadVehiculos.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifInicio.setClosable(true);
        jifInicio.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifInicio.setIconifiable(true);
        jifInicio.setMaximizable(true);
        jifInicio.setTitle("Inicio");
        jifInicio.setVisible(false);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoInicio.JPG"))); // NOI18N

        javax.swing.GroupLayout jifInicioLayout = new javax.swing.GroupLayout(jifInicio.getContentPane());
        jifInicio.getContentPane().setLayout(jifInicioLayout);
        jifInicioLayout.setHorizontalGroup(
            jifInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifInicioLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(86, 86, 86))
        );
        jifInicioLayout.setVerticalGroup(
            jifInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifInicioLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        desktopPane.add(jifInicio);
        jifInicio.setBounds(40, -10, 1089, 668);
        try {
            jifInicio.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        mnuPrincipal.setMnemonic('f');
        mnuPrincipal.setText("Menu");
        mnuPrincipal.setEnabled(false);

        mnuVehiculosDisponilbes.setMnemonic('o');
        mnuVehiculosDisponilbes.setText("Vehiculos Disponibles");
        mnuVehiculosDisponilbes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVehiculosDisponilbesActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuVehiculosDisponilbes);

        mnuAlquilarVehiculos.setMnemonic('a');
        mnuAlquilarVehiculos.setText("Alquilar Vehiculos");
        mnuAlquilarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlquilarVehiculosActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuAlquilarVehiculos);

        mnuRecepcionVehiculo.setText("Recepcion de Vehiculo");
        mnuRecepcionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRecepcionVehiculoActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuRecepcionVehiculo);

        mnuReporteVehiculos.setText("Reporte de Vehiculos");
        mnuReporteVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteVehiculosActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuReporteVehiculos);

        mnuEstadisticasDisponibilidad.setText("Estadistica de Disponibilidad de Vehiculos");

        mnuEstadisticaDisponibilidad.setMnemonic('s');
        mnuEstadisticaDisponibilidad.setText("Estadisticas de Disponibilidad");
        mnuEstadisticaDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstadisticaDisponibilidadActionPerformed(evt);
            }
        });
        mnuEstadisticasDisponibilidad.add(mnuEstadisticaDisponibilidad);

        mnuCargarVehiculos.setText("Cargar Vehiculos");
        mnuEstadisticasDisponibilidad.add(mnuCargarVehiculos);

        mnuPrincipal.add(mnuEstadisticasDisponibilidad);

        mnuConfiguracionUsuario.setText("Configuracion de usuario");
        mnuConfiguracionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfiguracionUsuarioActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuConfiguracionUsuario);

        mnuCerrarSesion.setText("Cerrar Sesión");
        mnuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarSesionActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuCerrarSesion);

        mnuSalir.setMnemonic('x');
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuSalir);

        menuBar.add(mnuPrincipal);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed
//Ingreso del Login----------------------------------------------
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        jifInicio.setVisible(true);
        //Validacion si se ha escrito algo en el user
        if (txtLogin.getText() == null || txtLogin.getText().compareTo("") == 0) {

            JOptionPane.showMessageDialog(this, "Debe diiligenciar el campo de Usuario", "Datos Faltantes", 0);

        } //Validacion si se ha escrito algo en password
        else if (txtPassword.getPassword().length == 0) {

            JOptionPane.showMessageDialog(this, "Debe diiligenciar el password", "Datos Faltantes", 0);
        } //validacion si es un correo electronico Expresion regular 
        else {

            try {
                if (gestionUsuario.validarEmail(txtLogin.getText())) {

                    //Validar que el usuario este REGISTRADO
                    usuarioAutenticado = gestionUsuario.validarUsuario(txtLogin.getText(), txtPassword.getText());
                    if (usuarioAutenticado != null) {

                        gestionVehiculo = new GestionVehiculo();    //cargo las vehiculos del archivo a la lista
                        JOptionPane.showMessageDialog(this, "Bienvenido " + usuarioAutenticado, "Ingresó como "
                                + usuarioAutenticado.getTipoUsuario().getDescripcion(), 2);
                        mnuPrincipal.setEnabled(true);
                        jifLogin.hide();
                        gestionPermisosMnu();   //habilita los menus
                    } else {
                        JOptionPane.showMessageDialog(this, "Error", "Datos de Ingreso Erroneos", 2);

                    }

                }
            } catch (UsuarioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }

        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void mnuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarSesionActionPerformed
        ocultarJiframes();
        mnuPrincipal.setEnabled(false);
        txtLogin.setText("");
        txtPassword.setText("");
        usuarioAutenticado = null;
        iniciarMenus(false);
        jifLogin.show();
        jifListadoVehiculos.hide();
        jpConfiguracionVehiculo.hide();
        jifInicio.hide();


    }//GEN-LAST:event_mnuCerrarSesionActionPerformed

    private void pintarLstVehiculos() {

        modeloTblCamionetas.getDataVector().removeAllElements();//
        modeloTblCarros.getDataVector().removeAllElements();
        modeloTblMotos.getDataVector().removeAllElements();
        modeloTblInformeAlquiler.getDataVector().removeAllElements();
//        for (int i = 0; i < gestionVehiculo.getLstVehiculos().size(); i++) {
//            gestionVehiculo.getLstVehiculos().remove(i);//
//        }
        for (AbstractVehiculo vehiculo : gestionVehiculo.getLstVehiculos()) {
            if (vehiculo.getTipoVehiculo().getCodigo() == (byte) 1) {
                //COn Instace of puedo saber si un objeto es instancia de alguna clase EJ...
                //vehiculo instanceof Camioneta
                modeloTblCamionetas.addRow(vehiculo.obtenerArregloObjeto());

            } else if (vehiculo.getTipoVehiculo().getCodigo() == (byte) 2) {

                modeloTblCarros.addRow(vehiculo.obtenerArregloObjeto());
            } else if (vehiculo.getTipoVehiculo().getCodigo() == (byte) 3) {
                modeloTblMotos.addRow(vehiculo.obtenerArregloObjeto());
            }
        }

        tblListadosCamionetas.setModel(modeloTblCamionetas);
        tblListadoCarros.setModel(modeloTblCarros);
        tblListadoMotos.setModel(modeloTblMotos);

        for (InformeAlquiler informeAlquiler : alquilaVehiculo.llenarInformeVehiculos()) {

            modeloTblInformeAlquiler.addRow(informeAlquiler.obtenerArregloObjeto());
        }
        tblInformeAlquiler.setModel(modeloTblInformeAlquiler);

    }

    private void pintarTblConfiguracionUsuario() {

        modeloTblConfiguracionUsuario.getDataVector().removeAllElements();//

        gestionUsuario.llenarTipoUsuario();
        gestionUsuario.llenarUsuarios();
        for (Usuario usuario : gestionUsuario.getLstUsuarios()) {
            modeloTblConfiguracionUsuario.addRow(usuario.obtenerArregloObjeto());
        }
        tblConfiguracionUsuario.setModel(modeloTblConfiguracionUsuario);
    }

    private void pintarTblReporteDisponibilidadVehiculos() {

        modeloTblReporteDisponibilidadVehiculos.getDataVector().removeAllElements();//

        for (InformeAlquiler reporteDisponibilidad : alquilaVehiculo.getReporteDisponibiidadVehculos()) {
            modeloTblReporteDisponibilidadVehiculos.addRow(reporteDisponibilidad.obtenerArregloObjetoReporteDisponibilidad());
        }
        tblReporteDisponibilidadVehiculos.setModel(modeloTblReporteDisponibilidadVehiculos);
    }

    private void iniciarTablas() {

        gestionVehiculo.llenarVehiculos();
        pintarLstVehiculos();
        verificarCamionetasInactivos();
        verificarCarrosInactivos();
        verificarMotosInactivos();
    }

    private void mnuVehiculosDisponilbesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVehiculosDisponilbesActionPerformed

        iniciarTablas();
        ocultarJiframes();
        jifListadoVehiculos.show();
        tblListadosCamionetas.clearSelection();
        tblListadoCarros.clearSelection();
        tblListadoMotos.clearSelection();
        if (jifListadoVehiculos.isIcon()) {   //SI esta minimizada al presiona en el menu se maximiza
            try {
                jifListadoVehiculos.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MdiVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mnuVehiculosDisponilbesActionPerformed

    private void mnuEstadisticaDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstadisticaDisponibilidadActionPerformed

        ocultarJiframes();
        jifEstadisticaDisponibilidadVehiculos.setVisible(true);
        alquilaVehiculo.llenarReporteDisponibilidadVehiculos();
        pintarTblReporteDisponibilidadVehiculos();


    }//GEN-LAST:event_mnuEstadisticaDisponibilidadActionPerformed
    private boolean validarCampoKm() {
        try {
            Integer.parseInt(txtKm.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarCampoKmRecepcion() {
        try {
            Integer.parseInt(txtKmRecpcion.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarCampoValorAlquiler() {
        try {
            Double.parseDouble(txtValorAlquiler.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarCampoCapacidad() {
        try {
            Double.parseDouble(txtValorAlquiler.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

//Validacion de campos de configurcion y captura de excepciones
    //Los campos numericos deben tener numeros y no letras y el campo de matricula debe terner un formato valido
    private boolean validarCamposConfiguracionVehiculo() throws VehiculosException {

        if (validarCampoKm() && validarCampoValorAlquiler()) {
            if (Integer.parseInt(txtKm.getText()) >= 0 && Double.parseDouble(txtValorAlquiler.getText()) > 0) {

                if (gestionVehiculo.validarMatricula(txtMatricula.getText())) {
                    return true;
                } else {
                    throw new VehiculosException("Debe diligenciar una placa valida");
                }
            }
        } else {
            throw new VehiculosException("Debe diligenciar valores numericos en los campos Km y Valor Alquiler");
        }
        return false;
    }

    private void limpiarCamposConfiguracion() {

        jspCapacidadVehiculo.setValue(0);
        chbExtras.setSelected(false);
        chbCasco.setSelected(false);
        txtMatricula.setText("");
        txtKm.setText("");
        chbDisponibilidad.setSelected(false);
        txtValorAlquiler.setText("");
        tblListadosCamionetas.clearSelection();
        tblListadoCarros.clearSelection();
        tblListadoMotos.clearSelection();

    }


    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed

        try {
            if (validarCamposConfiguracionVehiculo()) {
                String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
                String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
                String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();
                String capacidad = "" + jspCapacidadVehiculo.getValue();
                if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {

                    Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarCamioneta(camioneta)) {
                        //Convierto el objeto camionETA en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla

                        modeloTblCamionetas.addRow(camioneta.obtenerArregloObjeto());
                    }
//-------------------------------Validacion de carro---------------------
                } else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                    Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarCarro(carro)) {
                        //Convierto el objeto camion en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla

                        modeloTblCarros.addRow(carro.obtenerArregloObjeto());
                    }
                } //-------------------------------------validacion tipo moto
                else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                    Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarMoto(moto)) {
                        //Convierto el objeto camion en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla

                        modeloTblMotos.addRow(moto.obtenerArregloObjeto());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La capacidad de la camioneta debe ser mayor que cero", "Datos Erroneos", 0);
                }

            }
        } catch (VehiculosException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
        }

        limpiarCamposConfiguracion();


    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed

        String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
        String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
        String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();

        if (tblListadosCamionetas.getSelectedRow() != -1) {
            modeloTblCamionetas.removeRow(tblListadosCamionetas.getSelectedRow());
            tblListadosCamionetas.clearSelection();

        } else if (tblListadoCarros.getSelectedRow() != -1) {
            modeloTblCarros.removeRow(tblListadoCarros.getSelectedRow());
            tblListadoCarros.clearSelection();
        } else if (tblListadoMotos.getSelectedRow() != -1) {
            modeloTblMotos.removeRow(tblListadoMotos.getSelectedRow());
            tblListadoMotos.clearSelection();
        } else {
            try {
                if (validarCamposConfiguracionVehiculo()) {

                    if (itemCamioneta.compareToIgnoreCase("camioneta") == 0) {

                        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {

                            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
                            if (camioneta.toString().equals(camionetaTabla.toString())) {
                                modeloTblCamionetas.removeRow(i);
                                JOptionPane.showMessageDialog(this, "eliminar archivo", "Dat", 0);
                                break;
                            }
                        }
                    } //Validacion para el tipo carro  ---------------------------------------------------------------
                    else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

                            Carro carroTabla = obtenerObjetoTablaCarro(i);
                            if (carro.toString().equals(carroTabla.toString())) {
                                modeloTblCarros.removeRow(i);
                                JOptionPane.showMessageDialog(this, "eliminar archivo", "Warning", 0);
                                break;
                            }
                        }
                    } //------------------------------------validacion para tipo Moto
                    else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

                            Moto motoTabla = obtenerObjetoTablaMoto(i);
                            if (moto.toString().equals(motoTabla.toString())) {
                                modeloTblMotos.removeRow(i);
                                JOptionPane.showMessageDialog(this, "eliminar archivo", "Warning", 0);
                                break;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Debe diligenciar tipo Y/O Capacidad, casco, Eztra",
                                "Datos Faltantes", 0);
                    }
                    limpiarCamposConfiguracion();
                }
            } catch (VehiculosException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }
        }
        limpiarCamposConfiguracion();
    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void btnGuardarConfiguracionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarConfiguracionVehiculoActionPerformed
        escribirArchivoPlanoTablasVehiculos();
        JOptionPane.showMessageDialog(null, "Se han guardado los cambios con exito");
    }//GEN-LAST:event_btnGuardarConfiguracionVehiculoActionPerformed

    private void escribirArchivoPlanoTablasVehiculos() {
        EscribirArchivoPlano.borrarArchivo();

        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {

            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            EscribirArchivoPlano.escribir(camionetaTabla);

            //COndicion necesaria para eliminar vehiculos de la lista de informe de vehiculos alquilados si se 
            //valida que en la tabla de vehiculos se encuentra disponible
            if (camionetaTabla.isEstado()) {

                for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
                    if (camionetaTabla.getMatricula().equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                        modeloTblInformeAlquiler.removeRow(j);
                    }
                }

            }
        }

        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

            Carro carroTabla = obtenerObjetoTablaCarro(i);
            EscribirArchivoPlano.escribirCarro(carroTabla);

            //COndicion necesaria para eliminar vehiculos de la lista de informe de vehiculos alquilados si se 
            //valida que en la tabla de vehiculos se encuentra disponible
            if (carroTabla.isEstado()) {

                for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
                    if (carroTabla.getMatricula().equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                        modeloTblInformeAlquiler.removeRow(j);
                    }
                }

            }

        }

        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

            Moto motoTabla = obtenerObjetoTablaMoto(i);
            EscribirArchivoPlano.escribirMoto(motoTabla);

            //COndicion necesaria para eliminar vehiculos de la lista de informe de vehiculos alquilados si se 
            //valida que en la tabla de vehiculos se encuentra disponible
            if (motoTabla.isEstado()) {

                for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
                    if (motoTabla.getMatricula().equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                        modeloTblInformeAlquiler.removeRow(j);
                    }
                }

            }
        }

        escribirInformeAlquiler();

        limpiarCamposConfiguracion();
    }

    private void escribirArchivoPlanoTablaConfiguracionUsuario() {
        EscribirArchivoPlano.borrarArchivoConfiguracionUsuario();

        for (int i = 0; i < tblConfiguracionUsuario.getRowCount(); i++) {

            Usuario usuarioTabla = obtenerObjetoTablaConfiguracionUsaurio(i);
            EscribirArchivoPlano.escribir(usuarioTabla);
        }
    }


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            if (validarCamposConfiguracionVehiculo()) {
                String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
                String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
                String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();
                String capacidad = "" + jspCapacidadVehiculo.getValue();
                if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {

                    Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!buscarCamioneta(camioneta)) {
                        JOptionPane.showMessageDialog(this, "El vehiculo no se encuentra registrado", "Resultado", 0);
                    }
//-------------------------------Validacion de carro---------------------
                } else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                    Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!buscarCarro(carro)) {
                        JOptionPane.showMessageDialog(this, "El vehiculo no se encuentra registrado", "Resultado", 0);
                    }
                } //-------------------------------------validacion tipo moto
                else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                    Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!buscarMoto(moto)) {
                        JOptionPane.showMessageDialog(this, "El vehiculo no se encuentra registrado", "Resultado", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La capacidad de la camioneta debe ser mayor que cero", "Datos Erroneos", 0);
                }
            }
        } catch (VehiculosException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
        }
        limpiarCamposConfiguracion();
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void verificarCamionetasInactivos() {

        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            if (!gestionVehiculo.validarMatricula(camionetaTabla.getMatricula())) {
                modeloTblCamionetas.setValueAt(false, i, 6);
            } else {
                modeloTblCamionetas.setValueAt(true, i, 6);
            }
        }
    }

    private void verificarCarrosInactivos() {

        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
            Carro carroTabla = obtenerObjetoTablaCarro(i);
            if (!gestionVehiculo.validarMatricula(carroTabla.getMatricula())) {
                modeloTblCarros.setValueAt(false, i, 6);
            } else {
                modeloTblCarros.setValueAt(true, i, 6);
            }
        }
    }

    private void verificarMotosInactivos() {

        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
            Moto motoTabla = obtenerObjetoTablaMoto(i);
            if (!gestionVehiculo.validarMatricula(motoTabla.getMatricula())) {
                modeloTblMotos.setValueAt(false, i, 6);
            } else {
                modeloTblMotos.setValueAt(true, i, 6);
            }
        }
    }

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed

        String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
        String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
        String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();

        if (tblListadosCamionetas.getSelectedRow() != -1) {

            modeloTblCamionetas.setValueAt("Inhabilitado " + modeloTblCamionetas.getValueAt(tblListadosCamionetas.getSelectedRow(), 2), tblListadosCamionetas.getSelectedRow(), 2);
            modeloTblCamionetas.setValueAt(false, tblListadosCamionetas.getSelectedRow(), 4);
            modeloTblCamionetas.setValueAt(false, tblListadosCamionetas.getSelectedRow(), 6);
            tblListadosCamionetas.setSelectionForeground(Color.RED);
            tblListadosCamionetas.clearSelection();

        } else if (tblListadoCarros.getSelectedRow() != -1) {

            modeloTblCarros.setValueAt("Inhabilitado " + modeloTblCarros.getValueAt(tblListadoCarros.getSelectedRow(), 2), tblListadoCarros.getSelectedRow(), 2);
            modeloTblCarros.setValueAt(false, tblListadoCarros.getSelectedRow(), 4);
            modeloTblCarros.setValueAt(false, tblListadoCarros.getSelectedRow(), 6);
            tblListadoCarros.setSelectionForeground(Color.RED);
            tblListadoCarros.clearSelection();

        } else if (tblListadoMotos.getSelectedRow() != -1) {

            modeloTblMotos.setValueAt("Inhabilitado " + modeloTblMotos.getValueAt(tblListadoMotos.getSelectedRow(), 2), tblListadoMotos.getSelectedRow(), 2);
            modeloTblMotos.setValueAt(false, tblListadoMotos.getSelectedRow(), 4);
            modeloTblMotos.setValueAt(false, tblListadoMotos.getSelectedRow(), 6);
            tblListadoMotos.setSelectionForeground(Color.RED);
            tblListadoMotos.clearSelection();
        } else {
            try {
                if (validarCamposConfiguracionVehiculo()) {
                    String capacidad = "" + jspCapacidadVehiculo.getValue();
                    if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {
                        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
                            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
                            if (camioneta.getMatricula().equals(camionetaTabla.getMatricula())) {

                                modeloTblCamionetas.setValueAt("Inhabilitado " + modeloTblCamionetas.getValueAt(i, 2), i, 2);
                                modeloTblCamionetas.setValueAt(false, i, 4);
                                modeloTblCamionetas.setValueAt(false, i, 6);
                                tblListadosCamionetas.setSelectionForeground(Color.RED);
                                JOptionPane.showMessageDialog(this, "Camioneta desactivada", "Dat", 0);
                                break;
                            }
                        }

                    } //Validacion para el tipo carro  ---------------------------------------------------------------
                    else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

                            Carro carroTabla = obtenerObjetoTablaCarro(i);
                            if (carro.getMatricula().equals(carroTabla.getMatricula())) {

                                modeloTblCarros.setValueAt("Inhabilitado " + modeloTblCarros.getValueAt(i, 2), i, 2);
                                modeloTblCarros.setValueAt(false, i, 4);
                                modeloTblCarros.setValueAt(false, i, 6);
                                tblListadoCarros.setSelectionForeground(Color.RED);
                                JOptionPane.showMessageDialog(this, "Carro desactivado", "Dat", 0);
                                break;
                            }
                        }

                    } //------------------------------------validacion para tipo Moto
                    else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

                            Moto motoTabla = obtenerObjetoTablaMoto(i);
                            if (moto.getMatricula().equals(motoTabla.getMatricula())) {

                                modeloTblMotos.setValueAt("Inhabilitado " + modeloTblMotos.getValueAt(i, 2), i, 2);
                                modeloTblMotos.setValueAt(false, i, 4);
                                modeloTblMotos.setValueAt(false, i, 6);
                                tblListadoMotos.setSelectionForeground(Color.RED);
                                JOptionPane.showMessageDialog(this, "Moto desactivada", "Dat", 0);
                                break;
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Debe diligenciar tipo Y/O Capacidad, casco, Eztra",
                                "Datos Faltantes", 0);
                    }
                    limpiarCamposConfiguracion();

                }
            } catch (VehiculosException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }
        }

        limpiarCamposConfiguracion();


    }//GEN-LAST:event_btnDesactivarActionPerformed


    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed

        String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
        String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
        String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();

        if (tblListadosCamionetas.getSelectedRow() != -1) {

            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modeloTblCamionetas.getValueAt(tblListadosCamionetas.getSelectedRow(), 2).toString().split(" ");
                modeloTblCamionetas.setValueAt(datos[1], tblListadosCamionetas.getSelectedRow(), 2);
                modeloTblCamionetas.setValueAt(true, tblListadosCamionetas.getSelectedRow(), 6);
                tblListadosCamionetas.clearSelection();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }

        } else if (tblListadoCarros.getSelectedRow() != -1) {

            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modeloTblCarros.getValueAt(tblListadoCarros.getSelectedRow(), 2).toString().split(" ");
                modeloTblCarros.setValueAt(datos[1], tblListadoCarros.getSelectedRow(), 2);
                modeloTblCarros.setValueAt(true, tblListadoCarros.getSelectedRow(), 6);
                tblListadoCarros.clearSelection();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }

        } else if (tblListadoMotos.getSelectedRow() != -1) {

            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modeloTblMotos.getValueAt(tblListadoMotos.getSelectedRow(), 2).toString().split(" ");
                modeloTblMotos.setValueAt(datos[1], tblListadoMotos.getSelectedRow(), 2);
                modeloTblMotos.setValueAt(true, tblListadoMotos.getSelectedRow(), 6);
                tblListadoMotos.clearSelection();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }
        } else {
            try {
                if (validarCamposConfiguracionVehiculo()) {
                    String capacidad = "" + jspCapacidadVehiculo.getValue();
                    if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {
                        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
                            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);

                            if (camionetaTabla.getMatricula().compareTo("Inhabilitado " + camioneta.getMatricula()) == 0) {

                                String[] datos = modeloTblCamionetas.getValueAt(i, 2).toString().split(" ");
                                modeloTblCamionetas.setValueAt(datos[1], i, 2);
                                modeloTblCamionetas.setValueAt(true, i, 6);
                                JOptionPane.showMessageDialog(this, "Camioneta Activada", "Dat", 0);
                                break;
                            }
                        }

                    } //Validacion para el tipo carro  ---------------------------------------------------------------
                    else if (itemCamioneta.compareToIgnoreCase("carro") == 0) {

                        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

                            Carro carroTabla = obtenerObjetoTablaCarro(i);
                            if (carroTabla.getMatricula().compareTo("Inhabilitado " + carro.getMatricula()) == 0) {

                                String[] datos = modeloTblCarros.getValueAt(i, 2).toString().split(" ");
                                modeloTblCarros.setValueAt(datos[1], i, 2);
                                modeloTblCarros.setValueAt(true, i, 6);
                                JOptionPane.showMessageDialog(this, "Carro Activado", "Dat", 0);
                                break;
                            }
                        }

                    } //------------------------------------validacion para tipo Moto
                    else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

                            Moto motoTabla = obtenerObjetoTablaMoto(i);
                            if (motoTabla.getMatricula().compareTo("Inhabilitado " + moto.getMatricula()) == 0) {

                                String[] datos = modeloTblMotos.getValueAt(i, 2).toString().split(" ");
                                modeloTblMotos.setValueAt(datos[1], i, 2);
                                modeloTblMotos.setValueAt(true, i, 6);
                                JOptionPane.showMessageDialog(this, "Moto Activada", "Dat", 0);
                                break;
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Debe diligenciar tipo Y/O Capacidad, casco, Eztra",
                                "Datos Faltantes", 0);
                    }
                    limpiarCamposConfiguracion();

                }
            } catch (VehiculosException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }
        }
        limpiarCamposConfiguracion();
    }//GEN-LAST:event_btnActivarActionPerformed

    private boolean validarRegistroUsuario() {

        try {
            if (gestionUsuario.validarEmail(txtRegistrarCorreo.getText())) {
                if (txtRegistrarNombre.getText().compareTo("") != 0 && txtRegistarPassword.getText().compareTo("") != 0
                        && txtRegistrarApellido.getText().compareTo("") != 0 && txtRegistrarCedula.getText().compareTo("") != 0) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(this, "Debe diligenciar todos los campos", "Error", 0);
                }
            }
        } catch (UsuarioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
        }
        return false;
    }


    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed

        Usuario usuario = new Usuario(txtRegistrarCorreo.getText(),
                encriptar.encriptarPassword("1217", txtRegistarPassword.getText()),
                new TipoUsuario((byte) 2, "2"), txtRegistrarNombre.getText(),
                txtRegistrarApellido.getText(), txtRegistrarCedula.getText(), Byte.parseByte(txtRegistrarEdad.getText()),
                true, true);

        if (validarRegistroUsuario()) {

            EscribirArchivoPlano.escribir(usuario);
            gestionUsuario.llenarUsuarios();
            jifRegistrarUsuario.hide();
        }

    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        jifRegistrarUsuario.setVisible(true);
        txtRegistarPassword.setVisible(true);
        txtRegistrarNombre.setVisible(true);
        txtRegistrarApellido.setVisible(true);
        txtRegistrarCedula.setVisible(true);
        txtRegistrarCorreo.setVisible(true);

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void ocultarJiframes() {

        jifAlquilarVehiculo.setVisible(false);
        jifInformeAlquiler.setVisible(false);
        jifListadoVehiculos.setVisible(false);
        jifLogin.setVisible(false);
        jifRecepcionVehiculo.setVisible(false);
        jifRegistrarUsuario.setVisible(false);
        jifConfiguracionUsuario.setVisible(false);
        jifEstadisticaDisponibilidadVehiculos.setVisible(false);
        jifInicio.setVisible(false);

    }

    private void validarVehiculosDisponibles() {
        //Metodo para verificar que los vehiculos que no esten activos no aparezcan como disponibles
        //Verifica si en la columba de activo o inactivo de la tabla esta false entonces los vehiculos deben estar NO DISOPONI
        for (int i = 0; i < modeloTblCamionetas.getRowCount(); i++) {
            if (!(boolean) modeloTblCamionetas.getValueAt(i, 6)) {
                modeloTblCamionetas.setValueAt(false, i, 4);
            }
        }
        for (int i = 0; i < modeloTblCarros.getRowCount(); i++) {
            if (!(boolean) modeloTblCarros.getValueAt(i, 6)) {
                modeloTblCarros.setValueAt(false, i, 4);
            }
        }
        for (int i = 0; i < modeloTblMotos.getRowCount(); i++) {
            if (!(boolean) modeloTblMotos.getValueAt(i, 6)) {
                modeloTblMotos.setValueAt(false, i, 4);
            }
        }
        escribirArchivoPlanoTablasVehiculos();

    }

    private void mnuAlquilarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlquilarVehiculosActionPerformed
        pintarTablaAlquilarVehiculos();
        ocultarJiframes();
        jifAlquilarVehiculo.setVisible(true);

    }//GEN-LAST:event_mnuAlquilarVehiculosActionPerformed

    private void pintarTablaAlquilarVehiculos() {

        iniciarTablas();
        validarVehiculosDisponibles();
        modeloAlquilerVehiculo.getDataVector().removeAllElements();//Limpia la tabla para que no se duplique informacion

        Object filaCamionetas[] = new Object[modeloTblCamionetas.getColumnCount() + 1];
        Object filaCarros[] = new Object[modeloTblCarros.getColumnCount() + 1];
        Object filaMotos[] = new Object[modeloTblMotos.getColumnCount() + 1];

        for (int i = 0; i < modeloTblCamionetas.getRowCount(); i++) {
            if ((boolean) modeloTblCamionetas.getValueAt(i, 4)) {

                for (int j = 0; j < modeloTblCamionetas.getColumnCount(); j++) {
                    filaCamionetas[j] = modeloTblCamionetas.getValueAt(i, j);
                }
                filaCamionetas[7] = false;
                modeloAlquilerVehiculo.addRow(filaCamionetas);
            }
        }
        for (int i = 0; i < modeloTblCarros.getRowCount(); i++) {
            if ((boolean) modeloTblCarros.getValueAt(i, 4)) {
                for (int j = 0; j < modeloTblCarros.getColumnCount(); j++) {
                    filaCarros[j] = modeloTblCarros.getValueAt(i, j);
                }
                filaCarros[7] = false;
                modeloAlquilerVehiculo.addRow(filaCarros);
            }
        }
        for (int i = 0; i < modeloTblMotos.getRowCount(); i++) {
            if ((boolean) modeloTblMotos.getValueAt(i, 4)) {
                for (int j = 0; j < modeloTblMotos.getColumnCount(); j++) {
                    filaMotos[j] = modeloTblMotos.getValueAt(i, j);
                }
                filaMotos[7] = false;
                modeloAlquilerVehiculo.addRow(filaMotos);
            }
        }
        tblAlquilarVehiculo.setModel(modeloAlquilerVehiculo);

    }

    private void calcularDiasAlquiler(int numeroFila) {

        try {
            LocalDate fecha = LocalDate.of(jdFechaInicial.getDate().getYear() + 1900, jdFechaInicial.getDate().getMonth() + 1,
                    jdFechaInicial.getDate().getDate());

            int diaAlquiler = fecha.getDayOfMonth();

            LocalDate fechaFinal = LocalDate.of(jdFechaFinal.getDate().getYear() + 1900, jdFechaFinal.getDate().getMonth() + 1,
                    jdFechaFinal.getDate().getDate());

            int diaEntrega = fechaFinal.getDayOfMonth();

            if (fechaFinal.isBefore(fecha)) {
                JOptionPane.showMessageDialog(this, "La fecha de entrega no puede ser menor a la fecha de alquiler", "Datos Erroneos", 0);
            } else {
                int diasAlquiler = diaEntrega - diaAlquiler;
                if (diasAlquiler == 0) {
                    diasAlquiler = 1;
                }

                modeloTblInformeAlquiler.addRow(obtenerArregloObjetoInformeAlquiler(numeroFila, diasAlquiler));

                //LLena la lista de reposte de horas para hallar la disponibilidad
                reporteHorasAlquiler.add(new InformeAlquiler(devolverVehiculoAlquilado(numeroFila).getTipoVehiculo().getTipoVehiculo(),
                        devolverVehiculoAlquilado(numeroFila).getMatricula(), fecha, fechaFinal, diasAlquiler));
//               

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Debe diligenciar correctamente las fechas", "Datos Erroneos", 0);
        }

    }

    private Object[] obtenerArregloObjetoInformeAlquiler(int numeroFila, int diasAlquiler) {
        Object[] informeAlquiler = {usuarioAutenticado.toString(), devolverVehiculoAlquilado(numeroFila).getTipoVehiculo().getTipoVehiculo(),
            devolverVehiculoAlquilado(numeroFila).getMatricula(), LocalDate.of(jdFechaInicial.getDate().getYear() + 1900, jdFechaInicial.getDate().getMonth() + 1,
            jdFechaInicial.getDate().getDate()), LocalDate.of(jdFechaFinal.getDate().getYear() + 1900, jdFechaFinal.getDate().getMonth() + 1,
            jdFechaFinal.getDate().getDate()),
            devolverVehiculoAlquilado(numeroFila).getKm()};
        JOptionPane.showMessageDialog(this, "Acaba de alquilar un vehiculo tipo " + informeAlquiler[1] + " de placas "
                + informeAlquiler[2] + "", "Congratulations", 2);

        enviarCorreo.enviarCorreo("El usuario " + usuarioAutenticado.toString() + " Acaba de alquilar un vehiculo tipo " + informeAlquiler[1] + " de placas "
                + informeAlquiler[2]);

        return informeAlquiler;
    }

    private void bntConfirmarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConfirmarAlquilerActionPerformed

        if(usuarioAutenticado.isAudicion() && usuarioAutenticado.isVision()&& 
                usuarioAutenticado.getEdad() >= (byte)18){
        
        //guarda en una lista las filas en donde se presenta true en el campo de alquilar vehiculos 
        vehiculoAlquilar.clear();
        for (int i = 0; i < modeloAlquilerVehiculo.getRowCount(); i++) {

            if ((boolean) modeloAlquilerVehiculo.getValueAt(i, 7)) {
//            numeroFila = tblAlquilarVehiculo.getSelectedRow();
                vehiculoAlquilar.add(i);        //Lista con los numero de las filas en donde estan alquilados los vehicu
            }
        }

        for (Integer numeroFila : vehiculoAlquilar) {
            Usuario usuario = usuarioAutenticado;
            AbstractVehiculo vehiculoAlquilado = devolverVehiculoAlquilado(numeroFila);
            if (vehiculoAlquilado instanceof Camioneta) {
                for (int i = 0; i < modeloTblCamionetas.getRowCount(); i++) {
                    if (modeloTblCamionetas.getValueAt(i, 2).toString().compareToIgnoreCase(modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString()) == 0) {
                        modeloTblCamionetas.setValueAt(false, i, 4);
                    }
                }

            } else if (vehiculoAlquilado instanceof Carro) {
                for (int i = 0; i < modeloTblCarros.getRowCount(); i++) {
                    if (modeloTblCarros.getValueAt(i, 2).toString().compareToIgnoreCase(modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString()) == 0) {
                        modeloTblCarros.setValueAt(false, i, 4);
                    }
                }
            } else if (vehiculoAlquilado instanceof Moto) {
                for (int i = 0; i < modeloTblMotos.getRowCount(); i++) {
                    if (modeloTblMotos.getValueAt(i, 2).toString().compareToIgnoreCase(modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString()) == 0) {
                        modeloTblMotos.setValueAt(false, i, 4);
                    }
                }
            }

            modeloAlquilerVehiculo.setValueAt(false, numeroFila, 4);
            calcularDiasAlquiler(numeroFila);

        }
        escribirArchivoPlanoTablasVehiculos();  //Actualiza el valor  de la tabla de alquilar quitando de la lista
//                //el vehiculo que ya no esta disponible
        escribirInformeAlquiler();
        escribirReporteHorasAlquilerVehiculos();

        ocultarJiframes();
        
        }else{
            JOptionPane.showMessageDialog(this, "El usuario no puede alquilar vehiculos", "Advertencia", 0);
        }

    }//GEN-LAST:event_bntConfirmarAlquilerActionPerformed

    private void escribirInformeAlquiler() {

//     Escribo el vehiculo en la lista de infrome vehiculos y los guardo en un archivo plano
        EscribirArchivoPlano.borrarArchivoInformeVehiculos();
//        JOptionPane.showMessageDialog(null, tblInformeAlquiler.getRowCount());
        for (int i = 0; i < tblInformeAlquiler.getRowCount(); i++) {

            Object[] informeAlquiler = obtenerObjetoTablaInformeAlquiler(i);
            EscribirArchivoPlano.escribirInformeAlquiler(informeAlquiler);
        }

    }

    //Escribo en un archivo plano la lista creada con los vehculos alquilados y sus respectivas fechas de entrega y salida
    private void escribirReporteHorasAlquilerVehiculos() {

        alquilaVehiculo.llenarReporteDisponibilidadVehiculos();
        pintarTblReporteDisponibilidadVehiculos();
        Integer diasAlquilado;
//        EscribirArchivoPlano.borrarArchivoReporteHorasVehiculos();
        for (InformeAlquiler reporteHoras : this.reporteHorasAlquiler) {

//            for (int i = 0; i < modeloTblReporteDisponibilidadVehiculos.getRowCount(); i++) {
//                if (reporteHoras.getMatricula().equals(modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 1))) {
//                    diasAlquilado = Integer.parseInt("" + reporteHoras.getDiasAlquiler())
//                            + Integer.parseInt("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 4));
//                    reporteHoras.setDiasAlquiler(diasAlquilado);
//                    reporteHoras.setFechaInicio(modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 2));
//                }
//            }
            EscribirArchivoPlano.escribirReporteHorasAlquiler(reporteHoras);
        }
        this.reporteHorasAlquiler.clear();
    }


    private void txtBuscarMatriculaRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMatriculaRecepcionVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMatriculaRecepcionVehiculoActionPerformed

    private void chbCojineriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbCojineriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbCojineriaActionPerformed

    private void mnuRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRecepcionVehiculoActionPerformed
        ocultarJiframes();
        jpRecepcionVehiculo.setVisible(false);
        jifRecepcionVehiculo.setVisible(true);


    }//GEN-LAST:event_mnuRecepcionVehiculoActionPerformed

    private void mnuReporteVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteVehiculosActionPerformed

        iniciarTablas();
        ocultarJiframes();

        jifInformeAlquiler.setVisible(true);

    }//GEN-LAST:event_mnuReporteVehiculosActionPerformed

    private void btnBuscarMatriculaRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMatriculaRecepcionVehiculoActionPerformed

        for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
            if (txtBuscarMatriculaRecepcionVehiculo.getText().equalsIgnoreCase(modeloTblInformeAlquiler.getValueAt(j, 2).toString())) {
                jpRecepcionVehiculo.setVisible(true);
//                txtValorPagar.setVisible(false);
                txtpRecepcionVehiculo.setText("Vehiculo tipo " + modeloTblInformeAlquiler.getValueAt(j, 1)
                        + " de placas " + modeloTblInformeAlquiler.getValueAt(j, 2) + " con " + modeloTblInformeAlquiler.getValueAt(j, 5)
                        + " Km");

                //Pregunte por el valor de kilometros con los que recibe el vehiculo
                txtKmRecpcion.setText(JOptionPane.showInputDialog(null, "Ingrese "
                        + "el numero de kilometros con los que recibe el vehiculo"));

                if (validarCampoKmRecepcion()) {

//Si el vehiculo del informe de alquiler registrado es de tipo ----camioneta carro o moto
                    switch ("" + modeloTblInformeAlquiler.getValueAt(j, 1)) {

                        case "Camioneta":
//Comparo la matricula del vehiculo de listado alquilados  con la tabla de camionetas
                            for (int x = 0; x < tblListadosCamionetas.getRowCount(); x++) {
                                if (modeloTblCamionetas.getValueAt(x, 2).equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                                    //Si encuentro coincidencia instancio el nuevo vehiculo para abstraer el objeto vehiculo
                                    //************************************ Instancia de Vehiculo***********************************              
                                    AbstractVehiculo vehiculo = new Camioneta(new TipoVehiculo("Camioneta", (byte) 1),
                                            (short) modeloTblCamionetas.getValueAt(x, 1),
                                            modeloTblCamionetas.getValueAt(x, 2).toString(),
                                            (int) modeloTblCamionetas.getValueAt(x, 3),
                                            (boolean) modeloTblCamionetas.getValueAt(x, 4),
                                            (double) modeloTblCamionetas.getValueAt(x, 5));
//si el kilometraje ingresado en la recepcion es menor que los km iniciales del vehiculo sale del ciclo
                                    if (Integer.parseInt(txtKmRecpcion.getText()) < vehiculo.getKm()) {
                                        JOptionPane.showMessageDialog(this, "Los km ingresados son errados",
                                                "Error", 0);
                                    } else {
                                        txtpRecepcionVehiculo.setText("" + vehiculo.getKm());

                                        //**********************************Intancia de Usuario********************************
                                        Usuario usuario = usuarioAutenticado;

                                        //*************************Km recorridos por el vehiculo neesarios para calcular el costo
                                        int kmRecorridos = Integer.parseInt(txtKmRecpcion.getText()) - Integer.parseInt(""
                                                + modeloTblCamionetas.getValueAt(x, 3));

                                        modeloTblCamionetas.setValueAt(true, x, 4);
                                        modeloTblCamionetas.setValueAt(txtKmRecpcion.getText(), x, 3);
                                        escribirArchivoPlanoTablasVehiculos();
//llamada al metodo de alquilar vehiculo del controlador pasando los parametros correspondientes
                                        double costoAlquiler = alquilaVehiculo.alquilarVehiculo(vehiculo,
                                                usuario, kmRecorridos);
                                        txtValorPagar.setText("" + costoAlquiler);
                                        break;
                                    }
                                }
                            }
                            break;

                        case "Carro":
                            for (int x = 0; x < tblListadoCarros.getRowCount(); x++) {
                                if (modeloTblCarros.getValueAt(x, 2).equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                                    //Si encuentro coincidencia instancio el nuevo vehiculo para abstraer el objeto vehiculo
                                    //************************************ Instancia de Vehiculo***********************************              
                                    AbstractVehiculo vehiculo = new Carro(new TipoVehiculo("Carro", (byte) 2),
                                            (boolean) modeloTblCarros.getValueAt(x, 1),
                                            modeloTblCarros.getValueAt(x, 2).toString(),
                                            (int) modeloTblCarros.getValueAt(x, 3),
                                            (boolean) modeloTblCarros.getValueAt(x, 4),
                                            (double) modeloTblCarros.getValueAt(x, 5));

                                    //**********************************Intancia de Usuario********************************
                                    Usuario usuario = usuarioAutenticado;

                                    if (Integer.parseInt(txtKmRecpcion.getText()) < vehiculo.getKm()) {
                                        JOptionPane.showMessageDialog(this, "Los km ingresados son errados",
                                                "Error", 0);
                                    } else {
                                        txtpRecepcionVehiculo.setText("" + vehiculo.getKm());

                                        //*************************Km recorridos por el vehiculo neesarios para calcular el costo
                                        int kmRecorridos = Integer.parseInt(txtKmRecpcion.getText()) - Integer.parseInt(""
                                                + modeloTblCarros.getValueAt(x, 3));

                                        modeloTblCarros.setValueAt(true, x, 4);
                                        modeloTblCarros.setValueAt(txtKmRecpcion.getText(), x, 3);
                                        escribirArchivoPlanoTablasVehiculos();
                                        //llamada al metodo de alquilar vehiculo del controlador pasando los parametros correspondientes
                                        double costoAlquiler = alquilaVehiculo.alquilarVehiculo(vehiculo,
                                                usuario, kmRecorridos);
                                        txtValorPagar.setText("" + costoAlquiler);
                                        break;
                                    }
                                }

                            }
                            break;

                        case "Moto":
                            for (int x = 0; x < tblListadoMotos.getRowCount(); x++) {
                                if (tblListadoMotos.getValueAt(x, 2).equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                                    //Si encuentro coincidencia instancio el nuevo vehiculo para abstraer el objeto vehiculo
                                    //************************************ Instancia de Vehiculo***********************************              
                                    AbstractVehiculo vehiculo = new Moto(new TipoVehiculo("Moto", (byte) 3),
                                            (boolean) tblListadoMotos.getValueAt(x, 1),
                                            tblListadoMotos.getValueAt(x, 2).toString(),
                                            (int) tblListadoMotos.getValueAt(x, 3),
                                            (boolean) tblListadoMotos.getValueAt(x, 4),
                                            (double) tblListadoMotos.getValueAt(x, 5));

                                    //**********************************Intancia de Usuario********************************
                                    Usuario usuario = usuarioAutenticado;

                                    if (Integer.parseInt(txtKmRecpcion.getText()) < vehiculo.getKm()) {
                                       
                                        JOptionPane.showMessageDialog(this, "Los km ingresados son errados","Error", 0);
                                    } else {
                                        txtpRecepcionVehiculo.setText("" + vehiculo.getKm());

                                        //*************************Km recorridos por el vehiculo neesarios para calcular el costo
                                        int kmRecorridos = Integer.parseInt(txtKmRecpcion.getText()) - Integer.parseInt(""
                                                + modeloTblMotos.getValueAt(x, 3));
                                       
                                        tblListadoMotos.setValueAt(true, x, 4);
                                        tblListadoMotos.setValueAt(txtKmRecpcion.getText(), x, 3);
                                        escribirArchivoPlanoTablasVehiculos();
                                        //llamada al metodo de alquilar vehiculo del controlador pasando los parametros correspondientes
                                        double costoAlquiler = alquilaVehiculo.alquilarVehiculo(vehiculo,
                                                usuario, kmRecorridos);
                                        txtValorPagar.setText("" + costoAlquiler);
                                        break;
                                    }
                                }
                            }
                            break;

                    }
                }

//                        modeloTblCamionetas.setValueAt(txtKmRecpcion.getText(), j, NORMAL);
            }
        }

    }//GEN-LAST:event_btnBuscarMatriculaRecepcionVehiculoActionPerformed

//    private void calcularValorPagar(double costoAlquiler) {
//
////        txtValorPagar.setText(""+vehiculo.calcularAlquiler(kmRecorridos));
//        System.out.println(vehiculo.calcularAlquiler(kmRecorridos));
//    }

    private void btnCalcularValorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularValorPagarActionPerformed
        txtValorPagar.setVisible(true);

    }//GEN-LAST:event_btnCalcularValorPagarActionPerformed

    private void mnuConfiguracionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfiguracionUsuarioActionPerformed
        ocultarJiframes();
        jifConfiguracionUsuario.setVisible(true);
        pintarTblConfiguracionUsuario();

    }//GEN-LAST:event_mnuConfiguracionUsuarioActionPerformed

    private void btnGuardarConfiguracionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarConfiguracionUsuarioActionPerformed

        escribirArchivoPlanoTablaConfiguracionUsuario();
    }//GEN-LAST:event_btnGuardarConfiguracionUsuarioActionPerformed

    private void jcbReporteDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReporteDisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbReporteDisponibilidadActionPerformed

    private LocalDate devolverFecha(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(date, formatter);

        return fecha;
    }


    private void btnReporteDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDisponibilidadActionPerformed

        try {

            int promedio = 0;
            int contador = 0;
            LocalDate fechaInicialReporte = LocalDate.of(jdFechaInicialReporteDisponibilidad.getDate().getYear() + 1900,
                    jdFechaInicialReporteDisponibilidad.getDate().getMonth() + 1,
                    jdFechaInicialReporteDisponibilidad.getDate().getDate());

            LocalDate fechaFinalReporte = LocalDate.of(jdFechaFinalReporteDisponibilidad.getDate().getYear() + 1900,
                    jdFechaFinalReporteDisponibilidad.getDate().getMonth() + 1,
                    jdFechaFinalReporteDisponibilidad.getDate().getDate());

            for (int i = 0; i < modeloTblReporteDisponibilidadVehiculos.getRowCount(); i++) {
                //lo que explicao el profe...no devuelve el valor automatico, lo devuelve a una variable

                String item = "" + jcbReporteDisponibilidad.getSelectedItem();
                //Dependiendo del valor que tenga el menu de item  
                if (item.compareTo("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 0)) == 0) {

                    //Si el vehiculo de la lista esta en el rango de fechas de la busqueda se mostrara en el reporte de disponibilidad
                    if (devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 2)).isAfter(fechaInicialReporte)
                            && devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 3)).isBefore(fechaFinalReporte)) {

                        promedio = promedio + Integer.parseInt("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 4));
                        contador++;
                    } else if (devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 3)).isAfter(fechaInicialReporte)
                            && devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 3)).isBefore(fechaFinalReporte)) {

                        promedio = promedio + devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 3)).getDayOfYear()
                                - fechaInicialReporte.getDayOfYear(); //  
                        contador++;
                    } else if (devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 2)).isAfter(fechaInicialReporte)
                            && devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 2)).isBefore(fechaFinalReporte)
                            && devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 3)).isAfter(fechaFinalReporte)) {

                        promedio = promedio + fechaFinalReporte.getDayOfYear() - devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 2)).getDayOfYear();
                        contador++;
                    } else if (devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 2)).isBefore(fechaInicialReporte)
                            && devolverFecha("" + modeloTblReporteDisponibilidadVehiculos.getValueAt(i, 3)).isAfter(fechaFinalReporte)) {

                        promedio = promedio + fechaFinalReporte.getDayOfYear() - fechaInicialReporte.getDayOfYear();
                        contador++;
                    }

                }
            }

            int porcentaje = (promedio / contador) * 100 / (fechaFinalReporte.getDayOfYear() - fechaInicialReporte.getDayOfYear());
            JOptionPane.showMessageDialog(null, "El promedio de dias que estan ocupados los vehiculos es "
                    + porcentaje + "%");

//            JOptionPane.showMessageDialog(null, promedio);
            //***********************************GRAFICAR Barras*************************
            DefaultCategoryDataset categoria = new DefaultCategoryDataset();

            String camionetas = "Camionetas";
            String carros = "Carros";
            String motos = "Motos";
            String reporteDisponibilidad = "Reporte de Ocupacion (%)";

            categoria.setValue(Integer.parseInt("" + modeloTblCamionetas.getRowCount()), camionetas, "N° Cam");
            categoria.setValue(Integer.parseInt("" + modeloTblCarros.getRowCount()), carros, "N° Car");
            categoria.setValue(Integer.parseInt("" + modeloTblMotos.getRowCount()), motos, "N° M");
            categoria.setValue(porcentaje, reporteDisponibilidad, "Dias Ocupados");

            JFreeChart f = ChartFactory.createBarChart("Vehiculos", "Tipo de Vehiculos",
                    "Cantidad", categoria, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled,
                    rootPaneCheckingEnabled);
            ChartPanel ch = new ChartPanel(f);
            add(ch);
            ch.setBounds(600, 250, 400, 300);
//        ChartFrame freme = new ChartFrame(preuba, f);
//       
//        freme.setVisible(true); 
//            //*************************GRAFICA PASTEL*****************

            pintarTablaAlquilarVehiculos();
            DefaultPieDataset pastel = new DefaultPieDataset();

            pastel.setValue("Camionetas Disponibles", devolverVehiculosDisponibles("Camioneta"));
            pastel.setValue("Carros Disponibles", devolverVehiculosDisponibles("Carro"));
            pastel.setValue("Motos Disponibles", devolverVehiculosDisponibles("Moto"));
//            pastel.setValue("Promedio Vehiculos Ocupados", (double) porcentaje);

            JFreeChart graficaPastel = ChartFactory.createPieChart3D("Porcentajes de Vehiculos", pastel);
            ChartPanel chartPastel = new ChartPanel(graficaPastel);
            add(chartPastel);
            chartPastel.setBounds(100, 250, 400, 300);

        } catch (Exception ex) {;
            JOptionPane.showMessageDialog(this, "Debe diligenciar correctamente las fechas", "Fallo", 0);
        }


    }//GEN-LAST:event_btnReporteDisponibilidadActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void btnGenerarReportePdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReportePdfActionPerformed

        try {

            gestionVehiculo.llenarVehiculos();
            GenerarPdf pdf = new GenerarPdf();
            pdf.crearPdf(gestionVehiculo.getLstVehiculos());
            pdf.abriPdf();
        } catch (Exception ex) {
            Logger.getLogger(MdiVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnGenerarReportePdfActionPerformed

    private double devolverVehiculosDisponibles(String vehiculo) {
        double numero = 0;
        for (int i = 0; i < modeloAlquilerVehiculo.getRowCount(); i++) {
            String vehiculoTablaAlquiler = "" + modeloAlquilerVehiculo.getValueAt(i, 0);
            if (vehiculoTablaAlquiler.compareToIgnoreCase(vehiculo) == 0) {
                numero++;
            }
        }
        return numero;
    }

    public AbstractVehiculo devolverVehiculoAlquilado(int numeroFila) {

        if (modeloAlquilerVehiculo.getValueAt(numeroFila, 0).toString().compareToIgnoreCase("Camioneta") == 0) {

            AbstractVehiculo camioneta = new Camioneta(new TipoVehiculo("Camioneta", (byte) 1),
                    (short) modeloAlquilerVehiculo.getValueAt(numeroFila, 1),
                    modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString(),
                    (int) modeloAlquilerVehiculo.getValueAt(numeroFila, 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 4),
                    (double) modeloAlquilerVehiculo.getValueAt(numeroFila, 5));
            return camioneta;

        } else if (modeloAlquilerVehiculo.getValueAt(numeroFila, 0).toString().compareToIgnoreCase("Carro") == 0) {

            AbstractVehiculo carro = new Carro(new TipoVehiculo("Carro", (byte) 2),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 1),
                    modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString(),
                    (int) modeloAlquilerVehiculo.getValueAt(numeroFila, 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 4),
                    (double) modeloAlquilerVehiculo.getValueAt(numeroFila, 5));

            return carro;

        } else if (modeloAlquilerVehiculo.getValueAt(numeroFila, 0).toString().compareToIgnoreCase("Moto") == 0) {

            AbstractVehiculo moto = new Moto(new TipoVehiculo("Moto", (byte) 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 1),
                    modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString(),
                    (int) modeloAlquilerVehiculo.getValueAt(numeroFila, 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 4),
                    (double) modeloAlquilerVehiculo.getValueAt(numeroFila, 5));

            return moto;
        }
        return null;
    }

    public Camioneta obtenerObjetoTablaCamionetas(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblListadosCamionetas.getValueAt(numeroFila, i);
        }
        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)),
                Short.parseShort("" + fila[1]), "" + fila[2], Integer.parseInt("" + fila[3]),
                Boolean.parseBoolean("" + fila[4]),
                Double.parseDouble("" + fila[5]));
        return camioneta;
    }

    private Carro obtenerObjetoTablaCarro(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblListadoCarros.getValueAt(numeroFila, i);
        }
        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)),
                Boolean.parseBoolean("" + fila[1]), "" + fila[2], Integer.parseInt("" + fila[3]),
                Boolean.parseBoolean("" + fila[4]),
                Double.parseDouble("" + fila[5]));
        return carro;
    }

    private Moto obtenerObjetoTablaMoto(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblListadoMotos.getValueAt(numeroFila, i);
        }
        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 2)),
                Boolean.parseBoolean("" + fila[1]), "" + fila[2], Integer.parseInt("" + fila[3]),
                Boolean.parseBoolean("" + fila[4]),
                Double.parseDouble("" + fila[5]));
        return moto;
    }

    private Object[] obtenerObjetoTablaInformeAlquiler(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblInformeAlquiler.getValueAt(numeroFila, i);
        }
        Object[] informeAlquiler = {fila[0], fila[1], fila[2], fila[3], fila[4], fila[5]};
        return informeAlquiler;
    }

    public Usuario obtenerObjetoTablaConfiguracionUsaurio(int numeroFila) {
        Object[] fila = new Object[9];
        for (int i = 0; i < 9; i++) {//              
            fila[i] = tblConfiguracionUsuario.getValueAt(numeroFila, i);
        }
        byte tipoUsuario = 2;
        String tipo = null;
        switch ("" + fila[2]) {

            case "Administrador":
                tipoUsuario = 1;
                tipo = "1";
                break;
            case "UsuarioGeneral":
                tipoUsuario = 2;
                tipo = "2";
                break;
            case "Secretaria":
                tipoUsuario = 3;
                tipo = "3";
                break;

        }
        Usuario usuario = new Usuario("" + fila[0], "" + fila[1], (new TipoUsuario(tipoUsuario, tipo)),
                "" + fila[3], "" + fila[4], "" + fila[5], Byte.parseByte("" + fila[6]),
                Boolean.parseBoolean("" + fila[7]),
                Boolean.parseBoolean("" + fila[8]));
        return usuario;
    }

//Validar si hay una camioneta con la misma placa en la lista
    private boolean validarCamioneta(Camioneta camioneta) {
        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            if (camioneta.getMatricula().compareTo(camionetaTabla.getMatricula()) == 0) {
                try {
                    llamarExcepcionMatriculasIguales(1);
                } catch (VehiculosException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
                }
                return true;
            }
        }
        return false;
    }

    private boolean validarCarro(Carro carro) {
        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
            Carro carroTabla = obtenerObjetoTablaCarro(i);
            if (carro.getMatricula().compareTo(carroTabla.getMatricula()) == 0) {
                try {
                    llamarExcepcionMatriculasIguales(2);
                } catch (VehiculosException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
                }
                return true;
            }
        }
        return false;
    }

    private boolean validarMoto(Moto moto) {
        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
            Moto motoTabla = obtenerObjetoTablaMoto(i);
            if (moto.getMatricula().compareTo(motoTabla.getMatricula()) == 0) {
                try {
                    llamarExcepcionMatriculasIguales(3);
                } catch (VehiculosException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
                }

                return true;
            }
        }
        return false;
    }

    private void llamarExcepcionMatriculasIguales(int x) throws VehiculosException {

        if (x == 1) {
            throw new VehiculosException("La matricula de la camioneta  se encuentra registrada");
        } else if (x == 2) {
            throw new VehiculosException("La matricula del Carro  se encuentra registrada");
        } else if (x == 3) {
            throw new VehiculosException("La matricula de la moto se encuentra registrada");
        }
    }

    private boolean buscarCamioneta(Camioneta camioneta) {
        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            if (camioneta.getMatricula().compareTo(camionetaTabla.getMatricula()) == 0) {
                tblListadosCamionetas.changeSelection(i, 2, false, false);
                JOptionPane.showMessageDialog(this, "Vehiculo encontrado", "Resultado", 2);
                if (true) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    private boolean buscarCarro(Carro carro) {
        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
            Carro carroTabla = obtenerObjetoTablaCarro(i);
            if (carro.getMatricula().compareTo(carroTabla.getMatricula()) == 0) {
                tblListadoCarros.changeSelection(i, 2, false, false);
                JOptionPane.showMessageDialog(this, "Vehiculo encontrado", "Resultado", 2);
                if (true) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    private boolean buscarMoto(Moto moto) {
        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
            Moto motoTabla = obtenerObjetoTablaMoto(i);
            if (moto.getMatricula().compareTo(motoTabla.getMatricula()) == 0) {
                tblListadoMotos.changeSelection(i, 2, false, false);
                JOptionPane.showMessageDialog(this, "Vehiculo encontrado", "Resultado", 2);
                if (true) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    private void iniciarMenus(boolean estado) {

        tblListadosCamionetas.setEnabled(estado);
        tblListadoCarros.setEnabled(estado);
        tblListadoMotos.setEnabled(estado);
        mnuAlquilarVehiculos.setVisible(estado);
        mnuCargarVehiculos.setVisible(estado);
        mnuConfiguracionUsuario.setVisible(estado);
        mnuEstadisticasDisponibilidad.setVisible(estado);
        mnuEstadisticaDisponibilidad.setVisible(estado);
        mnuRecepcionVehiculo.setVisible(estado);
        mnuReporteVehiculos.setVisible(estado);
        mnuVehiculosDisponilbes.setVisible(estado);

    }

    private void gestionPermisosMnu() {

        switch (usuarioAutenticado.getTipoUsuario().getCodigo()) {
            //Administrador ---> Habilita el menu
            case 1:
                iniciarMenus(true);
                jpConfiguracionVehiculo.show();
                break;
            case 2:
                iniciarMenus(false);//Uduario general
                mnuVehiculosDisponilbes.setVisible(true);
                jpConfiguracionVehiculo.hide();

                break;
            case 3:
                iniciarMenus(true);

                mnuReporteVehiculos.setVisible(false);
                jpConfiguracionVehiculo.hide();
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntConfirmarAlquiler;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarMatriculaRecepcionVehiculo;
    private javax.swing.JButton btnCalcularValorPagar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnGenerarReportePdf;
    private javax.swing.JButton btnGuardarConfiguracionUsuario;
    private javax.swing.JButton btnGuardarConfiguracionVehiculo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnReporteDisponibilidad;
    private javax.swing.JCheckBox chbAntena;
    private javax.swing.JCheckBox chbBotiquin;
    private javax.swing.JCheckBox chbCarroceria;
    private javax.swing.JCheckBox chbCasco;
    private javax.swing.JCheckBox chbCojineria;
    private javax.swing.JCheckBox chbDisponibilidad;
    private javax.swing.JCheckBox chbExtras;
    private javax.swing.JCheckBox chbKitCarreteras;
    private javax.swing.JCheckBox chbLuces;
    private javax.swing.JCheckBox chbRadio;
    private javax.swing.JCheckBox chbTapetes;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JComboBox<String> jcbReporteDisponibilidad;
    private javax.swing.JComboBox<String> jcbTipoVehiculo;
    private com.toedter.calendar.JDateChooser jdFechaFinal;
    private com.toedter.calendar.JDateChooser jdFechaFinalReporteDisponibilidad;
    private com.toedter.calendar.JDateChooser jdFechaInicial;
    private com.toedter.calendar.JDateChooser jdFechaInicialReporteDisponibilidad;
    private javax.swing.JInternalFrame jifAlquilarVehiculo;
    private javax.swing.JInternalFrame jifConfiguracionUsuario;
    private javax.swing.JInternalFrame jifDefault;
    private javax.swing.JInternalFrame jifEstadisticaDisponibilidadVehiculos;
    private javax.swing.JInternalFrame jifInformeAlquiler;
    private javax.swing.JInternalFrame jifInicio;
    private javax.swing.JInternalFrame jifListadoVehiculos;
    private javax.swing.JInternalFrame jifLogin;
    private javax.swing.JInternalFrame jifRecepcionVehiculo;
    private javax.swing.JInternalFrame jifRegistrarUsuario;
    private javax.swing.JPanel jpConfiguracionVehiculo;
    private javax.swing.JPanel jpRecepcionVehiculo;
    private javax.swing.JPanel jpRecepcionVehiculoCamioneta;
    private javax.swing.JSpinner jspCapacidadVehiculo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAlquilarVehiculos;
    private javax.swing.JMenuItem mnuCargarVehiculos;
    private javax.swing.JMenuItem mnuCerrarSesion;
    private javax.swing.JMenuItem mnuConfiguracionUsuario;
    private javax.swing.JMenuItem mnuEstadisticaDisponibilidad;
    private javax.swing.JMenu mnuEstadisticasDisponibilidad;
    private javax.swing.JMenu mnuPrincipal;
    private javax.swing.JMenuItem mnuRecepcionVehiculo;
    private javax.swing.JMenuItem mnuReporteVehiculos;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuVehiculosDisponilbes;
    private javax.swing.JTable tblAlquilarVehiculo;
    private javax.swing.JTable tblConfiguracionUsuario;
    private javax.swing.JTable tblInformeAlquiler;
    private javax.swing.JTable tblListadoCarros;
    private javax.swing.JTable tblListadoMotos;
    private javax.swing.JTable tblListadosCamionetas;
    private javax.swing.JTable tblReporteDisponibilidadVehiculos;
    private javax.swing.JTextField txtBuscarMatriculaRecepcionVehiculo;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtKmRecpcion;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRegistarPassword;
    private javax.swing.JTextField txtRegistrarApellido;
    private javax.swing.JTextField txtRegistrarCedula;
    private javax.swing.JTextField txtRegistrarCorreo;
    private javax.swing.JTextField txtRegistrarEdad;
    private javax.swing.JTextField txtRegistrarNombre;
    private javax.swing.JTextField txtValorAlquiler;
    private javax.swing.JTextField txtValorPagar;
    private javax.swing.JTextPane txtpRecepcionVehiculo;
    // End of variables declaration//GEN-END:variables

}
