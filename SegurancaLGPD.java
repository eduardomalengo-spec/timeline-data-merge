import java.util.HashMap;
import java.util.Map;

public class SegurancaLGPD {
    public static void main(String[] args) {
        
        Map<String, String> codigo = new HashMap<>();
        
        codigo.put("[CODIGO-EU 87238743@#]", "COD-1");
        codigo.put("[CODIGO-EU 56765468@#]", "COD-2");
        codigo.put("[CODIGO-EU 09876532@#]", "COD-3");
        codigo.put("[CODIGO-EU 09134563@#]", "COD-4");
        System.out.println(codigo);
        
        Map<Double, Double> numero = new HashMap<>();
        
        numero.put(1.1, 1.0);
        numero.put(1.2, 1.1);
        numero.put(1.3, 1.2);
        numero.put(1.4, 1.3);
        System.out.println(numero);
        
        for(String codigando : codigo.values()) {
            System.out.println(codigando);
        }
        
     }
}