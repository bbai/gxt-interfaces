package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.FieldSet;

import gxt.client.visual.interfaces.presenter.IFieldSetPresenter;
import gxt.client.visual.interfaces.view.IFieldSetView;

/**
 * @author eugenp
 */
public interface IFieldSet extends ILayoutContainer, IFieldSetView, IFieldSetPresenter{

	/** mine */
	FieldSet getComponent();
	
}
