import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/**
 * Created by Anush on 12/5/2017.
 */

@WebServlet(name = "/Register" , urlPatterns = {"/Register"})
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            System.out.println("success");
            Connection connection = CreateConnection.getConnection();
            Statement st = connection.createStatement();
            ResultSet rst = st.executeQuery("SELECT COUNT(*) FROM person");
            int number = 0;
            while (rst.next()) {
                number = Integer.parseInt(rst.getString("COUNT(*)"));
            }

            String personId = "USR" + (number + 1);
            String firstName = request.getParameter("fname");
            String lastName = request.getParameter("lname");
            String type = request.getParameter("type");
            String dob = request.getParameter("birthday");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            PreparedStatement ps = connection.prepareStatement("INSERT INTO person VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, personId);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, type);
            ps.setString(5, dob);
            ps.setString(6, email);
            ps.setString(7, password);
            int k = ps.executeUpdate();
            if (k == 1){
                System.out.println("success");
            }else{
                System.out.println("failed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
