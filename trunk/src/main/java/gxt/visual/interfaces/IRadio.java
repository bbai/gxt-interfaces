package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IRadioPresenter;
import gxt.visual.interfaces.view.IRadioView;

import com.extjs.gxt.ui.client.widget.form.Radio;

/**
 * @author eugenp
 */
public interface IRadio extends ICheckBox, IRadioView, IRadioPresenter{
	
	/** mine */
	Radio getComponent();

}
