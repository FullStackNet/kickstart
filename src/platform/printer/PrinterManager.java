package platform.printer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

import platform.log.ApplicationLogger;

public class PrinterManager {
	
	private static PrinterManager instance ;
	private PrintService service = null;
	private DocFlavor flavor;
	private PrintRequestAttributeSet aset;

	public PrinterManager() {
	}

	public static PrinterManager getInstance() {
		if (instance == null) {
			instance = new PrinterManager();
		}
		return instance;
	}
	
	
	void initPrinter() {
		flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
		service = PrintServiceLookup.lookupDefaultPrintService();
		aset = new HashPrintRequestAttributeSet();		
	}	
	
	public void printTextFile(String filename) {
		if (service == null) {
			initPrinter();
		}
		if(service == null) {
			ApplicationLogger.error("ERROR :: PRINTER INIT FAILED - No default Printer configured ...", this.getClass());
			return;
		}
		FileInputStream textStream;
		try {
			textStream = new FileInputStream(filename);
			Doc mydoc = new SimpleDoc(textStream, flavor, null);
			aset.add(new Copies(1));
			//print using default
			DocPrintJob job = service.createPrintJob();
			job.print(mydoc, aset);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
