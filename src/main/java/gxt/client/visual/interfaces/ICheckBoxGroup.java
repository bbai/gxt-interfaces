package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ICheckBoxGroupPresenter;
import gxt.client.visual.interfaces.view.ICheckBoxGroupView;

import com.extjs.gxt.ui.client.widget.form.CheckBox;
import com.extjs.gxt.ui.client.widget.form.CheckBoxGroup;

/**
 * @author eugenp
 */
public interface ICheckBoxGroup extends IMultiField< CheckBox >, ICheckBoxGroupView, ICheckBoxGroupPresenter{
	
	/** mine */
	CheckBoxGroup getComponent();

}
