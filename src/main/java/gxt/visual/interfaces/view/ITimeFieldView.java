package gxt.visual.interfaces.view;

import java.util.Date;

import com.extjs.gxt.ui.client.widget.form.Time;
import com.extjs.gxt.ui.client.widget.form.TimeField.TimeFieldMessages;
import com.google.gwt.i18n.client.DateTimeFormat;

/**
 * @author eugenp
 */
public interface ITimeFieldView extends IComboBoxView< Time >{
	
	/**
	 * Returns the matching Time for the given date.
	 * @param date the date
	 * @return the matching model or null if no match
	 */
	Time findModel( Date date );
	
	/**
	 * Return the matching Time for the given time.
	 * @param hours the hours
	 * @param minutes the minutes
	 * @return the matching model or null if no match
	 */
	Time findModel( int hours, int minutes );
	
	/**
	 * Returns the current date value.
	 * @return the value
	 */
	Date getDateValue();
	
	/**
	 * Returns the date time format.
	 * @return the date time format
	 */
	DateTimeFormat getFormat();
	
	/**
	 * Returns the number of minutes between each time value.
	 * @return the increment
	 */
	int getIncrement();
	
	/**
	 * Returns the field's max value.
	 * @return the max value
	 */
	Date getMaxValue();
	
	TimeFieldMessages getMessages();
	
	/**
	 * Returns the fields minimum value.
	 * @return the min value
	 */
	Date getMinValue();
	
	/**
	 * Sets the field's value from a date.
	 * @param date the date
	 */
	void setDateValue( Date date );
	
	/**
	 * Sets the date time format used to format each entry (defaults to {@link DateTimeFormat#getShortDateFormat()}.
	 * @param format the date time format
	 */
	void setFormat( DateTimeFormat format );
	
	/**
	 * Sets the number of minutes between each time value in the list (defaults to 15).
	 * @param increment the increment
	 */
	void setIncrement( int increment );
	
	/**
	 * Sets the field's max value.
	 * @param value the max value
	 */
	void setMaxValue( Date value );
	
	/**
	 * The minimum allowed time (no default value).
	 * @param value the min date
	 */
	void setMinValue( Date value );

}
