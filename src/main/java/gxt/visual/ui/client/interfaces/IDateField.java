package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IDateFieldPresenter;
import gxt.visual.ui.client.interfaces.view.IDateFieldView;

import java.util.Date;

import com.extjs.gxt.ui.client.widget.form.DateField;

/**
 * @author eugenp
 */
public interface IDateField extends ITriggerField< Date >, IDateFieldView, IDateFieldPresenter{
	
	/** mine */
	DateField getComponent();

}
