package com.nttdata.tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Mi primer servlet
 * 
 * @author Christian
 */
public class NTTDataServlet extends HttpServlet {

	/** Serial version */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public NTTDataServlet() {
		super();
	}

	/**
	 * M�todo que escucha por defecto peticiones HTTP con m�todo GET
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("<b>SI LEES ESTO TE DEBO UNA CERVEZA EL DIA 10 DE ENERO ;)</b>");
	}

	/**
	 * M�todo que escucha por defecto peticiones HTTP con m�todo POST
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
