package gxt.visual.ui.implementations;

import gxt.visual.interfaces.ISlider;

import com.extjs.gxt.ui.client.widget.Slider;

/**
 * @author eugenp
 */
public class VSlider extends Slider implements ISlider{
	
	public VSlider(){
		super();
	}
	
	//
	public Slider getComponent(){
		return this;
	}
	
}
