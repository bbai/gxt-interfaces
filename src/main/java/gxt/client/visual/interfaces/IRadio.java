package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IRadioPresenter;
import gxt.client.visual.interfaces.view.IRadioView;

import com.extjs.gxt.ui.client.widget.form.Radio;

/**
 * @author eugenp
 */
public interface IRadio extends ICheckBox, IRadioView, IRadioPresenter{
	
	/** mine */
	Radio getComponent();

}
