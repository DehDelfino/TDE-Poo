package com.aula.poo;

public class AlugarApto {
//cria classe
    public static void main(String[] args) {
        // Método main para chamar o metodo de escolher apto, não permite chamar 2x 
        escolherApto(102);
        escolherApto(102);
        escolherApto(90);
        escolherApto(90);
    }

    // Método que verifica a disponibilidade e remove do array de aptos disponíveis
    public static void escolherApto(int aptonumero) {
        AlugarAptoSingleton apto = AlugarAptoSingleton.getInstance();
        apto.selecionarApto(aptonumero);
    }
}
