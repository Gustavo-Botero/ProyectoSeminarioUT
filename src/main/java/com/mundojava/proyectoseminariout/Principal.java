package com.mundojava.proyectoseminariout;

import com.mundojava.proyectoseminariout.estado.EstadoDAO;
import com.mundojava.proyectoseminariout.estado.EstadoDTO;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        
        EstadoDAO estadoDAO = new EstadoDAO();
        
        List<EstadoDTO> estados = estadoDAO.listar();
        System.out.println("lista de estados");
        if(estados.size() > 0) {
            for(EstadoDTO estado: estados) {
                System.out.println("estado = " + estado);
            }
        } else {    
            System.out.println("No hay estados registrados en el sistema");
        }
        
        System.out.println("------------------------");
        
        /*EstadoDTO estado = estadoDAO.consultarPorId(2);
        System.out.println(estado);
        
        List<EstadoDTO> nombre = estadoDAO.consultarPorNombre("pago");
        System.out.println(nombre);*/
        
        /*EstadoDTO nuevoEstado = new EstadoDTO(3,"PENDIENTE DE FALLO", 0);
        
        int insertado = estadoDAO.adicionar(nuevoEstado);
        
        if( insertado > 0 ) {
        System.out.println("Dato insertado correctamente");
        } else {
        System.out.println("Dato no pudo ser insertado");
        }*/
        
        /*int eliminar = estadoDAO.eliminar(3);
        System.out.println("eliminar = " + eliminar);
        
        if (eliminar > 0) {
        System.out.println("Dato eliminado correctamente");
        } else {
        System.out.println("Dato no pudo ser eliminado");
        }*/
        
        EstadoDTO modificandoEstado = new EstadoDTO(0,"PENDIENTE", 0);
        int modificar = estadoDAO.modificar(2, modificandoEstado);
        
        if ( modificar > 0 ) {
            System.out.println("El dato modificado correctamente");
        } else {
            System.out.println("El dato no se pudo modificar");
        }
        System.out.println("modificar = " + modificar);
    }
}
