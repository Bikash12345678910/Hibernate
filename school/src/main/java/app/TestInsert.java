package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static app.assignment.url;

public class TestInsert {
    public static void main(String[]args){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        PreparedStatement preparedStatement1=null;
        try{
            connection= DriverManager.getConnection(url);
            String query="Delete from bottle where price=?";
            String query2="update bottle set price=? where price=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement1=connection.prepareStatement(query2);
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the price :");
            preparedStatement.setInt(1,sc.nextInt());
            System.out.print("Enter the update price:");
            preparedStatement1.setInt(1,sc.nextInt());
            System.out.print("Enter the price:");
            preparedStatement1.setInt(2,sc.nextInt());
            preparedStatement1.executeUpdate();
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try{
                preparedStatement1.close();
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
