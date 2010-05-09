package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.form.FieldSet;

import gxt.visual.ui.client.interfaces.presenter.IFieldSetPresenter;
import gxt.visual.ui.client.interfaces.view.IFieldSetView;

/**
 * @author eugenp
 */
public interface IFieldSet extends ILayoutContainer, IFieldSetView, IFieldSetPresenter{

	/** mine */
	FieldSet getComponent();
	
}
