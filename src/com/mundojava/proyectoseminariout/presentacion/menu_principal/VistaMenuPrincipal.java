package com.mundojava.proyectoseminariout.presentacion.menu_principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class VistaMenuPrincipal {

    private JFrame ventana;
    private JMenuBar barraMenu;
    
    private JMenu opcUsuario;
    private JMenuItem opcCrearUsuario;
    
    private JMenu opcConductor;
    private JMenu opcInfraccion;
    private JMenu opcTipoInfraccion;
    private JMenu opcTipoVehiculo;
    private JMenu opcEstado;
    private JMenu opcSalir;
    
    public VistaMenuPrincipal() {
        configurarVentana();
    }
    
    public void ejecutar() {
        ventana.setVisible(true);
    }
    
    private void agregarOpcUsuario(){
        opcUsuario = new JMenu("Usuario");
        opcCrearUsuario = new JMenuItem("Crear Usuario");
        opcCrearUsuario.addActionListener(new VentanaListener());
        opcUsuario.add(opcCrearUsuario);
        barraMenu.add(opcUsuario);
    }
    
    private void agregarOpcConductor(){
        opcConductor = new JMenu("Conductor");
        barraMenu.add(opcConductor);
    }
    
    private void agregarOpcInfraccion(){
        opcInfraccion = new JMenu("Infracción");
        barraMenu.add(opcInfraccion);
    }
    
    private void agregarOpcTipoInfraccion(){
        opcTipoInfraccion = new JMenu("Tipo Infracción");
        barraMenu.add(opcTipoInfraccion);
    }
    
    private void agregarOpcTipoVehiculo(){
        opcTipoVehiculo = new JMenu("Tipo vehículo");
        barraMenu.add(opcTipoVehiculo);
    }
    
    private void agregarOpcEstado(){
        opcEstado = new JMenu("Estado");
        barraMenu.add(opcEstado);
    }
    
    private void agregarOpcSalir() {
        opcSalir = new JMenu("Salir");
        barraMenu.add(opcSalir);
    }
    
    /*private void crearOpcionMenu(JMenu menu, JMenuItem item, String texto) {
    item = new JMenuItem(texto);
    item.addActionListener(new VentanaListener());
    menu.add(item);
    }*/
        
    private void agregarBarraMenu() {
        barraMenu = new JMenuBar();
        ventana.setJMenuBar(barraMenu);
        agregarOpcUsuario();
        agregarOpcConductor();
        agregarOpcInfraccion();
        agregarOpcTipoInfraccion();
        agregarOpcTipoVehiculo();
        agregarOpcEstado();
        agregarOpcSalir();
        
    }
    
    private void configurarVentana() {
        ventana = new JFrame();
        ventana.setTitle(VistaMenuPrincipalLiterales.TITULO_VENTANA.getDato());
        ventana.setSize(800, 800);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        //ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Para cerrar la ventana pero que se siga ejecutando el programa
        agregarBarraMenu();
    }
    
    class VentanaListener implements ActionListener {
      
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println(ae.getSource().toString());
            JOptionPane.showMessageDialog(null, "opcion ejecutada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
