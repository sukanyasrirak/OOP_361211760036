package lab9;

public class Mobiletest {
    private int MobileID;
    private String Brand;
    private String Generation;
    private double Price;
    private String OperationST;

    public int getMobileID() {
        return MobileID;
    }

    public void setMobileID(int mobileID) {
        MobileID = mobileID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getGeneration() {
        return Generation;
    }

    public void setGeneration(String generation) {
        Generation = generation;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getOperationST() {
        return OperationST;
    }

    public void setOperationST(String operationST) {
        OperationST = operationST;
    }

    @Override
    public String toString() {
        return "Mobiletest{" +
                "MobileID=" + MobileID +
                ", Brand='" + Brand + '\'' +
                ", Generation='" + Generation + '\'' +
                ", Price=" + Price +
                ", OperationST='" + OperationST + '\'' +
                '}';
    }

    public Mobiletest(int mobileID, String brand, String generation, double price, String operationST) {
        MobileID = mobileID;
        Brand = brand;
        Generation = generation;
        Price = price;
        OperationST = operationST;


    }
}//class
