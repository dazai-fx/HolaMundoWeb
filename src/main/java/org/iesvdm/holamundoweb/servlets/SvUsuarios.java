package org.iesvdm.holamundoweb.servlets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.iesvdm.holamundoweb.logica.Usuario;

@WebServlet(name = "SvUsuarios", value = "/SvUsuarios")
public class SvUsuarios extends HttpServlet {

    public void init() {
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<Usuario> listaUsuarios = new ArrayList<Usuario>();

        listaUsuarios.add(new Usuario("123","luisina","paula","4444"));
        listaUsuarios.add(new Usuario("1234","Manuel","Gomez","987"));
        listaUsuarios.add(new Usuario("2985","Alejandro","Pablo","789394"));

        // Mandamos la lista de usuarios a un jsp mediante un objeto HttpSession
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaUsuarios", listaUsuarios);

        response.sendRedirect("mostrarUsuarios.jsp");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Telefono: " + telefono);

    }

    public void destroy() {
    }
}