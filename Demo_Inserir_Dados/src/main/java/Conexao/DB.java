package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
    
    private static Connection conn = null;
    
    public Connection conexao(){
        
        try{
            String url = "jdbc:mysql://localhost/LOJA?user=root&password=";
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
    
    public static void fecharPS(PreparedStatement ps){
        if(ps != null){
            try{
                ps.close();
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
                System.out.println("ERRO: " + e.getMessage());
            }
        }
        
    }
}
