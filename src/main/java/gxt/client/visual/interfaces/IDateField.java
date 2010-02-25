package gxt.client.visual.interfaces;

import java.util.Date;

import com.extjs.gxt.ui.client.widget.DatePicker;
import com.extjs.gxt.ui.client.widget.form.DateTimePropertyEditor;

/**
 * @author eugenp
 */
public interface IDateField extends ITriggerField< Date >{
	
	DateTimePropertyEditor getPropertyEditor();
	
	void setMinValue( final Date minValue );
	void setMaxValue( final Date maxValue );
	
	DatePicker getDatePicker();
	
}
