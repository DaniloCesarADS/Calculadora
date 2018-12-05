/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class calcular {
    
    //Atributos
    private double num1;
    private double num2;
    private int op;
    private boolean flagNum1;
    private boolean flagNum2;
    private boolean flagRet;
    
    //Métodos de funcionalidade
    public double adicionar(){
        return getNum1() + getNum2();
    }
    public double subtrair(){
        return getNum1() - getNum2();
    }
    public double multiplicar(){
        return getNum1() * getNum2();
    }
    public double dividir(){
        try{
            //return getNum1() / getNum2();
            double res = 0;
            if(getNum2()==0){
                throw new ArithmeticException();
            }
            res = getNum1()/getNum2();
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Nao divide por zero");
        }
        return 0;
    }

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @return the op
     */
    public int getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(int op) {
        this.op = op;
    }

    /**
     * @return the flagNum1
     */
    public boolean isFlagNum1() {
        return flagNum1;
    }

    /**
     * @param flagNum1 the flagNum1 to set
     */
    public void setFlagNum1(boolean flagNum1) {
        this.flagNum1 = flagNum1;
    }

    /**
     * @return the flagNum2
     */
    public boolean isFlagNum2() {
        return flagNum2;
    }

    /**
     * @param flagNum2 the flagNum2 to set
     */
    public void setFlagNum2(boolean flagNum2) {
        this.flagNum2 = flagNum2;
    }

    /**
     * @return the flagRet
     */
    public boolean isFlagRet() {
        return flagRet;
    }

    /**
     * @param flagRet the flagRet to set
     */
    public void setFlagRet(boolean flagRet) {
        this.flagRet = flagRet;
    }

   
}
