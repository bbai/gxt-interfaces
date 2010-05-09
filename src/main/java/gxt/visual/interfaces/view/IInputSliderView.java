package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.form.NumberField;

/**
 * @author eugenp
 */
public interface IInputSliderView extends ISliderView{
	
	/**
	 * Returns the input field.
	 * @return the input field
	 */
	NumberField getInput();
	
	/**
	 * Returns the input's width.
	 * @return the input width
	 */
	int getInputWidth();
	
	/**
	 * Sets the input's width (defaults to 22).
	 * @param inputWidth the input width
	 */
	void setInputWidth( int inputWidth );
	
}
