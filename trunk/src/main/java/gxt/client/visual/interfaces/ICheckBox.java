package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ICheckBoxPresenter;
import gxt.client.visual.interfaces.view.ICheckBoxView;

import com.extjs.gxt.ui.client.widget.form.CheckBox;

/**
 * @author eugenp
 */
public interface ICheckBox extends IField< Boolean >, ICheckBoxView, ICheckBoxPresenter{
	
	/** mine */
	CheckBox getComponent();

}
