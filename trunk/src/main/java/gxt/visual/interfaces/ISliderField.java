package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.SliderField;

import gxt.visual.interfaces.presenter.ISliderFieldPresenter;
import gxt.visual.interfaces.view.ISliderFieldView;

/**
 * @author eugenp
 */
public interface ISliderField extends IField< Integer >, ISliderFieldView, ISliderFieldPresenter{
	
	/** mine */
	SliderField getComponent();

}
