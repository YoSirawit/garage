
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class InvoiceCreator {
    public InvoiceCreator(Bill bill) throws FileNotFoundException, IOException {
        String path = "invoice.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);
        
        float twoCol = 285f;
        float threeCol = 190f;
        float twoCol150 = twoCol+150f;
        float oneColumnWidth[] = {twoCol150};
        float twoColumnWidth[] = {twoCol150, twoCol};
        float threeColumnWidth[] = {threeCol, threeCol, threeCol};
        float oneTwo[] = {threeCol+125f, threeCol*2};
        float fullWidth[] = {threeCol*3};
        Paragraph oneSp = new Paragraph("\n");
        
        Table table = new Table(twoColumnWidth);
        table.addCell(new Cell().add("Invoice").setFontSize(20f).setBorder(Border.NO_BORDER).setBold());
        
        Table nestedTable = new Table(new float[]{twoCol/2, twoCol/2});
        nestedTable.addCell(getHeaderTextCell("Invoice No."));
        //Invoice No. data
        nestedTable.addCell(getHeaderTextCellValue("---------"));  
        nestedTable.addCell(getHeaderTextCell("Invoice Date"));     
        //Invoice Date data
        nestedTable.addCell(getHeaderTextCellValue("---------"));  
        
        table.addCell(new Cell().add(nestedTable).setBorder(Border.NO_BORDER));
        
        //Create Separate Line
        Border gb = new SolidBorder(Color.GRAY, 2f);
        Table divider = new Table(fullWidth);
        divider.setBorder(gb);
        
        document.add(table);
        document.add(oneSp);
        //Add Separate Line
        document.add(divider); 
        document.add(oneSp);
        
        Table twoColTable = new Table(twoColumnWidth);
        twoColTable.addCell(getBillingAndShippingCell("Billing Information"));
        twoColTable.addCell(getBillingAndShippingCell("Shipping Information"));
        document.add(twoColTable.setMarginBottom(12f));
        
        Table twoColTable2 = new Table(twoColumnWidth);
        twoColTable2.addCell(getCell10fLeft("Company", true));
        twoColTable2.addCell(getCell10fLeft("Name", true));
        twoColTable2.addCell(getCell10fLeft("Dumrongruy", false));
        //Customer data
        twoColTable2.addCell(getCell10fLeft("Customer's name", false));
        document.add(twoColTable2);
        
        Table twoColTable3 = new Table(twoColumnWidth);
        twoColTable3.addCell(getCell10fLeft("Name", true));
        twoColTable3.addCell(getCell10fLeft("Address", true));
        //Worker data
        twoColTable3.addCell(getCell10fLeft("Worker's name", false));
        //Customer data
        twoColTable3.addCell(getCell10fLeft("Customer's address", false));
        document.add(twoColTable3);
        
        Table oneColTable1 = new Table(oneColumnWidth);
        oneColTable1.addCell(getCell10fLeft("Address", true));
        //Organize data
        oneColTable1.addCell(getCell10fLeft("Organize's address", false));
        oneColTable1.addCell(getCell10fLeft("Email", true));
        oneColTable1.addCell(getCell10fLeft("dumrongruykanchang@gmail.com", false));
        document.add(oneColTable1);
        document.add(oneSp);
        
        //Create Dashed Separate Line
        Table tableDivider = new Table(fullWidth);
        Border dgb = new DashedBorder(Color.GRAY, 0.5f);
        document.add(tableDivider.setBorder(dgb));
        
        //Create Product's Data Table
        Paragraph productPara = new Paragraph("Products");
        document.add(productPara.setBold());
        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(Color.BLACK, 0.7f);
        threeColTable1.addCell(new Cell().add("Description").setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE));
        threeColTable1.addCell(new Cell().add("Quantity").setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("Price").setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setMarginRight(15f).setTextAlignment(TextAlignment.RIGHT));
        document.add(threeColTable1);
        
        List<Item> itemList = bill.getInfo();
        
        Table threeColTable2 = new Table(threeColumnWidth);
        float totalSum = 0f;
        for (Item item:itemList) {
            double total = item.getTotal();
            totalSum += total;
            threeColTable2.addCell(new Cell().add(item.getName()).setBorder(Border.NO_BORDER).setMarginLeft(10f));
            threeColTable2.addCell(new Cell().add(String.valueOf(item.getVolume())).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
            threeColTable2.addCell(new Cell().add(String.valueOf(item.getPrice())).setBorder(Border.NO_BORDER).setMarginLeft(15f).setTextAlignment(TextAlignment.RIGHT));
        }
        document.add(threeColTable2.setMarginBottom(20f));
        Table threeColTable4 = new Table(oneTwo);
        threeColTable4.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
        threeColTable4.addCell(new Cell().add(tableDivider).setBorder(Border.NO_BORDER));
        document.add(threeColTable4);
        
        Table threeColTable3 = new Table(threeColumnWidth);
        threeColTable3.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setMarginLeft(10f));
        threeColTable3.addCell(new Cell().add("Total").setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
        threeColTable3.addCell(new Cell().add(String.valueOf(totalSum)).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT).setMarginRight(15f));

        document.add(threeColTable3);
        document.add(tableDivider);
        document.add(new Paragraph("\n"));
        document.add(divider.setBorder(new SolidBorder(Color.GRAY, 1)).setMarginBottom(15f));
        //Product Data Created
        
        //Create Terms and Conditions
        Table termsAndCondsTable = new Table(fullWidth);
        termsAndCondsTable.addCell(new Cell().add("TERMS AND CONDITIONS\n").setBold().setBorder(Border.NO_BORDER));
        List<String> termsAndCondsList = new ArrayList<>();
        termsAndCondsList.add("1. I am the storm that is approaching!");
        for (String tnc:termsAndCondsList) {
            termsAndCondsTable.addCell(new Cell().add(tnc).setBorder(Border.NO_BORDER));
        }
        document.add(termsAndCondsTable);
        
        document.close();
        openPDF(path);
}
        static Cell getHeaderTextCell(String textValue) {

            return new Cell().add(textValue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT);
        }
        static Cell getHeaderTextCellValue(String textValue) {

            return new Cell().add(textValue).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
        }
        static Cell getBillingAndShippingCell(String textValue) {

            return new Cell().add(textValue).setFontSize(12f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
        }
        static Cell getCell10fLeft(String textValue, Boolean isBold) {
            Cell myCell = new Cell().add(textValue).setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
            return isBold ?myCell.setBold():myCell;
    //        if (isBold) {
    //            return myCell.setBold();
    //        } else {
    //            return myCell;
    //        }
        }
        static void openPDF(String filePath) throws IOException {
            File file = new File(filePath);
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+file);
        }
}
