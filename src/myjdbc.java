import java.sql.*;

public class myjdbc {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://triton.towson.edu:3360/sstren2db","sstren2","COSC*qf28v");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Client");

            while(resultSet.next()){
                System.out.println(resultSet.getString("Fname"));
            }

        }   catch(Exception e) {
                e.printStackTrace();
        }
    }
}
