package platform.printer;

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
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

import platform.log.ApplicationLogger;

public class PrinterManager {
	
	private static PrinterManager instance ;
	

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
	
	public void printTextFile(String filename) {
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
			textStream = new FileInputStream(new File(filename));
			Doc mydoc = new SimpleDoc(textStream, flavor, null);
			
			//print using default
			DocPrintJob job = service.createPrintJob();
			PrintJobWatcher pjDone = new PrintJobWatcher(job);
			job.print(mydoc, aset);
            // Wait for the print job to be done
	        pjDone.waitForDone();
	   		textStream.close();
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
