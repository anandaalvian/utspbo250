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
public class komputer {
    private cpu cpu;
    public komputer(cpu cpu){
        this.cpu=cpu;
    }
    public void memasang(cpu cpu){
        this.cpu=cpu;
        System.out.println("CPU : "+this.cpu.getCPUData()+" GHz"+" dipasang");
    }
    public void mencabut(cpu cpu){
       this.cpu=cpu;
       System.out.println("CPU : "+this.cpu.getCPUData()+" GHz"+" dicabut"); 
    }
    public void cetakInfo(){
        System.out.println("Spesifikasi : CPU : "+this.cpu.getCPUData()+" GHz");
    } 

    void mencabut(amd amd1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
