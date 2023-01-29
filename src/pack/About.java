package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class About extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out1 = resp.getWriter();
		out1.println("Welcome to my servelet about page...");
		out1.println();
		out1.print("www.achieverANKIT.com");
        out1.println();
		out1.print("Note : Below are the more info about my website, We must read.");
		out1.println();
		out1.println();
		out1.println("Welcome to our web development website! We specialize in creating custom web solutions that are tailored to meet your individual needs. Our team of experienced web developers, designers, and engineers are dedicated to delivering the best possible web experience  our customers. ");
	}

	
}
