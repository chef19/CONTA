/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ANDRES MS
 */
public class Saldos {

    static Map<String, Integer> BcoA = new HashMap<String, Integer>();
    static Map<String, Integer> BcoD = new HashMap<String, Integer>();
    static Map<String, Integer> CompA = new HashMap<String, Integer>();
    static Map<String, Integer> CompD = new HashMap<String, Integer>();

    public void BancoA(String codigo, int monto) {
        BcoA.put(codigo, monto);
    }

    public void BancoD(String codigo, int monto) {
        BcoD.put(codigo, monto);
    }

    public void CompañiaA(String codigo, int monto) {
        CompA.put(codigo, monto);
    }

    public void CompañiaD(String codigo, int monto) {
        CompD.put(codigo, monto);
    }

    public static void main(String[] args) {
        BcoA.put("A", 12);
        BcoA.put("B", 13);
        BcoA.put("C", 14);
        System.out.println(BcoA.get("A"));
    }

}
