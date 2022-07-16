package onlinecalc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * String exp=request.getParameter("Expression"); ScriptEngineManager mgr = new
		 * ScriptEngineManager(); ScriptEngine engine =
		 * mgr.getEngineByName("JavaScript"); String result=""; try {
		 * result=engine.eval(exp).toString(); } catch (ScriptException e) {
		 * e.printStackTrace(); }
		 * 
		 * PrintWriter out=response.getWriter(); out.println(result);
		 */
		/*
		 * request.setAttribute("Expression", result);
		 * request.getRequestDispatcher("/WEB-INF/OnlineCalculator.html").forward(
		 * request, response);
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String exp=request.getParameter("Expression");
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String result="";
	    try {
			result=engine.eval(exp).toString();
		} 
	    catch (ScriptException e) {	
			e.printStackTrace();
		}
		
		  PrintWriter out=response.getWriter(); 
		  out.println(result);
		 
		/*
		 * request.setAttribute("Expression", result);
		 * request.getRequestDispatcher("/WEB-INF/OnlineCalculator.html").forward(
		 * request, response);
		 */
	}

}
