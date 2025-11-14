package Questao2;

public class AppQ2 {
    public static void main(String[] args) {
        PlataformaAnalise plataforma = new PlataformaAnalise();
        String clienteA = "CLI_1234";
        String clienteB = "CLI_5678";
        

        plataforma.setModelo(new ModeloModerado());
        String resultadoA = plataforma.analisarRisco(clienteA);
        System.out.println("Resultado Cliente A: " + resultadoA);

        System.out.println("\n=====================================");

        plataforma.setModelo(new ModeloAgressivo());
        String resultadoB = plataforma.analisarRisco(clienteB);
        System.out.println("Resultado Cliente B: " + resultadoB);
        
        System.out.println("\n=====================================");

        plataforma.setModelo(new ModeloConservador());
        String resultadoC = plataforma.analisarRisco("CLI_9999");
        System.out.println("Resultado Cliente C: " + resultadoC);

    }
}