
package Exercise1;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {
    private double tax;
    public ReferenceBook (String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super (bookId, publisher, entryDate, unitPrice, quantity);
        this.tax=tax;
    }
    public ReferenceBook(){}
    public double getTax () {
        return tax;
    }
    public void setTax(double tax) {
        this.tax=tax;
    }
    public void addBook () {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.println("Enter tax: ");
        setTax(scanner.nextDouble());
        System.out.println("ReferenceBook added successfully");
    }
    public void updateBook (String id) {
        if (getBookId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.println("Enter new tax: ");
            setTax(scanner.nextDouble());
            System.out.println("ReferenceBook update successfully.");
            
        } else {
            System.out.println("Not found ID "+id);
        }
    }
    public void displayBook () {
        super.displayBook();
        System.out.println("Tax: "+getTax());
    }
    
}
