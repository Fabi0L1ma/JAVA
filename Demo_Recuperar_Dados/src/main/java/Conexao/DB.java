package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    
    private static Connection conn = null;
    
    public Connection ConexaoBd(){
            
        try{
            String url = "jdbc:mysql://localhost/LOJA?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        }catch(SQLException e){
            System.out.println("ERRO: " + e.getMessage());
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
   
    public static void fecharStatement(Statement st){
        if(st != null){
            try{
                st.close();
            }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());   
            }
        }
    }
    
    public static void fecharResultSet(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());   
            }
        }
         
    }
}
