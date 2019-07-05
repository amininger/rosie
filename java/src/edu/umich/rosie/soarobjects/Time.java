package edu.umich.rosie.soarobjects;

import sml.Identifier;
import edu.umich.rosie.soar.ISoarObject;
import edu.umich.rosie.soar.IntWME;
import java.util.Calendar;

public class Time implements ISoarObject{
	private long startTime;
	private boolean added = false;

	private Identifier timeId = null;
	private IntWME seconds;
	private IntWME steps;
	private IntWME milliseconds;

	
	public Time(){
		startTime = mstime();
		
		seconds = new IntWME("seconds", 0L);
		milliseconds = new IntWME("milliseconds", 0L);
		steps = new IntWME("steps", 0L);
	}
	
	public static long mstime(){
		return (Calendar.getInstance()).getTimeInMillis();
	}

	@Override
	public void addToWM(Identifier parentId) {
		if(added){
			return;
		}
		
		timeId = parentId.CreateIdWME("time");
		seconds.addToWM(timeId);
		milliseconds.addToWM(timeId);
		steps.addToWM(timeId);
		
		added = true;
	}

	@Override
	public boolean isAdded() {
		return added;
	}

	@Override
	public void updateWM() {
		if(!added){
			return;
		}
		
		seconds.setValue((mstime() - startTime)/1000);
		seconds.updateWM();
		
		milliseconds.setValue(mstime() - startTime);
		milliseconds.updateWM();
		
		steps.setValue(steps.getValue()+1);
		steps.updateWM();
	}

	@Override
	public void removeFromWM() {
		if(!added){
			return;
		}

		seconds.removeFromWM();
		milliseconds.removeFromWM();
		steps.removeFromWM();
		timeId = null;

		added = false;
	}

}
