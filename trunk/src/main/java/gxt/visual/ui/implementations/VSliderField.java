package gxt.visual.ui.implementations;

import gxt.visual.interfaces.ISliderField;

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
