package JDBC.src.application;

import JDBC.src.db.DB;
import JDBC.src.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from department");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            DB.closeStatement(statement);
            DB.closeConnection();
            DB.closeResultSet(resultSet);
        }
    }

}
