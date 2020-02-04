package com.lloydsbanking.training.java.pdf;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class InsertingImageInPdf {
	public static void main(String args[]) throws Exception {

		// Creating PDF document object
		PDDocument document = new PDDocument();

		// Add an empty page to it
		document.addPage(new PDPage());

		// Saving the document
		document.save("C:\\Users\\shant\\Documents\\TCS\\Training\\pdf\\image.pdf");
		
		// Loading an existing document
		File file = new File("C:\\Users\\shant\\Documents\\TCS\\Training\\pdf\\image.pdf");
		PDDocument doc = PDDocument.load(file);

		// Retrieving the page
		PDPage page = doc.getPage(0);

		// Creating PDImageXObject object
		PDImageXObject pdImage = PDImageXObject.createFromFile("C:\\Users\\shant\\Documents\\TCS\\Training\\Sketch.png", doc);

		// creating the PDPageContentStream object
		PDPageContentStream contents = new PDPageContentStream(doc, page);

		// Drawing the image in the PDF document
		contents.drawImage(pdImage, 70, 250);
		System.out.println("Image inserted");

		// Closing the PDPageContentStream object
		contents.close();

		// Saving the document
		doc.save("C:\\Users\\shant\\Documents\\TCS\\Training\\pdf\\image.pdf");

		// Closing the document
		doc.close();
	}
}