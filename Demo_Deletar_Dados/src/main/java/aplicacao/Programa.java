package aplicacao;

import conexao.BD;
import conexao.DbExcecao_Integridade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

    public static void main(String[] args) {
       
        Connection conn = null;
        PreparedStatement st = null;
        
        try{
            conn = new BD().conexao();
            
            st = conn.prepareStatement("DELETE FROM DEPARTAMENTO " + 
                    "WHERE ID = ?");
            
            st.setInt(1, 6);
            
            int linhasAlteradas = st.executeUpdate();
            
            System.out.println("Pronto! Linhas afetadas: " + linhasAlteradas);
            
        }catch(SQLException e){
            throw new DbExcecao_Integridade(e.getMessage());
        }finally{
            BD.fecharPS(st);
            BD.fecharConexao();
        }
    }
}
