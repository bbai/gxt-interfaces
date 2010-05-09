package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Slider;

import gxt.visual.interfaces.presenter.ISliderPresenter;
import gxt.visual.interfaces.view.ISliderView;

/**
 * @author eugenp
 */
public interface ISlider extends IBoxComponent, ISliderView, ISliderPresenter{
	
	/** mine */
	Slider getComponent();

}
