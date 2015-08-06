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
    static Map<Integer, Integer> BcoA = new HashMap<Integer, Integer>();
    static Map<Integer, Integer> BcoD = new HashMap<Integer, Integer>();
    static Map<Integer, Integer> CompA = new HashMap<Integer, Integer>();
    static Map<Integer, Integer> CompD = new HashMap<Integer, Integer>();
    
    public void BancoA(int codigo,int monto){
        BcoA.put(codigo, monto);
    }
    public void BancoD(int codigo,int monto){
        BcoD.put(codigo, monto);
    }
    public void CompañiaA(int codigo,int monto){
        CompA.put(codigo, monto);
    }
    public void CompañiaD(int codigo,int monto){
        CompD.put(codigo, monto);
    }
   

}
