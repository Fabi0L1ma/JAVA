package aplicacao;

import Conexao.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs  = null;
        
        try{
            conn = new DB().ConexaoBd();
            
            st = conn.createStatement();
            
            rs = st.executeQuery("SELECT * FROM DEPARTAMENTO"); // ST = PASSA O COMANDO SQL     E     RS = 
            
            while(rs.next()){
                System.out.println(rs.getInt("ID") + ", " + rs.getString("NOME"));
            }
        }catch(SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            
        }finally{
            DB.fecharResultSet(rs);
            DB.fecharStatement(st);
            DB.fecharConexao();
        }
    }
}
