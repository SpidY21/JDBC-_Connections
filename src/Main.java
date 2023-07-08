import java.sql.*;

public class Main {
    public static void main(String[] args)throws Exception {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "Yash@90180");
            Statement stm= con.createStatement();
            ResultSet rs= stm.executeQuery("select *from users");
            int no;
            String name;
            int city;
            while(rs.next()) {
                no = rs.getInt("id");
                name = rs.getString("name");
                city = rs.getInt("city");
                System.out.println(no + " " + name + " " + city);
            }
    }
}