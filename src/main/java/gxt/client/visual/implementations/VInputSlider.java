package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IInputSlider;

import com.extjs.gxt.ui.client.widget.InputSlider;

/**
 * @author eugenp
 */
public class VInputSlider extends InputSlider implements IInputSlider{
	
	public VInputSlider(){
		super();
	}

	//
	public InputSlider getComponent(){
		return this;
	}
	
}