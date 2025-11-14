package Questao2;


public class ModeloModerado implements ModeloCalculoRisco {

    @Override
    public String calcularPerfil(String clienteId) {
        System.out.println("[Modelo Moderado] Aplicando fórmula de equilíbrio para o cliente " + clienteId);
        return "Perfil Moderado (Risco Nível 3): Busca por retorno estável e proteção.";
    }
}