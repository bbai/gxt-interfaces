package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;

import gxt.visual.ui.client.interfaces.presenter.IRadioGroupPresenter;
import gxt.visual.ui.client.interfaces.view.IRadioGroupView;

/**
 * @author eugenp
 */
public interface IRadioGroup extends IMultiField< Radio >, IRadioGroupView, IRadioGroupPresenter{
	
	/** mine */
	RadioGroup getComponent();

}
