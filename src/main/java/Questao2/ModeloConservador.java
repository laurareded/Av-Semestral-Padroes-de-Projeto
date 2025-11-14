package Questao2;


public class ModeloConservador implements ModeloCalculoRisco {

    @Override
    public String calcularPerfil(String clienteId) {
        System.out.println("[Modelo Conservador] Aplicando fórmula de preservação de capital para o cliente " + clienteId);
        return "Perfil Conservador (Risco Nível 1): Prioridade total na segurança e baixa volatilidade.";
    }
}