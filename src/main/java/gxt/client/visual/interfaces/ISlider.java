package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Slider;

import gxt.client.visual.interfaces.presenter.ISliderPresenter;
import gxt.client.visual.interfaces.view.ISliderView;

/**
 * @author eugenp
 */
public interface ISlider extends IBoxComponent, ISliderView, ISliderPresenter{
	
	/** mine */
	Slider getComponent();

}
