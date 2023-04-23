package JDBC.insert.src.application;

import JDBC.insert.src.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "values "
                    + "(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, "Carl Purple");
            preparedStatement.setString(2, "carlpurple@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(sdf.parse("11/04/1958").getTime()));
            preparedStatement.setDouble(4, 3000.0);
            preparedStatement.setInt(5, 4);

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while (resultSet.next()){
                    System.out.println(resultSet.getInt(1));
                }
            }else System.out.println("No rown affected.");
            //System.out.println("Done, rows affected: " + rowsAffected);
        }catch (SQLException | ParseException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }

}
