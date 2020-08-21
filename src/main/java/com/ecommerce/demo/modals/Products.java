package com.ecommerce.demo.modals;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private String Modelnumber;
    private String productCost;
    private String quantityAvailable;
    private String RAM;
    private String InternalMmemory;
    private String FrontCamera;
    private String BackCamera;

    /*All-arg constructor and No-arg constructor*/
    public Products() {}

    public Products(int productId, String productName, String modelnumber, String productCost, String quantityAvailable, String RAM,
                    String internalMmemory, String frontCamera, String backCamera) {
        this.productId = productId;
        this.productName = productName;
        Modelnumber = modelnumber;
        this.productCost = productCost;
        this.quantityAvailable = quantityAvailable;
        this.RAM = RAM;
        InternalMmemory = internalMmemory;
        FrontCamera = frontCamera;
        BackCamera = backCamera;
    }

    /*Getter and Setters*/

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCost() {
        return productCost;
    }

    public void setProductCost(String productCost) {
        this.productCost = productCost;
    }

    public String getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(String quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getModelnumber() {
        return Modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        Modelnumber = modelnumber;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getInternalMmemory() {
        return InternalMmemory;
    }

    public void setInternalMmemory(String internalMmemory) {
        InternalMmemory = internalMmemory;
    }

    public String getFrontCamera() {
        return FrontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        FrontCamera = frontCamera;
    }

    public String getBackCamera() {
        return BackCamera;
    }

    public void setBackCamera(String backCamera) {
        BackCamera = backCamera;
    }
}
