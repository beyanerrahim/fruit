/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit1;

public class fruit {
    String isim;
    String renk;
    float Agirlik;
    int Dolubos=-1;
    int Birsonraki=-1;
    public fruit(String name,String colur,float weight,int fullempty,int next)
    {
        this.isim=name;
        this.renk=colur;
        this.Agirlik=weight;
        this.Dolubos=fullempty;
        this.Birsonraki=next;
    }
    public fruit(String name,String colur,float weight,int fullempty)
    {
        this.isim=name;
        this.renk=colur;
        this.Agirlik=weight;
        this.Dolubos=fullempty;
        this.Birsonraki=-1;
    }
    public fruit()
    {
        this.isim="";
        this.renk="";
        this.Agirlik=0;
        this.Dolubos=-1;
        this.Birsonraki=-1;
    }
    public int getnext()
    {
        fruit f=this;
        return f.Birsonraki;
    }
    public void setnext(int a)
    {
        fruit f=this;
        f.Birsonraki=a;
    }
    public int getfullempty()
    {
        return Dolubos;
    }
    public void setfullempty(int a)
    {
        this.Dolubos=a;
    }
    public String print(int a)
    {
        fruit f=this;
        String s="fruit"+a+": \n name: "+f.isim+"\t color: "+f.renk+"\t weight: "+f.Agirlik+"\n";   
        return s;
        
    }
}

    

