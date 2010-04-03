package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;

import gxt.client.visual.interfaces.presenter.IRadioGroupPresenter;
import gxt.client.visual.interfaces.view.IRadioGroupView;

/**
 * @author eugenp
 */
public interface IRadioGroup extends IMultiField< Radio >, IRadioGroupView, IRadioGroupPresenter{
	
	/** mine */
	RadioGroup getComponent();

}
