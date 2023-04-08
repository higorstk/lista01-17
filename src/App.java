import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double metrosquadrados;
    double precototal;
    double quantidadedelatas;
    double quantidadedegaloes;
    double precototalgaloes;
    double quantidadedelatas1;
    double quantidadedegaloes1;
    double metrosquadrados1;
    double quantidadedegaloes2;
    
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos metros quadrados serão pintados?");
     metrosquadrados = teclado.nextDouble();
    
    // passo 3: calcular
    quantidadedelatas = Math.ceil (metrosquadrados / 108d);   
    precototal = quantidadedelatas * 80;
    quantidadedegaloes =  Math.ceil (metrosquadrados / 21.6d);
    precototalgaloes = quantidadedegaloes * 25;

    // misturar
    metrosquadrados = metrosquadrados * 1.1;
    quantidadedelatas1 = Math.floor (metrosquadrados / 108);
    quantidadedegaloes1 = (metrosquadrados - (quantidadedelatas1 * 108));
    quantidadedegaloes2 = Math.ceil (quantidadedegaloes1 / 21.6);

      //passo 4: exibir 
    System.out.println("Quantidades de latas necessárias :" + quantidadedelatas);
    System.out.println("Preço total a ser pago por latas R$ " + precototal);
    System.out.println("Quantidades de galões necessários :" + quantidadedegaloes);
    System.out.println("Preço total a ser pago por galões R$ " + precototalgaloes);
    System.out.println("Galões misturados : " + quantidadedegaloes2);
    System.out.println("Latas misturadas : " + quantidadedelatas1);
  
  }
}