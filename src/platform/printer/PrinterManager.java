package platform.printer;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

import platform.log.ApplicationLogger;

public class PrinterManager {
	
	private static PrinterManager instance ;


	private  PageFormat definePageFormat(PrinterJob printJob) {
	        PageFormat pageFormat = printJob.defaultPage();
	        Paper paper = pageFormat.getPaper();
	        pageFormat.setOrientation(PageFormat.PORTRAIT);
	        paper.setSize(8.5 * 72, 11 * 72);
	        paper.setImageableArea(0.875 * 72, 0.625 * 72, 6.75 * 72, 9.75 * 72);
	        pageFormat.setPaper(paper);
	        return pageFormat;
	 }
	 
	public PrinterManager() {
	}

	public static PrinterManager getInstance() {
		if (instance == null) {
			instance = new PrinterManager();
		}
		return instance;
	}
	
	
	void initPrinter() {
	
	}	
	public void printLaserTextFilePrint(String filename) {
		PrinterJob job = PrinterJob.getPrinterJob();

        // Get the page format:
        PageFormat format = definePageFormat(job);
        
        // Default attributes to printer:
        PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
        attributes.add(OrientationRequested.PORTRAIT);
        attributes.add(MediaSizeName.NA_LETTER);

        // Create our PageableText object, and tell the PrinterJob about it
        try {
            job.setPageable(new PageableText(new File(filename), format));
        } catch (IOException ex) {
        	ex.printStackTrace();
            System.out.println("Cannot load file to print");
        }

        // Ask the user to select a printer, etc., and if not canceled, print pages:
        try {
                job.print();
        } catch (PrinterException e) {
        	e.printStackTrace();
            System.out.println("Cannot Select Printer");
        }
	}
	
	public void printTextFile(String printerType,String filename) {
		if ("DOT_MATRIX".equalsIgnoreCase(printerType)) {
			printDotMatrixTextFilePrint(filename);
		} else {
			printLaserTextFilePrint(filename);
		}
	}
	public void printDotMatrixTextFilePrint(String filename) {
		PrintService service = null;
		DocFlavor flavor;
		PrintRequestAttributeSet aset;
		flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
		
		service = PrintServiceLookup.lookupDefaultPrintService();
		aset = new HashPrintRequestAttributeSet();	
		aset.add(new Copies(1));
		if (service == null) {
			initPrinter();
		}
		if(service == null) {
			ApplicationLogger.error("ERROR :: PRINTER INIT FAILED - No default Printer configured ...", this.getClass());
			return;
		}
		FileInputStream textStream;
		try {
			if (!service.isDocFlavorSupported(flavor)) {
				ApplicationLogger.error("ERROR :: PRINTER FLAOUR not suported .....", this.getClass());
				return;
			}
			textStream = new FileInputStream(new File(filename));
			Doc mydoc = new SimpleDoc(textStream, flavor, null);
			
			//print using default
			DocPrintJob job = service.createPrintJob();
			PrintJobWatcher pjDone = new PrintJobWatcher(job);
			job.print(mydoc, aset);
            // Wait for the print job to be done
	        pjDone.waitForDone();
	   		textStream.close();
	   		System.out.println("\n\nPrint completed\n\n");
	   		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static class PrintJobWatcher {
        // true iff it is safe to close the print job's input stream
        boolean done = false;

        PrintJobWatcher(DocPrintJob job) {
            // Add a listener to the print job
            job.addPrintJobListener(new PrintJobAdapter() {
			    public void printJobCanceled(PrintJobEvent pje) {
			    	System.out.println("Job canceled");
                    allDone();
                }
                public void printJobCompleted(PrintJobEvent pje) {
                	System.out.println("Job completed");
                    allDone();
                }
                public void printJobFailed(PrintJobEvent pje) {
                	System.out.println("Job failed");
                    allDone();
                }
                public void printJobNoMoreEvents(PrintJobEvent pje) {
                	System.out.println("no more job");
                    allDone();
                }
                void allDone() {
                    synchronized (PrintJobWatcher.this) {
                        done = true;
                        PrintJobWatcher.this.notify();
                    }
                }
            });
        }
        public synchronized void waitForDone() {
            try {
                while (!done) {
                    wait();
                }
            } catch (InterruptedException e) {
            }
        }
    }


}
