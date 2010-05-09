package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.widget.ProgressBar;

/**
 * @author eugenp
 */
public interface IProgressBarView extends IBoxComponentView{
	
	/**
	 * Initiates an auto-updating progress bar using the current duration, increment, and interval.
	 * @return this
	 */
	ProgressBar auto();
	
	/**
	 * Returns the duration.
	 * @return the duration
	 */
	int getDuration();
	
	/**
	 * Returns the bar's increment value.
	 * @return the increment the increment
	 */
	int getIncrement();
	
	/**
	 * Returns the bar's interval value.
	 * @return the interval in millseconds
	 */
	int getInterval();
	
	/**
	 * Returns the current value.
	 * @return the value
	 */
	double getValue();
	
	/**
	 * Returns true if the progress bar is currently in a {@link #auto} operation.
	 * @return true if waiting, else false
	 */
	boolean isRunning();
	
	/**
	 * Resets the progress bar value to 0 and text to empty string.
	 * @return this
	 */
	ProgressBar reset();
	
	/**
	 * The length of time in milliseconds that the progress bar should run before resetting itself (defaults to DEFAULT, in which case it will run indefinitely until reset is called)
	 * @param duration the duration in milliseconds
	 */
	void setDuration( int duration );
	
	/**
	 * The number of progress update segments to display within the progress bar (defaults to 10). If the bar reaches the end and is still updating, it will automatically wrap back to the beginning.
	 * @param increment the new increment
	 */
	void setIncrement( int increment );
	
	/**
	 * Sets the length of time in milliseconds between each progress update (defaults to 300 ms).
	 * @param interval the interval to set
	 */
	void setInterval( int interval );
	
	/**
	 * Updates the progress bar value, and optionally its text. If the text argument is not specified, any existing text value will be unchanged. To blank out existing text, pass "". Note that even if the progress bar value exceeds 1, it will never
	 * automatically reset -- you are responsible for determining when the progress is complete and calling {@link #reset} to clear and/or hide the control.
	 * @param value A value between 0 and 1 (e.g., .5, defaults to 0)
	 * @param text The string to display in the progress text element or null.
	 * @return this
	 */
	ProgressBar updateProgress( double value, String text );
	
	/**
	 * Updates the progress bar text. If specified, textEl will be updated, otherwise the progress bar itself will display the updated text.
	 * @param text The string to display in the progress text element
	 */
	void updateText( String text );
	
}
