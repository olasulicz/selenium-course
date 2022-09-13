package document;

public class DocumentChecker {

    public static void main(String[] args) {
        //ExcelDocument document = new ExcelDocument();
        Document excelDocument = new ExcelDocument();// dokument excela jest jedna z postaci naszego dukemntu
        Document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
