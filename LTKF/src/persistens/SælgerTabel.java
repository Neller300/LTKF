//Skrevet af Patrick
package persistens;

import java.util.Observable;

public class SælgerTabel implements HasAutoKey {
	private int sælgerId;
	private String initialer;
	private int fastGrænse;

	public SælgerTabel(int sælgerId, String initialer, int fastGrænse) {
		this.sælgerId = sælgerId;
		this.initialer = initialer;
		this.fastGrænse = fastGrænse;
	}

	@Override
	public void setAutoKey(int key) {
		this.sælgerId = key;
	}

	public int getSælgerId() {
		return sælgerId;
	}

	public String getInitialer() {
		return initialer;
	}

	public int getFastGrænse() {
		return fastGrænse;
	}
	
	@Override
	public String toString() {
		return "[Sælger: SælgerId=" + sælgerId + 
			   ", Initialer=" + initialer + 
			   ", Fastgrænse=" + fastGrænse + "]";
	}

}
