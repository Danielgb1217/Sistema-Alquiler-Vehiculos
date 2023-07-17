package utilidades;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AbstractVehiculo;

public class GenerarPdf {

    public static final String DESTINO = "./pdf/Resumen_de_Vehiculos.pdf";

//    public static void main(String[] args) {
//
//
//        try {
//            Pdf pdf = new Pdf();
//
//            pdf.crearPedf(DESTINO);
//            pdf.abriPdf();
//
//        } catch (Exception ex) {
//            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public Cell devolverCelda(String texto) throws IOException {

        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
        Cell cell = new Cell().add(new Paragraph(texto)
                .setFont(font)
                .setFontColor(ColorConstants.BLACK));
        cell.setBackgroundColor(ColorConstants.WHITE);
//            cell.setBorder(Border.NO_BORDER);
        cell.setTextAlignment(TextAlignment.CENTER);

        return cell;

    }

    public Cell devolverCeldaColorVerde(String texto) throws IOException {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
        Cell cell = new Cell().add(new Paragraph(texto)
                .setFont(font)
                .setFontColor(ColorConstants.BLACK));
        cell.setBackgroundColor(ColorConstants.GREEN);
        cell.setTextAlignment(TextAlignment.CENTER);
        return cell;
    }

    public Cell devolverCeldaColorRojo(String texto) throws IOException {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
        Cell cell = new Cell().add(new Paragraph(texto)
                .setFont(font)
                .setFontColor(ColorConstants.BLACK));
        cell.setBackgroundColor(ColorConstants.RED);
        cell.setTextAlignment(TextAlignment.CENTER);
        return cell;
    }

    public void crearPdf(List<AbstractVehiculo> listadoVehiculos) throws Exception {

        File archivo = new File(DESTINO);
        archivo.getParentFile().mkdirs(); //Crea las n carpetas que hallana hasta el nombre del archivo

        //Instancia un objeto tipo pdf guardado en la ruta definida por el destino
        PdfDocument documentoPdf = new PdfDocument(new PdfWriter(DESTINO));//Crea el documento y lo instancia
        Document documento = new Document(documentoPdf);//Crear layaout para trabjo en swing de un pdf
        Table tabla = new Table(7);
        tabla.addCell(devolverCelda("Tipo"));
        tabla.addCell(devolverCelda("Matricula"));
        tabla.addCell(devolverCelda("Km"));
        tabla.addCell(devolverCelda("Disponibilidad"));
        tabla.addCell(devolverCelda("Valor Alquiler"));

        for (AbstractVehiculo vehiculo : listadoVehiculos) {
            //Adicionar celda
//            tabla.addCell("daniel");

            tabla.startNewRow();
            tabla.addCell(vehiculo.getTipoVehiculo().getTipoVehiculo());
            tabla.addCell(vehiculo.getMatricula());
            tabla.addCell("" + vehiculo.getKm());
            if (vehiculo.isEstado()) {
                tabla.addCell(devolverCeldaColorVerde("Disponible"));
            }else{
                 tabla.addCell(devolverCeldaColorRojo("Alquilado"));
            }
            tabla.addCell("" + vehiculo.getValorAlquiler());

        }
        documento.add(tabla);
        documento.close();//Cuando se trabaja con archivos es importnte cerrarlos
    }

    public void abriPdf() {

        try {
            File archivo = new File(DESTINO);
            Desktop.getDesktop().open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(GenerarPdf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
