import java.util.*;
public class Restaurante {
    private Long id;
    private String nomeFantasia;
    private String cnpj;
    private List<Produto> cardapio = new ArrayList<>();
    private Endereço endereço;
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Restaurante [id=" + id + ", nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + ", cardapio=" + cardapio
                + ", endereço=" + endereço + "]";
    }
    
}
