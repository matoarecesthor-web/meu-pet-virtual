package com.exemplo.pet;

public class Pet {
    public int fome = 100;
    public int felicidade = 100;

    public void alimentar() {
        fome = Math.min(fome + 20, 100);
    }

    public void brincar() {
        felicidade = Math.min(felicidade + 15, 100);
        fome -= 10; // Brincar gasta energia/fome
    }

    public String getStatus() {
        return "Fome: " + fome + " | Felicidade: " + felicidade;
    }
}
