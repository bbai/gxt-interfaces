package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IDateFieldPresenter;
import gxt.visual.interfaces.view.IDateFieldView;

import java.util.Date;

import com.extjs.gxt.ui.client.widget.form.DateField;

/**
 * @author eugenp
 */
public interface IDateField extends ITriggerField< Date >, IDateFieldView, IDateFieldPresenter{
	
	/** mine */
	DateField getComponent();

}
