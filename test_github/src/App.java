public class App {
    public static void main(String[] args) throws Exception {
        int tal1 = 2;
        int tal2 = 30;

        int summa_addition = tal1 + tal2;
        int summa_subtraktion = tal2 - tal1;

        System.out.println("Summan av tal1 och tal2 är "+summa_addition);
        System.out.println("Diferensen av tal2 och tal1 "+summa_subtraktion);

        int rest1 = 10%3;
        int rest2 = 9%3;

        System.out.println("Resten av 10/3 är "+rest1);
        System.out.println("Resten av 9/3 är "+rest2);

        double decimal_tal1 = 5.0;
        double decimal_tal2 = 23.41;

        double dec_summa_add = decimal_tal1+decimal_tal2;
        double dec_summa_sub = decimal_tal1-decimal_tal2;

        System.out.println("Summan av decimal_tal1 + decimal_tal2 är "+dec_summa_add);
        System.out.println("Diferensen av decimal_tal1 - decimal_tal2 är "+dec_summa_sub);
    }
}
