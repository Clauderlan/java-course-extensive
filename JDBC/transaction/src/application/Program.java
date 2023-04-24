package JDBC.transaction.src.application;

import JDBC.transaction.src.db.DB;
import JDBC.transaction.src.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            // Select ->
            connection = DB.getConnection();
            connection.setAutoCommit(false); // Commit able
            statement = connection.createStatement();

            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();
            System.out.println("Rows 1 : " + rows1 + " Rows 2: " + rows2);

        }catch (SQLException e){
            try {
                connection.rollback();
                throw new DbException("Error, Rollback now. Caused by : " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error with rollback. Caused by : " + ex.getMessage());
            }
        }finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }

}
