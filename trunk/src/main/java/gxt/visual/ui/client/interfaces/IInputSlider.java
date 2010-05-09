package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.InputSlider;

import gxt.visual.ui.client.interfaces.presenter.IInputSliderPresenter;
import gxt.visual.ui.client.interfaces.view.IInputSliderView;

/**
 * @author eugenp
 */
public interface IInputSlider extends ISlider, IInputSliderView, IInputSliderPresenter{
	
	/** mine */
	InputSlider getComponent();

}
