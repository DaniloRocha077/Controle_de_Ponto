package com.company;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.lang.Thread;

*/Danilo Rocha,
Carlos Roberto,
Paulo Alencar/*

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        GerenciarControlePonto geren = new GerenciarControlePonto();
        Gerente ger1 = new Gerente(1, "Carlos", "carlao@gmail.com",
                "123456", "Carlao", "Orientador");
        Secretaria sec1 = new Secretaria(2, "Paula", "paulinha@gmail.com",
                "654321", "98877-6655", "55");
        Operador oper1 = new Operador(3, "Jonas", "joninha@gmail.com",
                "852741", 41.40);

        RegistroPonto registro1 = new RegistroPonto(111, ger1, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(registro1.toString());
        Thread.sleep(2500);
        RegistroPonto registro2 = new RegistroPonto(222, oper1, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(registro2.toString());
        Thread.sleep(3500);
        RegistroPonto registro3 = new RegistroPonto(333, sec1, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(registro3.toString());

        registro1.setHoraSaida(LocalDateTime.now());
        System.out.println(registro1.toString());
        Thread.sleep(1500);

        registro2.setHoraSaida(LocalDateTime.now());
        System.out.println(registro2.toString());
        Thread.sleep(2500);

        registro3.setHoraSaida(LocalDateTime.now());
        System.out.println(registro3.toString());
        Thread.sleep(2000);

    }

}
