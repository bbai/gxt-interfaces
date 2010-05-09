package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.Slider;

/**
 * @author eugenp
 */
public interface ISliderFieldView extends IFieldView< Integer >{
	
	Slider getSlider();
	
	void setReadOnly( boolean readOnly );
	
	void setSlider( Slider slider );
	
	void setValue( Integer value );
	
}
