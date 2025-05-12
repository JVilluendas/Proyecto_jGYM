package proyecto_final_jgym;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pantalla extends javax.swing.JFrame {

    LabelThread movimiento;

    private Point clickInicial;
    private ConexionjGym conexionjGym = new ConexionjGym();

    public Pantalla() {
        //Este primer Listener detecta el CLICK del ratón
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                clickInicial = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                clickInicial = null;
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Si initialClick es null, significa que no empezamos arrastrando desde esta ventana
                if (clickInicial == null) {
                    return;
                }

                // Coordenadas actuales del ratón en la pantalla
                int thisX = getLocationOnScreen().x;
                int thisY = getLocationOnScreen().y;

                int xMoved = e.getXOnScreen() - clickInicial.x;
                int yMoved = e.getYOnScreen() - clickInicial.y;

                // Mueve la ventana a la nueva posición
                setLocation(xMoved, yMoved);
            }
        });

        initComponents();
        movimiento = new LabelThread(jLabel3);
        movimiento.start();
        movimiento = new LabelThread(jLabel7);
        movimiento.start();
        movimiento = new LabelThread(jLabel16);
        movimiento.start();
        movimiento = new LabelThread(jLabel19);
        movimiento.start();
        movimiento = new LabelThread(jLabel28);
        movimiento.start();
        movimiento = new LabelThread(jLabel35);
        movimiento.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaPrincipal = new javax.swing.JDialog();
        selectorPrincipal = new javax.swing.JTabbedPane();
        panelPrincipalTablaDatos = new javax.swing.JPanel();
        scrollPaneTablaDatos = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        verDatosPersonas = new javax.swing.JButton();
        verDatosEmpleados = new javax.swing.JButton();
        verDatosAsistentes = new javax.swing.JButton();
        verDatosClientes = new javax.swing.JButton();
        verDatosClases = new javax.swing.JButton();
        verDatosMaterial = new javax.swing.JButton();
        verDatosMaterialUsado = new javax.swing.JButton();
        tituloBorrarLinea = new javax.swing.JLabel();
        comboBoxElegirLineaABorrar = new javax.swing.JComboBox<>();
        botonBorrarLinea = new javax.swing.JButton();
        buscarID = new javax.swing.JLabel();
        comboBoxElementoABuscar = new javax.swing.JComboBox<>();
        IDABuscar = new javax.swing.JLabel();
        textFieldIDABuscar = new javax.swing.JTextField();
        botonBuscarConID = new javax.swing.JButton();
        panelPrincipalInsertarDatos = new javax.swing.JPanel();
        selectorInsertarDatos = new javax.swing.JTabbedPane();
        panelCliente = new javax.swing.JPanel();
        textFieldNombreCliente = new javax.swing.JTextField();
        textFieldDNICliente = new javax.swing.JTextField();
        textFieldDireccionCliente = new javax.swing.JTextField();
        textFieldFechaCliente = new javax.swing.JTextField();
        textFieldTelefonoCliente = new javax.swing.JTextField();
        tituloCliente1 = new javax.swing.JLabel();
        nombreCliente1 = new javax.swing.JLabel();
        DNICliente1 = new javax.swing.JLabel();
        direccionCliente1 = new javax.swing.JLabel();
        fechaCliente1 = new javax.swing.JLabel();
        telefonoCliente1 = new javax.swing.JLabel();
        botonAñadirCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelEmpleado = new javax.swing.JPanel();
        textFieldTelefonoEmpleado = new javax.swing.JTextField();
        puestoEmpleado = new javax.swing.JLabel();
        textFieldNombreEmpleado = new javax.swing.JTextField();
        textFieldDNIEmpleado = new javax.swing.JTextField();
        textFieldPuestoEmpleado = new javax.swing.JTextField();
        textFieldDireccionEmpleado = new javax.swing.JTextField();
        textFieldSalarioEmpleado = new javax.swing.JTextField();
        salarioEmpleado = new javax.swing.JLabel();
        contraseñaEmpleado = new javax.swing.JLabel();
        passwordFieldContraseñaEmpleado = new javax.swing.JPasswordField();
        tituloCliente2 = new javax.swing.JLabel();
        nombreCliente2 = new javax.swing.JLabel();
        DNICliente2 = new javax.swing.JLabel();
        direccionCliente2 = new javax.swing.JLabel();
        telefonoCliente2 = new javax.swing.JLabel();
        botonAñadirEmpleado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelClases = new javax.swing.JPanel();
        textFieldEmpleadoACargoClase = new javax.swing.JTextField();
        empleadoACargoClase = new javax.swing.JLabel();
        textFieldNombreClase = new javax.swing.JTextField();
        textFieldFechaClase = new javax.swing.JTextField();
        checkBoxRealizoClase = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        botonAñadirClase = new javax.swing.JLabel();
        tituloCliente3 = new javax.swing.JLabel();
        nombreCliente3 = new javax.swing.JLabel();
        DNICliente3 = new javax.swing.JLabel();
        panelAsistentes = new javax.swing.JPanel();
        textFieldIDClaseAsistente = new javax.swing.JTextField();
        textFieldIDClienteAsistente = new javax.swing.JTextField();
        tituloCliente4 = new javax.swing.JLabel();
        nombreCliente4 = new javax.swing.JLabel();
        DNICliente4 = new javax.swing.JLabel();
        botonAñadirAsistente = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panelMaterial = new javax.swing.JPanel();
        textFieldNombreMaterial = new javax.swing.JTextField();
        textFieldCantidadMaterial = new javax.swing.JTextField();
        tituloCliente5 = new javax.swing.JLabel();
        nombreCliente5 = new javax.swing.JLabel();
        DNICliente5 = new javax.swing.JLabel();
        botonAñadirMaterial = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        panelMaterialUsado = new javax.swing.JPanel();
        textFieldIDClaseMaterialUsado = new javax.swing.JTextField();
        textFieldIDMaterialMaterialUsado = new javax.swing.JTextField();
        IDMaterialMaterialUsado = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        botonAñadirMaterialUsado = new javax.swing.JLabel();
        DNICliente6 = new javax.swing.JLabel();
        nombreCliente6 = new javax.swing.JLabel();
        tituloCliente6 = new javax.swing.JLabel();
        modelosTablas = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloEmpleado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        modeloPersona = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        modeloClase = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        modeloAsistentes = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        modeloMaterialClase = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        modeloMaterial = new javax.swing.JTable();
        textoBienvenida = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JLabel();
        areaInicioSesion = new javax.swing.JPanel();
        labelIniciarSesion = new javax.swing.JLabel();
        labelIdEmpleado = new javax.swing.JLabel();
        textFieldIDInicioSesion = new javax.swing.JTextField();
        labelContraseña = new javax.swing.JLabel();
        passwordFieldContraseñaInicioSesion = new javax.swing.JPasswordField();
        labelBotonEntrar = new javax.swing.JLabel();
        bordePantallaInicio1 = new javax.swing.JLabel();
        bordePantallaInicio = new javax.swing.JLabel();

        pantallaPrincipal.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pantallaPrincipal.setTitle("Gestor base de datos");
        pantallaPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        pantallaPrincipal.setMaximumSize(new java.awt.Dimension(1024, 768));
        pantallaPrincipal.setMinimumSize(new java.awt.Dimension(1024, 768));
        pantallaPrincipal.setResizable(false);
        pantallaPrincipal.setSize(new java.awt.Dimension(1024, 768));
        pantallaPrincipal.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                pantallaPrincipalWindowClosed(evt);
            }
        });
        pantallaPrincipal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectorPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        selectorPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        selectorPrincipal.setPreferredSize(new java.awt.Dimension(280, 190));

        panelPrincipalTablaDatos.setBackground(new java.awt.Color(204, 204, 204));
        panelPrincipalTablaDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelPrincipalTablaDatos.setPreferredSize(new java.awt.Dimension(280, 190));
        panelPrincipalTablaDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPaneTablaDatos.setViewportView(tablaDatos);

        panelPrincipalTablaDatos.add(scrollPaneTablaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 480, 610));

        verDatosPersonas.setText("<html><p align=\"center\">DATOS GENERALES DE PERSONAS</p></html>");
        verDatosPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosPersonasActionPerformed(evt);
            }
        });
        panelPrincipalTablaDatos.add(verDatosPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 70));

        verDatosEmpleados.setText("<html><p align=\"center\">DATOS ESPECÍFICOS DE EMPLEADOS</p></html>");
        verDatosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosEmpleadosActionPerformed(evt);
            }
        });
        panelPrincipalTablaDatos.add(verDatosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 70));

        verDatosAsistentes.setText("<html><p align=\"center\">ASISTENTES DE CADA CLASE</p></html>");
        verDatosAsistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosAsistentesActionPerformed(evt);
            }
        });
        panelPrincipalTablaDatos.add(verDatosAsistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 200, 70));

        verDatosClientes.setText("<html><p align=\"center\">DATOS ESPECÍFICOS DE CLIENTES</p></html>");
        verDatosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosClientesActionPerformed(evt);
            }
        });
        panelPrincipalTablaDatos.add(verDatosClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 70));

        verDatosClases.setText("<html><p align=\"center\">DATOS DE LAS CLASES IMPARTIDAS</p></html>");
        verDatosClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosClasesActionPerformed(evt);
            }
        });
        panelPrincipalTablaDatos.add(verDatosClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 70));

        verDatosMaterial.setText("<html><p align=\"center\">DATOS DEL MATERIAL</p></html>");
        verDatosMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosMaterialActionPerformed(evt);
            }
        });
        panelPrincipalTablaDatos.add(verDatosMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 200, 70));

        verDatosMaterialUsado.setText("<html><p align=\"center\">MATERIAL DE CADA CLASE</p></html>");
        verDatosMaterialUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosMaterialUsadoActionPerformed(evt);
            }
        });
        panelPrincipalTablaDatos.add(verDatosMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 200, 70));

        tituloBorrarLinea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloBorrarLinea.setText("BORRAR LÍNEA NÚMERO:");
        panelPrincipalTablaDatos.add(tituloBorrarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        comboBoxElegirLineaABorrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        panelPrincipalTablaDatos.add(comboBoxElegirLineaABorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 160, 30));

        botonBorrarLinea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonBorrarLinea.setText("<html><p align=\"center\">BORRAR PERMANENTEMENTE</p></html>");
        panelPrincipalTablaDatos.add(botonBorrarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 210, -1));

        buscarID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscarID.setText("<html><p align=\"center\">BUSCAR</p></html>");
        panelPrincipalTablaDatos.add(buscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        comboBoxElementoABuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERSONA", "CLIENTE", "EMPLEADO", "TELEFONO", "CLASE", "ASISTENTES", "MATERIAL", "MATERIAL DE CLASES" }));
        panelPrincipalTablaDatos.add(comboBoxElementoABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 110, 30));

        IDABuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IDABuscar.setText("CON LA ID:");
        panelPrincipalTablaDatos.add(IDABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, -1));
        panelPrincipalTablaDatos.add(textFieldIDABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 90, 30));

        botonBuscarConID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonBuscarConID.setText("BUSCAR");
        panelPrincipalTablaDatos.add(botonBuscarConID, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, -1));

        selectorPrincipal.addTab("Tabla con datos", null, panelPrincipalTablaDatos, "");

        panelPrincipalInsertarDatos.setBackground(new java.awt.Color(204, 204, 204));
        panelPrincipalInsertarDatos.setPreferredSize(new java.awt.Dimension(280, 190));
        panelPrincipalInsertarDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectorInsertarDatos.setBackground(new java.awt.Color(153, 153, 153));
        selectorInsertarDatos.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        panelCliente.setBackground(new java.awt.Color(153, 153, 153));
        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCliente.add(textFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 200, 30));
        panelCliente.add(textFieldDNICliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 200, 30));
        panelCliente.add(textFieldDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 200, 30));
        panelCliente.add(textFieldFechaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 200, 30));
        panelCliente.add(textFieldTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 200, 30));

        tituloCliente1.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloCliente1.setText("<html><p align=\"center\">AÑADIR UN CLIENTE</p></html>");
        panelCliente.add(tituloCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 450, -1));

        nombreCliente1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        nombreCliente1.setText("NOMBRE COMPLETO");
        panelCliente.add(nombreCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        DNICliente1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DNICliente1.setText("DNI / NIF");
        panelCliente.add(DNICliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        direccionCliente1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        direccionCliente1.setText("DIRECCION");
        panelCliente.add(direccionCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        fechaCliente1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        fechaCliente1.setText("FECHA DE INSCRIPCION");
        panelCliente.add(fechaCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        telefonoCliente1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        telefonoCliente1.setText("TELÉFONO");
        panelCliente.add(telefonoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        botonAñadirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/AÑADIR-removebg-preview.png"))); // NOI18N
        botonAñadirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAñadirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirClienteMouseClicked(evt);
            }
        });
        panelCliente.add(botonAñadirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 280, 80));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        panelCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 676, 680, 7));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setText("PROGRAMA TU ENTRENAMIENTO");
        panelCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 290, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        panelCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 870, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/bannerVertical.png"))); // NOI18N
        panelCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, -5, 200, 700));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setOpaque(true);
        panelCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 870, 15));

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setToolTipText("");
        jLabel5.setOpaque(true);
        panelCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 870, 32));

        selectorInsertarDatos.addTab("Cliente", panelCliente);

        panelEmpleado.setBackground(new java.awt.Color(153, 153, 153));
        panelEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelEmpleado.add(textFieldTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 240, 30));

        puestoEmpleado.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        puestoEmpleado.setText("PUESTO");
        panelEmpleado.add(puestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));
        panelEmpleado.add(textFieldNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 240, 30));
        panelEmpleado.add(textFieldDNIEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 240, 30));
        panelEmpleado.add(textFieldPuestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 240, 30));
        panelEmpleado.add(textFieldDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 240, 30));
        panelEmpleado.add(textFieldSalarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 240, 30));

        salarioEmpleado.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        salarioEmpleado.setText("SALARIO");
        panelEmpleado.add(salarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        contraseñaEmpleado.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        contraseñaEmpleado.setText("CONTRASEÑA");
        panelEmpleado.add(contraseñaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));
        panelEmpleado.add(passwordFieldContraseñaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 240, 30));

        tituloCliente2.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloCliente2.setText("<html><p align=\"center\">AÑADIR UN EMPLEADO</p></html>");
        panelEmpleado.add(tituloCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 510, -1));

        nombreCliente2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        nombreCliente2.setText("NOMBRE COMPLETO");
        panelEmpleado.add(nombreCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        DNICliente2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DNICliente2.setText("DNI / NIF");
        panelEmpleado.add(DNICliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        direccionCliente2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        direccionCliente2.setText("DIRECCION");
        panelEmpleado.add(direccionCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        telefonoCliente2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        telefonoCliente2.setText("TELÉFONO");
        panelEmpleado.add(telefonoCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        botonAñadirEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/AÑADIR-removebg-preview.png"))); // NOI18N
        botonAñadirEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAñadirEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirEmpleadoMouseClicked(evt);
            }
        });
        panelEmpleado.add(botonAñadirEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 280, 80));

        jLabel7.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel7.setText("PROGRAMA TU ENTRENAMIENTO");
        panelEmpleado.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 290, 70));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setOpaque(true);
        panelEmpleado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 870, 70));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setOpaque(true);
        panelEmpleado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 870, 15));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        panelEmpleado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 676, 680, 7));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setToolTipText("");
        jLabel11.setOpaque(true);
        panelEmpleado.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 870, 32));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/bannerVertical.png"))); // NOI18N
        panelEmpleado.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, -5, 200, 700));

        selectorInsertarDatos.addTab("Empleado", panelEmpleado);

        panelClases.setBackground(new java.awt.Color(153, 153, 153));
        panelClases.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelClases.add(textFieldEmpleadoACargoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 230, 30));

        empleadoACargoClase.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        empleadoACargoClase.setText("EMPLEADO A CARGO");
        panelClases.add(empleadoACargoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 190, -1));
        panelClases.add(textFieldNombreClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 230, 30));
        panelClases.add(textFieldFechaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 230, 30));

        checkBoxRealizoClase.setBackground(new java.awt.Color(153, 153, 153));
        checkBoxRealizoClase.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        checkBoxRealizoClase.setText("¿SE REALIZÓ?");
        panelClases.add(checkBoxRealizoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 160, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setOpaque(true);
        panelClases.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 676, 680, 7));

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setToolTipText("");
        jLabel14.setOpaque(true);
        panelClases.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 870, 32));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setOpaque(true);
        panelClases.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 870, 15));

        jLabel16.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel16.setText("PROGRAMA TU ENTRENAMIENTO");
        panelClases.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 290, 70));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setOpaque(true);
        panelClases.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 870, 70));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/bannerVertical.png"))); // NOI18N
        panelClases.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, -5, 200, 700));

        botonAñadirClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/AÑADIR-removebg-preview.png"))); // NOI18N
        botonAñadirClase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAñadirClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirClaseMouseClicked(evt);
            }
        });
        panelClases.add(botonAñadirClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 280, 80));

        tituloCliente3.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloCliente3.setText("<html><p align=\"center\">AÑADIR UNA CLASE</p></html>");
        panelClases.add(tituloCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 450, -1));

        nombreCliente3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        nombreCliente3.setText("NOMBRE");
        panelClases.add(nombreCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        DNICliente3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DNICliente3.setText("FECHA Y HORA");
        panelClases.add(DNICliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        selectorInsertarDatos.addTab("Clases", panelClases);

        panelAsistentes.setBackground(new java.awt.Color(153, 153, 153));
        panelAsistentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelAsistentes.add(textFieldIDClaseAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 230, 30));
        panelAsistentes.add(textFieldIDClienteAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 230, 30));

        tituloCliente4.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloCliente4.setText("<html><p align=\"center\">AÑADIR UN ASISTENTE</p></html>");
        panelAsistentes.add(tituloCliente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 520, -1));

        nombreCliente4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        nombreCliente4.setText("ID DE LA CLASE");
        panelAsistentes.add(nombreCliente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        DNICliente4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DNICliente4.setText("ID DEL CLIENTE");
        panelAsistentes.add(DNICliente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        botonAñadirAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/AÑADIR-removebg-preview.png"))); // NOI18N
        botonAñadirAsistente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAñadirAsistente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirAsistenteMouseClicked(evt);
            }
        });
        panelAsistentes.add(botonAñadirAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 280, 80));

        jLabel19.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel19.setText("PROGRAMA TU ENTRENAMIENTO");
        panelAsistentes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 290, 70));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setOpaque(true);
        panelAsistentes.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 870, 70));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setOpaque(true);
        panelAsistentes.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 676, 680, 7));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/bannerVertical.png"))); // NOI18N
        panelAsistentes.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, -5, 200, 700));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setOpaque(true);
        panelAsistentes.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 870, 15));

        jLabel23.setBackground(new java.awt.Color(255, 0, 0));
        jLabel23.setToolTipText("");
        jLabel23.setOpaque(true);
        panelAsistentes.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 870, 32));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setOpaque(true);
        panelAsistentes.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 676, 680, 7));

        selectorInsertarDatos.addTab("Asistentes a clases", panelAsistentes);

        panelMaterial.setBackground(new java.awt.Color(153, 153, 153));
        panelMaterial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelMaterial.add(textFieldNombreMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 230, 30));
        panelMaterial.add(textFieldCantidadMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 230, 30));

        tituloCliente5.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloCliente5.setText("<html><p align=\"center\">AÑADIR MATERIAL</p></html>");
        panelMaterial.add(tituloCliente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 520, -1));

        nombreCliente5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        nombreCliente5.setText("NOMBRE");
        panelMaterial.add(nombreCliente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        DNICliente5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DNICliente5.setText("CANTIDAD");
        panelMaterial.add(DNICliente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        botonAñadirMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/AÑADIR-removebg-preview.png"))); // NOI18N
        botonAñadirMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAñadirMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirMaterialMouseClicked(evt);
            }
        });
        panelMaterial.add(botonAñadirMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 280, 80));

        jLabel28.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel28.setText("PROGRAMA TU ENTRENAMIENTO");
        panelMaterial.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 290, 70));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setOpaque(true);
        panelMaterial.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 870, 70));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setOpaque(true);
        panelMaterial.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 870, 15));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setOpaque(true);
        panelMaterial.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 676, 680, 7));

        jLabel30.setBackground(new java.awt.Color(255, 0, 0));
        jLabel30.setToolTipText("");
        jLabel30.setOpaque(true);
        panelMaterial.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 870, 32));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/bannerVertical.png"))); // NOI18N
        panelMaterial.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, -5, 200, 700));

        selectorInsertarDatos.addTab("Material", panelMaterial);

        panelMaterialUsado.setBackground(new java.awt.Color(153, 153, 153));
        panelMaterialUsado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelMaterialUsado.add(textFieldIDClaseMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 170, 30));
        panelMaterialUsado.add(textFieldIDMaterialMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 170, 30));

        IDMaterialMaterialUsado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        panelMaterialUsado.add(IDMaterialMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setOpaque(true);
        panelMaterialUsado.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 676, 680, 7));

        jLabel32.setBackground(new java.awt.Color(255, 0, 0));
        jLabel32.setToolTipText("");
        jLabel32.setOpaque(true);
        panelMaterialUsado.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 870, 32));

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setOpaque(true);
        panelMaterialUsado.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 870, 15));

        jLabel35.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel35.setText("PROGRAMA TU ENTRENAMIENTO");
        panelMaterialUsado.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 290, 70));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setOpaque(true);
        panelMaterialUsado.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 870, 70));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/bannerVertical.png"))); // NOI18N
        panelMaterialUsado.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, -5, 200, 700));

        botonAñadirMaterialUsado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/AÑADIR-removebg-preview.png"))); // NOI18N
        botonAñadirMaterialUsado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAñadirMaterialUsado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirMaterialUsadoMouseClicked(evt);
            }
        });
        panelMaterialUsado.add(botonAñadirMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 280, 80));

        DNICliente6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DNICliente6.setText("ID DEL MATERIAL");
        panelMaterialUsado.add(DNICliente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        nombreCliente6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        nombreCliente6.setText("ID DE LA CLASE");
        panelMaterialUsado.add(nombreCliente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        tituloCliente6.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloCliente6.setText("<html><p align=\"center\">ANOTAR MATERIAL USADO</p></html>");
        panelMaterialUsado.add(tituloCliente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 520, -1));

        selectorInsertarDatos.addTab("Material usado en clases", panelMaterialUsado);

        panelPrincipalInsertarDatos.add(selectorInsertarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 740));

        selectorPrincipal.addTab("Insertar Datos", panelPrincipalInsertarDatos);

        pantallaPrincipal.getContentPane().add(selectorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));
        selectorPrincipal.getAccessibleContext().setAccessibleName("pane");

        pantallaPrincipal.getAccessibleContext().setAccessibleParent(null);

        modelosTablas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modeloEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Salario", "Puesto", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(modeloEmpleado);

        modelosTablas.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 70));

        modeloCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Fecha de inscripción"
            }
        ));
        jScrollPane2.setViewportView(modeloCliente);

        modelosTablas.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 70));

        modeloPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "DNI", "Dirección", "Teléfono"
            }
        ));
        jScrollPane3.setViewportView(modeloPersona);

        modelosTablas.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 70));

        modeloClase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Fecha y hora", "Realizado", "Empleado a cargo"
            }
        ));
        jScrollPane4.setViewportView(modeloClase);

        modelosTablas.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 80));

        modeloAsistentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id de la clase", "Id del cliente"
            }
        ));
        jScrollPane5.setViewportView(modeloAsistentes);

        modelosTablas.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 80));

        modeloMaterialClase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id de la clase", "Id del equipamiento"
            }
        ));
        jScrollPane6.setViewportView(modeloMaterialClase);

        modelosTablas.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 70));

        modeloMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jScrollPane7.setViewportView(modeloMaterial);

        modelosTablas.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 70));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("Fotos/iconoJGym.png")).getImage());
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoBienvenida.setFont(new java.awt.Font("Impact", 1, 100)); // NOI18N
        textoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        textoBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBienvenida.setText("jGym");
        getContentPane().add(textoBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 290, -1));

        botonCerrar.setFont(new java.awt.Font("Segoe UI", 3, 100)); // NOI18N
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonCerrar.png"))); // NOI18N
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, 40));

        areaInicioSesion.setBackground(new java.awt.Color(0, 0, 101));
        areaInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIniciarSesion.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 26)); // NOI18N
        labelIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        labelIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIniciarSesion.setText("Iniciar sesión");
        areaInicioSesion.add(labelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, 250, -1));

        labelIdEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelIdEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        labelIdEmpleado.setText("ID de empleado:");
        areaInicioSesion.add(labelIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        areaInicioSesion.add(textFieldIDInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 260, 30));

        labelContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        labelContraseña.setText("Contraseña:");
        areaInicioSesion.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        areaInicioSesion.add(passwordFieldContraseñaInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, 30));

        labelBotonEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBotonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonEntrar.png"))); // NOI18N
        labelBotonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBotonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBotonEntrarMouseClicked(evt);
            }
        });
        areaInicioSesion.add(labelBotonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 150, 60));

        bordePantallaInicio1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 4));
        areaInicioSesion.add(bordePantallaInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        getContentPane().add(areaInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 230, 300, 350));

        bordePantallaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/fondoPantallaInicioSesion.jpg"))); // NOI18N
        bordePantallaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 4));
        getContentPane().add(bordePantallaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void labelBotonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBotonEntrarMouseClicked
        boolean comprobar = conexionjGym.comprobarUsuario(textFieldIDInicioSesion.getText(), passwordFieldContraseñaInicioSesion.getText());
        //conexionjGym.comprobarUsuario(textFieldIDInicioSesion.getText(), Arrays.toString(passwordFieldContraseñaInicioSesion.getPassword()));
        if (comprobar) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ha iniciado sesión",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            pantallaPrincipal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "El usuario y/o contraseña son incorrectos",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_labelBotonEntrarMouseClicked

    private void pantallaPrincipalWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_pantallaPrincipalWindowClosed
        System.exit(0);
    }//GEN-LAST:event_pantallaPrincipalWindowClosed

    private void botonAñadirClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirClienteMouseClicked
        Cliente cliente = new Cliente();
        cliente.setNombre(textFieldNombreCliente.getText());
        cliente.setDNI(textFieldDNICliente.getText());
        cliente.setDireccion(textFieldDireccionCliente.getText());
        cliente.setDate(textFieldFechaCliente.getText());
        cliente.setTelefono(Integer.parseInt(textFieldTelefonoCliente.getText()));
        conexionjGym.meterCliente(cliente);
    }//GEN-LAST:event_botonAñadirClienteMouseClicked

    private void botonAñadirEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirEmpleadoMouseClicked
        Empleado empleado = new Empleado();
        empleado.setNombre(textFieldNombreEmpleado.getText());
        empleado.setDNI(textFieldDNIEmpleado.getText());
        empleado.setDireccion(textFieldDireccionEmpleado.getText());
        empleado.setTelefono(Integer.parseInt(textFieldTelefonoEmpleado.getText()));
        empleado.setSalario(Double.parseDouble(textFieldSalarioEmpleado.getText()));
        empleado.setPuesto(textFieldPuestoEmpleado.getText());
        empleado.setContrasenya(passwordFieldContraseñaEmpleado.getText());
        conexionjGym.meterEmpleado(empleado);
    }//GEN-LAST:event_botonAñadirEmpleadoMouseClicked

    private void botonAñadirClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirClaseMouseClicked
        ClasesGym clasesGym = new ClasesGym();
        clasesGym.setFechaHora(textFieldFechaClase.getText());
        clasesGym.setIdPersona(Integer.parseInt(textFieldEmpleadoACargoClase.getText()));
        clasesGym.setNombre(textFieldNombreClase.getText());
        if (checkBoxRealizoClase.isSelected()) {
            clasesGym.setRealizado(1);
        } else {
            clasesGym.setRealizado(0);
        }
        conexionjGym.meterClase(clasesGym);
    }//GEN-LAST:event_botonAñadirClaseMouseClicked

    private void botonAñadirAsistenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirAsistenteMouseClicked
        conexionjGym.meterAsistentes(Integer.parseInt(textFieldIDClaseAsistente.getText()), Integer.parseInt(textFieldIDClienteAsistente.getText()));
    }//GEN-LAST:event_botonAñadirAsistenteMouseClicked

    private void botonAñadirMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirMaterialMouseClicked
        Equipamiento equipamiento = new Equipamiento();
        equipamiento.setNombre(textFieldNombreMaterial.getText());
        conexionjGym.meterEquipamiento(equipamiento, Integer.parseInt(textFieldCantidadMaterial.getText()));
    }//GEN-LAST:event_botonAñadirMaterialMouseClicked

    private void botonAñadirMaterialUsadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirMaterialUsadoMouseClicked
        conexionjGym.meterEquipamientoClase(Integer.parseInt(textFieldIDClaseMaterialUsado.getText()), Integer.parseInt(textFieldIDMaterialMaterialUsado.getText()));
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        
    }//GEN-LAST:event_botonAñadirMaterialUsadoMouseClicked

    private void verDatosPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosPersonasActionPerformed
        tablaDatos.setModel(modeloPersona.getModel());
    }//GEN-LAST:event_verDatosPersonasActionPerformed

    private void verDatosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosClientesActionPerformed
        tablaDatos.setModel(modeloCliente.getModel());
    }//GEN-LAST:event_verDatosClientesActionPerformed

    private void verDatosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosEmpleadosActionPerformed
        tablaDatos.setModel(modeloEmpleado.getModel());
    }//GEN-LAST:event_verDatosEmpleadosActionPerformed

    private void verDatosClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosClasesActionPerformed
        tablaDatos.setModel(modeloClase.getModel());
    }//GEN-LAST:event_verDatosClasesActionPerformed

    private void verDatosAsistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosAsistentesActionPerformed
        tablaDatos.setModel(modeloAsistentes.getModel());
    }//GEN-LAST:event_verDatosAsistentesActionPerformed

    private void verDatosMaterialUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosMaterialUsadoActionPerformed
        tablaDatos.setModel(modeloMaterialClase.getModel());
    }//GEN-LAST:event_verDatosMaterialUsadoActionPerformed

    private void verDatosMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosMaterialActionPerformed
        tablaDatos.setModel(modeloMaterial.getModel());
    }//GEN-LAST:event_verDatosMaterialActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNICliente1;
    private javax.swing.JLabel DNICliente2;
    private javax.swing.JLabel DNICliente3;
    private javax.swing.JLabel DNICliente4;
    private javax.swing.JLabel DNICliente5;
    private javax.swing.JLabel DNICliente6;
    private javax.swing.JLabel IDABuscar;
    private javax.swing.JLabel IDMaterialMaterialUsado;
    private javax.swing.JPanel areaInicioSesion;
    private javax.swing.JLabel bordePantallaInicio;
    private javax.swing.JLabel bordePantallaInicio1;
    private javax.swing.JLabel botonAñadirAsistente;
    private javax.swing.JLabel botonAñadirClase;
    private javax.swing.JLabel botonAñadirCliente;
    private javax.swing.JLabel botonAñadirEmpleado;
    private javax.swing.JLabel botonAñadirMaterial;
    private javax.swing.JLabel botonAñadirMaterialUsado;
    private javax.swing.JButton botonBorrarLinea;
    private javax.swing.JButton botonBuscarConID;
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel buscarID;
    private javax.swing.JCheckBox checkBoxRealizoClase;
    private javax.swing.JComboBox<String> comboBoxElegirLineaABorrar;
    private javax.swing.JComboBox<String> comboBoxElementoABuscar;
    private javax.swing.JLabel contraseñaEmpleado;
    private javax.swing.JLabel direccionCliente1;
    private javax.swing.JLabel direccionCliente2;
    private javax.swing.JLabel empleadoACargoClase;
    private javax.swing.JLabel fechaCliente1;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JLabel labelBotonEntrar;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelIdEmpleado;
    private javax.swing.JLabel labelIniciarSesion;
    private javax.swing.JTable modeloAsistentes;
    private javax.swing.JTable modeloClase;
    private javax.swing.JTable modeloCliente;
    private javax.swing.JTable modeloEmpleado;
    private javax.swing.JTable modeloMaterial;
    private javax.swing.JTable modeloMaterialClase;
    private javax.swing.JTable modeloPersona;
    private javax.swing.JDialog modelosTablas;
    private javax.swing.JLabel nombreCliente1;
    private javax.swing.JLabel nombreCliente2;
    private javax.swing.JLabel nombreCliente3;
    private javax.swing.JLabel nombreCliente4;
    private javax.swing.JLabel nombreCliente5;
    private javax.swing.JLabel nombreCliente6;
    private javax.swing.JPanel panelAsistentes;
    private javax.swing.JPanel panelClases;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelMaterial;
    private javax.swing.JPanel panelMaterialUsado;
    private javax.swing.JPanel panelPrincipalInsertarDatos;
    private javax.swing.JPanel panelPrincipalTablaDatos;
    private javax.swing.JDialog pantallaPrincipal;
    private javax.swing.JPasswordField passwordFieldContraseñaEmpleado;
    private javax.swing.JPasswordField passwordFieldContraseñaInicioSesion;
    private javax.swing.JLabel puestoEmpleado;
    private javax.swing.JLabel salarioEmpleado;
    private javax.swing.JScrollPane scrollPaneTablaDatos;
    private javax.swing.JTabbedPane selectorInsertarDatos;
    private javax.swing.JTabbedPane selectorPrincipal;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JLabel telefonoCliente1;
    private javax.swing.JLabel telefonoCliente2;
    private javax.swing.JTextField textFieldCantidadMaterial;
    private javax.swing.JTextField textFieldDNICliente;
    private javax.swing.JTextField textFieldDNIEmpleado;
    private javax.swing.JTextField textFieldDireccionCliente;
    private javax.swing.JTextField textFieldDireccionEmpleado;
    private javax.swing.JTextField textFieldEmpleadoACargoClase;
    private javax.swing.JTextField textFieldFechaClase;
    private javax.swing.JTextField textFieldFechaCliente;
    private javax.swing.JTextField textFieldIDABuscar;
    private javax.swing.JTextField textFieldIDClaseAsistente;
    private javax.swing.JTextField textFieldIDClaseMaterialUsado;
    private javax.swing.JTextField textFieldIDClienteAsistente;
    private javax.swing.JTextField textFieldIDInicioSesion;
    private javax.swing.JTextField textFieldIDMaterialMaterialUsado;
    private javax.swing.JTextField textFieldNombreClase;
    private javax.swing.JTextField textFieldNombreCliente;
    private javax.swing.JTextField textFieldNombreEmpleado;
    private javax.swing.JTextField textFieldNombreMaterial;
    private javax.swing.JTextField textFieldPuestoEmpleado;
    private javax.swing.JTextField textFieldSalarioEmpleado;
    private javax.swing.JTextField textFieldTelefonoCliente;
    private javax.swing.JTextField textFieldTelefonoEmpleado;
    private javax.swing.JLabel textoBienvenida;
    private javax.swing.JLabel tituloBorrarLinea;
    private javax.swing.JLabel tituloCliente1;
    private javax.swing.JLabel tituloCliente2;
    private javax.swing.JLabel tituloCliente3;
    private javax.swing.JLabel tituloCliente4;
    private javax.swing.JLabel tituloCliente5;
    private javax.swing.JLabel tituloCliente6;
    private javax.swing.JButton verDatosAsistentes;
    private javax.swing.JButton verDatosClases;
    private javax.swing.JButton verDatosClientes;
    private javax.swing.JButton verDatosEmpleados;
    private javax.swing.JButton verDatosMaterial;
    private javax.swing.JButton verDatosMaterialUsado;
    private javax.swing.JButton verDatosPersonas;
    // End of variables declaration//GEN-END:variables
}
