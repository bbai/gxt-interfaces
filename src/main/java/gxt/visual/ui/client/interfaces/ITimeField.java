package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ITimeFieldPresenter;
import gxt.visual.ui.client.interfaces.view.ITimeFieldView;

import com.extjs.gxt.ui.client.widget.form.Time;
import com.extjs.gxt.ui.client.widget.form.TimeField;

/**
 * @author eugenp
 */
public interface ITimeField extends IComboBox< Time >, ITimeFieldView, ITimeFieldPresenter{
	
	/** mine */
	TimeField getComponent();

}
