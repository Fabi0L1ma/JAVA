package conexao;

public class DbExcecao_Integridade extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    
    public DbExcecao_Integridade(String msg){
        super(msg);
    }
}
