package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.form.SliderField;

import gxt.visual.ui.client.interfaces.presenter.ISliderFieldPresenter;
import gxt.visual.ui.client.interfaces.view.ISliderFieldView;

/**
 * @author eugenp
 */
public interface ISliderField extends IField< Integer >, ISliderFieldView, ISliderFieldPresenter{
	
	/** mine */
	SliderField getComponent();

}
