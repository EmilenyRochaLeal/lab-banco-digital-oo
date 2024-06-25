import java.util.ArrayList;
import java.util.List;

public class GerenciaCofrinhos {
    private List<Cofrinho> cofrinhos;

    public GerenciaCofrinhos() {
        this.cofrinhos = new ArrayList<>();
    }

    public void adicionarCofrinho(Cofrinho cofrinho) {
        cofrinhos.add(cofrinho);
    }
    
}
