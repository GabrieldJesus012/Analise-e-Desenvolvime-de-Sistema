class Programa02
{
   public static void main (String entrada[])
 {
   //declaracao de variaveis
     int n1, n2, mod, div;
     double raiz, pot;
     String msg= "";

   // entrada de dados
   n1= Integer.parseInt(entrada [0]);
   n2= Integer.parseInt(entrada [1]);

   //procesamento
   mod = n1 % n2;
   div = (int)n1 / (int)n2;
   raiz= Math.sqrt(n1);
   pot= Math.pow(n1,n2);

   //saida de resultados
   msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
   msg = msg + "resto da divisao de " + n1 + " por " + n2 + " = " + mod + "\n";
   msg = msg + "quociente da divisao de " + n1 + " por " + n2 + " = " + div + "\n";
   msg = msg + "raiz quadrada de " + n1 + " por " + n2 + " = " + raiz + "\n";
   msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot +"\n";
   System.out.println(msg);
   System.exit(0);
 }
}

