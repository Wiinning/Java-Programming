package IntroductionJava;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        System.out.print("👉Insert Product id:");
        int id = new Scanner(System.in).nextInt();

        System.out.print("👉Insert product name: ");
        String ProductName = new Scanner(System.in).nextLine();

        System.out.print("Insert product price: ");
        float price = new Scanner(System.in).nextFloat();

        System.out.print("Insert product quantity: ");
        int quantity = new Scanner(System.in).nextInt();


        System.out.println("ID of the product: " + id);
        System.out.println("Product Name: " + ProductName);
        System.out.println("Price: " + price);
        System.out.println("Quantity of the product: " + quantity);


        // adding table
        Table table = new Table(4, BorderStyle.CLASSIC, ShownBorders.ALL);
        table.addCell("ID", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Product Name", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Product Price", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Product Qty", new CellStyle(CellStyle.HorizontalAlign.center));
        // set width
        table.setColumnWidth(0, 10, 20);
        table.setColumnWidth(1, 10, 20);
        table.setColumnWidth(2, 10, 20);
        table.setColumnWidth(3, 10, 20);
        //
        table.addCell(String.valueOf(id), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(ProductName, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(price), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(quantity), new CellStyle(CellStyle.HorizontalAlign.center));
        System.out.println(table.render());
    }
}

