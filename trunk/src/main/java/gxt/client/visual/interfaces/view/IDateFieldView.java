package gxt.client.visual.interfaces.view;

import java.util.Date;

import com.extjs.gxt.ui.client.widget.DatePicker;
import com.extjs.gxt.ui.client.widget.form.DateTimePropertyEditor;
import com.extjs.gxt.ui.client.widget.form.DateField.DateFieldMessages;

/**
 * @author eugenp
 */
public interface IDateFieldView extends ITriggerFieldView< Date >{
	
	/**
	 * Returns the field's date picker.
	 * @return the date picker
	 */
	DatePicker getDatePicker();
	
	/**
	 * Returns the field's max value.
	 * @return the max value
	 */
	Date getMaxValue();
	
	DateFieldMessages getMessages();
	
	/**
	 * Returns the field's min value.
	 * @return the min value
	 */
	Date getMinValue();
	
	DateTimePropertyEditor getPropertyEditor();
	
	/**
	 * Returns true if formatting is enabled.
	 * @return the format value state
	 */
	boolean isFormatValue();
	
	/**
	 * True to format the user entered value using the field's property editor after passing validation (defaults to false). Format value should not be enabled when auto validating.
	 * @param formatValue true to format the user value
	 */
	void setFormatValue( boolean formatValue );
	
	/**
	 * Sets the field's max value.
	 * @param maxValue the max value
	 */
	void setMaxValue( Date maxValue );
	
	/**
	 * The maximum date allowed.
	 * @param minValue the max value
	 */
	void setMinValue( Date minValue );
	
}
