package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup.RadioGroupMessages;

/**
 * @author eugenp
 */
public interface IRadioGroupView extends IMultiFieldView< Radio >{
	
	void add( Radio radio );
	
	RadioGroupMessages getMessages();
	
	/**
	 * Returns the selected radio.
	 */
	Radio getValue();
	
	/**
	 * Returns true if a selection is required.
	 * @return the selection required state
	 */
	boolean isSelectionRequired();
	
	boolean isValid( boolean preventMark );
	
	/**
	 * Sets whether a selection is required when validating the group (defaults to false).
	 * @param selectionRequired true to require a selection
	 */
	void setSelectionRequired( boolean selectionRequired );
	
	void setValue( Radio value );
	
}
