public class Estudante {
    String nome;
    double trimestre1;
    double trimestre2;
    double trimestre3;

    public double notaFinal() {
        if (trimestre1 > 30.0 || trimestre2 > 35.0 || trimestre3 > 35.0) {
            System.out.println("INVALID GRADES");
            return 0.0;
        } 
        else if (trimestre1 + trimestre2 + trimestre3 >= 60.0) {
            System.out.printf("FINAL GRADE = %.2f%nPASS ",  trimestre1 + trimestre2 + trimestre3);
            return trimestre1 + trimestre2 + trimestre3;

        } else { 
            System.out.printf("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS ", trimestre1 + trimestre2 + trimestre3, 60.0 - (trimestre1 + trimestre2 + trimestre3));
            return trimestre1 + trimestre2 + trimestre3;
        }

        /* public double notaFinal() {

        double notaFinal = trimestre1 + trimestre2 + trimestre3;

        if (trimestre1 > 30.0 || trimestre2 > 35.0 || trimestre3 > 35.0) {
            System.out.println("INVALID GRADES");
            return 0.0;
        } 
        else if (trimestre1 + trimestre2 + trimestre3 >= 60.0) {
            System.out.printf("FINAL GRADE = %.2f%nPASS ",  notaFinal);

        } else {
            double pontosFaltantes = notaFinal - 60.0;
            System.out.printf("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS ", notaFinal, pontosFaltantes);
          }

          return notaFinal();

    }
         */
    }
}
