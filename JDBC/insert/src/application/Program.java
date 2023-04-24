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
                    "INSERT INTO department "
                    + "(Name) "
                    + "values "
                    + "(?)",
                    Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, "DT");


            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while (resultSet.next()){
                    System.out.println(resultSet.getInt(1));
                }
            }else System.out.println("No rown affected.");
            //System.out.println("Done, rows affected: " + rowsAffected);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }

}
