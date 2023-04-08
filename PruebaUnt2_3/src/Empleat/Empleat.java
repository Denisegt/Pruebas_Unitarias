package Empleat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DeniseGT
 */
public class Empleat {

    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) throws MaException {
        double salarioBase = 0;
        double prima = 0;
        double salariBrut = 0;

        if (tipusEmpleat == null || (!tipusEmpleat.equals("venedor") && !tipusEmpleat.equals("encarregat"))) {
            throw new MaException("El tipus d'empleat no és correcte");
        }

        if (vendesMes < 0 || horesExtra < 0) {
            throw new MaException("El valor no pot ser negatiu");
        }

        if (tipusEmpleat.equals("venedor")) {
            salarioBase = 1000;
        } else {
            salarioBase = 1500;
        }

        if (vendesMes >= 1000 && vendesMes < 2500) {
            prima = 100;
        } else if (vendesMes >= 2500) {
            prima = 200;
        }

        salariBrut = salarioBase + prima + (horesExtra * 18.57);
        return salariBrut;
    }

    public double calculaSalariNet(double salariBrut) throws MaException {

        double retencion = 0;
        double salariNet = 0;

        if (salariBrut < 0) {
            throw new MaException("El valor no pot ser negatiu");
        }

        if (salariBrut >= 0 && salariBrut <= 999) {
            retencion = 0;
        } else if (salariBrut >= 1000 && salariBrut <= 1500) {
            retencion = 0.16;
        } else if (salariBrut >= 1501) {
            retencion = 0.20;
        }

        salariNet = salariBrut * (1 - retencion);
        return salariNet;
    }
}
