package gxt.visual.ui.client.interfaces.view;

import java.util.Date;

import com.extjs.gxt.ui.client.widget.DatePicker;

/**
 * @author eugenp
 */
public interface IDateMenuView extends IMenuView{
	
	/**
	 * Returns the selected date.
	 * @return the date
	 */
	Date getDate();
	
	/**
	 * Returns the date picker.
	 * @return the date picker
	 */
	DatePicker getDatePicker();
	
}
