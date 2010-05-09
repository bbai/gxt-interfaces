package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IRadioPresenter;
import gxt.visual.ui.client.interfaces.view.IRadioView;

import com.extjs.gxt.ui.client.widget.form.Radio;

/**
 * @author eugenp
 */
public interface IRadio extends ICheckBox, IRadioView, IRadioPresenter{
	
	/** mine */
	Radio getComponent();

}
