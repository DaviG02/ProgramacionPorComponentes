/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author administradorPC
 */
public class Control extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<body style=\"background-color:cadetblue;\">\n" +"</body>");
            out.println("<title>Servlet Control</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><B>Servlet Control at " + request.getContextPath() + "</B></h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       // processRequest(request, response);
    String action=(String) request.getParameter("action");
       
    if (action.equals("Ingresar")){
        String correo = request.getParameter("txt_Correo");
        String clave = request.getParameter("txt_Clave");
        PersonaInf ObjPer=new PersonaDAO().verificar(correo, clave);
        
        if (ObjPer.getClave().equals(clave)) {
                request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }   
    
    
    if (action.equals("Registrar")){
        
        String nombre=request.getParameter("txt_Nombre");
        String numero=request.getParameter("txt_Numero");
        String Correo=request.getParameter("txt_Correo");
        String Clave=request.getParameter("txt_Clave");
        
        PersonaInf persona=new PersonaInf(nombre,numero,Correo,Clave);
        PersonaDAO hi=new PersonaDAO();
        hi.insertar(persona);
    }     

       // response.setContentType("text/html;charset=UTF-8");
       // try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        //    out.println("<!DOCTYPE html>");
        //   out.println("<html>");
        //    out.println("<head>");
        //    out.println("<title>RESPUESTA1</title>");            
        //   out.println("</head>");
        //   out.println("<body style=\"background-color:yellow;\">\n" +"</body>");
        //    out.println("<body>");
        //    out.println("<h1>La persona que llego es: "+nombre+"---"+numero+"---"+Correo+" "+"---"+Clave+" "+"</h1>");
        //    out.println("<h1>Esta es la respuesta desde el servelet control</h1>");
        //    out.println("</body>");
        //    out.println("</html>");
        //}
        //PersonaDAO Dao=new PersonaDAO();
        //List<PersonaInf>lista=Dao.realAll();
        //for(PersonaInf i : lista){
        //    System.out.println(i.toString());
        //}
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
