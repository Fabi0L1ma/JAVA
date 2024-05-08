package aplicacao;

import conexao.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Programa {

    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            conn = new BD().conexao();
         
            st = conn.prepareStatement("UPDATE VENDEDOR " +
                    "SET SALARIO =  SALARIO + ? " +
                    "WHERE ID = ?");
            
            st.setDouble(1, 200.00);
            st.setInt(2, 2);
            
            int linhasAfetadas = st.executeUpdate();
            
            System.out.println("Pronto ! Linhas afetadas " + linhasAfetadas);
            
        }catch(SQLException e){
             e.printStackTrace();
        }finally{
            BD.fecharPS(st);
            BD.fecharConexao();
        }
 
    }
}
