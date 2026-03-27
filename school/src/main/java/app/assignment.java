package app;

import java.sql.*;
import java.util.Scanner;

public class assignment {
    static String url="jdbc:postgresql://localhost:5432/shop?user=postgres&password=root";

    public static void main(String[]args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection= DriverManager.getConnection(url);
        // insert the data
//        String query="insert into bottle values(?,?,?)";
//        PreparedStatement pre=connection.prepareStatement(query);
//        Scanner sc=new Scanner(System.in);
//        pre.setInt(1,sc.nextInt());
//        pre.setString(2,sc.next());
//        pre.setInt(3,sc.nextInt());
//        pre.executeUpdate();

        // check
        String query="select * from bottle";
        Statement st=connection.createStatement();
        ResultSet rs=st.executeQuery(query);
        int count=0;
        while(rs.next()){
           if(rs.getString("color").equals("green") && rs.getInt("price")==20){
               count++;
           }
        }
        System.out.println(count);
        System.out.print("success");
//        pre.close();;
        connection.close();
    }
}
