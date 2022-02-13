package com.mundojava.proyectoseminario;

import com.mundojava.proyectoseminario.patrones_dao_dto.EstadoDAO;
import com.mundojava.proyectoseminario.patrones_dao_dto.EstadoDAOImplementacion;
import com.mundojava.proyectoseminario.patrones_dao_dto.EstadoDTO;
import java.util.List;

public class Principal {
    private static EstadoDAO estadoDAO;
    public static void main(String[] args) {
        estadoDAO = new EstadoDAOImplementacion();
        
        consultarEstadoPorId(2);
        listarEstados();
        //adicionarEstado();
        listarEstados();
        /*Capturador capturador = new Capturador();
        
        String cadena = capturador.capturarLetras("Validar Solo letras");
        System.out.println("cadena = " + cadena);
        
        int validarInt = capturador.capturarInteger("Validar integer", true);
        System.out.println("validarInt = " + validarInt);
        
        short validarShort = capturador.capturarShort("Validar short", true);
        System.out.println("validarShort = " + validarShort);*/
    }
    
    private static void modificarEstado(){
        EstadoDTO estado = new EstadoDTO(3, "Pendiente de resolución", false);
        estadoDAO.adicionar(estado);
    }
    
    public static void adicionarEstado() {
        EstadoDTO estado = new EstadoDTO(3, "Pendiente de fallo", false);
        estadoDAO.adicionar(estado);
    }
    
    public static void consultarEstadoPorId(int idBuscado) {
        EstadoDTO estado1 = estadoDAO.consultarPorId(idBuscado);
        System.out.println("estado1 = " + estado1);
    }
    
    private static void listarEstados() {
        List<EstadoDTO> datos = estadoDAO.listarTodo();
        System.out.println("\nLista de estados\n");
        for(EstadoDTO es: datos) {
            System.out.println(es);
        }
    }
}
