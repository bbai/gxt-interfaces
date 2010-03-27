package gxt.client.visual.interfaces.view;

import java.util.Date;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.DatePicker.DatePickerMessages;

/**
 * @author eugenp
 */
public interface IDatePickerView extends IBoxComponentView{
	
	void focus();
	
	/**
	 * Returns the field's maximum allowed date.
	 * @return the max date
	 */
	Date getMaxDate();
	
	/**
	 * Returns the data picker messages.
	 * @return the date picker messages
	 */
	DatePickerMessages getMessages();
	
	/**
	 * Returns the picker's minimum data.
	 * @return the min date
	 */
	Date getMinDate();
	
	/**
	 * Returns the picker's start day.
	 * @return the start day
	 */
	int getStartDay();
	
	/**
	 * Gets the current selected value of the date field.
	 * @return the date
	 */
	Date getValue();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Sets the picker's maximum allowed date.
	 * @param maxDate the max date
	 */
	void setMaxDate( Date maxDate );
	
	/**
	 * Sets the data picker messages.
	 * @param messages the date picker messages
	 */
	void setMessages( DatePickerMessages messages );
	
	/**
	 * Sets the picker's minimum allowed date.
	 * @param minDate the min date
	 */
	void setMinDate( Date minDate );
	
	/**
	 * Sets the picker's start day
	 * @param startDay the start day
	 */
	void setStartDay( int startDay );
	
	/**
	 * Sets the value of the date field.
	 * @param date the date
	 */
	void setValue( Date date );
	
	/**
	 * Sets the value of the date field.
	 * @param date the date
	 * @param supressEvent true to suppress the select event
	 */
	void setValue( Date date, boolean supressEvent );
	
}
