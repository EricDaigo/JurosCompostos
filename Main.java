import java.math.BigDecimal;
import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {
    
    BigDecimal principal = BigDecimal.valueOf(1000.0);
    BigDecimal taxa = BigDecimal.valueOf(0.05);//Juros de 5%

    System.out.printf("%s%20s%n", "Ano", "Valor");

    for(int ano = 1; ano <= 10; ano++){
      BigDecimal valor = principal.multiply(taxa.add(BigDecimal.ONE).pow(ano));//add(adiciona 1 - ONE) e pow(eleva ao ano)
      System.out.printf("%4d%20s%n", ano, NumberFormat.getCurrencyInstance().format(valor));
    }
    
  }
}