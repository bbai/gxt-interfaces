package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.InputSlider;

import gxt.visual.interfaces.presenter.IInputSliderPresenter;
import gxt.visual.interfaces.view.IInputSliderView;

/**
 * @author eugenp
 */
public interface IInputSlider extends ISlider, IInputSliderView, IInputSliderPresenter{
	
	/** mine */
	InputSlider getComponent();

}
