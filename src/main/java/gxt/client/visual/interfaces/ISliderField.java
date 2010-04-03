package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.SliderField;

import gxt.client.visual.interfaces.presenter.ISliderFieldPresenter;
import gxt.client.visual.interfaces.view.ISliderFieldView;

/**
 * @author eugenp
 */
public interface ISliderField extends IField< Integer >, ISliderFieldView, ISliderFieldPresenter{
	
	/** mine */
	SliderField getComponent();

}
