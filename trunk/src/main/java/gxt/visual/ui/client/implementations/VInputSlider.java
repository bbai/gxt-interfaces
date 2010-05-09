package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IInputSlider;

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
