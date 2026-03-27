import java.sql.*;
import java.util.Scanner;

public class insertdata {
    static String url="jdbc:postgresql://localhost:5432/School?user=postgres&password=root";
    public static void main(String[]args) throws ClassNotFoundException, SQLException {
    Class.forName("org.postgresql.Driver");
    Connection connection= DriverManager.getConnection(url);
    // Insert the data
//    String query="insert into student values(?,?,?,?)";
//        PreparedStatement pre=connection.prepareStatement(query);
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the id :");
//        pre.setInt(1,sc.nextInt());
//        System.out.print("Enter the Name:");
//        pre.setString(2,sc.next());
//        System.out.print("Enter the Email:");
//        pre.setString(3,sc.next());
//        System.out.print("Enter the phone no:");
//        pre.setDouble(4,sc.nextDouble());
//        pre.executeUpdate();
        // update the data
//        String query2="update student set name=? where id=?";
//        PreparedStatement pre2=connection.prepareStatement(query2);
//        Scanner sc=new Scanner(System.in);
//        pre2.setInt(2,sc.nextInt());
//        pre2.setString(1,sc.next());
//
//        pre2.executeUpdate();
    // Retrive the data
//        String query3="select * from student";
//        Statement pre3=connection.createStatement();
//        ResultSet rs=pre3.executeQuery(query3);
//        while(rs.next()){
//            String name= rs.getString("name");
//                if(name.equals("raja")){
//                    System.out.println("present");
//                }
//
//            }

        String query4="delete from student where name=?";
        PreparedStatement pre4=connection.prepareStatement(query4);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name which are removed the records:");
       pre4.setString(1,sc.next());
       pre4.executeUpdate();
        System.out.print("successfully");
        }

    }


