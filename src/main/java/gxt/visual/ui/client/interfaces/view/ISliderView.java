package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.ComponentEvent;

/**
 * @author eugenp
 */
public interface ISliderView extends IBoxComponentView{
	
	El getFocusEl();
	
	/**
	 * Returns the increment.
	 * @return the increment
	 */
	int getIncrement();
	
	/**
	 * Returns the max value (defaults to 100).
	 * @return the max value
	 */
	int getMaxValue();
	
	/**
	 * Returns the tool tip message.
	 * @return the tool tip message
	 */
	String getMessage();
	
	/**
	 * Returns the minimum value (defaults to 0).
	 * @return the minimum value
	 */
	int getMinValue();
	
	/**
	 * Returns the current value.
	 * @return the current value
	 */
	int getValue();
	
	/**
	 * Returns whether whether or not clicking on the Slider axis will change the slider.
	 * @return true to allow axis clicks
	 */
	boolean isClickToChange();
	
	/**
	 * Returns true if the slider is draggable.
	 * @return true if draggable
	 */
	boolean isDraggable();
	
	/**
	 * Returns true if tips are enabled.
	 * @return true if tips are enabled
	 */
	boolean isUseTip();
	
	boolean isVertical();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Determines whether or not clicking on the slider axis will change the slider (defaults to true).
	 * @param clickToChange true to allow the slider axis to be clicked
	 */
	void setClickToChange( boolean clickToChange );
	
	/**
	 * True to allow the slider to be dragged (default to true).
	 * @param draggable true to enable dragging
	 */
	void setDraggable( boolean draggable );
	
	/**
	 * How many units to change the slider when adjusting by drag and drop. Use this option to enable 'snapping' (default to 10).
	 * @param increment the increment
	 */
	void setIncrement( int increment );
	
	/**
	 * Sets the max value (defaults to 100).
	 * @param maxValue the max value
	 */
	void setMaxValue( int maxValue );
	
	/**
	 * Sets the tool tip message (defaults to '{0}'). "{0} will be substituted with the current slider value.
	 * @param message the tool tip message
	 */
	void setMessage( String message );
	
	/**
	 * Sets the minimum value (defaults to 0).
	 * @param minValue the minimum value
	 */
	void setMinValue( int minValue );
	
	/**
	 * True to enable tool tips (default to true).
	 * @param useTip true to enable tool tips
	 */
	void setUseTip( boolean useTip );
	
	/**
	 * Sets the current value.
	 * @param value the value
	 */
	void setValue( int value );
	
	/**
	 * Sets the current value.
	 * @param value the value
	 * @param supressEvent true to suppress the change event
	 */
	void setValue( int value, boolean supressEvent );
	
	/**
	 * True to orient the slider vertically (defaults to false).
	 * @param vertical true for vertical
	 */
	void setVertical( boolean vertical );
	
}
