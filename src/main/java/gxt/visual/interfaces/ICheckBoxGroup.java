package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.ICheckBoxGroupPresenter;
import gxt.visual.interfaces.view.ICheckBoxGroupView;

import com.extjs.gxt.ui.client.widget.form.CheckBox;
import com.extjs.gxt.ui.client.widget.form.CheckBoxGroup;

/**
 * @author eugenp
 */
public interface ICheckBoxGroup extends IMultiField< CheckBox >, ICheckBoxGroupView, ICheckBoxGroupPresenter{
	
	/** mine */
	CheckBoxGroup getComponent();

}
