package platform.manager.obd;

import java.util.Comparator;

public class PIDCompare implements Comparator<PID> {
    public int compare(PID object1, PID object2) {
    	int num1 = 1;
    	int num2 = 1;
    	if (object1.isSupported()) {
    		num1 = 0;
    	}
    	if (object2.isSupported()) {
    		num2 = 0;
    	}
        return (num1+object1.getKey()).compareTo(num2+object2.getKey());
    }
}