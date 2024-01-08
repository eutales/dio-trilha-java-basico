public class Ternario {
    public static void main(String[] args) {
        double nota = 65;
        if (nota >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        String status;
        //Realizando a verificação de aprovado e reprovado. 
        status = nota >= 60? "Aprovado" : "Reprovado";
        System.out.println(status);

    }

}
