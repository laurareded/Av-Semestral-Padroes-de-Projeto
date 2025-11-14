package Questao1;

public class AppQ1 {
    public static void main(String[] args) {

        CriadorRelatorio criador1 = new CriadorRelatorioDiario();
        criador1.processarRelatorio();
        

        CriadorRelatorio criador2 = new CriadorRelatorioSemanal();
        criador2.processarRelatorio();
        

        CriadorRelatorio criador3 = new CriadorRelatorioEmergencial();
        criador3.processarRelatorio();
        

    }
}