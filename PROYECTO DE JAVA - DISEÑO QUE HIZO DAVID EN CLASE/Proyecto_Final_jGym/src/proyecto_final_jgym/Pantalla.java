package proyecto_final_jgym;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Pantalla extends javax.swing.JFrame {

    private Point clickInicial;

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
        tituloCliente = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JLabel();
        DNICliente = new javax.swing.JLabel();
        direccionCliente = new javax.swing.JLabel();
        fechaCliente = new javax.swing.JLabel();
        textFieldNombreCliente = new javax.swing.JTextField();
        textFieldDNICliente = new javax.swing.JTextField();
        textFieldDireccionCliente = new javax.swing.JTextField();
        textFieldFechaCliente = new javax.swing.JTextField();
        botonAñadirCliente = new javax.swing.JLabel();
        textFieldTelefonoCliente = new javax.swing.JTextField();
        telefonoCliente = new javax.swing.JLabel();
        panelEmpleado = new javax.swing.JPanel();
        botonAñadirEmpleado = new javax.swing.JLabel();
        textFieldTelefonoEmpleado = new javax.swing.JTextField();
        puestoEmpleado = new javax.swing.JLabel();
        textFieldNombreEmpleado = new javax.swing.JTextField();
        nombreEmpleado = new javax.swing.JLabel();
        textFieldDNIEmpleado = new javax.swing.JTextField();
        DNIEmpleado = new javax.swing.JLabel();
        telefonoEmpleado = new javax.swing.JLabel();
        textFieldPuestoEmpleado = new javax.swing.JTextField();
        textFieldDireccionEmpleado = new javax.swing.JTextField();
        direccionEmpleado = new javax.swing.JLabel();
        tituloEmpleado = new javax.swing.JLabel();
        textFieldSalarioEmpleado = new javax.swing.JTextField();
        salarioEmpleado = new javax.swing.JLabel();
        contraseñaEmpleado = new javax.swing.JLabel();
        passwordFieldContraseñaEmpleado = new javax.swing.JPasswordField();
        panelClases = new javax.swing.JPanel();
        botonAñadirClase = new javax.swing.JLabel();
        textFieldEmpleadoACargoClase = new javax.swing.JTextField();
        empleadoACargoClase = new javax.swing.JLabel();
        textFieldNombreClase = new javax.swing.JTextField();
        nombreClase = new javax.swing.JLabel();
        textFieldFechaClase = new javax.swing.JTextField();
        fechaClase = new javax.swing.JLabel();
        tituloClase = new javax.swing.JLabel();
        checkBoxRealizoClase = new javax.swing.JCheckBox();
        panelAsistentes = new javax.swing.JPanel();
        tituloAsistentes = new javax.swing.JLabel();
        botonAñadirAsistente = new javax.swing.JLabel();
        textFieldIDClaseAsistente = new javax.swing.JTextField();
        IDClaseAsistente = new javax.swing.JLabel();
        textFieldIDClienteAsistente = new javax.swing.JTextField();
        IDClienteAsistente = new javax.swing.JLabel();
        panelMaterial = new javax.swing.JPanel();
        tituloMaterial = new javax.swing.JLabel();
        botonAñadirMaterial = new javax.swing.JLabel();
        textFieldNombreMaterial = new javax.swing.JTextField();
        nombreMaterial = new javax.swing.JLabel();
        cantidadMaterial = new javax.swing.JLabel();
        spinnerCantidadMaterial = new javax.swing.JSpinner();
        panelMaterialUsado = new javax.swing.JPanel();
        tituloMaterialUsado = new javax.swing.JLabel();
        botonAñadirMaterialUsado = new javax.swing.JLabel();
        textFieldIDClaseMaterialUsado = new javax.swing.JTextField();
        IDClaseMaterialUsado = new javax.swing.JLabel();
        textFieldIDMaterialMaterialUsado = new javax.swing.JTextField();
        IDMaterialMaterialUsado = new javax.swing.JLabel();
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
        fondoPantalla = new javax.swing.JLabel();

        pantallaPrincipal.setMaximumSize(new java.awt.Dimension(1024, 768));
        pantallaPrincipal.setMinimumSize(new java.awt.Dimension(1024, 768));
        pantallaPrincipal.setPreferredSize(new java.awt.Dimension(1024, 768));
        pantallaPrincipal.setResizable(false);
        pantallaPrincipal.setSize(new java.awt.Dimension(1024, 768));
        pantallaPrincipal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectorPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        selectorPrincipal.setPreferredSize(new java.awt.Dimension(280, 190));

        panelPrincipalTablaDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelPrincipalTablaDatos.setPreferredSize(new java.awt.Dimension(280, 190));
        panelPrincipalTablaDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID de la persona", "Nombre", "DNI", "Dirección", "Teléfono"
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
        panelPrincipalTablaDatos.add(verDatosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 70));

        verDatosAsistentes.setText("<html><p align=\"center\">ASISTENTES DE CADA CLASE</p></html>");
        panelPrincipalTablaDatos.add(verDatosAsistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 200, 70));

        verDatosClientes.setText("<html><p align=\"center\">DATOS ESPECÍFICOS DE CLIENTES</p></html>");
        panelPrincipalTablaDatos.add(verDatosClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 70));

        verDatosClases.setText("<html><p align=\"center\">DATOS DE LAS CLASES IMPARTIDAS</p></html>");
        panelPrincipalTablaDatos.add(verDatosClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 70));

        verDatosMaterial.setText("<html><p align=\"center\">DATOS DEL MATERIAL</p></html>");
        panelPrincipalTablaDatos.add(verDatosMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 200, 70));

        verDatosMaterialUsado.setText("<html><p align=\"center\">MATERIAL DE CADA CLASE</p></html>");
        panelPrincipalTablaDatos.add(verDatosMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 200, 70));

        tituloBorrarLinea.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloBorrarLinea.setText("BORRAR LÍNEA NÚMERO:");
        panelPrincipalTablaDatos.add(tituloBorrarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        comboBoxElegirLineaABorrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        panelPrincipalTablaDatos.add(comboBoxElegirLineaABorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 160, 30));

        botonBorrarLinea.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botonBorrarLinea.setText("<html><p align=\"center\">BORRAR PERMANENTEMENTE</p></html>");
        panelPrincipalTablaDatos.add(botonBorrarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 210, -1));

        buscarID.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        buscarID.setText("<html><p align=\"center\">BUSCAR</p></html>");
        panelPrincipalTablaDatos.add(buscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        comboBoxElementoABuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERSONA", "CLIENTE", "EMPLEADO", "TELEFONO", "CLASE", "ASISTENTES", "MATERIAL", "MATERIAL DE CLASES" }));
        panelPrincipalTablaDatos.add(comboBoxElementoABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 110, 30));

        IDABuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        IDABuscar.setText("CON LA ID:");
        panelPrincipalTablaDatos.add(IDABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, -1));
        panelPrincipalTablaDatos.add(textFieldIDABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 90, 30));

        botonBuscarConID.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botonBuscarConID.setText("BUSCAR");
        panelPrincipalTablaDatos.add(botonBuscarConID, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, -1));

        selectorPrincipal.addTab("Tabla con datos", null, panelPrincipalTablaDatos, "");

        panelPrincipalInsertarDatos.setPreferredSize(new java.awt.Dimension(280, 190));
        panelPrincipalInsertarDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCliente.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        tituloCliente.setText("AÑADIR UN CLIENTE");
        panelCliente.add(tituloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        nombreCliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nombreCliente.setText("NOMBRE COMPLETO");
        panelCliente.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        DNICliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        DNICliente.setText("DNI / NIF");
        panelCliente.add(DNICliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        direccionCliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        direccionCliente.setText("DIRECCION");
        panelCliente.add(direccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        fechaCliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fechaCliente.setText("FECHA DE INSCRIPCION");
        panelCliente.add(fechaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));
        panelCliente.add(textFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 30));
        panelCliente.add(textFieldDNICliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, 30));
        panelCliente.add(textFieldDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 170, 30));
        panelCliente.add(textFieldFechaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 170, 30));

        botonAñadirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonAñadir.png"))); // NOI18N
        panelCliente.add(botonAñadirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 460, -1, -1));
        panelCliente.add(textFieldTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 170, 30));

        telefonoCliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        telefonoCliente.setText("TELÉFONO");
        panelCliente.add(telefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        selectorInsertarDatos.addTab("Cliente", panelCliente);

        panelEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAñadirEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonAñadir.png"))); // NOI18N
        panelEmpleado.add(botonAñadirEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 460, -1, -1));
        panelEmpleado.add(textFieldTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 170, 30));

        puestoEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        puestoEmpleado.setText("PUESTO");
        panelEmpleado.add(puestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));
        panelEmpleado.add(textFieldNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 30));

        nombreEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nombreEmpleado.setText("NOMBRE COMPLETO");
        panelEmpleado.add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        panelEmpleado.add(textFieldDNIEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, 30));

        DNIEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        DNIEmpleado.setText("DNI / NIF");
        panelEmpleado.add(DNIEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        telefonoEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        telefonoEmpleado.setText("TELÉFONO");
        panelEmpleado.add(telefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));
        panelEmpleado.add(textFieldPuestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 170, 30));
        panelEmpleado.add(textFieldDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 170, 30));

        direccionEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        direccionEmpleado.setText("DIRECCION");
        panelEmpleado.add(direccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        tituloEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        tituloEmpleado.setText("AÑADIR UN EMPLEADO");
        panelEmpleado.add(tituloEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        panelEmpleado.add(textFieldSalarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 170, 30));

        salarioEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        salarioEmpleado.setText("SALARIO");
        panelEmpleado.add(salarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        contraseñaEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        contraseñaEmpleado.setText("CONTRASEÑA");
        panelEmpleado.add(contraseñaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, -1));
        panelEmpleado.add(passwordFieldContraseñaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 170, 30));

        selectorInsertarDatos.addTab("Empleado", panelEmpleado);

        panelClases.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAñadirClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonAñadir.png"))); // NOI18N
        panelClases.add(botonAñadirClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 460, -1, -1));
        panelClases.add(textFieldEmpleadoACargoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 170, 30));

        empleadoACargoClase.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        empleadoACargoClase.setText("EMPLEADO A CARGO");
        panelClases.add(empleadoACargoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 190, -1));
        panelClases.add(textFieldNombreClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 170, 30));

        nombreClase.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nombreClase.setText("NOMBRE ");
        panelClases.add(nombreClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));
        panelClases.add(textFieldFechaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 170, 30));

        fechaClase.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fechaClase.setText("FECHA Y HORA");
        panelClases.add(fechaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        tituloClase.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        tituloClase.setText("REGISTRAR UNA CLASE");
        panelClases.add(tituloClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        checkBoxRealizoClase.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        checkBoxRealizoClase.setText("¿SE REALIZÓ?");
        panelClases.add(checkBoxRealizoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 150, 30));

        selectorInsertarDatos.addTab("Clases", panelClases);

        panelAsistentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloAsistentes.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        tituloAsistentes.setText("<html><p align=\"center\">REGISTRAR UN ASISTENTE</p></html>");
        panelAsistentes.add(tituloAsistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 700, -1));

        botonAñadirAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonAñadir.png"))); // NOI18N
        panelAsistentes.add(botonAñadirAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 460, -1, -1));
        panelAsistentes.add(textFieldIDClaseAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 170, 30));

        IDClaseAsistente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        IDClaseAsistente.setText("ID DE LA CLASE");
        panelAsistentes.add(IDClaseAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));
        panelAsistentes.add(textFieldIDClienteAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 170, 30));

        IDClienteAsistente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        IDClienteAsistente.setText("ID DEL CLIENTE");
        panelAsistentes.add(IDClienteAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        selectorInsertarDatos.addTab("Asistentes a clases", panelAsistentes);

        panelMaterial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMaterial.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        tituloMaterial.setText("AÑADIR MATERIAL");
        panelMaterial.add(tituloMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        botonAñadirMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonAñadir.png"))); // NOI18N
        panelMaterial.add(botonAñadirMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 460, -1, -1));
        panelMaterial.add(textFieldNombreMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 170, 30));

        nombreMaterial.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nombreMaterial.setText("NOMBRE");
        panelMaterial.add(nombreMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        cantidadMaterial.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cantidadMaterial.setText("CANTIDAD");
        panelMaterial.add(cantidadMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));
        panelMaterial.add(spinnerCantidadMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 170, 30));

        selectorInsertarDatos.addTab("Material", panelMaterial);

        panelMaterialUsado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMaterialUsado.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        tituloMaterialUsado.setText("<html><p align=\"center\">ANOTAR MATERIAL USADO EN CLASES</p></html>");
        panelMaterialUsado.add(tituloMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 970, -1));

        botonAñadirMaterialUsado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonAñadir.png"))); // NOI18N
        panelMaterialUsado.add(botonAñadirMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 460, -1, -1));
        panelMaterialUsado.add(textFieldIDClaseMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 170, 30));

        IDClaseMaterialUsado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        IDClaseMaterialUsado.setText("ID DE LA CLASE");
        panelMaterialUsado.add(IDClaseMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));
        panelMaterialUsado.add(textFieldIDMaterialMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 170, 30));

        IDMaterialMaterialUsado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        IDMaterialMaterialUsado.setText("ID DEL MATERIAL");
        panelMaterialUsado.add(IDMaterialMaterialUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        selectorInsertarDatos.addTab("Material usado en clases", panelMaterialUsado);

        panelPrincipalInsertarDatos.add(selectorInsertarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 740));

        selectorPrincipal.addTab("Insertar Datos", panelPrincipalInsertarDatos);

        pantallaPrincipal.getContentPane().add(selectorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));
        selectorPrincipal.getAccessibleContext().setAccessibleName("pane");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoBienvenida.setFont(new java.awt.Font("Impact", 1, 100)); // NOI18N
        textoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        textoBienvenida.setText("jGym");
        getContentPane().add(textoBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 230, -1));

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
        labelIniciarSesion.setText("Iniciar sesión");
        areaInicioSesion.add(labelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 240, -1));

        labelIdEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelIdEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        labelIdEmpleado.setText("ID de empleado:");
        areaInicioSesion.add(labelIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        areaInicioSesion.add(textFieldIDInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));

        labelContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        labelContraseña.setText("Contraseña:");
        areaInicioSesion.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        passwordFieldContraseñaInicioSesion.setText("jPasswordField1");
        areaInicioSesion.add(passwordFieldContraseñaInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, 30));

        labelBotonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/botonEntrar.png"))); // NOI18N
        labelBotonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBotonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBotonEntrarMouseClicked(evt);
            }
        });
        areaInicioSesion.add(labelBotonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        bordePantallaInicio1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 4));
        areaInicioSesion.add(bordePantallaInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        getContentPane().add(areaInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 230, 300, 350));

        bordePantallaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/Fotos/fondoPantallaInicioSesion.jpg"))); // NOI18N
        bordePantallaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 4));
        getContentPane().add(bordePantallaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        fondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final_jgym/fondoPantallaInicioSesion.jpg"))); // NOI18N
        fondoPantalla.setMaximumSize(new java.awt.Dimension(1024, 768));
        fondoPantalla.setMinimumSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(fondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1020, 764));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void labelBotonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBotonEntrarMouseClicked
        pantallaPrincipal.setVisible(true);
    }//GEN-LAST:event_labelBotonEntrarMouseClicked

    private void verDatosPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosPersonasActionPerformed
        
    }//GEN-LAST:event_verDatosPersonasActionPerformed

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
    private javax.swing.JLabel DNICliente;
    private javax.swing.JLabel DNIEmpleado;
    private javax.swing.JLabel IDABuscar;
    private javax.swing.JLabel IDClaseAsistente;
    private javax.swing.JLabel IDClaseMaterialUsado;
    private javax.swing.JLabel IDClienteAsistente;
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
    private javax.swing.JLabel cantidadMaterial;
    private javax.swing.JCheckBox checkBoxRealizoClase;
    private javax.swing.JComboBox<String> comboBoxElegirLineaABorrar;
    private javax.swing.JComboBox<String> comboBoxElementoABuscar;
    private javax.swing.JLabel contraseñaEmpleado;
    private javax.swing.JLabel direccionCliente;
    private javax.swing.JLabel direccionEmpleado;
    private javax.swing.JLabel empleadoACargoClase;
    private javax.swing.JLabel fechaClase;
    private javax.swing.JLabel fechaCliente;
    private javax.swing.JLabel fondoPantalla;
    private javax.swing.JLabel labelBotonEntrar;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelIdEmpleado;
    private javax.swing.JLabel labelIniciarSesion;
    private javax.swing.JLabel nombreClase;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JLabel nombreEmpleado;
    private javax.swing.JLabel nombreMaterial;
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
    private javax.swing.JSpinner spinnerCantidadMaterial;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JLabel telefonoCliente;
    private javax.swing.JLabel telefonoEmpleado;
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
    private javax.swing.JLabel tituloAsistentes;
    private javax.swing.JLabel tituloBorrarLinea;
    private javax.swing.JLabel tituloClase;
    private javax.swing.JLabel tituloCliente;
    private javax.swing.JLabel tituloEmpleado;
    private javax.swing.JLabel tituloMaterial;
    private javax.swing.JLabel tituloMaterialUsado;
    private javax.swing.JButton verDatosAsistentes;
    private javax.swing.JButton verDatosClases;
    private javax.swing.JButton verDatosClientes;
    private javax.swing.JButton verDatosEmpleados;
    private javax.swing.JButton verDatosMaterial;
    private javax.swing.JButton verDatosMaterialUsado;
    private javax.swing.JButton verDatosPersonas;
    // End of variables declaration//GEN-END:variables
}
