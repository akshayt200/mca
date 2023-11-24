
public class InsertStudentServlet {
}
@WebServlet("/insertStudent.jsp")
public class InsertStudentServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
     // Retrieve student information from the request
     String name = request.getParameter("name");
     String rollNumber = request.getParameter("rollNumber");
     String course = request.getParameter("course");
     response.sendRedirect("studentForm.jsp");
 }
}
