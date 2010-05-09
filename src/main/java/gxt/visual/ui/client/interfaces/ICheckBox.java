package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ICheckBoxPresenter;
import gxt.visual.ui.client.interfaces.view.ICheckBoxView;

import com.extjs.gxt.ui.client.widget.form.CheckBox;

/**
 * @author eugenp
 */
public interface ICheckBox extends IField< Boolean >, ICheckBoxView, ICheckBoxPresenter{
	
	/** mine */
	CheckBox getComponent();

}
