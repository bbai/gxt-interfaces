package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.form.NumberField;

import gxt.visual.ui.client.interfaces.presenter.INumberFieldPresenter;
import gxt.visual.ui.client.interfaces.view.INumberFieldView;

/**
 * @author eugenp
 */
public interface INumberField extends ITextField< Number >, INumberFieldView, INumberFieldPresenter{
	
	/** mine */
	NumberField getComponent();

}
