package docs;

import javax.print.Doc;

public class DocumentChecker {
    public static void main(String[] args) {
        Document doc = new ExcelDocument();
        doc.getDescription();

        Document pdfDoc = new PdfDocument();
        pdfDoc.getDescription();

    }
}
