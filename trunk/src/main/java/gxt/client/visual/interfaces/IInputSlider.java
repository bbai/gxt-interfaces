package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.InputSlider;
import gxt.client.visual.interfaces.presenter.IInputSliderPresenter;
import gxt.client.visual.interfaces.view.IInputSliderView;

/**
 * @author eugenp
 */
public interface IInputSlider extends ISlider, IInputSliderView, IInputSliderPresenter{
	
	/** mine */
	InputSlider getComponent();

}
