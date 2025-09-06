/*
 * 28. Online Shopping Cart System
Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and
apply discounts.

Problem Statement:
● Class Product → instance variables: productId, name, price (Encapsulation: use private variables
with getters/setters)
● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic
behavior for cart items)
● Class Cart extends CartItem → store list of products, implement calculateTotalPrice()
● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can
have discounts applied)
In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost

Sample Input:
Product1 → name="Laptop", price=50000
Product2 → name="Mouse", price=500
Product3 → name="Keyboard", price=1200

Sample Output:
Applying 10% discount to Laptop
Total Cart Price = 51800
 */

 package Java.oopj.Assignment3;

 import java.util.ArrayList;
 import java.util.List;
 
 // ---------------- Product ----------------
 class Product {
     private int productId;
     private String name;
     private double price;
 
     public Product(int productId, String name, double price) {
         this.productId = productId;
         this.name = name;
         this.price = price;
     }
 
     // Getters & Setters
     public int getProductId() {
         return productId;
     }
 
     public String getName() {
         return name;
     }
 
     public double getPrice() {
         return price;
     }
 
     public void setPrice(double price) {
         this.price = price;
     }
 }
 
 // ---------------- Abstract Class ----------------
 abstract class CartItem {
     public abstract double calculateTotalPrice();
 }
 
 // ---------------- Discountable Interface ----------------
 interface Discountable {
     void applyDiscount(Product product, double percentage);
 }
 
 // ---------------- Cart Class ----------------
 class Cart extends CartItem implements Discountable {
     private List<Product> products = new ArrayList<>();
 
     public void addProduct(Product p) {
         products.add(p);
     }
 
     @Override
     public double calculateTotalPrice() {
         double total = 0;
         for (Product p : products) {
             total += p.getPrice();
         }
         return total;
     }
 
     @Override
     public void applyDiscount(Product product, double percentage) {
         double discount = product.getPrice() * (percentage / 100);
         double newPrice = product.getPrice() - discount;
         product.setPrice(newPrice);
         System.out.println("Applying " + percentage + "% discount to " + product.getName());
     }
 }
 
 // ---------------- Main Class ----------------
 public class ShoppingCartMain {
     public static void main(String[] args) {
         Cart cart = new Cart();
 
         // Create Products
         Product p1 = new Product(1, "Laptop", 50000);
         Product p2 = new Product(2, "Mouse", 500);
         Product p3 = new Product(3, "Keyboard", 1200);
 
         // Add to cart
         cart.addProduct(p1);
         cart.addProduct(p2);
         cart.addProduct(p3);
 
         // Apply 10% discount on Laptop
         cart.applyDiscount(p1, 10);
 
         // Display Total Cart Price
         System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
     }
 }
 