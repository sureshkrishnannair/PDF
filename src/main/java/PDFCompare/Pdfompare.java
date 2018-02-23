package PDFCompare;

import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class Pdfompare {
	
	//https://www.youtube.com/watch?v=koMegSvZEVE
	//http://www.verypdf.com/app/pdf-to-txt-converter/index.html

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String Expected="C:\\Suresh\\Learnings\\Selenium\\pdftest\\Suresh Krishnan_CV  - Copy.pdf";
		String Actual="C:\\Suresh\\Learnings\\Selenium\\pdftest\\Suresh Krishnan_CV.pdf";
		String Result="C:\\Suresh\\Learnings\\Selenium\\pdftest\\result";
		String Result1="C:\\Suresh\\Learnings\\Selenium\\pdftest\\result1";
		String IgnoreFile="C:\\Users\\suresh\\workspace1\\PDFComparison1\\src\\main\\java\\PDFCompare\\ignore.cong";
		
		//Option1
		//new PdfComparator(Expected, Actual).compare().writeTo(Result);
		System.out.println("Compared");
		
		//Option2, if not equal
		boolean isEquals = new PdfComparator(Expected, Actual).compare().writeTo(Result);
		if (!isEquals) {
		    System.out.println("Differences found!");
		}
		
		//Options3
		//Exclusions-with ignore
		new PdfComparator(Expected, Actual).withIgnore(IgnoreFile).compare().writeTo(Result1);

	}

}
