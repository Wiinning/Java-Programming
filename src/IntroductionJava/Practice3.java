package IntroductionJava;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

                String uuid = UUID.randomUUID().toString();

        System.out.print("Insert student's name: ");
        String name = scanner.nextLine();

        System.out.print("Insert student's class: ");
        int Class = scanner.nextInt();

        System.out.print("Insert student's score: ");
        double score = scanner.nextDouble();
// display result
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.addCell("Student's UUID", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Student's Name", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Student's Class", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Student's score", new CellStyle(CellStyle.HorizontalAlign.center));
        // set width
        table.setColumnWidth(0, 10, 20);
        table.setColumnWidth(1, 10, 20);
        table.setColumnWidth(2, 10, 20);
        table.setColumnWidth(3, 10, 20);
        //
        table.addCell(String.valueOf(uuid), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(name, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(Class), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(score), new CellStyle(CellStyle.HorizontalAlign.center));
        System.out.println(table.render());
    }
}
