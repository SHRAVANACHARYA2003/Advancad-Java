package com.prime;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/primeNumber")
public class Prime_Number extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            if (number < 0) {
                throw new IllegalArgumentException("Please enter a positive number.");
            }

            boolean isPrime = true;
            if (number == 0 || number == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html>");
            out.println("<head><title>Prime Number Result</title></head>");
            out.println("<body>");
            out.println("<h2>Prime Number Checker</h2>");

            if (isPrime) {
                out.println("<p>" + number + " is a prime number.</p>");
            } else {
                out.println("<p>" + number + " is not a prime number.</p>");
            }

            out.println("<br><a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            displayError(out, "Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            displayError(out, e.getMessage());
        }
    }

    private void displayError(PrintWriter out, String message) {
        out.println("<html>");
        out.println("<head><title>Error</title></head>");
        out.println("<body>");
        out.println("<div style='color: red;'>");
        out.println("<h2>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Try Again</a>");
        out.println("</div>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
