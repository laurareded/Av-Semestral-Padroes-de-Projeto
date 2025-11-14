package Questao2;


public class ModeloAgressivo implements ModeloCalculoRisco {

    @Override
    public String calcularPerfil(String clienteId) {
        System.out.println("[Modelo Agressivo] Aplicando fórmula de alta volatilidade para o cliente " + clienteId);
        return "Perfil Agressivo (Risco Nível 5): Foco em crescimento de capital.";
    }
}