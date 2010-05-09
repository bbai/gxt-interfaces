package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.ITimeFieldPresenter;
import gxt.visual.interfaces.view.ITimeFieldView;

import com.extjs.gxt.ui.client.widget.form.Time;
import com.extjs.gxt.ui.client.widget.form.TimeField;

/**
 * @author eugenp
 */
public interface ITimeField extends IComboBox< Time >, ITimeFieldView, ITimeFieldPresenter{
	
	/** mine */
	TimeField getComponent();

}
