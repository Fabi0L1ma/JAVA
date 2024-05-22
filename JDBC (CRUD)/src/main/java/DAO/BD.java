package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BD {
    
    private static Connection conn = null;
    
    public Connection conexaoBD(){
        
        try{
            String url = "jdbc:mysql://localhost/BDO?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }
       return conn; 
    }
    
    
    public static void fecharConexao(){
        if(conn != null){
            try{
                conn.close();
                
            }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
    
    public static void fecharPS(PreparedStatement pst){
        if(pst != null){
            try{
                pst.close();
                
            }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
    
    public static void fecharST(Statement st){
        if(st != null){
            try{
                st.close();
        
            }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
    
    public static void fecharRS(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
                
            }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
            }
            
        }
    }
}
