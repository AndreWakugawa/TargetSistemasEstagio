public class TargetSistemasEstagio {

    public static void main(String[] args) {
        Ex1.Soma();
        System.out.println(Ex2.Fibonacci(13)) ; /*13 pos*/
        System.out.println(Ex2.isFibonacci(13)); /*numero 13*/
        System.out.println("3a: 9 (+2)|" +
                "3b: 128 (2^n)|" +
                "3c: 49 (n*n)|" +
                "3d: 100 (n*n pares)|" +
                "3e: 13 (Fibonacci)|" +
                "3f: 200 (Numeros com 'd')");
        System.out.println("Ex4.: É possível determinar as três lâmpadas pelos fatores " +
                "Temp (Calor : Frio) e Luz (Aceso : Apagado). \n" +
                "Se acionarmos um interruptor A por alguns minutos, desligarmos A e " +
                "ligarmos B logo em seguida, teremos 3 possibilidades de lâmpadas: \n" +
                "1 (Quente e apagado), 2 (Frio e apagado) e 3 (Aceso), sendo possível " +
                "determinar uma por cada uma das 2 idas e a terceira por eliminação. ");
        System.out.println(Ex5.inverter("Final Fantasy"));
    }

}



class Ex1 {
    /* 1) Observe o trecho de código abaixo:

 	int INDICE = 13, SOMA = 0, K = 0;
 	enquanto K < INDICE faça
	{
		K = K + 1;
		SOMA = SOMA + K;
	}
 	imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?  */

    public static void Soma() {
        int index = 13;
        int soma = 0;
        int k = 0;
        while (k < index) {
            k++;
            soma += k;
        }
        System.out.println(soma);
    }
}

class Ex2 {
    /* Dado a sequência de Fibonacci, onde se inicia por 0 e 1
    e o próximo valor sempre será a soma dos 2 valores anteriores
    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
    escreva um programa na linguagem que desejar onde,
    informado um número, ele calcule a sequência de Fibonacci
    e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

    IMPORTANTE:  Esse número pode ser informado através de qualquer
    entrada de sua preferência ou pode ser previamente definido no código; */

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    private static boolean isPerfectSquare(int x) {
        int sq = (int) Math.sqrt(x);
        return (sq * sq == x);
    }
    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4);
    }
}

class Ex5{
    /*Escreva um programa que inverta os caracteres de um string.

    IMPORTANTE:
	a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse; */

    public static String inverter(String str) {
        String invertido = "";
        for (int i = str.length()-1; i >= 0; i--) {
            invertido += str.charAt(i);
        }
        return invertido;
    }
}