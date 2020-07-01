/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula21mar2018auto;

import static java.lang.reflect.Array.set;

/**
 *
 * @author Tiago
 */
public class Auto {

    public Auto() {
        estado = false;
        velocidade = 0;
        mudanca = 0;
        combustivel = 60;
    }

    public Auto(int mudanca, int combustivel) {
        estado = false;
        velocidade = 0;
        this.mudanca = mudanca;
        this.combustivel = combustivel;
    }

    public Auto(boolean estado, int velocidade, int mudanca, int combustivel, int R) {
        this.estado = estado;
        this.velocidade = velocidade;
        this.mudanca = mudanca;
        this.combustivel = combustivel;

    }

    private boolean estado;
    private int velocidade;
    private int mudanca;
    private int combustivel;

    public void ligar() {
        if (combustivel > 0) {
            estado = true;
        }
    }

    public void desligar() {
            estado = false;
    }

    public void acelerar() {
        if (this.isEstado() && (mudanca != 0) && this.combustivel > 0) {
            switch (mudanca) {
                case 1:
                    if (velocidade < 30) {
                        velocidade += 1;
                    }
                    break;
                case 2:
                    if (velocidade < 50) {
                        velocidade += 2;
                    }
                    break;
                case 3:
                    if (velocidade < 70) {
                        velocidade += 3;
                    }
                    break;
                case 4:
                    if (velocidade < 90) {
                        velocidade += 4;
                    }
                    break;
                case 5:
                    if (velocidade < 120) {
                        velocidade += 5;
                    }
                    break;
                case 6:
                    if (velocidade < 300) {
                        velocidade += 6;
                    }

            }
            if (velocidade > 0) {
                combustivel--;
            }

        }

    }

    public void travar() {
        if (velocidade > 0) {
            velocidade--;
        }
    }

    public void combustivel() {
        if (combustivel >= 0) {
            this.combustivel = 0;

        }

    }

    public void mudancaMais() {
        if (this.getMudanca() < 6) {
            mudanca++;
        }
    }

    public void mudancaMenos() {
        if (mudanca > -1) {
            mudanca--;
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMudanca() {
        return mudanca;
    }

    public void setMudanca(int mudanca) {
        this.mudanca = mudanca;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Auto{" + "estado=" + estado + ", velocidade=" + velocidade + ", mudanca=" + mudanca + ", combustivel=" + combustivel + '}';
    }

}
