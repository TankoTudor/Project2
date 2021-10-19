package Classes;

import Interface.IProdus;

public class Processor implements IProdus {
    private double price;
    private int amount;
    public String name;
    public String type;
    private int code;

   public Coscump cos = null;

    public Processor(String name,String type,double price,int code,int amount){
        this.name = name;
        this.type = type;
        this.price = price;
        this.code = code;
        this.amount = amount;
        cos = new Coscump(0);
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount() {
        this.amount = amount;
    }

    public int getCode(){
        return code;
    }

    public void setCode(){
        this.code = code;
    }

    public boolean Adaugarecos(int option,int code,int cant){
        if(option == 1 && getCode()==code){
            System.out.println("Produsul a fost adaugat in cos");
            this.amount -=cant;
            cos.Totalsum(getPrice(),cant);
            return true;
        }
        else{
            System.out.println("Doriti sa adaugati alt produs?");
            return false;
        }
    }

    public boolean Verifstock(int x){
        if(x == code){
            if(this.amount <= 0){
                System.out.println("Produsul nu mai este in stock");
                return false;
            }
            else{
                System.out.println("Produsul este in stock:" + this.amount);
                return true;
            }
        }
        else{
            System.out.println("Produs inexistent");
            return false;
        }
    }
}
