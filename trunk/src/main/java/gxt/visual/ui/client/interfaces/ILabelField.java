package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ILabelFieldPresenter;
import gxt.visual.ui.client.interfaces.view.ILabelFieldView;

import com.extjs.gxt.ui.client.widget.form.LabelField;

/**
 * @author eugenp
 */
public interface ILabelField extends IField< Object >, ILabelFieldView, ILabelFieldPresenter{
	
	/** mine */
	LabelField getComponent();

}
