package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.NumberField;

import gxt.visual.interfaces.presenter.INumberFieldPresenter;
import gxt.visual.interfaces.view.INumberFieldView;

/**
 * @author eugenp
 */
public interface INumberField extends ITextField< Number >, INumberFieldView, INumberFieldPresenter{
	
	/** mine */
	NumberField getComponent();

}
