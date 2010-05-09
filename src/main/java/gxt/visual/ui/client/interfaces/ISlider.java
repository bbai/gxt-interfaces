package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Slider;

import gxt.visual.ui.client.interfaces.presenter.ISliderPresenter;
import gxt.visual.ui.client.interfaces.view.ISliderView;

/**
 * @author eugenp
 */
public interface ISlider extends IBoxComponent, ISliderView, ISliderPresenter{
	
	/** mine */
	Slider getComponent();

}
