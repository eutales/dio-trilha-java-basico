public class SituacaoAluno {
    public static void main(String[] args) {
        double nota = 2;

        if (nota >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (nota >= 5) {
            System.out.println("Aluno recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + resultado);
    }

}
