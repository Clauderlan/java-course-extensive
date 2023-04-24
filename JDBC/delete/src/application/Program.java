package JDBC.delete.src.application;

import JDBC.delete.src.db.DbIntegrityException;
import JDBC.select.src.db.DB;

import java.sql.*;

public class Program {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?"
            );
            preparedStatement.setInt(1, 5);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected);
        }catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }

    }

}
