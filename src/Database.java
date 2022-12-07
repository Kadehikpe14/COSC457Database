import com.mysql.cj.result.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public interface Database {
    public static void main(String[] args) throws IOException, SQLException {
        String jdbcURL = "jdbc:mysql://triton.towson.edu:3360/sstren2db";
        String username = "sstren2db";
        String password = "COSC*qf28v";
        String excelFilePath = "Students.xlsx";


        FileInputStream inputStream = new FileInputStream(excelFilePath);
       // XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

       // XSSFSheet sheet = workbook.getSheetAt(0);
       //Iterator<Row> iterator = sheet.iterator();
        Connection connection = DriverManager.getConnection(jdbcURL, username,  password);
        String sql = "Insert INTO...";
        Statement statement = connection.createStatement();
        int rows =  statement.executeUpdate(sql);
    }

    void start();
}
