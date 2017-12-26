package packnew;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogFilter implements Filter  {
   private static final Logger l = Logger.getLogger("LogFilter");
   
   public void  init(FilterConfig config) throws ServletException {
      String testParam = config.getInitParameter("test-param"); 
      System.out.println("Test Param: " + testParam); 
   }
   public void  doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
      throws java.io.IOException, ServletException {
      
      l.setLevel(Level.CONFIG);
      FileHandler fh = new FileHandler("myLogger.log");
      fh.setLevel(Level.CONFIG);
      l.addHandler(fh);
      l.info(request.getRemoteAddr()+" at Time "+new Date().toString());
   
      chain.doFilter(request,response);
   }
   public void destroy( ) {
   }
}