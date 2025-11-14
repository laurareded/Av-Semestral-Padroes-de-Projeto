package Questao2;


public class PlataformaAnalise {
    private ModeloCalculoRisco modelo;


    public void setModelo(ModeloCalculoRisco modelo) {
        this.modelo = modelo;
        System.out.println("\n--- Modelo de cálculo alterado para: " + modelo.getClass().getSimpleName() + " ---");
    }

    public String analisarRisco(String clienteId) {
        if (modelo == null) {
            return "Erro: Nenhum modelo de cálculo de risco definido.";
        }
        System.out.println("\n[Plataforma] Iniciando análise de risco...");
        return modelo.calcularPerfil(clienteId);
    }
}