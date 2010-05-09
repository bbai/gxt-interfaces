package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ISliderField;

import com.extjs.gxt.ui.client.widget.Slider;
import com.extjs.gxt.ui.client.widget.form.SliderField;

/**
 * @author eugenp
 */
public class VSliderField extends SliderField implements ISliderField{
	
	public VSliderField( final Slider slider ){
		super( slider );
	}
	
	//
	public SliderField getComponent(){
		return this;
	}
	
}
