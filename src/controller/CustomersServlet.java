package controller;

import Model.Customer;
import service.CustomersService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomersServlet",urlPatterns = "/customers")
public class CustomersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = CustomersService.getALLCustomers();
        request.setAttribute("customers" , customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/customers/List.jsp");
        dispatcher.forward(request,response);
    }
}
