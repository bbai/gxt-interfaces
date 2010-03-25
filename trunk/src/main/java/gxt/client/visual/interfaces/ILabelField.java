package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ILabelFieldPresenter;
import gxt.client.visual.interfaces.view.ILabelFieldView;

import com.extjs.gxt.ui.client.widget.form.LabelField;

/**
 * @author eugenp
 */
public interface ILabelField extends IField< Object >, ILabelFieldView, ILabelFieldPresenter{
	
	/** mine */
	LabelField getComponent();

}
