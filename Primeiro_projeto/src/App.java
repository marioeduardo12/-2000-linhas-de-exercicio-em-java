
import java.util.Locale;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        // Operadores de atribuição

        // double x = 10.234102;
        /*
         * String nome = "Maria";
         * int idade = 31;
         * double renda = 4000.0;
         *
         *
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula
         * System.out.printf("%.2f%n", x); // %.2f = 2 casas decimais de formatação
         * System.out.println("RESULTADO = " + x + " METROS"); // Concatenação
         * System.out.printf("RESULTADO = %.2f METROS%n", x); // %.2f = 2 casas decimais
         * de formatação
         * System.out.printf("RESULTADO = %.4f METROS%n", x); // %.4f = 4 casas decimais
         * de formatação
         * System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,
         * renda); // %s = string, %d = inteiro, %f = ponto flutuante, lembrando que as
         * váriaveis devem ser passadas na ordem correta dos marcadores
         *
         * String product1 = "Computer";
         * String product2 = "Office desk";
         *
         * int age = 30;
         * int code = 5290;
         * char gender = 'F';
         *
         * double price1 = 2100.0;
         * double price2 = 650.50;
         * double measure = 53.23456700;
         *
         *
         * System.out.
         * printf("Products: %s, which price is %.2f and %s, which price is %.2f%n",
         * product1, price1, product2, price2); // %.2f = 2 casas decimais de
         * formatação, use para valores com casas decimais
         *
         * System.out.printf("Record: %d years old, code %d and gender: %c%n", age,
         * code, gender); // %d = inteiro, %c = caractere
         *
         * System.out.println("Measure with eight decimal places: " + measure); // %.8f
         * = 8 casas decimais de formatação, mas podemos usar o padrão e reduzir o
         * código com o println
         *
         * System.out.printf("Rounded (three decimal places): %.3f%n", measure); // %.3f
         * = 3 casas decimais de formatação
         *
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula
         *
         * System.out.printf("US decimal point: %.3f%n", measure); // %.3f = 3 casas
         * decimais de formatação com ponto.
         */

        // Operadores aritméticos

        /*
         * int x, y;
         *
         * x = 5;
         *
         * y = 2 * x;
         *
         * System.out.println(x);
         * System.out.println(y);
         */

        /*
         * double b, B, h, area; // Declarando as variáveis
         *
         * // Atribuindo valores as variáveis
         *
         * b = 6.0; //Boa prárica é colocar o ponto para indicar que é um tipo double e
         * quando for float colocar o f no final
         * B = 8.0;
         * h = 5.0;
         *
         * area = (b + B) * h / 2.0; // Calculando a área do trapézio
         *
         * System.out.println(area); // Exibindo o resultado
         */

        // Operadores de incremento e decremento
        /*
         * int a, b; // Declarando as variáveis, em caso de divisão de inteiros usando
         * int, o resultado sera inteiro, double ou float o resultado será double ou
         * float, ou seja vai ter casas decimais
         * double resultado; // Declarando as variáveis
         *
         * // Atribuindo valores as variáveis
         *
         * a = 5;
         * b = 2;
         *
         * //resultado = a / b // Divisão de inteiros
         *
         * resultado = (double)a / b; // Divisão de inteiros com casting para double
         *
         * System.out.println(resultado);
         */

        // Em caso de não se importar com a perda de informações

        /*
         * double a; // Declarando as variáveis
         * int b;
         *
         * a = 5.0;
         * b = (int)a; // Casting de atribuiçao de valor sem se preocupar com a perda de
         * informações, sendo que o valor de a é 5.0 e o valor de b é 5
         *
         * System.out.println(b);
         */

        /*
         * // ENTRADA DE DADOS EM JAVA
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * String x; // Declarando a variável
         * x = sc.next(); // Lendo a variável e armazenando na variável x
         * System.out.println("Você digitou: " + x); // Exibindo o valor da variável x
         *
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // ler variaveis do tipo int usando next

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int x; // Declarando a variável
         *
         * x = sc.nextInt(); // Lendo a variável e armazenando na variável x
         * System.out.println("Você digitou: " + x); // Exibindo o valor da variável x
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        /*
         * //ler variaveis do tipo double usando next
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula, lembrando sempre antes do objeto Scanner
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * double x; // Declarando a variável
         *
         * x = sc.nextDouble(); // Lendo a variável e armazenando na variável x
         * System.out.println("Você digitou: " + x); // Exibindo o valor da variável x
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // ler variaveis do tipo char usando next/ char ultiliza apenas pra armazenar 1
        // caractere

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         * char x; // Declarando a variável
         * x = sc.next().charAt(0); // Lendo a variável e armazenando na variável x
         * System.out.println("Você digitou: " + x); // Exibindo o valor da variável x
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Ler varios dados na mesma linha de código
        /*
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula, lembrando sempre antes do objeto Scanner
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * String x; // Declarando a variável
         * int y; // Declarando a variável
         * double z; // Declarando a variável
         *
         * x = sc.next(); // Lendo a variável e armazenando na variável x
         * y = sc.nextInt(); // Lendo a variável e armazenando na variável y
         * z = sc.nextDouble(); // Lendo a variável e armazenando na variável z
         *
         * System.out.println("Dados digitados: " + x + " tem " + y + " anos e tirou " +
         * z + " na prova!"); // Exibindo o valor da variável x e y e z
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         * String s1, s2, s3; // Declarando as variáveis
         * int x; // Declarando a variável
         * x = sc.nextInt(); // Lendo a variável e armazenando na variável x, mas em
         * caso de usar o nextLine, o nextLine vai ler a quebra de linha que o next não
         * leu, ai nao vai haver o espaço em branco, sendo assim pra resolver isso, é só
         * colocar o nextLine SC depois do next int
         * sc.nextLine(); // Consumindo a quebra de linha pendente
         * s1 = sc.nextLine(); // Lendo a variável e armazenando na variável s1
         * s2 = sc.nextLine(); // Lendo a variável e armazenando na variável s2
         * s3 = sc.nextLine(); // Lendo a variável e armazenando na variável s3
         *
         * System.out.println("Dados digitados: " + x + " " + sc + " " + s1 + " " + s2 +
         * " " + s3); // Exibindo o valor da variável x e y e z / jeito de otimizar o
         * código
         * // System.out.println(s1); // Exibindo o valor da variável s1
         * // System.out.println(s2); // Exibindo o valor da variável s2
         * // System.out.println(s3); // Exibindo o valor da variável s3
         *
         * sc.close(); // Fechando o objeto Scanner
         * //Nextline é usado para ler uma linha inteira de texto, já o next é usado
         * para ler uma palavra, ou seja, até o espaço em branco
         */

        // Operadores Matemáticos

        // Calculando a raiz quadrada

        /*
         * double x = 3.0;
         * double y = 4.0;
         * double z = -5.0;
         * double A, B, C;
         *
         * A = Math.sqrt(x); // Raiz quadrada
         * B = Math.sqrt(y); // Raiz quadrada
         * C = Math.sqrt(25.0); // Raiz quadrada de 25
         *
         * System.out.println("Raiz quadrada de " + x + " = " + A); // Exibindo o valor
         * da variável A
         * System.out.println("Raiz quadrada de " + y + " = " + B); // Exibindo o valor
         * da variável B
         * System.out.println("Raiz quadrada de 25 = " + C); // Exibindo o valor da
         * variável C
         *
         * //Calculando a potência
         *
         * A = Math.pow(x, y); // Potência
         * B = Math.pow(x, 2.0); // Potência
         * C = Math.pow(5.0, 2.0); // Potência
         *
         * System.out.println(x + " elevado a " + y + " = " + A); // Exibindo o valor da
         * variável A
         * System.out.println(x + " elevado ao quadrado = " + B); // Exibindo o valor da
         * variável B
         * System.out.println("5 elevado ao quadrado = " + C); // Exibindo o valor da
         * variável C
         *
         * //Calculando o valor absoluto
         *
         * A = Math.abs(y); // Valor absoluto
         * B = Math.abs(z); // Valor absoluto
         *
         * System.out.println("Valor absoluto de " + y + " = " + A); // Exibindo o valor
         * da variável A
         * System.out.println("Valor absoluto de " + z + " = " + B); // Exibindo o valor
         * da variável B
         */

        // Incluindo funções em expressões maiores
        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         * double a, b, c;
         * double delta;
         *
         * a = sc.nextDouble(); // Lendo a variável e armazenando na variável a
         * b = sc.nextDouble(); // Lendo a variável e armazenando na variável b
         * c = sc.nextDouble(); // Lendo a variável e armazenando na variável c
         *
         * delta = Math.pow(b, 2.0) - 4*a*c; // Calculando the delta
         *
         * System.out.println("Delta = " + delta); // Exibindo the delta
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         * double A, B;
         * double x1, x2;
         * double delta = 25;
         *
         * A = sc.nextDouble();
         * B = sc.nextDouble();
         *
         * x1 = (-B + Math.sqrt(delta)) / (2.0 * A); // Calculando the x1
         * x2 = (-B - Math.sqrt(delta)) / (2.0 * A); // Calculando the x2
         *
         * System.out.println("X1 = " + x1); // Exibindo the x1
         * System.out.println("X2 = " + x2); // Exibindo the x2
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int A, B;
         *
         * A = sc.nextInt(); // Lendo a variável e armazenando na variável A
         * B = sc.nextInt(); // Lendo a variável e armazenando na variável B
         *
         * //função soma A + B
         *
         * int soma = A + B;
         *
         * System.out.println("SOMA = " + soma); // Exibindo o valor da variável soma
         *
         * sc.close();
         */ // Fechando o objeto Scanner

        // Exercício de fixação

        // Calculando a área do círculo

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * double raio, area, pi = 3.14159;
         *
         * raio = sc.nextDouble(); // Lendo a variável e armazenando na variável raio
         * area = pi * Math.pow(raio, 2.0); // Calculando a área do círculo
         *
         * System.out.printf("o valor da área = %.4f%n", area); // Exibindo o valor da
         * variável area
         * sc.close();
         */ // Fechando o objeto Scanner

        // Exercício de fixação

        // Calculando a diferença do produto entre A e B e C e D

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int A, B, C, D;
         *
         * A = sc.nextInt(); // Lendo a variável e armazenando na variável A
         * B = sc.nextInt(); // Lendo a variável e armazenando na variável B
         * C = sc.nextInt(); // Lendo a variável e armazenando na variável C
         * D = sc.nextInt(); // Lendo a variável e armazenando na variável D
         *
         * int ab = A * B; // Calculando o produto de A e B
         * int cd = C * D; // Calculando o produto de C e D
         *
         * System.out.println("DIFERENÇA = " + (ab - cd)); // Exibindo o valor da
         * variável AB e CD
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        // Calculando o salário do funcionário

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula, lembrando sempre antes do objeto Scanner
         *
         * int numero, horas;
         * double valorhora, salario;
         *
         * numero = sc.nextInt(); // Lendo a variável e armazenando na variável numero
         * horas = sc.nextInt(); // Lendo a variável e armazenando na variável horas
         * valorhora = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * valorhora
         *
         * salario = horas * valorhora; // Calculando o salário do funcionário
         *
         * System.out.printf("NUMBER = %d SALARY = U$ %.2f%n", numero, salario); //
         * Exibindo o valor da variável numero e salario
         *
         * System.out.printf: Este é um método em Java usado para imprimir uma string
         * formatada no console.
         * "NUMBER = %d SALARY = U$ %.2f%n": Esta é a string de formatação. Aqui estão
         * os marcadores de posição %d e %f que serão substituídos pelos valores reais
         * de acordo com o que é passado após a vírgula.
         * %d é um marcador de posição para um número inteiro.
         * %f é um marcador de posição para um número de ponto flutuante (float).
         * %.2f indica que queremos imprimir o número de ponto flutuante com precisão de
         * duas casas decimais.
         * numero e salario: São as variáveis que contêm os valores que serão
         * substituídos nos marcadores de posição na string de formatação.
         * Portanto, quando esta linha é executada, ela imprime uma mensagem na forma
         * "NUMBER = [valor de numero] SALARY = U$ [valor de salario]", onde "numero" é
         * substituído pelo valor da variável numero e "salario" é substituído pelo
         * valor da variável salario, com duas casas decimais.
         */

        // sc.close(); Fechando o objeto Scanner

        /*
         * Calcular peça Fazer um programa para ler o código de uma peça 1, o número de
         * peças 1, o valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.
         *
         * Scanner sc = new Scanner(System.in);
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula, lembrando sempre antes do objeto Scanner
         *
         * int cod1, cod2, num1, num2;
         *
         * double valor1, valor2, total;
         *
         *
         * cod1 = sc.nextInt(); // Lendo a variável e armazenando na variável cod1
         * num1 = sc.nextInt(); // Lendo a variável e armazenando na variável num1
         * valor1 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * valor1
         * sc.nextLine(); // Consumindo a quebra de linha pendente
         * cod2 = sc.nextInt(); // Lendo a variável e armazenando na variável cod2
         * num2 = sc.nextInt(); // Lendo a variável e armazenando na variável num2
         * valor2 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * valor2
         *
         * total = (num1 * valor1) + (num2 * valor2); // Calculando o total a ser pago
         *
         * System.out.printf("VALOR A PAGAR: R$ %.2f%n", total); // Exibindo o valor da
         * variável total
         *
         * sc.close(); Fechando o objeto Scanner
         */

        // Exercício de fixação

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         *
         * double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
         *
         * A = sc.nextDouble(); // Lendo a variável e armazenando na variável A
         * B = sc.nextDouble(); // Lendo a variável e armazenando na variável B
         * C = sc.nextDouble(); // Lendo a variável e armazenando na variável C
         *
         * triangulo = A * C / 2.0; // Calculando a área do triângulo
         * circulo = 3.14 * Math.pow(C, 2.0); // Calculando a área do círculo
         * trapezio = (A + B) / 2.0 * C; // Calculando a área do trapézio
         * quadrado = B * B; // Calculando a área do quadrado
         * retangulo = A * B; // Calculando a área do retângulo
         *
         * System.out.printf("TRIANGULO: %.3f%n", triangulo); // Exibindo o valor da
         * variável triangulo
         * System.out.printf("CIRCULO: %.3f%n", circulo); // Exibindo o valor da
         * variável circulo
         * System.out.printf("TRAPEZIO: %.3f%n", trapezio); // Exibindo o valor da
         * variável trapezio
         * System.out.printf("QUADRADO: %.3f%n", quadrado); // Exibindo o valor da
         * variável quadrado
         * System.out.printf("RETANGULO: %.3f%n", retangulo); // Exibindo o valor da
         * variável retangulo
         *
         * sc.close();
         */

        // Verdadeiro ou falso, se Exame de carteira de habilitação no Brasil

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * String piscotécnicos, legislação, Direção;
         *
         * piscotécnicos = sc.nextLine(); // Lendo a variável e armazenando na variável
         * piscotécnicos
         * legislação = sc.nextLine(); // Lendo a variável e armazenando na variável
         * legislação
         * Direção = sc.nextLine(); // Lendo a variável e armazenando na variável
         * Direção
         *
         * if (piscotécnicos.equals("Sim") && legislação.equals("Sim") &&
         * Direção.equals("Sim")) {
         * System.out.println("APROVADO");
         * } else {
         * System.out.println("REPROVADO");
         * }
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        // Num inteiro positivo ou negativo

        /*
         * Scanner sc = new scanner(system.in); // instanciando o objeto scanner
         *
         * int numero;
         *
         * numero = sc.nextInt(); // lendo a variável e armazenando na variável numero
         *
         * if (numero < 0) {
         * System.out.println("NEGATIVO");
         * } else {
         * System.out.println("NÃO NEGATIVO");
         * }
         */

        // Exercício de fixação

        // Verificar se um número é par ou ímpar

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int numero;
         *
         * numero = sc.nextInt(); // Lendo a variável e armazenando na variável numero
         *
         * if (numero % 2 == 0) {
         * System.out.println("PAR");
         * } else {
         * System.out.println("IMPAR");
         * }
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        // Verificar se dois números inteiros é múltiplo de 3 e 5

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int A, B;
         *
         * A = sc.nextInt(); // Lendo a variável e armazenando na variável A
         * B = sc.nextInt(); // Lendo a variável e armazenando na variável B
         *
         * if (A % 3 == 0 && A % 5 == 0 && B % 3 == 0 && B % 5 == 0) {
         * System.out.println("SÃO MÚLTIPLOS DE 3 E 5");
         * } else {
         * System.out.println("NÃO SÃO MÚLTIPLOS DE 3 E 5");
         * }
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        // Verificar durabilidade de um jogo com minimo de 1 hora e máximo de 24 horas

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int durabilidade;
         * int horainicial, horafinal;
         *
         * horainicial = sc.nextInt(); // Lendo a variável e armazenando na variável
         * horainicial
         * horafinal = sc.nextInt(); // Lendo a variável e armazenando na variável
         * horafinal
         *
         * if (horainicial < horafinal) {
         * durabilidade = horafinal - horainicial;
         * } else {
         * durabilidade = 24 - horainicial + horafinal;
         * }
         *
         * System.out.println("O JOGO DUROU " + durabilidade + " HORA(S)");
         */

        // Exercício de fixação

        // Leia um código de um item e a quantidade de cada item e depois mostre o valor
        // a ser pago

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula, lembrando sempre antes do objeto Scanner
         *
         * System.out.println("Digite o código do item e a quantidade: "); // Exibindo a
         * mensagem
         * int codigo = sc.nextInt(); // Lendo a variável e armazenando na variável
         * codigo
         * int quantidade = sc.nextInt(); // Lendo a variável e armazenando na variável
         * quantidade
         *
         *
         * double total;
         *
         * if (codigo == 1) {
         * total = quantidade * 4.00;
         * } else if (codigo == 2) {
         * total = quantidade * 4.50;
         * } else if (codigo == 3) {
         * total = quantidade * 5.00;
         * } else if (codigo == 4) {
         * total = quantidade * 2.00;
         * } else if (codigo == 5) {
         * total = quantidade * 1.50;
         * } else {
         * total = 0;
         *
         * }
         *
         * System.out.printf("TOTAL: R$ %.2f%n", total); // Exibindo o valor da variável
         * total
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * double intervalo;
         * System.out.println("Digite um número: "); // Exibindo a mensagem
         * intervalo = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * intervalo
         *
         * if (intervalo >= 0 && intervalo <= 25) {
         * System.out.println("INTERVALO [0,25]");
         * } else if (intervalo > 25 && intervalo <= 50) {
         * System.out.println("INTERVALO (25,50]");
         * } else if (intervalo > 50 && intervalo <= 75) {
         * System.out.println("INTERVALO (50,75]");
         * } else if (intervalo > 75 && intervalo <= 100) {
         * System.out.println("INTERVALO (75,100]");
         * } else {
         * System.out.println("FORA DE INTERVALO");
         * }
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Plano cartesiano

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula, lembrando sempre antes do objeto Scanner
         *
         * double x, y;
         *
         * System.out.println("Digite as coordenadas x e y: "); // Exibindo a mensagem
         *
         * x = sc.nextDouble(); // Lendo a variável e armazenando na variável x
         * y = sc.nextDouble(); // Lendo a variável e armazenando na variável y
         *
         * if (x == 0.0 && y == 0.0) {
         * System.out.println("ORIGEM");
         * } else if (x == 0.0) {
         * System.out.println("EIXO Y");
         * } else if (y == 0.0) {
         * System.out.println("EIXO X");
         * } else if (x > 0.0 && y > 0.0) {
         * System.out.println("QUADRANTE 1");
         * } else if (x < 0.0 && y > 0.0) {
         * System.out.println("QUADRANTE 2");
         * } else if (x < 0.0 && y < 0.0) {
         * System.out.println("QUADRANTE 3");
         * } else {
         * System.out.println("QUADRANTE 4");
         * }
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        // Imposto de renda

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * double renda, imposto;
         *
         * System.out.println("Digite a renda: "); // Exibindo a mensagem
         *
         * renda = sc.nextDouble(); // Lendo a variável e armazenando na variável renda
         *
         * if (renda <= 2000.00) {
         * imposto = 0.0;
         * } else if (renda <= 3000.00) {
         * imposto = (renda - 2000.00) * 0.08;
         * } else if (renda <= 4500.00) {
         * imposto = (renda - 3000.00) * 0.18 + 1000.00 * 0.08;
         * } else {
         * imposto = (renda - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
         * }
         *
         * if (imposto == 0.0) {
         * System.out.println("Isento");
         * } else {
         * System.out.printf("R$ %.2f%n", imposto);
         */

        /*
         * Locale.setDefault(Locale.US); // Formatação de casas decimais com ponto e não
         * vírgula, lembrando sempre antes do objeto Scanner
         *
         * Scanner sc = new Scanner(System.in); // instanciando o objeto Scanner
         *
         * int minutos = sc.nextInt(); // lendo a variável e armazenando na variável
         * minutos
         *
         * double conta = 50.0;
         * if(minutos > 100) {
         * conta += (minutos - 100) * 2.0;
         * }
         *
         * System.out.printf("Valor a pagar: R$ %.2f%n", conta); // exibindo o valor da
         * variável conta
         * sc.close(); // fechando o objeto scanner
         */

        /*
         * // Exercício de fixação - Switch Case
         *
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int x = sc.nextInt(); // Lendo a variável e armazenando na variável x
         * String dia;
         *
         * switch (x) {
         * case 1:
         * dia = "Domingo";
         * break;
         * case 2:
         * dia = "Segunda";
         * break;
         * case 3:
         * dia = "Terça";
         * break;
         * case 4:
         * dia = "Quarta";
         * break;
         * case 5:
         * dia = "Quinta";
         * break;
         * case 6:
         * dia = "Sexta";
         * break;
         * case 7:
         * dia = "Sábado";
         * break;
         * default:
         * dia = "Valor inválido";
         * break;
         * }
         *
         * System.out.println("Dia da semana: " + dia); // Exibindo o valor da variável
         * dia
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Expressão condicional ternária

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * System.out.println("Digite um número: "); // Exibindo a mensagem
         * int numero = sc.nextInt(); // Lendo a variável e armazenando na variável
         * numero
         *
         * numero = (numero % 2 == 0) ? 0 : 1; // Expressão condicional ternária
         *
         * System.out.println("PARIDADE: " + numero); // Exibindo o valor da variável
         * numero
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        // idade expressa e anos

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int Anos = sc.nextInt(); // Lendo a variável e armazenando na variável Anos
         * int Meses = sc.nextInt(); // Lendo a variável e armazenando na variável Meses
         * int Dias = sc.nextInt(); // Lendo a variável e armazenando na variável Dias
         *
         * int total = Anos * 365 + Meses * 30 + Dias; // Calculando o total de dias
         *
         * System.out.println("Total de dias: " + total); // Exibindo o valor da
         * variável total
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int Media1;
         * int Media2;
         *
         * Media1 = (8 + 9 + 7) / 3; // Calculando a média 1
         *
         * Media2 = (4 + 5 + 6) / 3; // Calculando a média 2
         *
         * System .out.println("Média 1 + Média 2: " + Media1 + Media2); // Exibindo o
         * valor da variável Media1
         */

        // Exercício de fixação

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * double saldo = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * saldo
         *
         * double saldoReajuste = saldo * 1.01; // Assign the result of the
         * multiplication to a variable
         *
         * System.out.printf("Saldo reajustado: %.2f%n", saldoReajuste); // Exibindo o
         * valor da variável saldoReajuste
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Exercício de fixação

        // Peças de roupas com valor do IPI acrescentado

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * double codigo1, numero1, valor1, codigo2, numero2, valor2, total;
         * double IPI = 3.01;
         *
         * codigo1 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * codigo1
         * numero1 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * numero1
         * valor1 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * valor1
         *
         * codigo2 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * codigo2
         * numero2 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * numero2
         * valor2 = sc.nextDouble(); // Lendo a variável e armazenando na variável
         * valor2
         *
         * total = (numero1 * valor1) + (numero2 * valor2) + (IPI/100 + 1); //
         * Calculando o total
         *
         * System.out.printf("VALOR A PAGAR: R$ %.2f%n", total); // Exibindo o valor da
         * variável total
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * double SM = 1412.00;
         * double salario = sc.nextDouble(); // Lendo a variável e armazenando na
         * variável salario
         *
         * double Ts = salario / SM; // Calculando o total de salários
         *
         * System.out.println("Total de sálarios: " + Ts); // Exibindo a mensagem
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        /*
         * Scanner sc = new Scanner(System.in); // Instanciando o objeto Scanner
         *
         * int numero = sc.nextInt(); // Lendo a variável e armazenando na variável
         * numero
         *
         * int numantece = numero - 1; // Calculando o número anterior
         * int numsucessor = numero + 1; // Calculando o número sucessor
         *
         * System.out.println("Número anterior: " + numantece); // Exibindo o valor da
         * variável numantece
         * System.out.println("Número sucessor: " + numsucessor); // Exibindo o valor da
         * variável numsucessor
         *
         * sc.close(); // Fechando o objeto Scanner
         */

        // Novo modulo

        /*
         * Locale.setDefault(Locale.US);
         * Scanner sc = new Scanner(System.in);
         * double largura = sc.nextDouble();
         * double comprimento = sc.nextDouble();
         * double metroQuadrado = sc.nextDouble();
         * double area = largura * comprimento;
         * double preco = area * metroQuadrado;
         * System.out.printf("AREA = %.2f%n", area);
         * System.out.printf("PRECO = %.2f%n", preco);
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         *
         *
         * int soma = 0;
         * int x = sc.nextInt();
         *
         *
         * while (x != 0) {
         * soma = soma + x;
         * x = sc.nextInt();
         * }
         *
         * System.out.println(soma);
         *
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         *
         * int x = 2;
         * int y = 4;
         *
         * while (x < 3) {
         *
         * x = sc.nextInt();
         * y = sc.nextInt();
         *
         * y = y + 2;
         * x = x + 1;
         *
         *
         * System.out.println(x + " - " + y);
         *
         * if (x > 3) {
         *
         * System.out.println("Fim");
         *
         * }
         * }
         *
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         *
         * int senha = sc.nextInt();
         *
         * while (senha != 2002) {
         *
         * System.out.println("Senha inválida");
         * senha = sc.nextInt();
         *
         * }
         *
         * System.out.println("Acesso permitido");
         *
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         *
         * float x = sc.nextFloat();
         * float y = sc.nextFloat();
         *
         * while (x != 0 && y != 0) {
         * if (x > 0 && y > 0) {
         * System.out.println("Primeiro");
         * } else if (x < 0 && y > 0) {
         * System.out.println("Segundo");
         * } else if (x < 0 && y < 0) {
         * System.out.println("Terceiro");
         * } else {
         * System.out.println("Quarto");
         * }
         * x = sc.nextFloat();
         * y = sc.nextFloat();
         * }
         *
         * System.out.println("Fim");
         *
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         *
         * int gasolina = 0;
         * int alcool = 0;
         * int diesel = 0;
         *
         *
         * while (true) {
         * int x = sc.nextInt();
         *
         *
         * if (x == 1) {
         * gasolina = gasolina + 1;
         * } else if (x == 2) {
         * alcool = alcool + 1;
         * } else if (x == 3) {
         * diesel = diesel + 1;
         * } else if (x == 4) {
         * System.out.println("MUITO OBRIGADO" + "\n" + "Alcool: " + alcool + "\n" +
         * "Gasolina: " + gasolina + "\n" + "Diesel: " + diesel);
         * break;
         * } else {
         * System.out.println("Valor inválido");
         * }
         * }
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * for (int i = 0; i < 5; i++) {
         * int x = sc.nextInt();
         * if (x % 2 == 0) {
         * System.out.println(x + " é par");
         * } else {
         * System.out.println(x + " é ímpar");
         * }
         * }
         * 
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int x = 4;
         * int y = x + 2;
         * 
         * for (int i = 0; i < x; i++) {
         * System.out.println(x + " " + y);
         * y = y + 1;
         * }
         * 
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * for (int i = 1; i <= 5; i++) {
         * int y = i - 1;
         * int x = i * 10;
         * System.out.println(i + " " + y + " " + x);
         * }
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int y = 10;
         * 
         * for (int i = 0; i< 4; i++) {
         * y = y + i;
         * System.out.println(i + " " + y);
         * 
         * }
         */

        /*
         * int x = 4;
         * int y = 0;
         * 
         * for (int i = 0; i<x; i++) {
         * 
         * System.out.println(i + " " + y);
         * y = y + 10;
         * 
         * }
         */

        /*
         * int x = 4;
         * int y = 0;
         * 
         * for (int i = 0; i < x; i++) {
         * y = y + i;
         * }
         * System.out.println("Valor: " + y);
         */

        /*
         * int x = 8;
         * int y = 3;
         * for (int i = 0; y < x; i++) {
         * x = x - 2;
         * y = y + 1;
         * System.out.println(i + " " + x + " " + y);
         * }
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int x = sc.nextInt();
         * 
         * for (int i = 1; i <= x; i++) {
         * if (x > 1000){
         * System.out.println("Valor inválido");
         * break;
         * }
         * if (i % 2 != 0) {
         * System.out.println(i);
         * }
         * }
         * 
         * sc.close();
         */
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Digite um número: ");
         * int n = sc.nextInt();
         * 
         * int in = 0;
         * int out = 0;
         * 
         * 
         * for (int i = 0; i < n; i++) {
         * System.out.println("Digite um número para a contagem: ");
         * int x = sc.nextInt();
         * if (x >= 10 && x <= 20) {
         * in = in + 1;
         * } else {
         * out = out + 1;
         * }
         * }
         * System.out.println(in + " in");
         * System.out.println(out + " out");
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int n = sc.nextInt();
         * 
         * int p1 = 2;
         * int p2 = 3;
         * int p3 = 5;
         * 
         * for (int i = 0; i < n; i++) {
         * int x = sc.nextInt();
         * int y = sc.nextInt();
         * int z = sc.nextInt();
         * 
         * double media = (double) (x * p1 + y * p2 + z * p3) / (p1 + p2 + p3);
         * 
         * System.out.printf("%.1f%n", media);
         * }
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int n = sc.nextInt();
         * 
         * for (int i = 0; i < n; i++) {
         * int x = sc.nextInt();
         * int y = sc.nextInt();
         * 
         * if (y == 0) {
         * System.out.println("Divisão impossível");
         * } else {
         * double divisao = (double) x / y;
         * System.out.printf("%.1f%n", divisao);
         * }
         * }
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int n = sc.nextInt();
         * 
         * for (int i = 0; i < n; i++) {
         * int x = sc.nextInt();
         * 
         * if (x <= 0) {
         * System.out.println("Fatorial é 0");
         * } else {
         * int fatorial = 1;
         * for (int j = 1; j <= x; j++) {
         * fatorial = fatorial * j;
         * }
         * System.out.println(fatorial);
         * }
         * }
         * sc.close();
         */
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int n = sc.nextInt();
         * 
         * for (int j = 0; j < n; j++) {
         * int x = sc.nextInt();
         * int divisores = 0;
         * 
         * System.out.print("Divisores de " + x + ": ");
         * for (int i = 1; i <= x; i++) {
         * if (x % i == 0) {
         * System.out.print(i + " ");
         * divisores++;
         * }
         * }
         * System.out.println("\nTotal de divisores: " + divisores);
         * }
         * sc.close();
         */

        /* Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);

            System.out.println(i + " " + quadrado + " " + cubo);

        }
        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Maior = " + n1);
        } else if (n2 > n3) {
            System.out.println("Maior = " + n2);
        } else {
            System.out.println("Maior = " + n3);
        }

        sc.close(); */
        /* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double areaX, areaY;
        
        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areaX = areaTriangulo(x.a, x.b, x.c); // o x.a, x.b, x.c são os atributos da classe triangulo
        areaY = areaTriangulo(y.a, y.b, y.c); // o y.a, y.b, y.c são os atributos da classe triangulo

        showResult(areaX, areaY);

        sc.close();

    }

    static class triangulo {
        public double a;
        public double b;
        public double c;
    }

    public static double areaTriangulo(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void showResult(double areaX, double areaY) {
        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);                                                                                                                                                                                                                                                                                                                                                                                                                                 if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        } */
        
       /*  Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product name: ");
        product.name = sc.nextLine();
        System.out.println("Enter product price: ");
        product.price = sc.nextDouble();
        System.out.println("Enter product quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Name: " + product.name + " | " + "Price: " + product.price + " | " + "Quantity in stock: " + product.quantity);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product.name + " | " + product.price + " | " + product.quantity);

        System.out.println("Enter the number of products to be removed from stock: ");

        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product.name + " | " + product.price + " | " + product.quantity);

        System.out.println("Total value in stock: " + product.totalValueInStock()); // Mas não é uma boa prática, podemos reduzir o código instanciando o to string da classe Product com uma predicção completa do que queremos exibir no final, ou seja assim apenas chamando a variavel product já exibe o resultado final

        sc.close(); */

        /* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.println("AREA = " + retangulo.area());
        System.out.println("PERIMETER = " + retangulo.perimetro());
        System.out.println("DIAGONAL = " + retangulo.diagonal());


        sc.close(); */

        /* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.println("Digite o nome do funcionário:");
        salario.nome = sc.nextLine();
        System.out.println("Digite o salário bruto:");
        salario.salarioBruto = sc.nextDouble();
        System.out.println("Entre com o imposto:");
        salario.taxa = sc.nextDouble();

        System.out.println("funcionario: " + salario);

        System.out.println("Digite a porcentagem para aumentar o salário:");

        double porcentagem = sc.nextDouble();

        salario.aumentoSalario(porcentagem);

        System.out.println("Dados atualizados: " + salario);

        sc.close(); */

       /*  Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();
        System.out.println("Digite o nome do estudante:");
        estudante.nome = sc.nextLine();
        System.out.println("Digite a nota do primeiro trimestre:");
        estudante.trimestre1 = sc.nextDouble();
        System.out.println("Digite a nota do segundo trimestre:");
        estudante.trimestre2 = sc.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre:");
        estudante.trimestre3 = sc.nextDouble();
       
        double notaFinal = estudante.notaFinal();
        System.out.println(notaFinal);


        sc.close();*/
        /* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the dollar price?:");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?:");
        double dollarBought = sc.nextDouble();

        double real = Currency.currencyConverter(dollarPrice, dollarBought);

        System.out.printf("Amount to be paid in reais = %.2f%n", real);


        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int ano = sc.nextInt();

        int idade = 2024 - ano;

        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade < 18 || idade > 70) {
            System.out.println("Pode votar, mas não é obrigatório");
        } else {
            System.out.println("Pode votar, é obrigatório");
        }

        sc.close(); */
        /* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0 && media <= 10.0) {
         System.out.println("Bom aproveitamento");   
        } else if(media <= 6.9 && media > 0) {
            System.out.println("Aproveitamento ruim");
        } else 
        System.out.println("Nota inválida"); 
       
        sc.close(); */

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
            
        }
        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
            
        }
        sc.close(); */

        /*  Scanner sc = new Scanner(System.in); 
        
        System.out.println("Digite sua idade atual:");
        int idade = sc.nextInt();

        int alistamento = 18;

        if (idade == alistamento) {
            System.out.println("Hora de se alistar");
        } else if (idade > alistamento) {
            idade = idade - alistamento;
            System.out.println("Já passou do tempo de se alistar: " + idade + " anos se passaram.");
        } else {
            idade = alistamento - idade;
            System.out.println("Ainda não é hora de se alistar: " + idade + " anos para se alistar.");
        }


        sc.close(); */

       /* Scanner sc = new Scanner(System.in);

        System.out.println("digite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o seu sexo  M/H:");
        String sexo = sc.nextLine();
        System.out.println("Digite o valor das compras: ");
        double compras = sc.nextDouble();

        if (sexo.equals("M")) {
            compras = compras - (compras * 0.13);
            System.out.printf("Preço final da %s: ",nome +" deu " + compras);
        } else if (sexo.equals("H")) {
            compras = compras - (compras * 0.05);
            System.out.printf("Preço final do %s: ",nome +" deu "+ compras);
        } else {
            System.out.println("Sexo inválido"); 
        }
        
        sc.close(); */


        /*Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em Km a ser percorrida na viagem:");
        double distancia = sc.nextDouble();

        if (distancia <= 200) {
            double preco = distancia * 0.50;
            System.out.printf("Preço da passagem: R$ %.2f%n", preco);
        } else {
            double preco = distancia * 0.45;
            System.out.printf("Preço da passagem: R$ %.2f%n", preco);
            
        }


        sc.close(); */


        /* Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro segmento de reta:");
        double a = sc.nextDouble();
        System.out.println("Segundo segmento de reta:");
        double b = sc.nextDouble();
        System.out.println("Terceiro segmento de reta:");
        double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os segmentos formam um triângulo");
        } else {
            System.out.println("Os segmentos não formam um triângulo");
            
        }

        sc.close(); */



        /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double a = sc.nextDouble();
        System.out.println("Digite outro valor:");
        double b = sc.nextDouble(); 

        if (a > b) {
            System.out.println("O maior valor é: " + a);
        } else if (b > a) {
            System.out.println("O maior valor é: " + b);
        } else {
            System.out.println("Os valores são iguais");
            
        }

        sc.close(); */


        /* Scanner sc = new Scanner(System.in);

        
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 10 || media < 0) {
            System.out.println("Nota inválida");
        }     else if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media > 5.0 && media < 6.9) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
            
        }
        
        sc.close(); */
        

        /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite o metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        if (metroQuadrado < 100) {
            System.out.println("TERRENO POPULAR");	
        } else  if (metroQuadrado >= 100 && metroQuadrado < 500) {
            System.out.println("TERRENO MASTER");
        } else {
            System.out.println("TERRENO VIP");  
        }


        sc.close(); */




        /* Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o seu tempo de empresa: ");
        int tempo = sc.nextInt();
        System.out.println("Digite o seu salário atual: ");
        double salario = sc.nextDouble();

        double aumento;

        if (tempo <= 3) {
          aumento = salario * 1.03;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
          System.out.println("O salário de " + nome + " é: " + aumento);        
        } else if (tempo >=3 && tempo <= 10) {
            aumento = salario * 1.125;
           System.out.println("O salário de " + nome + " é: " + aumento);
        } else {
            aumento = salario * 1.20;
            System.out.println("O salário de " + nome + " é: " + aumento); 
        }


        sc.close(); */


        /* Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro segmento de reta:");
        double a = sc.nextDouble();
        System.out.println("Segundo segmento de reta:");
        double b = sc.nextDouble();
        System.out.println("Terceiro segmento de reta:");
        double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os segmentos formam um triângulo: ");
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
                
            }
        } else {
            System.out.println("Os segmentos não formam um triângulo");
            
        }

        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        int papel = 1;
        int pedra = 2;
        int tesoura = 3;
        
        
        System.out.println("Digite oque você quer, papel - 1, pedra - 2, tesoura - 3:  ");

        int jogador = sc.nextInt();
        int computador = (int) (Math.random() * 3 + 1); // Gera um número aleatório entre 1 e 3
        
        while (computador == jogador) {
            System.out.println("Empate, jogue novamente");
            jogador = sc.nextInt();
            computador = (int) (Math.random() * 3 + 1);
        }
        
        if (jogador == papel && computador == pedra) {
            System.out.println("Jogador venceu");
        } else if (jogador == pedra && computador == tesoura) {
            System.out.println("Jogador venceu");
        } else if (jogador == tesoura && computador == papel) {
            System.out.println("Jogador venceu");
        } else if (jogador == computador) {
            System.out.println("Empate");
        } else {
            System.out.println("Computador venceu");
        }
        


        sc.close(); */



        /* Scanner sc = new Scanner(System.in);

        int computador = (int) (Math.random() * 5 + 1);

        System.out.println("Digite um número de 1 a 5: ");
        int jogador = sc.nextInt();

        if (jogador == computador) {
            System.out.println("Parabéns, você acertou o número");
        } else {
            System.out.println("Você errou, o número era: " + computador);
        }

        sc.close(); */

         /* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da casa: ");
        double valorCasa = sc.nextDouble();
        System.out.println("Salário do comprador: ");
        double salario = sc.nextDouble();
        System.out.println("Quantidade de anos a pagar: ");
        int anos = sc.nextInt();

        double prestacao = valorCasa / (anos * 12);

        if (prestacao > salario * 1.30) {
            System.out.println("Empréstimo negado");
        } else {
            System.out.println("Empréstimo aprovado");
        }

        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        if ( imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
            
        }
 
        sc.close(); */

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual tipo de carro você quer Luxo ou popular: ");
        String carro = sc.nextLine();
        System.out.println("Digite quantos dias você quer alugar o carro: ");
        int dias = sc.nextInt();
        System.out.println("Digite quantos Km você vai rodar: ");
        double km = sc.nextInt();


        if (carro.equalsIgnoreCase("Luxo")) {
            if (km <= 200) {
                km = km * 0.30;
                double preco = (dias * 150) + km;
                System.out.println("Preço total: " + preco);
            } else {
                km = km * 0.25;
                double preco = (dias * 150) + km;
                System.out.println("Preço total: " + preco);
            }
        } else if (carro.equalsIgnoreCase("Popular")) {
            if (km <= 200) {
                km = km * 0.20;
                double preco = (dias * 90) + km;
                System.out.println("Preço total: " + preco);
            } else {
                km = km * 0.10;
                double preco = (dias * 90) + km;
                System.out.println("Preço total: " + preco);
            }
        } else {
            System.out.println("Carro inválido"); 
        } 

        sc.close(); */


        /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas de atividade fisica: ");
        int horas = sc.nextInt();

        if (horas <= 10 && horas > 0) {
            int pontos = horas * 2;
            double valorDosPontos = pontos * 0.05;
            System.out.println("Horas de atividade: "+ horas + " Pontos: " + pontos + " | Valor dos pontos: " + valorDosPontos);
        } else if (horas > 10 && horas <= 20){
            int pontos = horas * 5;
            double valorDosPontos = pontos * 0.05;
            System.out.println("Horas de atividade: "+ horas + " Pontos: " + pontos + " | Valor dos pontos: " + valorDosPontos);
        } else if (horas > 20) {
            int pontos = horas * 10;
            double valorDosPontos = pontos * 0.05;
            System.out.println("Horas de atividade: "+ horas + " Pontos: " + pontos + " | Valor dos pontos: " + valorDosPontos);
        } else {
            System.out.println("Horas inválidas");
        }
        

        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu genêro M/H: ");
        String genero = sc.nextLine();
        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();
        System.out.println("Digite quantos anos você trabalha na empresa: ");
        int anos = sc.nextInt();

        if (genero.equalsIgnoreCase("M")) {
            if (anos < 15 && anos > 0) {
                double aumento = salario * 0.05;
                double novoSalario = salario + aumento;
                System.out.println("Salário atual: " + salario + " | Aumento: " + aumento + " | Novo salário: " + novoSalario);
            } else if (anos >= 15 && anos <= 20) {
                double aumento = salario * 0.12;
                double novoSalario = salario + aumento;
                System.out.println("Salário atual: " + salario + " | Aumento: " + aumento + " | Novo salário: " + novoSalario);
            } else {
                double aumento = salario * 0.23;
                double novoSalario = salario + aumento;
                System.out.println("Salário atual: " + salario + " | Aumento: " + aumento + " | Novo salário: " + novoSalario);
            }
        } else if (genero.equalsIgnoreCase("H")) {
            if (anos < 10 && anos > 0) {
                double aumento = salario * 0.03;
                double novoSalario = salario + aumento;
                System.out.println("Salário atual: " + salario + " | Aumento: " + aumento + " | Novo salário: " + novoSalario);
            } else if (anos >= 10 && anos <= 15) {
                double aumento = salario * 0.13;
                double novoSalario = salario + aumento;
                System.out.println("Salário atual: " + salario + " | Aumento: " + aumento + " | Novo salário: " + novoSalario);
            } else {
                double aumento = salario * 0.25;
                double novoSalario = salario + aumento;
                System.out.println("Salário atual: " + salario + " | Aumento: " + aumento + " | Novo salário: " + novoSalario);
            }
        } else {
            System.out.println("Gênero inválido");  
            
        }

        sc.close(); */

        /* Scanner sc = new Scanner(System.in);


        for (int i = 6; i <= 11; i++) {
            System.out.println(i + "");
        }

        System.out.println("Fim");


        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        for (int i = 10; i >= 3; i--) {
            System.out.println(i + "");
        }

        System.out.println("Fim");

        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 19; i += 3) {
            
            System.out.println(i + "");

        }

        System.out.println("Fim");

        sc.close(); */

        /*for (int i = 100; i >= 0 ; i-= 5) {
            System.out.println(i + "");
            
        }
        System.out.println("Fim"); */

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro positivo: ");

        int x = sc.nextInt();

        // valor ate a variavel x

        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                System.out.println(i + "");
            }
        } else {
            System.out.println("Valor inválido");
            
        } 

        sc.close(); */


        /*Scanner sc = new Scanner(System.in);

    

        for (int i = 30; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println("[" + i + "]");
            } else {
                System.out.println(i + "");
            }
        }

        sc.close(); */

        /*Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();
        System.out.println("Digite o último valor: ");
        int y = sc.nextInt();
        System.out.println("Digite o incremento: ");
        int z = sc.nextInt();
        if (x < y) {
            for (int i = x; i <= y; i += z) {
                System.out.println(i + "");
            }
        } else {
            System.out.println("Valores inválidos");
        }
       
        

        sc.close(); */

        /* int soma = 0;

        for (int i = 6; i <= 100; i += 2) {
            
            soma = soma + i;
        
        }
        System.out.println(soma); */

        /*Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 
450 + 400 + 350 + 300 + ... + 50 + 0 */

        /*int soma = 0;

        for (int i = 500; i >= 0; i -= 50) {
            soma = soma + i;
        }
        System.out.println(soma); */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor 7 vezes: ");
        

        int soma = 0;

        for (int i = 0; i <= 7; i++) {

            
            int x = sc.nextInt();

            soma = soma + x;

        }



        System.out.println(soma);

        sc.close(); */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor 6 vezes: ");

        int soma = 0;

        //exibir na tela quantos são pares
        for (int i = 0; i < 6; i++) {
            
            int x = sc.nextInt();

            if (x % 2 == 0) {
                soma = soma + 1;
            }

        }
        System.out.println(soma);
     
        

        sc.close();


    }
}
