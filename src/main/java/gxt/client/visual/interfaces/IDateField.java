package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IDateFieldPresenter;
import gxt.client.visual.interfaces.view.IDateFieldView;

import java.util.Date;

import com.extjs.gxt.ui.client.widget.form.DateField;

/**
 * @author eugenp
 */
public interface IDateField extends ITriggerField< Date >, IDateFieldView, IDateFieldPresenter{
	
	/** mine */
	DateField getComponent();

}
