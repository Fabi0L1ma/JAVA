package DTO;

public class JogadorDTO {
    
    private Integer numCamisa;
    private String nome;
    private String posicao;
    private String clube;
    
    public JogadorDTO(){
    }
    
    public JogadorDTO(Integer numCamisa, String nome, String posicao, String clube){
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.posicao = posicao;
        this.clube = clube;
    }
    
    public Integer getNumCamisa(){
        return numCamisa;
    }
    
    public void setNumCamisa(Integer numCamisa){
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }
}
