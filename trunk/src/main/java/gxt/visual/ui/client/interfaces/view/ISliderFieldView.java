package gxt.visual.ui.client.interfaces.view;

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
