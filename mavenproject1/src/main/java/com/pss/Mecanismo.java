/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss;

/**
 *
 * @author Leket
 */
public class Mecanismo {
    private double valorPagamento;
    private String cargo;
    private boolean gi;
    private boolean gg;
    private boolean df;
    private boolean dg;

    public Mecanismo(double valorPagamento, boolean gi, boolean gg, boolean df, boolean dg) {
        this.valorPagamento = valorPagamento;
        this.gi = gi;
        this.gg = gg;
        this.df = df;
        this.dg = dg;
    }



    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the gi
     */
    public boolean isGi() {
        return gi;
    }



    /**
     * @return the gg
     */
    public boolean isGg() {
        return gg;
    }


    /**
     * @return the df
     */
    public boolean isDf() {
        return df;
    }



    /**
     * @return the dg
     */
    public boolean isDg() {
        return dg;
    }




    


    
    public boolean verifica(){
 
        if((this.valorPagamento <= 500.00) && (this.gi == true)){
           this.setCargo("Gerente Imediato");
           System.out.println("Aprovado pelo "+ this.getCargo());
           return this.isGi();

        }
        if((this.valorPagamento <= 1500.00) && (this.gg == true)){
           this.setCargo("Gerente Geral");
           System.out.println("Aprovado pelo "+ this.getCargo());
           return this.isGg();

        }
        if((this.valorPagamento <= 5000.00) && (this.df == true)){
           this.setCargo("Diretor Financeiro");
           System.out.println("Aprovado pelo "+ this.getCargo());
           return this.isDf();

        }
        if((this.valorPagamento <= 15000.00) && (this.dg == true)){
           this.setCargo("Diretor Geral");
           System.out.println("Aprovado pelo "+ this.getCargo());
           return this.isDg();

        }else{
            System.out.println("Reprovado");
        }

       return false;      
    }

    

}

  

    
      


    
    


