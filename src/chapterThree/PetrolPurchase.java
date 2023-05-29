package chapterThree;

public class PetrolPurchase {
    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double price;
    private double discount;

    public PetrolPurchase(String location, String typeOfPetrol, int quantity, double price,double discount){
        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;

    }
    public void setLocation(){

    }
    public String getLocation(){
        return location;
    }
    public void setTypeOfPetrol(){

    }
    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public void setQuantity(){

    }
    public int getQuantity(){

        return quantity;
    }

    public void setPrice(){

    }
    public double getPrice(){
        return price;
    }

    public void setDiscount(){

    }
    public double getDiscount(){
        return discount;
    }

    public double getPurchaseAmount(double purchaseAmount){
        if (purchaseAmount >0){
            purchaseAmount = (quantity * price) - discount;
        }
        return purchaseAmount;
    }


}
