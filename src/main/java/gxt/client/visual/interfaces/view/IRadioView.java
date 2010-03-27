package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.form.RadioGroup;

/**
 * @author eugenp
 */
public interface IRadioView extends ICheckBoxView{
	
	/**
	 * Returns the radios container group.
	 * @return the group
	 */
	RadioGroup getGroup();
	
	void setValue( Boolean value );
	
}