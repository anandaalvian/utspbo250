/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author ANANDA
 */
public class cpu {
   protected String nama;
   protected int kecepatan;
   
   public cpu (String nama, int kecepatan){
       this.nama = nama;
       this.kecepatan = kecepatan;
   }
   
   public String getCPUData(){
        return(this.nama+" "+this.kecepatan);
   }
}