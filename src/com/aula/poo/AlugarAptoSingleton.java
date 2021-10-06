package com.aula.poo;

import java.util.HashSet;
import java.util.Set;


public class AlugarAptoSingleton {
    private static final AlugarAptoSingleton INSTANCE = new AlugarAptoSingleton();
    private Set<Integer> aptoDisponivel;
    
    // Constructor /Criar o HashSet com o numero dos apto 
    private AlugarAptoSingleton() {
        this.aptoDisponivel = new HashSet<>();
        aptoDisponivel.add(102);
        aptoDisponivel.add(100);
        aptoDisponivel.add(133);
        aptoDisponivel.add(110);
        aptoDisponivel.add(90);
        aptoDisponivel.add(130);
        aptoDisponivel.add(105);
    }
    

    //Verificação 
    public void selecionarApto(int numeroapto){
       boolean disponibilidade = aptoDisponivel.remove(numeroapto);
       if (disponibilidade == true){
          System.out.println("Apto foi alugado");
        }
       else {
           System.out.println("Apto indisponível");
       }
    }

    // Método pra utilizado para verificar a instância da classe AlugarAptoSingleton
    public static AlugarAptoSingleton getInstance() {
        return INSTANCE;
    }
}
