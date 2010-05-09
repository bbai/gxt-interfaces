package gxt.visual.ui.client.interfaces.view;

import java.util.List;

import com.extjs.gxt.ui.client.widget.form.CheckBox;

/**
 * @author eugenp
 */
public interface ICheckBoxGroupView extends IMultiFieldView< CheckBox >{
	
	/**
	 * Returns the first checked check box.
	 */
	CheckBox getValue();
	
	/**
	 * Returns a list of all selected check boxes.
	 * @return the list
	 */
	List< CheckBox > getValues();
	
}
