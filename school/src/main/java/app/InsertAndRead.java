package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static app.assignment.url;

public class InsertAndRead {
    public static void main(String[]args){
        Connection con=null;
        PreparedStatement pre=null;
        try{
            con= DriverManager.getConnection(url);
            String query="insert into bottle values(?,?,?)";
            pre=con.prepareStatement(query);
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the id :");
            pre.setInt(1,sc.nextInt());
            System.out.print("Enter the color:");
            pre.setString(2,sc.next());
            System.out.print("Enter the price:");
            pre.setInt(3,sc.nextInt());
            pre.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                con.close();
            }
            catch(SQLException e){
                System.out.print("connection lost");
            }
            try{
                pre.close();
            }
            catch(SQLException e){
                System.out.print("prepareStatemnt not close");
            }
        }
    }
}
