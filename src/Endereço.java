import java.util.*;
public class Endereço {
    private String cep;
    private String complemento;
    
    public Endereço(String cep, String complemento) {
        this.cep = cep;
        this.complemento = complemento;
    }

    public Endereço() {
    }

    @Override
    public String toString() {
        return "Endereço [cep=" + cep + ", complemento=" + complemento + "]";
    }
    
}
