package app;

import java.sql.*;

import static app.assignment.url;

public class fetchData {
    public static void main(String[]args){
        Connection con=null;
        PreparedStatement pre=null;
        try{
            con= DriverManager.getConnection(url);
            String query="select * from bottle";
            pre=con.prepareStatement(query);
            ResultSet res=pre.executeQuery();
            int count=0;
            while(res.next()){
                String name=res.getString("color");
                System.out.println(name);
                if(name.equals("green")){
                    count++;
                }
            }
            System.out.print("number of green bottle are:"+count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            pre.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.print("success");
        ;
    }
}
