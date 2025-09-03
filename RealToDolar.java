public class RealToDolar {
    public static void main(String[] args) {
        double valorEmDolares = 50;
        double taxaDeTroca = 4.94;
        double valorEmReais = (valorEmDolares * taxaDeTroca);

        System.out.printf("O valor de %.2f dólares é equivalente a R$ %.2f reais.", valorEmDolares, valorEmReais);

    }
    
}
