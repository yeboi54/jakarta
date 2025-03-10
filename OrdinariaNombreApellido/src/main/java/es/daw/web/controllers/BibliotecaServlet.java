package es.daw.web.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BibliotecaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        // Datos de prueba
        List<String> librosDisponibles = Arrays.asList("El Quijote", "1984", "Cien años de soledad", "El señor de los anillos");
        List<String> prestamosCliente = Arrays.asList("1984 - George Orwell", "Cien años de soledad - Gabriel García Márquez");
        List<String> prestamosAdmin = Arrays.asList("1984 - Juan Pérez", "Cien años de soledad - María Gómez", "El Quijote - Carlos López");







    }
}